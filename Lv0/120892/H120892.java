public class H120892 {
    public String solution(String cipher, int code) {
        // 암호화된 문자열 cipher
        //code의 n번 째 글자
        String answer = "";
        String[] cipherArr = cipher.split("");

        for(int i = 1; i <= cipherArr.length; i++){

            if(i % code == 0){
                answer += cipherArr[i-1];
            }
        }
        return answer;
    }
}