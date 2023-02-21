package Lv0;

public class H120899 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
                if (max < answer[i]) {
                    max = array[i];
                    index = i;
                }
            }
        answer[0] = max;
        answer[1] = index;

        return answer;
    }
    public static void main(String[] args){
        int[] array = {1, 8, 3};
        System.out.println(solution(array));
    }
}
