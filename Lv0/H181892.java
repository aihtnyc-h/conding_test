package Lv0;
/*
정수 리스트 num_list와 정수 n이 주어질 때,
 n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
import java.util.Arrays;

public class H181892 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
		return answer;
	}
}
