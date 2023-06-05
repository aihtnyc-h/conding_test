package LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class H92341 {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0], basicFee = fees[1], unitTime = fees[2], unitFee = fees[3]; // 기본 주차 시간, 기본 요금, 단위 시간, 단위 요금 설정

        HashMap<String, ArrayList<String>> parking = new HashMap<>(); // 주차 중인 차량 저장
        HashMap<String, Integer> parked = new HashMap<>(); // 주차한 차량과 그 차량의 주차 시간 저장

        // 주차 기록을 순회하면서 주차 시간 계산
        for(String record : records){
            String[] info = record.split(" ");
            String time = info[0], carNum = info[1], status = info[2];
            if(!parking.containsKey(carNum)){
                parking.put(carNum, new ArrayList<>()); // 주차 중인 차량에 추가
            }
            if(status.equals("IN")){
                parking.get(carNum).add(time); // 주차 시작 시간 추가
            } else {
                String inTime = parking.get(carNum).remove(parking.get(carNum).size()-1); // 주차 종료 시간 추가
                parked.put(carNum, parked.getOrDefault(carNum, 0) + getTimeDiff(inTime, time)); // 주차 시간 계산 후 저장
            }
        }
        // 아직 주차장을 나가지 않은 차량에 대해 주차 시간 계산
        for(String carNum : parking.keySet()){
            for(String inTime : parking.get(carNum)){
                parked.put(carNum, parked.getOrDefault(carNum, 0) + getTimeDiff(inTime, "23:59")); // 23:59까지의 주차 시간을 계산
            }
        }

        // 차량 번호 순서대로 정렬
        ArrayList<String> sortedKeys = new ArrayList<>(parked.keySet());
        Collections.sort(sortedKeys);

        // 요금 계산
        int[] result = new int[sortedKeys.size()];
        for(int i=0; i<sortedKeys.size(); i++){
            int totalTime = parked.get(sortedKeys.get(i));
            result[i] = totalTime <= basicTime ? basicFee : basicFee + (int)Math.ceil((double)(totalTime - basicTime) / unitTime) * unitFee; // 기본 시간 내면 기본 요금, 아니면 추가 요금 적용
        }
        return result;
    }

    // 두 시간 사이의 차이를 분 단위로 반환하는 함수
    private int getTimeDiff(String inTime, String outTime){
        String[] in = inTime.split(":");
        String[] out = outTime.split(":");
        int inHour = Integer.parseInt(in[0]), inMin = Integer.parseInt(in[1]);
        int outHour = Integer.parseInt(out[0]), outMin = Integer.parseInt(out[1]);
        return (outHour - inHour) * 60 + (outMin - inMin); // 차이 계산 (분 단위)
    }
}