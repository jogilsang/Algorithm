class Solution {
    public String defangIPaddr(String address) {
        // ipv4의 모든 자리는 4자리다.
        // ipv4는 각 자릿수가 0~255까지 가능하다.
        char[] arr = address.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]=='.') {
                sb.append("[.]");
            }
            else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}