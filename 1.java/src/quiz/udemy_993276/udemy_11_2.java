/**
 * 매우 많은 수에서 top 10구하기
 *
 * 입력받은 수가 n개일 때, o(n)으로 구현하여라
 * 
 */

import java.util.PriorityQueue;

public class udemy_11_2 {
    public static void main(String[] args) {

    }

    private PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    public void read(int n) {
        if(q.size()<10) {
            q.offer(n);
        } else {
            int tenth = q.peek();
            if(n > tenth) {
                q.poll();
                q.offer(n);
            }
        }
    }

    public int[] getTop10(){
        //  int[] arr = new int[q.size()];
        //  for(int i = 0 ; i<arr.length; ;i++) {
        //     arr[i] = q.poll();
        //  }

         int[] arr = new int[q.size()];
         for (int i=q.size()-1 ; t>=0  ; t++) {
              arr[i] = q.poll();
         }
         return arr;
    }

}