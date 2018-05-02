package hackerrank_examples;

import java.util.ArrayList;

class Rectangle {
  private double length;
  private double width;

  Rectangle() { // default length and width
    length = 1.0;
    width = 1.0;
  }

  Rectangle(double length, double width) { // overloaded constructor with two arguments
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }
}


class Collections {
  public static void main(String[] args) {
    Rectangle footballField = new Rectangle(); // create new Rectangle instance named footballField
    footballField.setLength(120);
    footballField.setWidth(53.3);
    Rectangle basketballCourt = new Rectangle();
    basketballCourt.setLength(94.0);
    basketballCourt.setWidth(50);
    // create an ArrayList
    ArrayList<Rectangle> fields = new ArrayList<Rectangle>();
    fields.add(footballField); // adds item
    fields.add(basketballCourt);
    for (Rectangle field : fields) {
      System.out.println("Length: " + field.getLength());
      System.out.println("Width: " + field.getWidth());
    }
  }
}
