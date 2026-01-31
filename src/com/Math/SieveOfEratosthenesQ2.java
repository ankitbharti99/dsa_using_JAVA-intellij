package com.Math;

public class SieveOfEratosthenesQ2 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    static void sieve(int n, boolean[] primes) {
        for(int i=2;i*i<=n;i++) {
            if(!primes[i]) {
                for(int j=i*2;j<=n;j+=i) {
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++) {
            if(!primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
/* Working
Instead of doing:

✅ “Is 15 divisible by 2, 3, 4...?” (modulo method)

Sieve does:

✅ “I know 3 is prime, so all multiples of 3 (6, 9, 12, 15…) are NOT prime.”

Because instead of testing divisibility, the sieve directly eliminates non-primes by marking multiples.

Example:

When i = 2 → you mark 4,6,8,… ❌

When i = 3 → you mark 6,9,12,… ❌
So 15 will already be marked when i = 3
No need to do 15 % 3 == 0
 */