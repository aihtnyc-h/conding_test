package Lv0;

import java.util.Arrays;

/*
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class H120882 {
	public int[] solution(int[][] score) {
		int n = score.length;
		double[] averages = new double[n];
		Integer[] ranks = new Integer[n];

		// 평균 점수 계산
		for (int i = 0; i < n; i++) {
			averages[i] = (score[i][0] + score[i][1]) / 2.0;
			ranks[i] = i;
		}

		// 등수를 계산하기 위해 averages 배열을 정렬합니다.
		// 람다 표현식을 사용하여 정렬 기준을 평균 점수로 설정하고, 내림차순으로 정렬합니다.
		Arrays.sort(ranks, (a, b) -> Double.compare(averages[b], averages[a]));

		// 각 학생의 등수를 찾습니다.
		int[] answer = new int[n];
		int rank = 1;
		for (int i = 0; i < n; i++) {
			if (i > 0 && averages[ranks[i]] != averages[ranks[i - 1]]) {
				rank = i + 1;
			}
			answer[ranks[i]] = rank;
		}
		return answer;
	}
}
