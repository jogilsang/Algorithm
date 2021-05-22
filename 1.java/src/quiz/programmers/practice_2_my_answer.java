import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 문제 : https://programmers.co.kr/learn/courses/30/lessons/12901

public class practice_2_my_answer {
//
//    2016년
//    문제 설명
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
// 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
// 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//            제한 조건
//2016년은 윤년입니다.
//            2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//    입출력 예
//    a	b	result
//5	24

    public String solution(int a, int b) {

        String month = String.valueOf(a);
        String day = String.valueOf(b);

        if(month.length() == 1) {
            month = "0" + month;
        }
        if(day.length() == 1) {
            day = "0" + day;
        }

        String answer = getDayNameAboutDate("2016" + month + day);
        return answer;
    }


    // 특정날짜에 대한 요일 이름 가져오기
    public String getDayNameAboutDate(String yyyyMMdd){

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String convertedString="";

        try{

            // 날짜 입력하는곳 .
            Date date = formatter.parse(yyyyMMdd);
            date=new Date(date.getTime());

            Calendar cal= Calendar.getInstance();

            // 하루더한 날자 값을 Calendar넣는다.
            cal.setTime(date);

            // 요일을 구해온다.
            int dayNum=cal.get(Calendar.DAY_OF_WEEK);

            String[] dayValue = { "SUN","MON","TUE","WED","THU","FRI","SAT"};

            convertedString = dayValue[dayNum-1];



        }catch (ParseException e) {
            e.printStackTrace();
        }
        return convertedString;
    }

}
