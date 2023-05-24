package LV2;

import java.util.Stack;

public class H76502 {
	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			// 문자열을 왼쪽으로 x칸 회전시킴
			String rotated = s.substring(i) + s.substring(0, i);

			// 스택을 비우고 새로운 문자열의 괄호들을 확인
			stack.clear();
			boolean isCorrect = true;
			for (char c : rotated.toCharArray()) {
				if (c == '(' || c == '[' || c == '{') {
					stack.push(c);
				} else {
					if (stack.isEmpty()) {
						isCorrect = false;
						break;
					}
					char top = stack.pop();
					if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
						isCorrect = false;
						break;
					}
				}
			}

			// 올바른 괄호 문자열인 경우 카운트 증가
			if (isCorrect && stack.isEmpty()) {
				answer++;
			}
		}

		return answer;
	}
}