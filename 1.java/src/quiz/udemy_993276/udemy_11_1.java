



/**
 * PriorityQueue를 이용하여 heap sort를 구현하라.
 *
 * heap소트를 priority
 *  heap소트는 heap에다가 n개를 넣고
 *  작은거나오면 첫번쨰, 두번째
 *  쭉 나열함
 *  logn을 n번하니까 삽입할떄, 꺼낼떄 2nlogn + n
 *  시간복잡도는 nlogn 입니다.
 * 
 */

import java.util.PriorityQueue;

public class udemy_11_1 {
    public static void main(String[] args) {

    }

    public static void sort(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int e : a) { // O(nlogn)
            q.add(e);
        }
        for(int k = 0 ; k < a.length ; k++){ // O(nlogn)
            a[k]=q.poll();
        }

    }
}