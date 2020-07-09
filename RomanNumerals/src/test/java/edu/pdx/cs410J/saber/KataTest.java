package edu.pdx.cs410J.saber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.calculateRomanNumeral(1), equalTo("I"));
  }

  @Test
  public void romanNumeralFor5IsV() {
    assertThat(Kata.calculateRomanNumeral(5), equalTo("V"));
  }

  @Test
  public void romanNumeralFor39IsXXXIX() {assertThat(Kata.calculateRomanNumeral(39), equalTo("XXXIX"));}

  @Test
  public void romanNumeralFor3549IsMMMDXLIX() {
    assertThat(Kata.calculateRomanNumeral(3549), equalTo("MMMDXLIX"));
  }

}
