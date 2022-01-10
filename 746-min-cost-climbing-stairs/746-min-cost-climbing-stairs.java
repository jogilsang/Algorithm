class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // https://blog.yevgnenll.me/posts/min-cost-climbing-stair-dp-strategy
        int[] pay = new int[cost.length];
        pay[0] = cost[0];
        pay[1] = cost[1];
        for (int i = 2; i < cost.length; i ++) {
            pay[i] = Math.min(pay[i-1], pay[i-2]) + cost[i];
        }
        int last = cost.length - 1;
        return Math.min(pay[last], pay[last-1]);

    }
}