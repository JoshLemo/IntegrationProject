package hackerrank_examples;

public class Arithmetic {
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    double mealCost = 12.00; // scan.nextDouble(); // original meal price hard-coded
    int tipPercent = 20; // scan.nextInt(); // tip percentage hard-coded
    int taxPercent = 8; // scan.nextInt(); // tax percentage hard-coded
    // scan.close();
    // calculation code
    float tip = (((float) mealCost) * ((float) tipPercent) * (1f / 100f));
    float tax = ((float) mealCost * ((float) taxPercent / 100));
    float total = (float) mealCost + tip + tax;
    // cast the result of the rounding operation to an int and saved as totalCost
    int totalCost = (int) Math.round(total);
    // Print your result
    System.out.println("Meal cost: " + mealCost);
    System.out.println("Tip Percent: " + tipPercent);
    System.out.println("Tax Percent: " + taxPercent);
    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }
}
