// 최빈값 구하기
/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
최빈값이 여러 개면 -1을 return 합니다.
 */

public class H120812 {
    public int solution(int[] array) {
        int answer = 0;
        // 0<= array의 원소 <1000
        int[] ar = new int[1001];

        // 원소 갯수 ar에 저장
        for(int i=0; i<array.length; i++){
            ar[array[i]]++;
        }

        int max = 0; //최빈값 구하기
        int max_index = 0; //최빈값

        for (int i = 0; i <ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
                max_index = i;
            }
        }

        int count =0;
        for (int i = 0; i<ar.length; i++){ //최빈값이 2개인지 학인
            if(ar[i] == max) count++;
        }
        if(count>1){            //최빈값이 2개이면-1 return
            return answer = -1;
        }

        answer = max_index;
        return answer;
    }
}