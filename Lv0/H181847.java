package Lv0;
/*
정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class H181847 {
	public String solution(String n_str) {
		int index = 0;

		while (index < n_str.length() && n_str.charAt(index) == '0') {
			index++;
		}
        return n_str.substring(index);
	}
}
