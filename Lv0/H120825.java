package Lv0;

import java.util.ArrayList;

public class H120825 {
    public static String solution(String my_string, int n){
        //Character 문자의 범주(소문자, 숫자 등) 결정하고 문자를 대문자에서 소문자로 또는 그 반대로 변환하기 위한 정적 메서드
        ArrayList<Character> rep=new ArrayList<Character>();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j <=n; j++) {
                rep.add(my_string.charAt(i));
                // 매개변수로 들어온 n번 만큼 for문을 arraylist에 my_string의 i번째 알파벳을 n번 넣음
            }
        }
        String answer="";
        for (char c : rep){
            answer += c;
        }
        return answer;
    }
    public static void main(String[] args){
        String my_string = "hello";
        int n = 3;
        System.out.println(my_string);
    }
}
