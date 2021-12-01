// Solution
// nums1에 m번째 index에 nums2의 0을 넣는다.
// nums1의 0번째 항까지 비교해나간다
// 같거나 작다면 바꾸지않는다
// 크다면 바꾼다
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        if(n != 0 || m != 0) {
            // case
            int count = 0;
            for(int i = m ; i < m+n ; i++) {
                nums1[i] = nums2[count++];
                for(int j = i ; j>=1 ; j--) {
                    int after = nums1[j];
                    int before = nums1[j-1];
                    if(after > before) {
                        break;
                    }
                    else {
                        nums1[j-1] = after;
                        nums1[j] = before;
                    }
                }
            }
        }
     
    }
}






















