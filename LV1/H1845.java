package LV1;

import java.util.Arrays;
import java.util.HashSet;

// 포켓몬의 이름을 쓸수 없어 만든 것인가..? 머쓱이네 연구실이 아니여서 다행이다...
//해시를 이용해서 풀어보자!
//hashset: value를 자바에서 자동으로 임의 지정하며 key에 중복을 배제하고 값을 넣음.
// hashmap: key와 value를 개발자가 직접 기입하고 키의 중복을 배제함.
// 이때 hash는 키를 이용해서 값을 찾기 때문에 검색 알고리즘에 매우 효율적.
// arraylist: 사용자가 정의한 <제너릭>객체에 맞는 값을 넣어 저장하고 중복 삽입이 가능 단, 수정 변경시 배열을 새로 생성해서 배열채로 집어넣기에 수정이 상대적으로 느림.
// 또한 키로 값을 찾을 수 없기에 검색 알고리즘에 매우 느린 속도를 자랑함 단, foreach문에선 arraylist가 더 빠름
//근데 해시로 못풀겟당...ㅎㅎㅎㅎㅎ
/*
뽑을 수 있는 폰켓몬의 수를 새로 만들어주기! (n/2 해주기!)
가장 많은 종류가 되는 중복 폰켓몬 제거! -> HashSet 인거 같다!
중복제거 한 후 폰켓몬의 종류의 수가 OO보다 크거나 같을 때 OO 할 OO값 만들어주기
 */
public class H1845 {
    public static int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        if (hs.size() > nums.length/2)
            return nums.length/2;


        return hs.size();
    }
//        int answer=0;
//        int pk=nums.length/2;           //뽑을수 있는 폰켓몬의 수
//
//        int[] disNums = Arrays.stream(nums).distinct().toArray(); //가장 많은 종류가 돼야하므로 중복폰켓몬 제거
//        if(disNums.length>=pk) {        //만약 중복을 제거한 폰켓못의 종류의 수가 pk보다 크거나 같으면
//            answer=pk;                  //pk를 리턴
//        } else{
//            answer=disNums.length;
//        }
//        return answer;
//    }

    public static void main(String[] args){
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
}
