package tests;

public class Fibonacci {
	  
    static long n_esimo(int n) {
        if (n < 2) {
            return n;
        } else {
            return n_esimo(n - 1) + n_esimo(n - 2);
        }
    }
}
