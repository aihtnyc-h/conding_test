package Lv0;
/*
문자열 myString이 주어집니다.
myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
 */
public class H181874 {
	public String solution(String myString) {
		StringBuilder sb = new StringBuilder();

		for (char ch : myString.toCharArray()) {
			if (ch == 'a') {
				sb.append('A');
			} else if (Character.isUpperCase(ch) && ch != 'A') {
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
