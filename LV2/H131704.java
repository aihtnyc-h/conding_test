package LV2;

import java.util.Stack;

public class H131704 {
    public int solution(int[] order) {
        // 실은 상자의 개수를 저장하는 변수
        int answer = 0;

        // 보조 벨트를 구현한 스택
        Stack<Integer> stack = new Stack<>();

        // 다음에 트럭에 실어야 할 상자 번호
        int next = 1;

        // 현재 메인 벨트에서 확인하고 있는 상자의 위치
        int i = 0;

        // order 배열의 각 원소를 key로, 그 위치를 value로 하는 box 배열을 생성
        // 이 배열은 각 상자가 트럭에 언제 실어야 하는지를 저장
        int[] box = new int[order.length + 1];
        for(int j = 0; j < order.length; j++) {
            box[order[j]] = j+1;
        }

        // 모든 상자를 확인할 때까지 반복
        while (next <= order.length) {
            // 현재 확인하고 있는 상자가 트럭에 실어야 할 상자라면
            if (i < order.length && box[i+1] == next) {
                // 트럭에 실고, 다음 상자를 확인
                next++;
                i++;
                answer++;

                // 보조 벨트에서 상자를 확인하면서, 트럭에 실어야 할 상자가 있으면 싣는다.
                while (!stack.isEmpty() && stack.peek() == next) {
                    stack.pop();
                    next++;
                    answer++;
                }
                // 현재 확인하고 있는 상자가 트럭에 실어야 할 상자가 아니라면
            } else if (i < order.length){
                // 보조 벨트에 넣고, 다음 상자를 확인한다.
                stack.push(box[i+1]);
                i++;
            } else {
                // 모든 상자를 확인했다면 반복문을 종료한다.
                break;
            }
        }

        // 트럭에 실은 상자의 개수를 반환한다.
        return answer;
    }
}