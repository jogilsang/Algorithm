

/**
 * 
 * 이미지에서 닫힌 영역 단색 칠하는 함수 구현하기
 * 그림판 프로그램의 영역 칠하기 기능을 생각하면 이해에 도움이 될것이다
 * 매개변수 중 x,y를 칠하기 시작하는 위치이다.
 * x,y 위치의 색과 같은 색만 칠한다.
 * "newC"는 새로 칠할 색상의 값이다.
 * 
 * xy인지 yx인지 면접관에게 물어보기
 * 행렬구조면 yx
 * 
 */

public class udemy_5_2 {

    public void static main(String[] args) {
        
    }
 
     public static int paint(int[][] image, int x, int y, int newC) {
        paintRec(image, x,y,newC, image[y][x])
     }
     public static int paintRec(int[][] image, int x,int y,int newC, int targetC) {

        if(x<0 || y<0 || y>=image.length || x>=image[0].length) {
            return;
        }

        // 같은색이면 칠할필요없음
        if(image[y][x] == newC || image[y[x]!=targetC]){
            return;
        }

        paintRec(image, x+1, y, newC,targetC);
        paintRec(image, x, y+1, newC,targetC);
        paintRec(image, x-1, y, newC,targetC);
        paintRec(image, x, y-1, newC,targetC);

     }
 }
 
 