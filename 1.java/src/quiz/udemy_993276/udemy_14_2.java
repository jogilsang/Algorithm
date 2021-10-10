

/**
 * 
 * 입력 받은 전화번호가 존재하는지 O(1)에 검색하기
 * 전화번호는 7자리로 000-0000 ~ 999-9999
 *
 * 입력은 숫자로만 이뤄진 7자리 문자열로 받는다
 * 메모리는 10mb 이하로 제한된다.
 * 
 */

public class udemy_14_2 {
    public static void main(String[] args) {

    // 검색인데 bigo의 1이면 hash일 느낌
    // 하지만 hash는 아님
    // 하나 저장하는대 1byte로 쓰면안됨 (10mb 초과함)
    // 비트맵 정렬을 사용
    // 1bit를 어떤 전화번호가 있는지 없는지 체크
    // 비트연산까지 해야함

    }

    public int[] cache;

    public udemy_14_2() {
        // 40mb - new int[10*1000*1000]
        // ??? - new int[(10*1000*1000)/32]
        cache = new int[(10*1000*1000)/32];
    }

    public void store(String phoneNumber) {
        int phoneInt = Integer.parseInt(phoneNumber);
        int arrayIndex = phoneInt/32;
        int byteIndex = phoneInt%32; // byteIndex 해당 번지만 1
        cache[arrayIndex] = cache[arrayIndex] | (1<<byteIndex);
    }

    // & 하면 나머지는 0이니까 없어지고 해당 인덱스가 1인거만 나옴
    public boolean exist(String phoneNumber) {
        int phoneInt = Integer.parseInt(phoneNumber);
        int arrayIndex = phoneInt/32;
        int byteIndex = phoneInt%32;
        return (cache[arrayIndex] & (1<<byteIndex)) != 0;
    }
}