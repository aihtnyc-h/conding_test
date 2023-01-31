package 백준;

import java.util.Scanner;
public class OX퀴즈8958 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int array = sc.nextInt();
            String str ;

            for (int i=0;i<array;i++) {
                str = sc.next();
                int count=0;
                int sum=0;

                for (int j=0; j<str.length();j++) {
                    if(str.charAt(j)=='O'){
                        count++;
                        sum+= count;
                    }else {
                        count=0;
                    }
                }
                System.out.println(sum);
            }

        }
    }

