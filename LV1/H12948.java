package LV1;
/*
toCharArray() phone_number을 char 배열 arr로 만들기
char배열에서 뒤에 4개 제외 한 나머지 * 바꾸기
char를 다시 문자열로 변환
 */
public class H12948 {
    public static String solution(String phone_number) {


        char[] arr = phone_number.toCharArray();
        for (int i = 0; i < arr.length-4; i++) {
            arr[i] = '*';
        }
        return new String(arr);
    }
    public static void main(String[] args){
        String phone_number1 = "01033334444";
        String phone_number2 = "027778888";
        System.out.println(solution(phone_number1));
        System.out.println(solution(phone_number2));
    }
}
