

// N개 괄호로 만들 수 있는 모든 조합 출력하기
// 모든 괄호는 올바르게 열리고 닫혀야함
// 올바른 조합 : ()()
// 틀린 조합 : )()(

// 올바른조합?
// 열리고,닫히고,열리고 닫히고?
// n==0 이면?
// 괄호를 열고닫으니까
// 연거의 개수,닫은거의 개수 추적

public class udemy_5_3 {

    public void static main(String[] args) {
        
    }

    private static List<String> getPairs(int n){
        if(n==0){
            return null;
        }
        return getPairsRec(n,n, "", new ArrayList<String>());
    }

    // l = 여는괄호 개수
    // r = 닫는괄호의 개수
    private static List<String> getPairsRec(int l, int r, String pairs, ArrayList<String> list) {
        
        // 여는개 더 많으면안됨. 닫을수없음.
        if(l>r) return list;
        if(l<0 || r<0) return list;
        if(l==0 && r==0) {
            list.add(pairs);
            return list;
        }

        getPairsRec(l-1,r, pairs + "(",list);
        getPairsRec(r,r-1, pairs + ")",list);
        return list;
        
    }
}
