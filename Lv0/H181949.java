package Lv0;

import java.util.Scanner;
/*
영어 알파벳으로 이루어진 문자열 str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 */
public class H181949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(Character.toUpperCase(ch));
			}
		}
		System.out.println(sb.toString());
	}
}
