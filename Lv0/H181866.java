package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

/*
문자열 myString이 주어집니다.
"x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.

단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 */
public class H181866 {
	public String[] solution(String myString) {
		String[] splitStrings = myString.split("x");
		ArrayList<String> nonEmptyStrings = new ArrayList<>();

		for (String str : splitStrings) {
			if (!str.isEmpty()) {
				nonEmptyStrings.add(str);
			}
		}
		String[] answer = new String[nonEmptyStrings.size()];
		answer = nonEmptyStrings.toArray(answer);
		Arrays.sort(answer);

		return answer;
	}
}
