package Lv0;
/*
알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.

단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 */
public class H181878 {
	public int solution(String myString, String pat) {
		int answer = 0;
		String lowerMyString = myString.toLowerCase();
		String lowerPat = pat.toLowerCase();

		for (int i = 0; i <= lowerMyString.length() - lowerPat.length(); i++) {
			String substring = lowerMyString.substring(i, i + lowerPat.length());

			if (substring.equals(lowerPat)) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}
