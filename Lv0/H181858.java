package Lv0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후,
지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.

이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.

정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.

단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
 */
public class H181858 {
	public int[] solution(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int num : arr) {
			if (!set.contains(num)) {
				set.add(num);
				list.add(num);
			}
			if (list.size() == k) {
				break;
			}
		}
		while (list.size() < k) {
			list.add(-1);
		}

		int[] answer = new int[k];
		for (int i = 0; i < k; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

/*
주어진 배열을 순회하면서 HashSet을 사용해 중복되지 않는 요소들을 찾기
중복되지 않는 요소들은 ArrayList에 추가
while 문 만약 리스트의 크기가 k와 같아지면 루프를 종료
리스트의 크기가 k보다 작다면 -1을 추가해 길이를 맞춤
리스트의 요소들을 결과 배열에 복사하고 반환
 */