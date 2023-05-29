package LV2;

public class H43165 {
    // 주요 함수: 주어진 배열과 목표값을 입력으로 받아서 조합의 수를 리턴함
    public int solution(int[] numbers, int target) {
        // 깊이 우선 탐색(dfs) 함수를 호출하여 조합의 수를 계산하고 반환
        // 초기 인덱스는 0이고, 초기 합계는 0
        return dfs(numbers, target, 0, 0);
    }

    // 깊이 우선 탐색 (dfs) 함수 정의
    // 인풋으로 숫자 배열, 목표값, 현재 인덱스, 현재 합계를 받음
    public int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 검사했을 때(인덱스가 숫자 배열의 길이와 같을 때)
        if(index == numbers.length) {
            // 현재 합계와 목표값이 같다면, 조합의 수는 1
            if(sum == target) {
                return 1;
            }
            // 그렇지 않다면, 조합의 수는 0
            return 0;
        }

        // dfs 함수를 재귀적으로 두 번 호출하여 각 숫자에 대해 더하거나 빼는 경우를 모두 탐색
        // 이후에 이 두 가지 경우에서 나온 조합의 수를 모두 더함
        return dfs(numbers, target, index + 1, sum + numbers[index]) // 현재 숫자를 더하는 경우
                + dfs(numbers, target, index + 1, sum - numbers[index]); // 현재 숫자를 빼는 경우
    }
}
