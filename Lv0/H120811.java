package Lv0;

// 중앙값 구하기
/*
문제 설명
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 */
public class H120811 {
    public int solution(int[] array) {
        int tmp = 0;
        for (int i=0; i<array.length; i++){                 //매개변수로 들어온 배열의 크기만큼 for문
            for (int j=i+1; j<array.length; j++) {
                if (array[j]> array[i]) {                       // 배열의 j번째 숫자가 i번째 숫자보다 크다
                    tmp = array[j];                             // 그 위치를 바꿈
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }
        int mid = array.length/2;                           // 배열이 내림차순으로 정리된 상태
        return array[mid];                                     // 매개변수로 들어온 배열의 크기를 2로 나누면 중앙값 인덱스가 나옴
    }
}