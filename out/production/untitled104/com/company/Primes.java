package com.company;

public class Primes {
    public static void main(String[] args) {
        for(int n=3;n<100;n++) System.out.println("Число " + n + " простое?\n" + "Ответ: " + IsPrime(n) + "\n");
    }

        public static boolean IsPrime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0 )
                    return false;
            }
            return true;
    }
}


