package com.NumberSystem;
//Magic Number
//ex- 2 = 1 0    -- (25+0)=25                3 = 1 1    -- (25+5)=30          4 = 1 0 0   -- (125+0+0)=125

public class Question5 {
     public static void main(String[] args) {
        int num = 6;
        int ans = 0;
        int base = 5;
        while(num>0) {
            int last = num & 1;
            num = num>>1;
            ans += last*base;
            base*=5;
        }
        System.out.println(ans);

        /* -------2nd Method-----
        System.out.println(convertToBinary(num));
        int binary = convertToBinary(num);
        System.out.println(magicNum(binary));

         */
    }

    /*
    ---------2nd Method-----
    static int magicNum(int n) {
        int base = 5;
        int ans = 0;
        while(n>0) {
            int rem = n%10;
            if(rem==1) {
                ans = ans+base;
            }
            n/=10;
            base*=5;
        }
        return ans;
    }

    static int convertToBinary(int n) {
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int remainder = n % 2;
            ans = ans + remainder * place;
            place = place * 10;
            n = n / 2;
        }
        return ans;
    }

     */
}
