package LV2;

public class H87390 {
    public int[] solution(int n, long left, long right) {
        // 1. 결과를 저장할 answer 배열을 초기화합니다. 크기는 right - left + 1 입니다.
        int[] answer = new int[(int)(right-left+1)];

        // 2. left부터 right까지 각 위치에 대해 값을 계산합니다.
        for (long i = left; i <= right; i++) {
            // 3. i의 위치에서의 값은 행 번호(i/n)와 열 번호(i%n) 중 큰 값입니다.
            //    배열의 인덱스는 0부터 시작하고, 숫자는 1부터 시작하므로 계산된 값에 1을 더해줍니다.
            answer[(int)(i-left)] = (int)(Math.max(i/n, i%n) + 1);
        }

        // 4. 계산된 결과 배열을 반환합니다.
        return answer;
    }
}