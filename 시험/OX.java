package 시험;
import java.util.*;
/*
"OOXXOXXOOO"와 같은 OX문의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
첫번째 줄에 테스트 케이스의 개수(N)을 입력받은 후 N개만큼의 OX 문자열을 입력 받습니다.
그 후 중첩 반복문을 통해 OK  문자열의 길이만큼 반복하여 첫 글자가 O일 경우 카운트를 추가시켜 연속된 숫자일 경우 +된 상태로 스코어와 함께 추가 해주고,
X일 경우 연속되지 않으니 카운트를 초기화 시켜 다시 1점부터 시작하게 생성합니다.
그대로 반복하여 연속된 숫자일 경우 카운트에 의해 +1점씩 추가, X를 만날경우 카운트가 0이 되어 다시 1점부터 시작을 반복 합니다.
OXOOOXXXOXOOXOOOOOXO
OOXXOXXOOO
OXOXOXOXOXOXOX
OOOOOOOOOO
 */
public class OX {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            int n = a.charAt(0) - '0';                        //횟수 설정


            for (int i = 0; i < n; i++) {
                int count = 0;
                int sum = 0;
                String str = sc.nextLine();                  //문자열 받아옴
                String[] arr = str.split("");             //한글자 단위로 배열 저장
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals("O")) {               //점수 계산
                        count++;
                        sum += count;
                    } else {
                        count = 0;
                    }

                }
                System.out.println(sum);                    //점수 출력
            }
            sc.close();
        }
    }


//  실패의 흔적...
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            int score = 0;
//            int cnt = 0;
//
//            String str = sc.nextLine();
//            String[] arr = str.split("");
//
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j].equals("O")) {
//                    cnt++;
//                    score += cnt;
//                } else cnt = 0;
//            }
//            System.out.println(score);
//        }
//
//        sc.close();
//    }
//}
//        public static void main(String[] args) throws IOException{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            int n = Integer.parseInt(br.readLine());   // 계속 여기에서 오류라는데 왜일까요?
//            String[] arr = new String[n];
//
//            for(int i = 0; i < n; i++) {
//                arr[i] = br.readLine();
//            }
//
//            for(int i = 0; i < n; i++) {
//                int sum = 0;
//                int count = 0;
//
//                for(int j = 0; j < arr[i].length(); j++) {
//
//                    if(arr[i].charAt(j) == 'O') {
//                        count++;
//                    }
//                    else {
//                        count = 0;
//                    }
//                    sum += count;
//                }
//
//
//                System.out.println(sum);
//            }
//
//        }
//
//    }

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = "";
        for (int i = 0; i < N; i++) {
            int sum = 0, cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O'){
                    cnt++;
                    sum += cnt;
                }
                else{
                    cnt = 0;
                }
                System.out.println(sum);
            }
        }
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String OX = sc.next();
        sc.nextLine();
        int score = 0;

        for(int i=0; i<N; i++) {
            int count = 0;
            score = 0;
            OX = sc.next();
            for(int j=0; j<OX.length(); j++) {
                if(OX.charAt(j)=='O') {
                    count++;
                    score = score + count;
                } else if (OX.charAt(j)=='X') {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = "";
        for (int i = 0; i < N; i++) {
            int sum = 0, cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O'){
                    cnt++;
                    sum += cnt;
                }
                else{
                    cnt = 0;
                }
                System.out.println(sum);
            }
        }
    }
*/

//    public static void main(String[] args) throws IOException {
//        try {
//            BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
//
//            int text_num = Integer.parseInt(rd.readLine());
//            // 합 값, O일 경우 연산용 변수
//            int sum=0, O=0;
//            // 반복 값 입력
//            for(int i=0;i<text_num;i++) {
//                // ox 작동할 값, 초기화
//                String ox = rd.readLine();
//                sum=0;
//                O=0;
//                for(int j=0;j<ox.length();j++) {
//                    if(ox.charAt(j)!='O'){
//                        O=0;
//                    }else if(ox.charAt(j)=='O') {
//                        O++;
//                        sum +=O;
//                    }
//                }
//                System.out.println(sum);
//            }
//        }
//        catch(IOException e) {
//            System.out.println("error");
//        }
//    }
//}







//        int one = 0;  // 정답을 맞춘 경우 O
//        int two = 0;  // 정답을 틀린 경우 X
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.toLowerCase().charAt(i); //소문자로 변환
//            if (c == 'O'){
//                one++;
//            } else if (c == 'X') {
//                two++;
//            }
//        }
 //       if (one == two) {
 //           answer = true;
  //      }else {
   //         answer = false;
        //}
        //


    //    return answer;


//    public static void main(String[] args) {
//
//        String s = "OXOOOXXXOXOOXOOOOOXO";
//        System.out.println(solution(s));
//    }
//
//}






