import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer ="";
        Arrays.sort(strs); // 오름차순 정렬
        String minStr = strs[0]; // 가장 작은 값 찾기
        String pivot = "";
        // prefix의 MAX값은 가장 작은 글자 전체
        for(int j=0  ; j < minStr.length() ;  j++){ 
            // 주어진 배열만큼 찾아보기
            // 앞글자의 수가 length만큼 일치하면, prefix
            // 어긋나면 prefix아님
            // 새로운 정답을 찾기위해 pivot을 부여한다.
            pivot = minStr.substring(0,j+1); // 가장 작은 값의 앞 글자
            
            for(int i = 0 ; i < strs.length; i++  ) {
                String target = strs[i].substring(0,j+1); 
                if(!target.equals(pivot)) {
                    return answer;
                }
            } 
            // 정답에 pivot을 넣는다.
            answer = pivot;
        }
        return pivot;
    
    }
}