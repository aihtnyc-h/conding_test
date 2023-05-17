package LV2;

/*
'(' 또는 ')' 로 이루어진 문자열 s가 주어졌을 때, 올바른 괄호라면 true를, 올바르지 않은 괄호라면 false를 반환하는 solution 함수를 완성합니다.

올바른 괄호는 '(' 문자로 열리면 반드시 ')' 문자로 닫히는 것을 말합니다.
예를 들어, "()()" 또는 "(())()"는 올바른 괄호이고, ")()(" 또는 "(()("는 올바르지 않은 괄호입니다.

제한사항:
문자열 s의 길이: 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
*/

import java.util.Stack;

public class H12909 {
	public static boolean solution(String s) {
		// 문자열 s를 검사하기 위한 스택을 생성합니다.
		Stack<Character> stack = new Stack<>();

		// 문자열 s의 모든 문자를 순회합니다.
		for (char c : s.toCharArray()) {
			// 현재 문자가 '('라면 스택에 푸시합니다.
			if (c == '(') {
				stack.push(c);
			}
			// 현재 문자가 ')'라면 스택에서 팝합니다.
			else if (c == ')') {
				// 만약 스택이 비어있다면 올바르지 않은 괄호이므로 false를 반환합니다.
				if (stack.empty()) {
					return false;
				}
				// 스택이 비어있지 않다면 스택에서 팝합니다.
				else {
					stack.pop();
				}
			}
		}
		// 모든 문자를 순회한 후 스택이 비어있다면 올바른 괄호이므로 true를 반환하고, 그렇지 않다면 false를 반환합니다.
		return stack.empty();
	}

	public static void main(String[] args) {
		System.out.println(solution("()()"));  // true를 반환
		System.out.println(solution("(())()"));  // true를 반환
		System.out.println(solution(")()("));  // false를 반환
		System.out.println(solution("(()("));  // false를 반환
	}
}
