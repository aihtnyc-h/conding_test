package LV2;

import java.util.LinkedList;
import java.util.Queue;

public class H42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();  // 다리를 표현하기 위한 큐
        int sum = 0;  // 현재 다리 위에 있는 트럭들의 무게 합
        int time = 0;  // 걸리는 시간

        // 각 트럭에 대해
        for (int truck_weight : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {  // 다리가 비어있다면
                    bridge.offer(truck_weight);  // 트럭을 다리로 보낸다.
                    sum += truck_weight;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {  // 다리가 꽉 차 있다면
                    sum -= bridge.poll();  // 다리 맨 앞에 있는 트럭을 내보낸다.
                } else {  // 다리에 여유 공간이 있다면
                    if (sum + truck_weight > weight) {  // 다리 위의 트럭 무게와 대기 중인 트럭 무게의 합이 weight를 초과한다면
                        bridge.offer(0);  // 무게가 0인 트럭을 다리로 보낸다. 이는 대기 상태를 유지하는 것을 의미한다.
                        time++;
                    } else {  // weight를 초과하지 않는다면
                        bridge.offer(truck_weight);  // 트럭을 다리로 보낸다.
                        sum += truck_weight;
                        time++;
                        break;
                    }
                }
            }
        }

        return time + bridge_length;  // 모든 트럭이 다리를 건너는데 걸리는 전체 시간을 반환
    }
}