import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i : nums1) {
            set1.add(i);
        }
        
        for(int i : nums2) {
            set2.add(i);
        }
        
        set1.retainAll(set2);
                
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = set1.iterator();
        
        while(it.hasNext()) { 
            list.add(it.next());
        }
        
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        
        return arr;
    }
}