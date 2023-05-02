package Lv0;
/*
알파벳으로 이루어진 문자열 myString이 주어집니다.
모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 */
public class H181876 {
	public static String solution(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			answer += Character.toLowerCase(myString.charAt(i));
		}
		return answer;
	}
	public static void main(String[] args){
		String myString = "aBcDeFg";
		System.out.println(solution(myString));
	}
}
