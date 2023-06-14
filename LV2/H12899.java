package LV2;

public class H12899 {
    public String solution(int n) {
        // 1, 2, 4를 각각 인덱스 1, 2, 0에 위치시킨 배열
        String[] numbers = { "4", "1", "2" };
        // 변환 결과를 저장할 문자열
        String answer = "";

        // n이 0이 될 때까지 반복
        while (n > 0) {
            // n을 3으로 나눈 나머지를 구함
            int remainder = n % 3;
            // n을 3으로 나눔
            n /= 3;

            // 나머지가 0인 경우, 즉 n이 3의 배수인 경우 n에서 1을 뺌
            if (remainder == 0) n--;

            // 나머지에 해당하는 숫자를 answer 문자열의 앞에 붙임
            answer = numbers[remainder] + answer;
        }

        return answer;
    }
}