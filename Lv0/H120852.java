package Lv0;// 소인수 분해
/*
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
따라서 12의 소인수는 2와 3입니다.
자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
import java.util.*;
public class H120852 {
    public int[] solution(int n) {
        int[] answer;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(int i = 2; i <= n;) //소인수는 1보다 크기에 2부터 시작
        {
            if(n%i==0) // 나눠지면 인수라는 것
            {
                map.put(i, i); //해시맵에 저장
                n/=i; // n을 소인수로 나누기
            }
            else // 나눠지지 않으면 i++;
            {
                i++;
            }

        }

        answer = new int[map.size()]; //해시맵 크기만큼
        for(Integer i : map.keySet()) //배열에 값 넣기
        {
            answer[index] = map.get(i);
            index++;
        }
        Arrays.sort(answer); //해시맵은 정렬된 상태가 아니기 때문에 정렬
        return answer;
    }
}