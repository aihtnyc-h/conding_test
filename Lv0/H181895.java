package Lv0;

import java.util.Arrays;

public class H181895 {
	public int[] solution(int[] arr, int[][] intervals) {
		int[] firstInterval = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
		int[] secondInterval = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

		int[] answer = new int[firstInterval.length + secondInterval.length];
		System.arraycopy(firstInterval, 0, answer, 0, firstInterval.length);
		System.arraycopy(secondInterval, 0, answer, firstInterval.length, secondInterval.length);

		return answer;
	}
}
