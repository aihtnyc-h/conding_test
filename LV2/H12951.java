package LV2;
/*
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class H12951 {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] arr = s.split("");
		boolean capitalizeNextChar = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {
				capitalizeNextChar = true;
			} else if (capitalizeNextChar) {
				arr[i] = arr[i].toUpperCase();
				capitalizeNextChar = false;
			} else {
				arr[i] = arr[i].toLowerCase();
			}
			answer.append(arr[i]);
		}
		return answer.toString();
	}
}