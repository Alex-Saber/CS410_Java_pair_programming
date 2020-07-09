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
                    1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
            )
    );

    ArrayList<String> symbols = new ArrayList<>(
            Arrays.asList(
                    "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
            )
    );

    StringBuilder toReturn = new StringBuilder();

    int index = 0;
    int remainder = 0;
    int intMod = 0;

    while (number > 0){
      if(number >= values.get(index)){
        remainder = number % values.get(index);
        intMod = (number - remainder) / values.get(index);
        number = number - (intMod * values.get(index));
        for(int i=0; i < intMod; i++){
          toReturn.append(symbols.get(index));
        }
      }
      index++;
    }
    return toReturn.toString();
  }
}