package Lv0;
/*
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수 `a`와 `b`가 주어졌을 때, `a` ⊕ `b`와 `b` ⊕ `a` 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, `a` ⊕ `b`와 `b` ⊕ `a`가 같다면 `a` ⊕ `b`를 return 합니다.
 */
public class H181939 {
	public int solution(int a, int b) {
		// a와 b를 문자열로 반환하여 저장
		String a_str = Integer.toString(a);
		String b_str = Integer.toString(b);
		// 숫자로 변환한 후 a_b_concat, b_a_concat에 저장
		int a_b_concat = Integer.parseInt(a_str + b_str);
		int b_a_concat = Integer.parseInt(b_str + a_str);
		// Math.max() 함수를 사용하여 a_b_concat, b_a_concat 중 더 큰 값을 반환!
		return Math.max(a_b_concat, b_a_concat);
	}
}
