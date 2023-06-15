package LV2;

public class H178870 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];  // 정답을 담을 배열
        int start = 0;  // 부분 수열의 시작 인덱스
        int end = 0;  // 부분 수열의 끝 인덱스
        int sum = 0;  // 현재 부분 수열의 합
        int min_length = Integer.MAX_VALUE;  // 최소 길이 저장 (최소 길이부터 시작하여 값이 작아지면 갱신)

        while (end < sequence.length) {  // 배열의 끝에 도달할 때까지 반복
            sum += sequence[end++];  // 끝 인덱스의 값을 합에 더하고 끝 인덱스를 한 칸 이동

            while (sum >= k) {  // 부분 수열의 합이 k 이상일 동안 반복
                if (sum == k && end - start < min_length) {  // 합이 k와 같고, 현재 길이가 최소 길이보다 작으면
                    min_length = end - start;  // 최소 길이 갱신
                    answer[0] = start;  // 시작 인덱스 저장
                    answer[1] = end - 1;  // 끝 인덱스 저장 (end는 이미 한 칸 이동했으므로 -1)
                }
                sum -= sequence[start++];  // 시작 인덱스의 값을 합에서 빼고 시작 인덱스를 한 칸 이동
            }
        }

        return answer;  // 시작 인덱스와 끝 인덱스가 저장된 배열 반환
    }
}



