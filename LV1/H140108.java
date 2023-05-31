package LV1;

public class H140108 {
    public int solution(String s) {
        int answer = 0; // 분해된 문자열의 개수를 저장할 변수
        int i = 0; // 문자열 s를 탐색할 인덱스

        // 문자열의 끝까지 탐색
        while (i < s.length()) {
            char x = s.charAt(i); // 첫 번째 문자를 x라고 함
            int xCount = 0; // x와 같은 문자의 개수를 저장할 변수
            int notXCount = 0; // x와 다른 문자의 개수를 저장할 변수

            // 문자열의 끝까지 혹은 x와 x가 아닌 문자의 개수가 같아질 때까지 탐색
            while (i < s.length()) {
                char currentChar = s.charAt(i); // 현재 문자

                // 현재 문자가 x와 같은지, 다른지에 따라 카운트를 증가
                if (currentChar == x) {
                    xCount++;
                } else {
                    notXCount++;
                }

                // x와 x가 아닌 문자의 개수가 같아지면 문자열 분해 완료, 카운트를 증가시키고 루프 종료
                if (xCount == notXCount) {
                    answer++;
                    break;
                }
                i++;
            }
            // 문자열의 끝까지 탐색했지만 x와 x가 아닌 문자의 개수가 같지 않으면 그대로 문자열을 분해하고 카운트 증가
            if(i == s.length() && xCount != notXCount) {
                answer++;
            }
            // 다음 문자열 분석을 위해 인덱스를 증가시킴
            i++;
        }
        return answer; // 분해된 문자열의 개수를 반환
    }
}