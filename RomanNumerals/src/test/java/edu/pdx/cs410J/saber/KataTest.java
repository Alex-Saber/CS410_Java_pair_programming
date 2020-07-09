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
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

}
