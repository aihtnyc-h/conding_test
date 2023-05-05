package Lv0;
/*
정수 배열 arr과 delete_list가 있습니다.
arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class H181844 {
	public int[] solution(int[] arr, int[] delete_list) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> deleteSet = new HashSet<>();

		for (int del : delete_list) {
			deleteSet.add(del);
		}

		for (int num : arr) {
			if (!deleteSet.contains(num)) {
				result.add(num);
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}
