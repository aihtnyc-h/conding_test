// 배열 뒤집기
/*
정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
class Solution{
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];                // 리턴용 int 타입 배열
        for (int i=0; i<num_list.length; i++){                     // 매개변수로 들어온 배열크기만큼 for문
            answer[i]=num_list[num_list.length-i-1];            // 리턴용 배열의 i번째에 매개변수 배열의 크기 -i-1번째 정수를 넣음
        }
        return answer;
    }
}