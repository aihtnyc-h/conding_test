package LV2;

import java.util.Arrays;
import java.util.Comparator;

public class H42746 {
    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);  // 정수를 문자열로 변환하여 저장
        }

        // 정렬
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두 문자열을 앞뒤로 이어 붙인 두 경우를 비교하여 더 큰 숫자 순서로 정렬
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 0만 여러 개 있는 경우에 대한 처리
        if (result[0].equals("0")) {  // 가장 큰 수가 '0'이라면 전체가 0이므로 "0"을 반환
            return "0";
        }

        String answer = "";
        for (String str : result) {
            answer += str;  // 정렬된 문자열을 이어붙여 결과 생성
        }

        return answer;  // 결과 반환
    }
}