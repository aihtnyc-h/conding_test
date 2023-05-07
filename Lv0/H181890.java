package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

/*
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
"l"이나 "r"이 없다면 빈 리스트를 return합니다.
 */
public class H181890 {
	public String[] solution(String[] str_list) {
		ArrayList<String> resultList = new ArrayList<>();
		int index = 0;

		for (; index < str_list.length; index++) {
			if (str_list[index].equals("l") || str_list[index].equals("r")) {
				break;
			}
		}

		if (index < str_list.length) {
			if (str_list[index].equals("l")) {
				resultList.addAll(Arrays.asList(str_list).subList(0, index));
			} else {
				resultList.addAll(Arrays.asList(str_list).subList(index + 1, str_list.length));
			}
		}

		String[] answer = new String[resultList.size()];
		return resultList.toArray(answer);
	}
}