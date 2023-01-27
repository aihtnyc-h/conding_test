// 배열의 평균값
/*
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
public class H120817 {
    public double solution(int[] numbers) {
        int result = 0;

        for (int arr : numbers) {
            result += arr;
        }
        return (double) result / numbers.length;
    }
}