package Lv0;
//정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.List;

public class H181899 {
	public List<Integer> solution(int start, int end) {
		List<Integer> result = new ArrayList<>();

		for (int i = start; i >= end; i--) {
			result.add(i);
		}

		return result;
	}
}
