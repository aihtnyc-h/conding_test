package LV2;

import java.util.ArrayList;
import java.util.Collections;

public class H17677 {
    public int solution(String str1, String str2) {
        // 두 문자열을 모두 소문자로 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 두 문자열을 두 글자씩 끊어서 저장할 리스트 생성
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // 첫 번째 문자열을 두 글자씩 끊어서 리스트에 저장 (둘 다 알파벳일 경우만)
        for(int i=0;i<str1.length()-1;i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z'){
                list1.add(first + "" + second);
            }
        }
        // 두 번째 문자열을 두 글자씩 끊어서 리스트에 저장 (둘 다 알파벳일 경우만)
        for(int i=0;i<str2.length()-1;i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z'){
                list2.add(first + "" + second);
            }
        }

        // 두 리스트를 정렬
        Collections.sort(list1);
        Collections.sort(list2);

        // 교집합과 합집합의 크기를 계산하기 위한 변수 생성
        int intersection = 0;
        int union = list1.size() + list2.size();

        // list1의 원소가 list2에도 존재하는 경우 교집합의 크기를 증가
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                intersection++;
                list2.remove(list1.get(i));
            }
        }
        // 합집합의 크기를 계산
        union -= intersection;

        // 자카드 유사도를 계산
        double jakard = 0.0;
        if(union == 0){ // 두 집합 모두 공집합인 경우 유사도를 1로 설정
            jakard = 1;
        }else{
            jakard = (double)intersection/union;
        }

        // 유사도에 65536을 곱한 후 소수점 아래를 버리고 정수부만 반환
        return (int)(jakard * 65536);
    }
}