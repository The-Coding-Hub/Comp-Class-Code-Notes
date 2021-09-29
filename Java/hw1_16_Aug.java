package Java;

// Problem Pattern:
// *
// * * *
// * * * * *

public class hw1_16_Aug {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}