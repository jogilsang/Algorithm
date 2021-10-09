

// n비트의 모든 경우의수 출력

// n이 1이면 1,0을 리스트로
// n이 2이면, 1,0,0을 리스트로 반환
// TODO : 재귀조건에 n이 -1 되야되지않나

public class udemy_5_3 {

    public void static main(String[] args) {
        
    }

    private static ArrayList<String> bitCombbinations(int n){
        return bitCombRec(n, "", new ArrayList<String>());
    }
    private static ArrayList<String> bitCombRec(int n, String s, ArrayList<String> list) {
        // s가 n비트면 종료. 길이를 비교
        if(n==s.length()) {
            list.add(s);
            return list;
        }
        
        bitCombRec(n,s + "0",list);
        bitCombRec(n,s + "1",list);
        return list;
        
    }
}
