package Java;

import java.util.Scanner;

public class ArmstrongWhile {
  public static void main(String[] args) {
    int n, m, a = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    n = sc.nextInt();
    sc.close();
    m = n;
    int prod = 0;
    while (m > 0) {
      a = m % 10;
      prod = prod + (a*a*a);
      m = m / 10;
    }
    if (n == prod) {
      System.out.println("Armstrong!");
    } else {
      System.out.println("Not Armstrong!");
    }
  }
}
