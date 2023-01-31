
package 시험;
/*
- 체크인과 체크아웃은 항상 정시에 진행한 것으로 가정한다.
- 체크아웃을 할 때 익일 시간은 24+a 로 계산한다. 즉 새벽 2시는 24+2 인 26으로 표기한다.
- 체크인 페이지는 체크아웃이 새벽 5시 정각이나 새벽 5시를 넘어가면 체크아웃을 깜빡한 것으로 간주한다.
따라서 새벽 5시가 넘어가 체크아웃을 하게 되면 자동으로 체크아웃을 오후 9시(21시)로 한 것으로 처리한다.

int arr1 체크인 arr2 체크아웃
    1시  6시 5시
[21, 25, 30, 29, 22, 23, 30]
[9,   9,  8,  8,  7,  8, 9]
12   16  13  13  15  15  12
숫자가 29 이상이 되면 21로 변환
 */


import java.util.*;
public class 몇시간했더라 {
    public static int solution(int[] arr1, int[] arr2) {
            int answer = 0;
            for (int i = 0; i < arr2.length; i++) {
                if(arr2[i]>=29){
                    arr2[i]=21;
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                answer += arr2[i]-arr1[i];
            }



            return answer;
        }



        public static void main(String[] args) {
            int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
            int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
            System.out.println(solution(arr1, arr2));
        }
    }

