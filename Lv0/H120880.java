package Lv0;

import java.util.Arrays;
import java.util.Comparator;

/*
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class H120880 {
	public int[] solution(int[] numlist, int n) {
		// 거리를 계한하는 함수 정의
		Comparator<Integer> distanceComparator = (num1, num2) -> {
			int dist1 = Math.abs(num1 - n);
			int dist2 = Math.abs(num2 - n);

			if (dist1 == dist2) {
				return num2 - num1;
			} else {
				return dist1 - dist2;
			}
		};

		// int[] numlist를 Integer[]로 변환
		Integer[] numlistInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

		// numlistInteger를 distanceComparator를 기준으로 정렬
		Arrays.sort(numlistInteger, distanceComparator);

		// Integer[] numlistInteger를 int[]로 변환하고 반환
		return Arrays.stream(numlistInteger).mapToInt(Integer::intValue).toArray();
	}
}