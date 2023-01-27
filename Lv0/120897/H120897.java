import java.util.ArrayList;

// 약수 구하기
/*
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class H120897 {
    public int[] solution(int n){
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                answerList.add(i);
                if (n / i != i)answerList.add(n / i);
            }
        }
        return answerList.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}