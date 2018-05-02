package hackerrank_examples;

import java.util.*;

class DictionariesAndMaps {
  public static void main(String[] argh) {
    System.out.println("Sample input is: \r\n" + "3\r\n" + "sam 99912222\r\n" + "tom 11122222\r\n"
        + "harry 12299933\r\n" + "sam\r\n" + "edward\r\n" + "harry"); // prompt user test case
    System.out.println("\nType Sample input here: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> myPhonebook = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String name = in.next();
      int phone = in.nextInt();
      myPhonebook.put(name, phone);
    }
    while (in.hasNext()) {
      String s = in.next();
      if (myPhonebook.get(s) == null)
        System.out.println("Not found");
      else {
        System.out.println(s + "=" + myPhonebook.get(s));
      }
    }
    in.close();
  }
}
