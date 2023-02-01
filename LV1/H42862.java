package LV1;

import java.util.Arrays;

// 경우의 수를 말하는 것인가?
/*
1 -> 2
2 -> 1, 3
3 -> 2, 4
4 -> 3, 5
결론은 n=1일때 +1 or -1에게만 빌려줄 수 있다
1. 정렬부터 시키기 -> Arrays.sort  체육복을 가저온 학생 reserve / 잃어버린 학생 lost
2. 여벌이 있는 학생이 도난당할때
3. 도난당한 학생, 여벌이 있는 학생이 도난당할때 결론은 체육복이 있는것 같은 값을 넣어주기
4. 빌리지 못한 학생 3번에 넣은 값이 아닐때로 설정하기!
 */
public class H42862 {
    public static int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(reserve);
        Arrays.sort(lost);

        for(int i=0; i < reserve.length; i++) {           //여벌이 있는 학생이 도난 당한 경우
            for(int j=0; j < lost.length; j++) {
                if(reserve[i] == lost[j]) {
                    reserve[i] = -1;                //여벌을 가져온 i번째 학생의 번호를 -1로 변경
                    lost[j] = -1;                   //도난당한 j번째 학생의 번호를 -1로 변경
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {   //만약 도난당한 i번째 학생+1/-1이 여별 학생중 존재할경우
                if(lost[i] -1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    lost[i] = -1;                   //도난당한 i번째 학생의 번호를 -1로 변경
                    reserve[j] = -1;                //여별을 가져온 j번째 학생의 번호를 -1로 변경
                    break;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < lost.length; i++) {
            if(lost[i]!=-1) {                       //lost배열에서 -1이 아니면 빌리지 못한 학생으로 간주
                count++;
            }
        }
        return n - count;
    }
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n, lost, reserve));
    }
}
