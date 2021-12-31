class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i]==nums2[j]) {
                    nums2[j] = -1;
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}