package LV2;

public class H92335 {
    // 소수 판별 함수
    public boolean isPrime(long n) {
        if(n == 1)  return false;  // 1은 소수가 아니므로 false 반환
        long a = (long)Math.sqrt(n) + 1;  // n의 제곱근 계산
        for(int i=2;i<a;i++) {  // 2부터 n의 제곱근까지 반복
            if(n%i == 0) return false;  // 나누어 떨어지는 수가 있으면 소수가 아니므로 false 반환
        }
        return true;  // 나누어 떨어지는 수가 없으면 소수이므로 true 반환
    }

    // 주어진 숫자를 k진수로 바꾸고, 0을 기준으로 나누는 함수
    public String[] makeBinList(int n, int k) {
        StringBuilder kBin = new StringBuilder();  // k진수를 저장할 StringBuilder
        while(n != 0) {
            kBin.insert(0, n%k);  // n을 k로 나눈 나머지를 문자열 앞에 추가
            n /= k;  // n을 k로 나눔
        }    // k진수 생성
        String[] binList = kBin.toString().split("0");  // 생성된 k진수를 '0'을 기준으로 나눔
        // 0을 기준으로 나눈 문자열 배열 반환
        return binList;
    }

    // 솔루션 함수
    public int solution(int n, int k) {
        int answer = 0;  // 소수의 개수를 저장할 변수

        String[] a = makeBinList(n, k);  // k진수로 변환된 문자열 배열을 가져옴

        for(String b : a) {  // 문자열 배열을 반복
            if(b.equals(""))  continue;  // 문자열이 비어있으면 다음 반복으로 건너뜀

            long c = Long.parseLong(b);  // 문자열을 long으로 변환
            if(isPrime(c))    answer++;  // 변환된 숫자가 소수이면 answer 증가
        }

        // 소수의 개수 반환
        return answer;
    }
}
