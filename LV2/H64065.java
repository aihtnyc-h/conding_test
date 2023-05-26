package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class H64065 {
    public int[] solution(String s) {
        // s에서 처음과 끝의 중괄호를 제거하고, 각 집합을 분리하는 ","를 "-"로 변경
        s = s.substring(2, s.length()-2).replace("},{", "-");

        // 변경된 문자열을 "-"를 기준으로 분리하여 각 집합을 배열에 저장
        String[] arr = s.split("-");

        // 배열을 각 집합의 크기에 따라 오름차순으로 정렬
        // Comparator를 사용하여 집합의 길이에 따라 정렬하도록 한다.
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // 결과를 저장할 리스트를 생성
        List<Integer> list = new ArrayList<>();

        // 각 집합에 대하여
        for(String str : arr) {
            // 집합을 ","를 기준으로 분리하여 각 숫자를 배열에 저장
            String[] nums = str.split(",");

            // 각 숫자에 대하여
            for(String num : nums) {
                // 숫자를 정수로 변환
                int n = Integer.parseInt(num);

                // 결과 리스트에 해당 숫자가 없다면 추가
                if(!list.contains(n)) {
                    list.add(n);
                }
            }
        }

        // 결과 리스트의 크기만큼의 크기를 가진 배열을 생성
        int[] answer = new int[list.size()];

        // 결과 리스트의 각 원소를 배열에 복사
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        // 결과 배열을 반환
        return answer;
    }
}