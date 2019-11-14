import java.util.Scanner;

public class line_6 {

//    문제 설명
//    Number Printing
//    0 ~ 9의 숫자를 크기와 정렬 방식을 달리하여 인쇄하는 프로그램을 만들고자 한다.
//
//    입력 형식
//    첫 번째 줄에는 입력 받을 데이터의 갯수와 정렬 방식을 나타내는 값이 공백으로 구분되어 적혀 있다
//    입력 받을 데이터 개수는 1 <= N <= 100 사이이다
//    정렬 방식을 나타내는 값은 TOP, BOTTOM 또는 MIDDLE 중 하나이다
//    TOP은 위 정렬, BOTTOM은 아래 정렬, 그리고 MIDDLE은 중앙 정렬을 의미 한다
//    두 번째 줄부터 N개의 줄은 크기 숫자들 형식으로 입력된다
//    크기는 출력할 숫자의 가로 크기를 의미하며 3 이상의 홀수이다
//    숫자들은 출력 해야 할 숫자열을 의미한다
//    출력 형식
//    숫자를 표시하는 부분은 # 문자, 여백을 표시하는 부분은 . 문자를 이용하도록 한다
//    숫자의 가로 크기는 입력으로 받은 값이다
//    숫자는 반드시 . 문자를 포함한 크기여야 한다
//    아래 예시의 숫자 1 또는 6을 보면, 해당 숫자는 . 문자 포함하여 가로 크기가 3이다
//    숫자의 세로 크기는 입력 받은 가로 크기의 값 중 제일 큰 값을 이용하여 계산한다
//    제일 큰 값이 n이라 할 때, 2n-1 이다 (제일 큰 가로 크기가 5일 경우 세로 크기는 9)
//    출력할 숫자 사이에는 한 칸의 공백을 둔다
//    출력할 숫자는 가로 크기가 3인 경우 아래와 같은 모양이 되도록 한다

    public static void main(String[] args) {

        String block1 = "....#";
        String block2 = "#####";
        String block3 = "#....";
        String block4 = "#...#";

        Scanner sc = new Scanner(System.in);

        // 4 , top
        String aaa = sc.nextLine();

        String[] temp = aaa.split(" ");
        int a = Integer.parseInt(temp[0]);
        String order = temp[1]; // TOP, MIDDLE, BOTTOM

        int[][] numbers = new int[a][2];

        for(int p = 0 ; p < a ; p++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            numbers[p][0] = b;
            numbers[p][1] = c;
        }

        for(int k= 0 ; k< numbers.length ; k++) {
            System.out.println(String.valueOf(numbers[k]));
        }


    }

}
