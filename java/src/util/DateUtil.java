package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
    public final static String CALENDAR_HEADER_FORMAT = "yyyy년 MM월";

    public final static String YEAR_FORMAT = "yyyy";
    public final static String MONTH_FORMAT = "MM";
    public final static String YEARMONTHDAY_FORMAT = "yyyyMMdd";
    public final static String DAY_FORMAT = "d";
    public final static String HOUR_FORMAT = "HH";
    public final static String MIN_FORMAT = "mm";
    public final static String SEC_FORMAT = "ss";


    public static String getDate(long date, String pattern) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.ENGLISH);
            Date d = new Date(date);
            return formatter.format(d).toUpperCase();
        } catch (Exception e) {
            return " ";
        }
    }

     public static String doDayOfWeek(){

        Calendar cal = Calendar.getInstance();
        String strWeek = null;

        int nWeek = cal.get(Calendar.DAY_OF_WEEK);
        if( nWeek == 1 ) {
            strWeek = "Sunday";
        } else if ( nWeek == 2) {
            strWeek = "Monday";
        }else if ( nWeek == 3) {
            strWeek = "Tuesday";
        }else if ( nWeek == 4) {
            strWeek = "Wednesday";
        }else if ( nWeek == 5) {
            strWeek = "Thursday";
        }else if ( nWeek == 6) {
            strWeek = "Friday";
        } else if ( nWeek == 7) {
            strWeek = "Saturday";
        }

        return strWeek;
    }

    public static String doDayOfMonth(){

        Calendar cal = Calendar.getInstance();
        String strWeek = null;

        int nWeek = cal.get(Calendar.MONTH) + 1;
        if( nWeek == 1 ) {
            strWeek = "Jan";
        } else if ( nWeek == 2) {
            strWeek = "Feb";
        }else if ( nWeek == 3) {
            strWeek = "Mar";
        }else if ( nWeek == 4) {
            strWeek = "Apr";
        }else if ( nWeek == 5) {
            strWeek = "May";
        }else if ( nWeek == 6) {
            strWeek = "Jun";
        } else if ( nWeek == 7) {
            strWeek = "Jul";
        } else if ( nWeek == 8) {
            strWeek = "Aug";
        } else if ( nWeek == 9) {
            strWeek = "Sep";
        } else if ( nWeek == 10) {
            strWeek = "Oct";
        } else if ( nWeek == 11) {
            strWeek = "Nov";
        } else if ( nWeek == 12) {
            strWeek = "Dec";
        }

        return strWeek;
    }


}
