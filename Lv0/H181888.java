package Lv0;

import java.util.ArrayList;

public class H181888 {
	public int[] solution(int[] num_list, int n) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < num_list.length; i += n) {
			result.add(num_list[i]);
		}

		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}
}
/*
정수 배열 num_list와 정수 n에 따라 num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어 있는 원소들을 차례로 담은 배열을 반환하는 Java 클래스
for 루프를 사용하여 결과 리스트를 계산하고, 그 결과를 int[] 배열로 변환하여 반환
 */