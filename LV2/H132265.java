package LV2;

import java.util.HashMap;
import java.util.Map;

public class H132265 {
    public int solution(int[] topping) {
        // 각 토핑의 종류와 그 개수를 저장하는 Map을 초기화한다.
        Map<Integer, Integer> map = new HashMap<>();
        int n = topping.length;  // 토핑의 개수

        // 각 위치에서의 토핑의 종류의 수를 저장하는 prefixSum과 suffixSum 배열을 초기화한다.
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        // prefixSum을 계산한다.
        // 첫 번째 토핑부터 순서대로 더해가면서 각 위치에서의 토핑의 종류의 수를 구한다.
        for (int i = 0; i < n; i++) {
            // 현재 위치의 토핑을 map에 추가하거나 개수를 업데이트한다.
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
            // 현재 위치에서의 토핑의 종류의 수를 prefixSum에 저장한다.
            prefixSum[i] = map.size();
        }

        // map을 초기화한다.
        map.clear();

        // suffixSum을 계산한다.
        // 마지막 토핑부터 역순으로 더해가면서 각 위치에서의 토핑의 종류의 수를 구한다.
        for (int i = n - 1; i >= 0; i--) {
            // 현재 위치의 토핑을 map에 추가하거나 개수를 업데이트한다.
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
            // 현재 위치에서의 토핑의 종류의 수를 suffixSum에 저장한다.
            suffixSum[i] = map.size();
        }

        int answer = 0;
        // prefixSum[i]와 suffixSum[i+1]이 같은 경우의 수를 세어 answer에 저장한다.
        for (int i = 0; i < n - 1; i++) {
            if (prefixSum[i] == suffixSum[i + 1]) {
                answer++;
            }
        }

        // 롤케이크를 공평하게 자르는 방법의 수를 반환한다.
        return answer;
    }
}