package LV1;

public class H72410 {
    public String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 바꿉니다.
        String answer = new_id.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, '-', '_', '.'를 제외한 모든 문자를 제거합니다.
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계: '.'가 2번 이상 연속된 부분을 하나의 '.'로 치환합니다.
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4단계: '.'가 처음이나 끝에 위치하면 제거합니다.
        answer = answer.replaceAll("^\\.|\\.$", "");

        // 5단계: 만약 빈 문자열이라면, "a"를 대입합니다.
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6단계: 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //        만약 제거 후 마침표('.')가 끝에 위치하면 '.'를 제거합니다.
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }

        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        // 최종 결과를 반환합니다.
        return answer;
    }
}