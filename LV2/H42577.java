package LV2;

import java.util.HashMap;

public class H42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;  // 결과를 저장할 변수 초기화
        HashMap<String, Integer> map = new HashMap<>();  // 전화번호를 저장할 해시맵 초기화

        // 전화번호들을 해시맵에 저장. 전화번호는 key로, 해당 인덱스는 value로 사용
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        // phone_book 배열을 다시 반복하면서 각 전화번호의 접두사를 확인
        for(int i = 0; i < phone_book.length; i++) {
            // 각 전화번호의 접두사를 생성
            for(int j = 1; j < phone_book[i].length(); j++) {
                // 생성한 접두사가 해시맵에 있는지 확인
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    // 만약 접두사가 해시맵에 있다면, 해당 접두사는 다른 전화번호의 접두사이므로 결과를 false로 설정하고 반환
                    answer = false;
                    return answer;
                }
            }
        }
        // 모든 전화번호를 확인한 후에도 접두사가 없다면, 결과는 true
        return answer;
    }
}