package Lv0;

import java.util.ArrayList;

/*
문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.

배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class H181912 {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> ret = new ArrayList<>();

		for (String str : intStrs) {
			String substring = str.substring(s, s + l);
			int num = Integer.parseInt(substring);
			if (num > k) {
				ret.add(num);
			}
		}

		int[] result = new int[ret.size()];
		for (int i = 0; i < ret.size(); i++) {
			result[i] = ret.get(i);
		}

		return result;
	}
}