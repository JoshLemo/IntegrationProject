package hackerrank_examples;

class Main {
  public static void main(String[] args) {
    MightyByte myByte = new MightyByte("00000101");
    System.out.println(myByte.getDecimalValue());
  }
}


class MightyByte {
  private String bits;

  // write the constructor here
  MightyByte(String bits) {
    this.bits = bits;
  }

  public int getDecimalValue() {
    int decimalValue = 0;
    int intValue;
    int power = 7;
    for (int i = 0; i < bits.length(); i++) {
      char c = bits.charAt(i); // get the character at position i in string bits
      intValue = Character.getNumericValue(c);
      decimalValue += intValue * Math.pow(2, power);
      power = power - 1;
    }
    return decimalValue;
  }
}
