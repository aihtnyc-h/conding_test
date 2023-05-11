package Lv0;

import java.util.HashSet;
import java.util.Set;

/*
문자열 my_string과 정수 배열 indices가 주어질 때,
my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181900 {
	public String solution(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder();
		Set<Integer> indexSet = new HashSet<>();

		for (int index : indices) {
			indexSet.add(index);
		}
		for (int i = 0; i < my_string.length(); i++) {
			if (!indexSet.contains(i)) {
				sb.append(my_string.charAt(i));
			}
		}
		return sb.toString();
	}
}
