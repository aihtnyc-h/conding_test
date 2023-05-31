package LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H17684 {
        public int[] solution(String msg) {
            Map<String, Integer> dict = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            // 사전 초기화: A-Z까지의 모든 단어를 사전에 추가
            for(int i = 0; i < 26; i++) {
                dict.put(String.valueOf((char)('A' + i)), i + 1);
            }

            int dictSize = 27;  // 사전에 추가될 새로운 단어의 색인 번호
            int msgLength = msg.length();  // 입력된 메시지의 길이

            // 메시지를 순차적으로 확인
            for(int i = 0; i < msgLength; ) {
                String w = "";  // 현재 확인하고 있는 단어
                // 사전에 있는 단어인지 확인하며 메시지를 읽음
                while(i < msgLength && dict.containsKey(w + msg.charAt(i))) {
                    w += msg.charAt(i);
                    i++;
                }

                // 사전에 없는 단어를 찾아낸 경우 그 단어의 색인 번호를 결과에 추가
                result.add(dict.get(w));

                // 사전에 새로운 단어로 추가
                if(i < msgLength) {
                    dict.put(w + msg.charAt(i), dictSize++);
                }
            }

            // 결과를 배열로 변환하여 반환
            int[] answer = new int[result.size()];
            for(int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;
        }
    }
