package LV2;

import java.util.Arrays;

public class H42885 {
	public static void main(String[] args) {
		int[] people1 = {70, 50, 80, 50};
		int limit1 = 100;
		int[] people2 = {70, 80, 50};
		int limit2 = 100;

		System.out.println(solution(people1, limit1)); // 출력: 3
		System.out.println(solution(people2, limit2)); // 출력: 3
	}

	public static int solution(int[] people, int limit) {
		Arrays.sort(people); // 사람들의 몸무게를 오름차순으로 정렬

		int i = 0, j = people.length - 1; // i는 가장 가벼운 사람을, j는 가장 무거운 사람을 가리킴
		int answer = 0; // 필요한 구명보트의 최소 개수

		while(i <= j) { // 구출해야 할 사람이 더 있는 동안 반복
			answer++; // 구명보트 1개 추가

			if (people[i] + people[j] <= limit) // 가장 가벼운 사람과 가장 무거운 사람이 함께 탈 수 있으면
				i++; // 가장 가벼운 사람을 구출 완료로 표시

			j--; // 가장 무거운 사람을 구출 완료로 표시
		}

		return answer; // 필요한 구명보트의 최소 개수 반환
	}
}