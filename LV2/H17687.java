package LV2;

public class H17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();  // 튜브가 말해야 하는 숫자를 담을 변수
        StringBuilder numbers = new StringBuilder(); // 전체 게임에서 필요한 숫자들을 담을 변수
        int number = 0;  // 0부터 시작하는 숫자를 담을 변수

        // 전체 게임에서 필요한 숫자들을 모두 생성
        while(numbers.length() <= m * t) {
            String numBaseN = Integer.toString(number++, n);  // 숫자를 주어진 진법으로 변환
            for(char c : numBaseN.toCharArray()) {  // 각 자릿수별로 문자열에 추가
                numbers.append(Character.toUpperCase(c));  // 모든 진법의 숫자를 대문자로 변환
            }
        }

        // 튜브가 말해야 하는 숫자들을 찾아서 answer에 추가
        for(int i=0; i<t; i++) {
            answer.append(numbers.charAt((p-1) + i*m));  // 튜브의 차례에 해당하는 숫자를 찾아서 추가
        }

        return answer.toString();  // 튜브가 말해야 하는 숫자들을 문자열로 반환
    }
}
