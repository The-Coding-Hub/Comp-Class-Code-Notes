package Java;

// Problem Statement: Return Factorial of n

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}