package LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H160586 {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, List<int[]>> keyMap = new HashMap<>();  // 키맵을 저장할 맵
        Map<Character, Integer> lastPress = new HashMap<>();  // 이전 키의 누름 횟수를 저장할 맵

        // 키맵 구성
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if (!keyMap.containsKey(c)) {
                    keyMap.put(c, new ArrayList<>());
                }
                keyMap.get(c).add(new int[]{i, j+1});
            }
        }

        int[] result = new int[targets.length];  // 결과를 저장할 배열

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];  // 대상 문자열
            int presses = 0;  // 누름 횟수
            int prevKey = -1;  // 이전 키의 인덱스
            lastPress.clear();  // 이전 키의 누름 횟수 맵 초기화

            for (char c : target.toCharArray()) {
                if (!keyMap.containsKey(c)) {  // 문자가 키맵에 없는 경우
                    presses = -1;  // 작성 불가능한 문자열
                    break;
                }

                List<int[]> options = keyMap.get(c);  // 문자에 대한 가능한 옵션 리스트
                int minPresses = Integer.MAX_VALUE;  // 최소 누름 횟수
                int keyForMinPresses = -1;  // 최소 누름 횟수를 갖는 키의 인덱스

                for (int[] option : options) {
                    int optionPresses = option[1];
                    if (option[0] == prevKey && lastPress.containsKey(c)) {
                        // 이전 키와 같은 키를 누르는 경우
                        // 이전 키의 누름 횟수를 고려하여 추가 누름 횟수 계산
                        optionPresses += Math.max(option[1] - lastPress.get(c), 0);
                    }
                    if (optionPresses < minPresses) {
                        // 최소 누름 횟수 갱신
                        minPresses = optionPresses;
                        keyForMinPresses = option[0];
                    }
                }

                presses += minPresses;
                prevKey = keyForMinPresses;
                lastPress.put(c, minPresses);

            }

            result[i] = presses;
        }

        return result;
    }
}