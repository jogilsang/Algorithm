
// https://leetcode.com/problems/two-sum/

/**
 * //Given an array of integers nums and an integer target,return indices of the two numbers such that they add up to target.
 * //You may assume that each input would have exactly one solution,and you may not use the same element twice.
 * //You can return the answer in any order.
 */

//1. Two Sum

package quiz.leetcode;
import java.util.Arrays;

class easy_1_two_sum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] results = twoSum(nums, 6);
        for(int result : results) {
            System.out.println(result);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];

        //    1. i번째부터 시작하여
        //      1.1. j번째(i+1)의 합이 일치하면 return
        //      1.2. j번째(i+1)의 합이 넘어서면, break & i+1 시작
        //      1.3. j번째(i+1)의 합이 작으면, continue & j+1

        for (int i = 0; i < nums.length; i++) {
            int value1 = nums[i];

            for(int j = i+1 ; j < nums.length ;j++) {
                if( j == nums.length) {
                    break;
                }
                int value2 = nums[j];
                int sum = value1 + value2;
                if(target == sum) {
                    result[0]=i;
                    result[1]=j;
                    System.out.println("result[0] : " + value1);
                    System.out.println("result[1] : " + value2);
                    return result;
                }
            }
        }

        return result;
    }
}


