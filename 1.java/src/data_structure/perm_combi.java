

// 순서를 지키면서 n 개 중에서 r개를 뽑는경우
// https://bcp0109.tistory.com/14

public class perm {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(arr, output, visited, 0, n, 3);

        comb1(arr, visited, 0, 3);
    }
    /**
     * dfs를 이용한 순열
     *
     * @param arr :
     * @param output :
     * @param visited :
     * @param depth :
     * @param n :
     * @param r :
     * @return
     */

    // 순열
    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {

        if(depth == r) {
            print(output);
            return ;
        }

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr,output,visited,depth + 1 ,n ,r);
                visited[i] = false;
            }
        }

    }

    // 조합
    // 백트래킹
    public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {

        if(r == 0 ) {
            print(arr,visited,n);
            return ;
        }

        for(int i = start ; i < n ; i++) {
            visited[i] = true;
            combination(arr,visited,i+1,n , r-1);
            visited[i] = false;
        }

    }
}

