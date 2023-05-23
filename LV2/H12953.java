package LV2;

public class H12953 {
	public static void main(String[] args) {
		// 테스트 케이스 정의
		int[] arr1 = {2, 6, 8, 14};
		int[] arr2 = {1, 2, 3};

		// 테스트 케이스 실행 및 결과 출력
		System.out.println(solution(arr1)); // 출력: 168
		System.out.println(solution(arr2)); // 출력: 6
	}

	// 최소공배수를 구하는 메서드
	public static int solution(int[] arr) {
		// 첫 번째 값을 answer로 초기화
		int answer = arr[0];

		// arr 배열의 각 요소에 대해
		for (int i = 1; i < arr.length; i++) {
			// answer와 다음 값의 최소공배수를 계산하여 answer 업데이트
			answer = lcm(answer, arr[i]);
		}

		// 최종 계산된 최소공배수 반환
		return answer;
	}

	// 최대공약수를 구하는 메서드
	private static int gcd(int a, int b) {
		// b가 0이 아닐 동안 반복
		while (b != 0) {
			// a를 b로 나눈 나머지를 r에 저장
			int r = a % b;
			// a에 b를 대입
			a = b;
			// b에 r을 대입
			b = r;
		}
		// 최대공약수인 a 반환
		return a;
	}

	// 최소공배수를 구하는 메서드
	private static int lcm(int a, int b) {
		// a와 b의 곱을 a와 b의 최대공약수로 나눈 값 반환
		return a * b / gcd(a, b);
	}
}