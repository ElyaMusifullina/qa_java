package ru.yandex.praktikum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FelineTest {

  Feline feline = new Feline();

  @Test
  public void getFamilyReturnCat() {
    assertEquals("Кошачьи", feline.getFamily());
  }

  @Test
  public void getKittens() {
    assertEquals(1, feline.getKittens());
  }

}
