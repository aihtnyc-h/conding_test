// 짝수는 싫어요
/*
정수 n이 매개변수로 주어질 때,
 n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록
 solution 함수를 완성해주세요.
 */
/*

 */
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; //홀수입력값 때문에 (n+1)/2

        for (int i =1; i<=n; i++){
            if(i%2==1){
                answer[i/2] = i; // 홀수값들이 순서대로 들어갈 수 있도록
            }
        }
        return answer;
    }
}