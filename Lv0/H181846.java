package Lv0;
/*
0 이상의 두 정수가 문자열 a, b로 주어질 때,
a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */
public class H181846 {
	public String solution(String a, String b) {
		// 문자열을 정수로 변환
		java.math.BigInteger num1 = new java.math.BigInteger(a);
		java.math.BigInteger num2 = new java.math.BigInteger(b);

		// 두 정수를 더함
		java.math.BigInteger sum = num1.add(num2);

		// 결과를 문자열로 변환하여 반환
		return sum.toString();
	}
}
