package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class POX8958{
        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            for(int t=0;t<n;t++) {
                String s = br.readLine();
                int cnt = 0; //연속되는 o의 개수 담기
                int res = 0; //결과값 담기
                int size = s.length();
                for(int i=0;i<size;i++) {
                    if(s.charAt(i)=='O') {
                        cnt++;
                        res += cnt;
                    }else {
                        cnt = 0;
                    }
                }
                System.out.println(res);

            }
        }

    }
