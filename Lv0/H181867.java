package Lv0;

import java.util.ArrayList;
import java.util.List;

/*
문자열 myString이 주어집니다.
myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class H181867 {
	public int[] solution(String myString) {
		List<Integer> lengths = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'x') {
				lengths.add(count);
				count = 0;
			} else {
				count++;
			}
		}
		lengths.add(count);

		int[] result = new int[lengths.size()];
		for (int i = 0; i < lengths.size(); i++) {
			result[i] = lengths.get(i);
		}
		return result;
	}
}
