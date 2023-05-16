package LV1;

public class H136798 {
	// number: 기사단원의 수, limit: 공격력의 제한수치, power: 제한수치를 초과할 때 사용할 무기의 공격력
	public int solution(int number, int limit, int power) {
		// 필요한 철의 총 무게를 저장할 변수
		int answer = 0;

		// 각 기사단원에 대하여
		for (int i = 1; i <= number; i++) {
			// i번 기사단원의 약수의 개수를 계산
			int divisors = countDivisors(i);

			// 약수의 개수가 제한수치를 초과하면 power만큼의 철이 필요
			if (divisors > limit) {
				answer += power;
			}
			// 제한수치를 초과하지 않으면 약수의 개수만큼의 철이 필요
			else {
				answer += divisors;
			}
		}

		// 필요한 철의 총 무게를 반환
		return answer;
	}

	// 주어진 수 n의 약수의 개수를 계산하는 메서드
	private int countDivisors(int n) {
		// 약수의 개수를 저장할 변수
		int count = 0;

		// 1부터 n의 제곱근까지의 모든 수에 대하여
		for (int i = 1; i <= Math.sqrt(n); i++) {
			// i가 n의 약수라면
			if (n % i == 0) {
				// n/i가 i와 같으면 약수가 하나 더 있는 것이므로 count를 1 증가
				if (n / i == i) {
					count++;
				}
				// 그렇지 않으면 약수가 두 개 더 있는 것이므로 count를 2 증가
				else {
					count += 2;
				}
			}
		}

		// 약수의 개수를 반환
		return count;
	}
}
