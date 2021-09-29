package Java;

public class WhileLoop {
  public static void main(String[] args) {
    // While Loop in Java
    // Program to print Delhi 5 times
    int i = 1;
    while (i <= 5) {
      System.out.println("DELHI");
      i = i + 1;
    }
  }
}

// While Loop
// -> The Java While Loop is used to iterate a part of the program repeatedly
// until the specified condition is true.
// -> When the condition becomes false, the loop automatically stops.
// -> If the number of iterations in not fixed, it is better to use While Loop.
// Why While Loop?
// -> It is mainly used when the number of iterations is unknown.
// -> For example, if we want to run the loop the number becomes 0.

// For and While Loop Syntax Comparision
// For Loop
// for (initialization; condition; increment/decrement) {
//   Code
// }
// While Loop
// initialization;
// while (condition) {
//   Code
//   increment/decrement
// }

// Home Work:
// WAP to enter a number and check whether it is armstrong or not.