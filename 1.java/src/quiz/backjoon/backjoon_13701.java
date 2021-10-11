import java.util.Scanner;
import java.util.ArrayList;

public class backjoon_13701  {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : splitInput) {
            list.add(Integer.parseInt(s));
        }
        
        for(int i = 0 ; i < list.size() ; i++) {
            int value = list.get(i);
            for(int j = i ; j < list.size() ; j++) {
                    int target = list.get(j);
                    if((value^target) == 0) {
                        list.remove(j);
                        j--;
                    }
            }
        }

        for(int output: list) {
            System.out.println(String.toValue(output)+" ");
        }

    }


}
