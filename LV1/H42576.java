package LV1;

import java.util.*;

public class H42576 {
    static String solution(String[] participant, String[] completion){
        HashMap<String,Integer> hm = new HashMap<>();                       // 요소가 많을 때 Map을 사용 (빠름빠름) 1000개 만개 될때!
        String answer = "";

        for (int i=0; i<participant.length; i++){
            if(hm.get(participant[i]) == null){
                hm.put(participant[i],1);
            }
            else {
                hm.put(participant[i], hm.get(participant[i])+1);
            }
        }
        for(int i=0; i<completion.length; i++) {
            hm.put(completion[i],hm.get(completion[i])-1);
        }

        for(int i=0; i<hm.size(); i++) {
            if(hm.get(participant[i]) != 0) {
                return participant[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] arr = {"leo", "kiki", "eden"};
        String arr1[] = {"eden", "kiki"};
        System.out.println(solution(arr,arr1));
        String arr2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String arrr2[]={"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(arr2,arrr2));
        String arr3[] = {"mislav", "stanko", "mislav", "ana"};
        String arrr3[] ={"stanko", "ana", "mislav"};
        System.out.println(solution(arr3,arrr3));

    }
}
