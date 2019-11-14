package util;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    	// 소수점 이하 버리고 세자리로 끊어서 돈표시
	public static String returnKoreanMoney(Double num) {

		DecimalFormat df = new DecimalFormat("#,##0");

		// 세자리로 만든다
		String value = df.format(num);

		return value;
	}

	// 소수점 이하 버리고 세자리로 끊어서 돈표시
	public static String dotSixFormat(Double num) {


		DecimalFormat df = new DecimalFormat("#,##0.000000");

		// 세자리로 만든다
		String value = df.format(num);

		return value;
	}

	// 소수점 이하 버리고 세자리로 끊어서 돈표시
	public static String dotTwoFormat(Double num) {

		DecimalFormat df =new DecimalFormat("###,##0.00");

		// 세자리로 만든다
		String value = df.format(num);

		return value;
	}


    	// Khash rate로 return
	public static String calKHashRate(String hashrate){

		double temp = Double.valueOf(hashrate);

		// k 단위 라서 1000으로 나눔
		temp = temp / 1000;

		// 소수둘째 짜리로 끊어서 리턴
		return dotTwoFormat(temp);

	}

	public static String getCurrentTime(){

// 시스템으로부터 현재시간(ms) 가져오기
		long now = System.currentTimeMillis();
// Data 객체에 시간을 저장한다.
		Date date = new Date(now);
// 각자 사용할 포맷을 정하고 문자열로 만든다.
		SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String strNow = sdfNow.format(date);

		return strNow;

		//출처: http://blog.opid.kr/247 [opid's document]

	}

	public static String getUnixTime(){

		long unixTime = 0;

		Calendar c = Calendar.getInstance();

		unixTime = c.getTimeInMillis() / 1000;

		return String.valueOf(unixTime);
	}


    	public static String returnFrontText(String text, String standard){
		// @를 기준으로 문자열을 추출할 것이다.
		//String mail = "abced@naver.com";

		// 먼저 standard 의 인덱스를 찾는다 - 인덱스 값: 5
		int idx = text.indexOf(standard);

		// @ 앞부분을 추출
		// substring은 첫번째 지정한 인덱스는 포함하지 않는다.
		// 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
		String data1 = text.substring(0, idx);

		// 뒷부분을 추출
		// 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
		//String data2 = mail.substring(idx+1);

		return data1;

		//출처: http://all-record.tistory.com/118 [세상의 모든 기록]
	}



	public static String returnBackText(String text, String standard){
		// @를 기준으로 문자열을 추출할 것이다.
		//String mail = "abced@naver.com";

		// 먼저 standard 의 인덱스를 찾는다 - 인덱스 값: 5
		int idx = text.indexOf(standard);

		// @ 앞부분을 추출
		// substring은 첫번째 지정한 인덱스는 포함하지 않는다.
		// 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
		//String data1 = text.substring(0, idx);

		// 뒷부분을 추출
		// 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
		String data2 = text.substring(idx+1);

		return data2;

		//출처: http://all-record.tistory.com/118 [세상의 모든 기록]

	}


}
