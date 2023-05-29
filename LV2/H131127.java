package LV2;

import java.util.HashMap;
import java.util.Map;

public class H131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 정현이가 원하는 제품들과 그 수량을 맵에 저장
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 할인 제품 목록을 10일 동안의 윈도우로 슬라이드하면서
        // 해당 기간 동안의 제품과 수량을 또 다른 맵에 저장
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            // 두 맵을 비교하여 원하는 제품의 수량을 모두 충족시키는지 확인
            boolean isMatch = true;
            for (String key : wantMap.keySet()) {
                if (wantMap.get(key) > discountMap.getOrDefault(key, 0)) {
                    isMatch = false;
                    break;
                }
            }

            // 만약 원하는 제품의 수량을 모두 충족시킨다면, 정답을 1 증가시킨다.
            if (isMatch) {
                answer++;
            }
        }

        // 계산된 정답을 반환
        return answer;
    }
}
