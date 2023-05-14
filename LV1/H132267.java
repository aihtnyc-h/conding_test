package LV1;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class H132267 {
	public int solution(int a, int b, int n) {
		int answer = 0;

		while(n >= a) {
			int exchange = (n / a) * b;
			n = (n % a) + exchange;
			answer += exchange;
		}

		return answer;
	}
}