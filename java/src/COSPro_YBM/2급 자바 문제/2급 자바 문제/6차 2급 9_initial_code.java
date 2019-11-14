public class Solution {
	public int solution(int[] socks) {
		int answer = 0;

		int[] count = new int[10];
		for(int i = 0; i < socks.length; i++)
			count[socks[i]]++;

		for(int i = 0; i < 10; i++)
			answer += (count[i] % 2);

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] socks = {1, 2, 1, 3, 2, 1};
		int ret = sol.solution(socks);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}