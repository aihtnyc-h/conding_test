package LV2;

import java.util.Stack;

public class H154539 {
    public int[] solution(int[] numbers) {
        // numbers의 길이를 length에 저장한다.
        int length = numbers.length;

        // 결과를 담을 배열 answer를 초기화하고, 모든 원소를 -1로 설정한다.
        int[] answer = new int[length];

        // 숫자를 저장할 스택을 생성한다.
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < length; i++) {
            answer[i] = -1;
        }

        // 오른쪽에서 왼쪽으로 이동하면서 각 숫자에 대한 뒷 큰수를 찾는다.
        for(int i = length - 1; i >= 0; i--) {
            // 현재 숫자가 스택의 최상위 숫자보다 크면, 스택에서 숫자를 빼고 뒷 큰수를 현재 숫자로 설정한다.
            while(!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            // 스택이 비어있지 않고, 스택의 최상위 숫자가 현재 숫자보다 크다면, 뒷 큰수를 스택의 최상위 숫자로 설정한다.
            if(!stack.isEmpty() && stack.peek() > numbers[i]) {
                answer[i] = stack.peek();
            }

            // 현재 숫자를 스택에 넣는다.
            stack.push(numbers[i]);
        }

        // 모든 숫자의 뒷 큰수를 담은 배열을 반환한다.
        return answer;
    }
}
