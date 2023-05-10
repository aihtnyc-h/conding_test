package Lv0;

import java.util.HashMap;
/*
문자열 배열 strArr이 주어집니다.
strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 */
public class H181855 {
	public int solution(String[] strArr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (String str : strArr) {
			int length = str.length();
			map.put(length, map.getOrDefault(length, 0) + 1);
		}

		int maxCount = 0;
		for (int count : map.values()) {
			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}
}