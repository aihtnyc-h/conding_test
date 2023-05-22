package LV1;

import java.util.LinkedList;

/*
햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고,
상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때,
두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다. 즉, 2개의 햄버거를 포장하게 됩니다.

상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.
 */
public class H133502 {
	public int solution(int[] ingredient) {
		// 재료를 담을 LinkedList(Deque)를 생성
		LinkedList<Integer> deque = new LinkedList<>();

		// 완성된 햄버거의 개수를 카운트하는 변수를 선언
		int count = 0;

		// 입력받은 모든 재료에 대해 순회
		for (int i : ingredient) {
			// 재료를 Deque의 맨 끝에 추가
			deque.offerLast(i);

			// Deque에 4개 이상의 재료가 있다면, 햄버거가 만들어질 수 있는지 검사
			while (deque.size() >= 4) {
				int size = deque.size();
				// 최근에 추가된 4개의 재료가 "빵-야채-고기-빵" 순서인지 확인
				if (deque.get(size - 4) == 1 && deque.get(size - 3) == 2 && deque.get(size - 2) == 3 && deque.get(size - 1) == 1) {
					// "빵-야채-고기-빵" 순서라면, 햄버거를 만들고 해당 재료를 Deque에서 제거
					for (int j = 0; j < 4; j++)
						deque.pollLast();
					// 햄버거의 개수를 증가시킴
					count++;
				} else {
					// "빵-야채-고기-빵" 순서가 아니라면, 더 이상 재료를 제거하지 않고 검사를 멈춘다.
					break;
				}
			}
		}
		// 완성된 햄버거의 개수를 반환
		return count;
	}
}