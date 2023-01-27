package LV1;

public class H12930 {
    public static String solution(String s) {
        String answer = "";
        int index = 0;          // 가상으로 index 저장
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 32) {    // i번째 문자가 공백일 경우
                answer += " ";  //단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다. //answer에 공백 더하기
                index = 0;      //첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.     //공백 => index는 다시 0으로 저장

            } else if (index == 0 || index % 2 == 0) {          // index 0이거나 짝수면
                answer += Character.toUpperCase(s.charAt(i));   // 대문자를 더하고
                index++;                                        // index에 +1

            } else if (index%2 != 0){                            // index 홀수면
                answer += Character.toLowerCase(s.charAt(i));    // 소문자를 더하고
                index++;                                         // index에 +1
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        String s1[] = {"TrY HeLlO WoRlD"};
        System.out.println(solution(s));
    }
}