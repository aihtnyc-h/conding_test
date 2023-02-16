package Lv0;

public class H120893 {
        public static String solution(String my_string) {
            String answer = "";
            char[] arry = my_string.toCharArray();

            // a ~ z 97 ~122
            // A ~ Z 65~90

            String temp ="";
            //char 배열로 만들어서 하나씩 꺼내고 (asci 코드 사용) 대소문자 변환하기.
            for(int i = 0; i<arry.length; i++) {
                if( arry[i] >= 97 && arry[i] <= 122 ) {
                    temp = arry[i] + "";
                    answer += temp.toUpperCase();
                } else if( arry[i] >=65 && arry[i] <= 90){
                    temp = arry[i] + "";
                    answer += temp.toLowerCase();
                }
            }
            return answer;

    }
    public static void main(String[] args){
            String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }
}
