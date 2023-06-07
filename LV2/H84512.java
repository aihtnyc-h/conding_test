package LV2;

public class H84512 {
    public int solution(String word) {
        String vowels = "AEIOU";  // 모음 문자들을 저장
        int answer = 0;  // 결과값을 저장할 변수를 선언
        int permut = 781;  // 첫 번째 자리에 들어갈 수 있는 경우의 수를 저장 (5^4 + 5^3 + 5^2 + 5 + 1)

        for (int i = 0; i < word.length(); i++) {  // 입력 받은 단어를 한 글자씩 순회
            for (int j = 0; j < 5; j++) {  // 모음 문자들을 한 글자씩 순회
                if (vowels.charAt(j) == word.charAt(i)) {  // 만약 모음 문자가 단어의 해당 위치의 문자와 같다면,
                    answer += 1 + j * permut;  // 해당 자리수의 순서를 계산하여 결과값에 더한다.
                }
            }
            permut = (permut - 1) / 5;  // 다음 자리수의 경우의 수를 계산하여 업데이트 한다.
        }

        return answer;  // 최종적으로 계산된 결과값을 반환
    }
}