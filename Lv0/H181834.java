package Lv0;
/*
알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
 */
public class H181834 {
	public String solution(String myString) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < myString.length(); i++) {
			char c = myString.charAt(i);
			if (c < 'l') {
				answer.append('l');
			} else {
				answer.append(c);
			}
		}
		return answer.toString();
	}
}
