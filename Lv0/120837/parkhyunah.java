class Solution {
    public int solution(int hp) {
        int answer = 0;
        //int[] ants = {5,3,1}; // 장군:5 병장:3 일:1

        // 적은 수의 병력 구성 -> 장군으로 구성

        answer += hp/5;
        hp%=5;

        answer += hp/3;
        hp%=3;

        answer += hp/1;
        /*
        for (int i=0; i>=0; i++) {
            if (hp>=ants[i]) {
            answer += hp/ants[i];
            hp %= ants[i];

            }//언제 반복문이 멈출건지 if문으로 만들기!

        }
        */

        return answer;
    }
}