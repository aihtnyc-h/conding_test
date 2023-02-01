package 시험;
/*
항해99 시작
98일 이후 수료하계되는 날짜를 계산해주는 알고리즘

날짜  입력 해주는 곳을 만들어야하는데 그게 어렵다... 왜그럴까  접근 방식이 잘못된건가..?
 */
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.*;

public class 신대륙발견 {
    public static String solution(int month, int day) {
        //Date nowDate = new Date();
        //System.out.println("포맷 지정 전 : " + nowDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //원하는 데이터 포맷 지정
        //String strNowDate = simpleDateFormat.format(2023-01-18);
        //지정한 포맷으로 변환
        //System.out.println("포맷 지정 후 : " + strNowDate);
        //날짜 포멧
        //Date time = new Date();	 //현재 날짜
        //LocalDate date = LocalDate.of(2023,1,18);
        Calendar cal = Calendar.getInstance();	 //날짜 계산을 위해 Calendar 추상클래스 선언 getInstance()메소드 사용
        cal.set(2023,month -1 ,day);
        //cal.setTime(time);
        cal.add(Calendar.DATE, -10);	//98 더하기
        String answer = String.valueOf(cal.getTime());
        return answer;



    }

//        String answer = "";
//        Date date = new Date();
//        System.out.println(date);
//
//        Calendar cal = Calendar.getInstance();
//        cal.set(2023, month, day);
//
//        cal.add(Calendar.DATE, 98);

//        LocalDate date = LocalDate.of(2023,month,day);
//        answer = date.getDayOfWeek().toString();
//        answer = answer.substring(0,3);


//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//        Calendar cal = Calendar.getInstance();
//        //Date da = format.parse();
//        cal.add(Calendar.DATE, 98);		//년 더하기
       // return answer;


            public static void main(String[] args) {
                int month = 1;
                int day = 18;
                System.out.println(solution(month, day));

                int month3 = 6;
                int day3 = 22;
                System.out.println(solution(month3, day3));

            }
        }

