package Lv0;

public class H181864 {
	public int solution(String myString, String pat) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();

		// myString의 문자를 순회하며 "A"를 "B"로, "B"를 "A"로 바꾼 문자열을 생성합니다.
		for (char ch : myString.toCharArray()) {
			if (ch == 'A') {
				sb.append('B');
			} else if (ch == 'B'){
				sb.append('A');
			}
		}
		String swappedString = sb.toString();

		// 생성된 문자열의 모든 가능한 부분 문자열에 대해 반복문을 수행하며,
		// 각 부분 문자열이 pat와 같은지 확인합니다.
		for (int i = 0; i <= swappedString.length() - pat.length(); i++) {
			String substring = swappedString.substring(i, i + pat.length());

			if (substring.equals(pat)) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}
