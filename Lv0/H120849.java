
package Lv0;
// String.replaceAll : 루프 내의 문자열에서 각 문자의 모든 발생을 제거하는 메서드 (상대적으로 느림...ㅠ)
// Guava바 사용하기 :  CharMatcher String에서 특정 문자를 제거하기 위한 클래스.
// 아이디어는 지정된 문자 중 하나와 일치하는 문자 일치자를 가져오고 다음을 사용하여 지정된 문자 집합에서 일치하는 모든 문자를 제거하는 것입니다. removeFrom()
import java.util.*;
public class H120849 {
    public static String solution(String my_string){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
    }
        //String answer ="";
        //String str = my_string;
        //String charsToRemove = "a, e, i, o, u";

        //for (char c : charsToRemove.toCharArray()){
        //     str = str.replace(String.valueOf(c),"");
        // }

         ////str = CharMatcher.anyOf(charsToRemove).removeFrom(str);  Guava바

         //return answer;


    public static void main(String[] args){
        String my_string = "bus";
        System.out.println(solution(my_string));
    }
}
