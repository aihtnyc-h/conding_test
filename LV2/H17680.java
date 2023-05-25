package LV2;

import java.util.LinkedList;

public class H17680 {
    public int solution(int cacheSize, String[] cities) {
        // 캐시 크기가 0이면, 모든 도시를 DB에서 가져와야 하므로
        // 실행 시간은 도시의 수에 5를 곱한 값이다.
        if(cacheSize == 0)
            return cities.length * 5;

        // LinkedList를 사용하여 캐시를 구현
        // 이 데이터 구조는 캐시에 새 항목을 추가하거나 가장 오래된 항목을 제거하는 데 효율적이다.
        LinkedList<String> cache = new LinkedList<>();
        int time = 0; // 총 실행 시간을 저장하는 변수이다.
        for(int i=0; i<cities.length; i++){
            // 도시 이름은 대소문자를 구분하지 않으므로 모두 대문자로 변환
            String city = cities[i].toUpperCase();
            // 해당 도시가 캐시에 이미 있는지 확인
            if(cache.remove(city)){
                // 캐시에 도시가 있다면, 캐시 히트이다.
                // 캐시 히트일 경우 실행 시간은 1이므로 time을 1 증가시키고,
                // 해당 도시를 캐시의 맨 앞으로 이동
                cache.addFirst(city);
                time++;
            } else {
                // 캐시에 도시가 없다면, 캐시 미스이다.
                // 캐시 미스일 경우 실행 시간은 5이므로 time을 5 증가시킨다.
                int currentSize = cache.size();
                // 캐시가 이미 가득 차 있다면, 가장 오래된 항목을 제거한다.
                if(currentSize == cacheSize){
                    cache.pollLast();
                }
                // 캐시에 새 도시를 추가한다.
                cache.addFirst(city);
                time += 5;
            }
        }
        // 총 실행 시간을 반환
        return time;
    }
}