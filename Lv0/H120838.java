package Lv0;

import java.util.HashMap;
import java.util.Map;

/*
머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.
 */
public class H120838 {
    public static String solution(String letter) {
//        String answer = "";
//
//        // 모스부호 문자열에 넣기 ( 수작업이다....)
//        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
//                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
//
//        // Map Structure, matching <'morse' : 'alphabet'>
//        Map<String, Character> map = new HashMap<>(){};
//        for (int i = 0; i <morse.length; i++) {
//            map.put(morse[i], (char)(97+i));    // 소문자 시작이 97!
//
//
//
//            // letter slit 과 interpret
//            String[] words = letter.split(" "); // 한글자 단위로 배열 저장
//            for (String x : words)                    // 편지에 모스 부호를 words에 저장한 것을 map에 다시 저장한다.
//                answer += map.get(x);
//        }
//
//        return answer;

        String[] letterArr = letter.split(" "); // 한글자 단위로 배열 저장
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String answer = "";
        for (int i = 0; i < letterArr.length; i++) {    // 편지안에서 찾기
            for (int j = 0; j < morse.length; j++) {    // 모스안에서 찾기
                if (letterArr[i].equals(morse[j])) {    // 편지안에 써있는 모스부호가 동일하다면
                    answer += alpha.charAt(j);          // 알파벳에 저정한다!
                    break;                              // 정지!
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String letter1 = ".... . .-.. .-.. ---";
        String letter2 = ".--. -.-- - .... --- -.";
        System.out.println(solution(letter1));
        System.out.println(solution(letter2));
    }
}
