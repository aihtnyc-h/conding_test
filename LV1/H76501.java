package LV1;

public class H76501 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true){
                answer += absolutes[i];
            }
            else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] absolutes1 = {4,7,12};
        boolean[] signs1 = {true,false,true};
        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        System.out.println(solution(absolutes1, signs1));
        System.out.println(solution(absolutes2, signs2));
    }
}
