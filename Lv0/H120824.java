package Lv0;

//짝수 홀수 개수
/*
정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class H120824 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0; // 홀수
        int even = 0; // 짝수

        //num_list의 길이가 i보다 클 동안 i는 증가한다.
        for(int i = 0; i < num_list.length; i++) {
            //만약 num_list[i]를 2로 나눴을 때 나머지가 0일 경우 맞으면 짝수 개수 증가 아니면 홀수 개수 증가
            if(num_list[i] % 2 == 0) {
                even++;
            }else{
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}