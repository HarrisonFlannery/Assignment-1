// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Exercise 1a
    int x = 7;
    int y = 12;
    System.out.println("The sum of the two variables is " + (x+y));
    // Exercise 1b
    double z = 2.59;
    System.out.println("The sum of the three variables is " + (x+y+z));
    // Exercise 1c
    boolean isThisTrue = true;
    boolean isThisNotTrue = false;
    System.out.println(isThisTrue);
    System.out.println(isThisNotTrue);
    // Exercise 1d
    char char1 = 62;
    char char2 = 119;
    char char3 = 60;
    System.out.print(char1);
    System.out.print(char2);
    System.out.print(char3);
    System.out.println();
    // Exercise 1e
    int high = 327, low = 4;
    if(high > low){
      System.out.println(true);
    }
    // Exercise 1f
    String name = "Harrison ";
    String surname = "Dailey";
    System.out.println(name+surname);
    // Exercise 1g
    System.out.println(name+x);
    // Exercise 1h
    System.out.println("I get that he's \"cool\", but that doesn't mean he gets to live here.");
    // Exercise 1i
    if (x > y){
      System.out.println("x is greater than y");
    } else if (y>x){
      System.out.println("y is greater than x");
    } else {
      System.out.println("x and y are equal");
    }
  }
}