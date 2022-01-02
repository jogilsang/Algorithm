class Solution {
    public void duplicateZeros(int[] arr) {
        
        // Solution 1
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++) {
            int value = arr[i];
            
            if(value != 0) {
                list.add(value);
            }
            else {
                list.add(0);
                list.add(0);
            }
        }
        
        for(int i = 0 ; i < arr.length ;i++) {
            arr[i] = list.get(i);
        }
        
        
        // Solution 2
        // StringBuffer sb = new StringBuffer();
        // int fixed_length = arr.length;
           
        // for(int i : arr){
        //     sb.append(String.valueOf(i));
        // }
        // String str = sb.toString();
           
        // str.replaceAll("0","00");
        // str = str.substring(0, fixed_length);
           
        // for(int i = 0 ; i < fixed_length ; i++) {
        //     arr[i] = Integer.valueOf(str.charAt(i));
        // }
        
        
    }
}