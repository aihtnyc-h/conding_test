package Lv0;

import java.util.regex.Pattern;

/*
문자열 `code`가 주어집니다.

`code`를 앞에서부터 읽으면서 만약 문자가 "1"이면 `mode`를 바꿉니다. `mode`에 따라 `code`를 읽어가면서 문자열 `ret`을 만들어냅니다.

`mode`는 0과 1이 있으며, `idx`를 0 부터 `code의 길이 - 1` 까지 1씩 키워나가면서 `code[idx]`의 값에 따라 다음과 같이 행동합니다.

- `mode`가 0일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 짝수일 때만 `ret`의 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 0에서 1로 바꿉니다.
- `mode`가 1일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 홀수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 1에서 0으로 바꿉니다.

문자열 `code`를 통해 만들어진 문자열 `ret`를 return 하는 solution 함수를 완성해 주세요.

단, 시작할 때 `mode`는 0이며, return 하려는 `ret`가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
 */
public class H181932 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char[] chars = code.toCharArray();
        int mode = 0;
        for (int i=0; i<chars.length; i++) {
            if (mode == 0) {
                if (chars[i] == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        sb.append(chars[i]);
                    }
                }
            } else if (mode == 1) {
                if (chars[i] == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        sb.append(chars[i]);
                    }
                }
            }
        }
        String str = sb.toString();

        if (str.equals("")) {
            return "EMPTY";
        }
        return str;
    }
}