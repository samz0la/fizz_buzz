package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String value = "";
      if (i % 3 == 0) {
        value = "Fizz";
      }
      if (i % 5 == 0) {
        value += "Buzz";
      }
      if (i % 7 == 0) {
        value += "Woof";
      }
      if (value.isEmpty()) {
        value += i;
      }
      System.out.println(value);
    }
  }
}
