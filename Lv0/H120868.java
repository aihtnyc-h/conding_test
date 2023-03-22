package Lv0;

public class H120868 {
	public static int solution(int[] sides) {
		int answer = 0;

		// Math 클래스를 이용하여 최대 최소 값을 구한다.
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);
		int sum = max + min;

		// 가장 긴변이 max 일 경우
		for (int i = 1; i <= sum; i++) {
			if ((i+min) > max && (i+min) <= sum){
				answer++;
			}
		}
		// 나머지 한변이 긴 경우
		answer += (sum - max)-1;

		return answer;
	}
	public static void main(String[] args) {
		int[] sides = {1, 2};
		System.out.println(solution(sides));
	}
}
