package hackerrank_examples;

import java.util.*;

class Calculator {
  int power(int n, int p) throws Exception {
    if (n < 0 || p < 0) {
      throw new Exception("n and p should be non-negative");
    }
    if (n == 0) {
      return 0;
    }
    if (p == 0) {
      return 1;
    }
    return (int) Math.pow(n, p);
  }
}


class Exceptions {
  public static void main(String[] args) {
    System.out.println("Sample input:");
    System.out.println("4\r\n" + "3 5\r\n" + "2 4\r\n" + "-1 -2\r\n" + "-1 3");
    System.out.println("\nType sample here: ");
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {
      int n = in.nextInt();
      int p = in.nextInt();
      Calculator myCalculator = new Calculator();
      try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    in.close();
  }
}
