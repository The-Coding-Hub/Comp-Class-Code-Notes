package Java;

import java.util.Scanner;

public class PalindromeWhile {
  public static void main(String[] args) {
    // WAP in Java for finding the factorial of a number using While Loop.
    Scanner sc = new Scanner(System.in);
    String number, front, back = "";
    System.out.print("Enter a number: ");
    number = sc.next();
    sc.close();
    front = number;
    int f = Integer.parseInt(front);
    while (f != 0) {
      int digit = f % 10;
      String d = Integer.toString(digit);
      back = back + d;
      f = f / 10;
    }
    int left = Integer.parseInt(front);
    int right = Integer.parseInt(back);
    if (left == right) {
      System.out.println("Palindrome!");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
