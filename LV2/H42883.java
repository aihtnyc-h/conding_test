package LV2;

import java.util.Stack;

public class H42883 {
    public String solution(String number, int k) {
        // 결과를 저장할 배열, k개의 숫자를 제거하므로 전체 길이에서 k를 뺀 만큼만 필요
        char[] result = new char[number.length() - k];
        // 숫자를 저장할 스택
        Stack<Character> stack = new Stack<>();

        // 입력 문자열의 모든 문자를 순회
        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            // 스택이 비어있지 않고, 스택의 맨 위 숫자가 현재 숫자보다 작고, 아직 제거할 숫자가 남아있는 동안
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop(); // 스택의 맨 위 숫자 제거
            }
            // 현재 숫자를 스택에 삽입
            stack.push(c);
        }
        // 스택의 내용을 결과 배열에 복사
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        // 결과 배열을 문자열로 변환하여 반환
        return new String(result);
    }
}