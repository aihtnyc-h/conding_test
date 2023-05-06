package Lv0;
/*
정수 리스트 num_list와 정수 n이 주어질 때,
num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 */
import java.util.Arrays;

public class H181891 {
	public int[] solution(int[] num_list, int n) {
		int[] firstPart = Arrays.copyOfRange(num_list, 0, n);
		int[] secondPart = Arrays.copyOfRange(num_list, n, num_list.length);

		int[] answer = new int[num_list.length];
		System.arraycopy(secondPart, 0, answer, 0, secondPart.length);
		System.arraycopy(firstPart, 0, answer, secondPart.length, firstPart.length);

		return answer;
	}
}
