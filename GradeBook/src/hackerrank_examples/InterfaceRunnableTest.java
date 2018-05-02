package hackerrank_examples;

// lambda example
public class InterfaceRunnableTest {
  public static void main(String[] args) {
    System.out.println("_____RunnableTest_____");
    // Anonymous Runnable
    Runnable r1 = new Runnable() {
      @Override // override run
      public void run() {
        System.out.println("First Hello world");
      }
    };
    // Lambda Runnable
    Runnable r2 = () -> System.out.println("Second Hello world");
    // Test run
    r1.run();
    r2.run();
  }
}
