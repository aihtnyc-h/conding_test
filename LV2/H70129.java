package LV2;

/*
0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

x의 모든 0을 제거합니다.
x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때,
이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
*/
public class H70129 {
	public int[] solution(String s) {
		int[] answer = new int[2]; // 이진 변환 횟수와 0의 제거 개수를 저장할 배열
		while (!s.equals("1")) { // s가 "1"이 될 때까지 계속
			String temp = s.replace("0", ""); // s에서 모든 '0'을 제거
			answer[1] += s.length() - temp.length(); // 제거된 '0'의 개수를 계산하고, answer[1]에 더함
			s = Integer.toBinaryString(temp.length()); // s를 '0'이 제거된 문자열의 길이를 2진수로 변환한 문자열로 업데이트
			answer[0]++; // 이진 변환 횟수 증가
		}
		return answer; // 이진 변환 횟수와 0의 제거 개수를 배열에 담아 반환
	}
}
