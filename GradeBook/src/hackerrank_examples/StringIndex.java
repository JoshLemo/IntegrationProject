package hackerrank_examples;

import java.util.*;

public class StringIndex {
  public static void main(String[] args) {
    System.out.println("Test case: ");
    System.out.println("2");
    System.out.println("Hacker");
    System.out.println("Rank");
    System.out.println("\n(The program will print odd and then even integer String indexes)\n");
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int i = 0; i < test; i++) {
      String str = sc.next();
      for (int j = 0; j < str.length(); j += 2) {
        System.out.print(str.charAt(j));
      }
      System.out.print(" ");
      for (int k = 1; k < str.length(); k += 2) {
        System.out.print(str.charAt(k));
      }
      System.out.println();
    }
  }
}
