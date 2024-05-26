package ru.yandex.praktikum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;
import org.junit.Test;

public class CatTest {
  Feline feline = new Feline();
  Cat cat = new Cat(feline);

  @Test
  public void getSoundReturnMiay() {
    assertEquals("Мяу", cat.getSound());
  }

  @Test
  public void getFoodReturnProteinFood() throws Exception {
    List<String> listOfProteinFood = List.of("Животные", "Птицы", "Рыба");
    assertEquals(listOfProteinFood, cat.getFood());
  }

  @Test
  public void getFoodNotReturnVegetableFood() throws Exception {
    List<String> listOfVegetableFood = List.of("Трава", "Различные растения");
    assertNotEquals(listOfVegetableFood, cat.getFood());
  }
}
