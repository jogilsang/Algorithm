
/**
 *
 * arrayList로 stack 구현하기
 *
 * 내부 배열을 크기는 100으로 시작하지만 더 크게 필요하다면 크기를 2배씩
 * pop을 할 때, 제거할 데이터가 없다면 RuntimeException을 발생
 * 
 */

 import java.util.ArrayList;
 import java.util.List;

 public class udemy_8_2<T> {

    private List<T> list;
    
    public udemy_8_2() {
        // TODO
        list = new ArrayList<T>();
    }

    public void push(T i) {
        list.add(i);
    }

    public T pop() {
        return list.remove(list.size()-1);
    }
 }
