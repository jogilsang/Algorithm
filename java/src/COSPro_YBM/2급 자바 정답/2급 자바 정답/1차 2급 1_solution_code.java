class Solution {
    public int[] solution(String[] shirt_size) {
        int[] size_counter = new int[6];
        for(int i = 0; i < shirt_size.length; ++i) {
            if(shirt_size[i].equals("XS"))
               size_counter[0]++;
            else if(shirt_size[i].equals("S"))
                size_counter[1]++;
            else if(shirt_size[i].equals("M"))
                size_counter[2]++;
            else if(shirt_size[i].equals("L"))
                size_counter[3]++;
            else if(shirt_size[i].equals("XL"))
                size_counter[4]++;
            else if(shirt_size[i].equals("XXL"))
                size_counter[5]++;
        }
        return size_counter;
    }
}