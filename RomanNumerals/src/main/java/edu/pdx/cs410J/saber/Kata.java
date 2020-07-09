package edu.pdx.cs410J.saber;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String calculateRomanNumeral(int number) {
    ArrayList<Integer> values = new ArrayList<>(
            Arrays.asList(
                    10, 9, 5, 4, 1
            )
    );

    ArrayList<String> symbols = new ArrayList<>(
            Arrays.asList(
                    "X", "IX", "V", "IV", "I"
            )
    );

    StringBuilder toReturn = new StringBuilder();

//    for (Integer val: )
    return "I";
  }

  public static String romanNumeralFor(int number) {
    return calculateRomanNumeral(number);
  }
}