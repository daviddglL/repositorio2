package org.example;

public class Recursividad {
    void metodoA() {
        metodoA();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void decimal(int n) {
        int divisor = 0;
        int resto = 0;

        if (n > 2) {
            divisor = n / 2;
            resto = n % 2;
            if (n / 2 == 1) {
                System.out.print(resto);
            } else {
                System.out.print(resto);
                decimal(divisor);
            }
        } else {
            System.out.println(n % 2);
        }
    }

    public static int conejos(int n) {

        if(n<2){
            return n;
        }
        else{
            return conejos(n-1) + conejos(n-2);
        }
    }

}
