package Lv0;
/*
한 자리 정수로 이루어진 문자열 num_str이 주어질 때,
각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class H181849 {
	public int solution(String num_str) {
		int sum = 0; // 각 자릿수의 합을 저장할 변수를 초기화

		// 문자열의 길이만큼 반복문을 돌면서 각 자리수를 더함
		for (int i = 0; i < num_str.length(); i++) {
			// 문자열의 i번째 문자를 정수로 변환하고 합계를 변수에 더함
			sum += num_str.charAt(i) - '0';
		}
		// 최종 합계를 반환
		return sum;
	}
}
