package Recursion;

public class Fibbonaccirec {
        static int fib(int x) {
            if (x==0||x==1) {
                return x;
            }
            return fib(x - 1) + fib(x - 2);
        }

        public static void main(String[] args) {
            int n = 100; // Change this to get different number of terms
            for (int i = 0; i < n; i++) {
                System.out.println(fib(i));
            }
        }
    }