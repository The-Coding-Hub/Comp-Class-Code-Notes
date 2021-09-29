package Java;

import java.util.Scanner;

public class FactorialWhile {
  public static void main(String[] args) {
    // WAP in Java for finding the factorial of a number using While Loop.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    sc.close();
    int i = 2;
    int fact = 1;
    while (i <= n) {
      fact = fact * i;
      i = i + 1;
    }
    System.out.print("The factorial is ");
    System.out.println(fact);
  }
}
