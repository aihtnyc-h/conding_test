package Lv0;
/*
정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class H181920 {
	public int[] solution(int start, int end) {
		int[] answer = new int[end - start + 1];
		int index = 0;

		for (int i = 0; i <= end; i++) {
			answer[index++] = 1;
		}
		return answer;
	}
}
