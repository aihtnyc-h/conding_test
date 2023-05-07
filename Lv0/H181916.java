package Lv0;

import java.util.HashMap;
import java.util.Map;

/*
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

- 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
- 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q) 점을 얻습니다.

    2

- 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
- 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
- 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 `a`, `b`, `c`, `d`로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 */
public class H181916 {
	public int solution(int a, int b, int c, int d) {
		int[] dice = {a, b, c, d};
		HashMap<Integer, Integer> counts = new HashMap<>();

		for (int number : dice) {
			counts.put(number, counts.getOrDefault(number, 0) + 1);
		}

		if (counts.size() == 1) {
			return 1111 * a;
		} else if (counts.size() == 2) {
			int[] numbers = new int[2];
			int[] countsList = new int[2];
			int index = 0;

			for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
				numbers[index] = entry.getKey();
				countsList[index] = entry.getValue();
				index++;
			}

			if (countsList[0] == 3 || countsList[1] == 3) {
				int p = numbers[0];
				int q = numbers[1];
				if (countsList[1] == 3) {
					p = numbers[1];
					q = numbers[0];
				}
				return (10 * p + q) * (10 * p + q);
			} else {
				int p = numbers[0];
				int q = numbers[1];
				return (p + q) * Math.abs(p - q);
			}
		} else if (counts.size() == 3) {
			int p = 0;
			for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
				if (entry.getValue() == 2) {
					p = entry.getKey();
				}
			}
			int q = 0;
			int r = 0;
			for (int number : counts.keySet()) {
				if (number != p) {
					if (q == 0) {
						q = number;
					} else {
						r = number;
					}
				}
			}
			return q * r;
		} else {
			return Math.min(Math.min(a, b), Math.min(c, d));
		}
	}

}
