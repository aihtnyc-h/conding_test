package LV1;

import java.time.DayOfWeek;
import java.util.Calendar;

public class 윤년_2016년 {
    public static String solution(int a, int b){
        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        switch (cal.get(Calendar.DAY_OF_WEEK)){
            case 1 :
                answer = "SUN";
                break;
            case 2 :
                answer = "MON";
                break;
            case 3 :
                answer = "TUE";
                break;
            case 4 :
                answer = "WED";
                break;
            case 5 :
                answer = "THU";
                break;
            case 6 :
                answer = "FRI";
                break;
            case 7 :
                answer = "SAT";
                break;
        }
        return answer;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 24;
        System.out.println(solution(a , b));
    }
}
