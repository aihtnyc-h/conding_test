package LV1;

import java.util.Arrays;

/*
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class H42840 {
    public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};                        // 1번 수포자가 찍는 방식 반복
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};           // 2번 수포자가 찍는 방식 반복
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // 3번 수포자가 찍는 방식 반복

        int[] score = new int[3];                        // 각각의 학생이 몇점을 받았는지 저장할 배열 선언 (3명이라서 3!)

        for (int i = 0; i < 3; i++) {
            int conut = 0;                               // int count에 정답을 저장
            int index = 0;                               // 찍는 방식이 반복이기 때문에 반복 패턴을 저장할 index 사용

            for (int j = 0; j < answers.length; j++) {
                if (i == 0) {                             // 1번 학생 answer의 j번째 점수와 one(1번 학생)의 index번째 점수가 같으면 count에 +1
                    if (answers[j] == one[index]) {
                        conut++;
                    }
                    index++;                             // 그 다음 문제로 넘어가기 위해서 index에 +1
                    if (index == 5) {                     // index가 5가 되면 1번 학생의 찍기 패턴 초기화!
                        index = 0;
                    }
                } else if (i == 1) {                     // 2번 학생 answer의 j번째 점수와 two(2번 학생)의 index번째 점수가 같으면 count에 +1
                    if (answers[j] == two[index]) {
                        conut++;
                    }
                    index++;
                    if (index == 8) {                     // 찍기 패턴이 총 8개 반복 index가 8이 되면 2번 학생의 찍기 패턴 초기화!
                        index = 0;
                    }
                } else if (i == 2) {                    // 3번 학생 answer의 j번째 점수와 three(3번 학생)의 index번째 점수가 같으면 count에 +1
                    if (answers[j] == three[index]) {
                        conut++;
                    }
                    index++;
                    if (index == 10) {                   // 찍기 패턴이 총 10개 반복 index가 10이 되면 3번 학생의 찍기 패턴 초기화!
                        index = 0;
                    }
                }
                score[i] = conut;
            }
        }
        int max = Math.max(score[0], Math.max(score[1], score[2])); // 3명의 학생의 점수 max저장

        int count = 0;                                              // 최고점ㅇㄹ 받은 학생이 몇명인지 count
        for(int i : score) {
            if(i == max) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        for(int i=0; i<3; i++) {
            if(score[i] == max) {
                answer[index] = i+1;
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] answers = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
    }
}
