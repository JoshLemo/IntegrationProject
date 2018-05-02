/****************************************************
 *Josh Lemonakis COP 2006 Spring 2018 GradeBook.java*
 ****************************************************/
// GradeBook class using a two-dimensional array to store grades.
public class GradeBook {
  private String courseName; // name of course this grade book represents
  private int[][] grades; // two-dimensional array of student grades
  private static double skipFinal = 85.00; // static var example

  // single argument constructor
  public GradeBook(String courseName) {
    this.courseName = courseName;
  }

  // two-argument constructor initializes courseName and grades array
  public GradeBook(String courseName, int[][] grades) {
    this.courseName = courseName;
    this.grades = grades;
  }

  // method to set the course name
  private void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  // method to get the course name
  public String getCourseName() {
    return courseName.toUpperCase(); // string method example
  }

  // perform various operations on the data
  public void processGrades() {
    // output grades array
    outputGrades();
    // call methods getMinimum and getMaximum
    System.out.printf("%n%s %d%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is",
        getMinimum(), "Highest grade in the grade book is", getMaximum(), "Grade range is",
        getRange());
    // output grade distribution chart of all grades on all tests
    outputBarChart();
  }

  // find minimum grade
  private int getMinimum() {
    // assume first element of grades array is smallest
    int lowGrade = grades[0][0];
    // loop through rows of grades array
    for (int[] studentGrades : grades) { // for loop
      // loop through columns of current row
      for (int grade : studentGrades) { // for each loop
        // if grade less than lowGrade, assign it to lowGrade
        if (grade < lowGrade) {
          lowGrade = grade;
        }
      }
    }
    return lowGrade;
  }

  // find maximum grade
  private int getMaximum() {
    // assume first element of grades array is largest
    int highGrade = grades[0][0];
    // loop through rows of grades array
    for (int[] studentGrades : grades) {
      // loop through columns of current row
      for (int grade : studentGrades) {
        // if grade greater than highGrade, assign it to highGrade
        if (grade > highGrade) {
          highGrade = grade;
        }
      }
    }
    return highGrade;
  }

  private int getRange() {
    int highGrade = getMaximum();
    int lowGrade = getMinimum();
    int range = highGrade - lowGrade;
    return range;
  }

  // determine average grade for particular set of grades
  private double getAverage(int[] setOfGrades) {
    int total = 0;
    // sum grades for one student
    for (int grade : setOfGrades) {
      total += grade;
    }
    // return average of grades
    return (double) total / setOfGrades.length; // casting
  }

  // output bar chart displaying overall grade distribution
  private void outputBarChart() {
    System.out.println("Overall grade distribution:");
    // stores frequency of grades in each range of 10 grades
    int[] frequency = new int[11];
    // for each grade in GradeBook, increment the appropriate frequency
    for (int[] studentGrades : grades) {
      for (int grade : studentGrades) {
        ++frequency[grade / 10];
      }
    }
    // for each grade frequency, print bar in chart
    for (int count = 0; count < frequency.length; count++) {
      // output bar label ("00-09: ", ..., "90-99: ", "100: ")
      if (count == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
      }
      // print bar of asterisks
      for (int stars = 0; stars < frequency[count]; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // output the contents of the grades array
  private void outputGrades() {
    System.out.printf("The grades are:%n%n");
    System.out.print("Student "); // align column heads
    // create a column heading for each of the tests
    for (int test = 0; test < grades[0].length; test++)
      System.out.printf("Test %d  ", test + 1);
    System.out.print("Average"); // student average column heading
    System.out.println("  Skip final"); // skip final exam heading
    // create rows/columns of text representing array grades
    for (int student = 0; student < grades.length; student++) {
      System.out.printf(" %2d", student + 1);
      for (int test : grades[student]) // output student's grades
        System.out.printf("%8d", test);
      // call method getAverage to calculate student's average grade;
      // pass row of grades as the argument to getAverage
      double average = getAverage(grades[student]);
      System.out.printf("%10.2f", average);
      if (average > skipFinal) { // static variable
        System.out.println("    x");
      } else {
        System.out.println();
      }
    }
  }
} // end class GradeBook
// primitive data types
/*
 * byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of
 * -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory
 * in large arrays, where the memory savings actually matters. They can also be used in place of int
 * where their limits help to clarify your code; the fact that a variable's range is limited can
 * serve as a form of documentation.
 * 
 * short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of
 * -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you
 * can use a short to save memory in large arrays, in situations where the memory savings actually
 * matters.
 * 
 * int: By default, the int data type is a 32-bit signed two's complement integer, which has a
 * minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int
 * data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum
 * value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the
 * section The Number Classes for more information. Static methods like compareUnsigned,
 * divideUnsigned etc have been added to the Integer class to support the arithmetic operations for
 * unsigned integers.
 * 
 * long: The long data type is a 64-bit two's complement integer. The signed long has a minimum
 * value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data
 * type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of
 * 264-1. Use this data type when you need a range of values wider than those provided by int. The
 * Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic
 * operations for unsigned long.
 * 
 * float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of
 * values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
 * Formats, and Values section of the Java Language Specification. As with the recommendations for
 * byte and short, use a float (instead of double) if you need to save memory in large arrays of
 * floating point numbers. This data type should never be used for precise values, such as currency.
 * For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers
 * BigDecimal and other useful classes provided by the Java platform.
 * 
 * double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of
 * values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
 * Formats, and Values section of the Java Language Specification. For decimal values, this data
 * type is generally the default choice. As mentioned above, this data type should never be used for
 * precise values, such as currency.
 * 
 * boolean: The boolean data type has only two possible values: true and false. Use this data type
 * for simple flags that track true/false conditions. This data type represents one bit of
 * information, but its "size" isn't something that's precisely defined.
 * 
 * char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000'
 * (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 */
