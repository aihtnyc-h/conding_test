package LV2;

public class H42584 {
        public int[] solution(int[] prices) {
            // 결과를 저장할 배열을 초기화
            int[] answer = new int[prices.length];

            // 모든 주식 가격에 대해 반복
            for(int i = 0; i < prices.length; i++) {
                // i 시점 이후의 주식 가격에 대해 반복
                for(int j = i + 1; j < prices.length; j++) {
                    // 가격이 떨어지지 않았으므로, 가격이 떨어지지 않은 기간을 1 증가시킨다.
                    answer[i]++;
                    // 만약 가격이 떨어졌다면, 더 이상 체크하지 않고 다음 가격으로 넘어감
                    if(prices[i] > prices[j]) break;
                }
            }

            // 계산된 결과를 반환
            return answer;
        }
    }
