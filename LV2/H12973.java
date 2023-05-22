package LV2;

import java.util.Stack;

public class H12973 {
	public int solution(String s)
	{
		Stack<Character> stack = new Stack<>();  // 문자를 저장할 스택을 생성

		for (char c : s.toCharArray()) {  // 문자열의 각 문자에 대해 반복
			// 스택이 비어있지 않고, 스택의 맨 위에 있는 문자와 현재 문자가 같은 경우
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();  // 스택에서 문자를 제거
			} else {  // 그렇지 않은 경우
				stack.push(c);  // 스택에 현재 문자를 추가
			}
		}

		// 스택이 비어있는 경우, 즉, 모든 문자를 제거할 수 있는 경우에는 1을 반환하고,
		// 그렇지 않은 경우에는 0을 반환합니다.
		return stack.isEmpty() ? 1 : 0;
	}
}
