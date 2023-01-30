package LV1;
/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */
import java.util.Arrays;

public class H12926 {
    public static String solution(String s, int n){
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // charAt(i): i에 들어간 값을 char형으로 바꿔줌

            if(Character.isLowerCase(ch)) ch = (char) ((ch - 'a' + n) % 26 + 'a');  //Character.isLowerCase(i) i 들어간 값이 소문자이면 true 아니라면 false를 반환
                // 값이 y, n이 4일 경우 %26에 걸러져  z 이후 다시 a로 시작하게 된다.
            else if(Character.isUpperCase(ch)) ch = (char) ((ch - 'A' + n) % 26 + 'A');  //Character.isUpperCase(i) i 들어간 값이 대문자이면 true 아니라면 false를 반환합니다.
            answer += ch; // 걸러진 값들을 저장

        }
        return answer;
    }
    public static void main(String[] args){
        String s = Arrays.toString(new String[]{"z"});
        int n = 1;
        System.out.println(solution(s,n));
    }
}
