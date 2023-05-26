package Lv0;

import java.util.ArrayList;
import java.util.List;

public class H181899 {
	// start와 end 값을 받아 start에서 end까지 1씩 감소하는 정수들을
	// 리스트에 담아 반환하는 함수
	public List<Integer> solution(int start, int end) {
		// 결과를 담을 ArrayList를 생성
		List<Integer> result = new ArrayList<>();

		// start 값부터 end 값까지 반복
		// 반복 변수 i는 start에서 시작하여 1씩 감소하며, end 값 이하가 될 때까지 반복
		for (int i = start; i >= end; i--) {
			// 감소하는 i 값을 리스트에 추가
			result.add(i);
		}

		// start에서 end까지 1씩 감소하는 값들이 담긴 리스트를 반환
		return result;
	}
}
