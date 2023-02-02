package Lv0;

import java.math.BigInteger;

public class H120840 {
        public static BigInteger solution(int balls, int share) {
            BigInteger n = BigInteger.ONE, m = BigInteger.ONE;
            long select1 = balls-share > share ? balls-share : share;
            long select2 = balls-share > share? share : balls-share;
            for(long i = select1+1; i <= balls; i++)
                n = n.multiply(BigInteger.valueOf(i));
            for(long i = 2L; i <= select2; i++)
                m = m.multiply(BigInteger.valueOf(i));
            return n.divide(m);
        }
    public static void main(String[] args){
        int balls1 = 3;
        int share1 = 2;
        int balls2 = 5;
        int share2 = 3;
        System.out.println(solution(balls1, share1));
        System.out.println(solution(balls2, share2));
    }
}
