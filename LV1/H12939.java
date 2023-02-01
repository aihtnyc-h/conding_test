package LV1;
/*
parseInt() 메서드 : 특정 문자열의 기본 데이터 유형을 가져오는 데 사용
 */
import java.util.*;

public class H12939 {
    public static String solution(String s) {
        String answer = "";

        String[] numbers = s.split(" ");        // 문자열을 공백을 기준으로 분리!  //이걸 안해줘서 에러났었음!
        int min = Integer.MAX_VALUE;            // 분리한 문자열을 정수형으로 반환! 최댓값 최솟값 구하기
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        answer = min+ " " +max;
        return answer;
    }
    public static void main(String[] args){
        String s = "1 2 3 4";
        System.out.println(solution(s));

    }
}
