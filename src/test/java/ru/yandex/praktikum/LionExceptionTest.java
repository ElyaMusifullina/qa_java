package ru.yandex.praktikum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionTest {

  private static final String EXPECTED_EXCEPTION = "Используйте допустимые значения пола животного - самец или самка";

  private final String sex;

  @Parameterized.Parameters
  public static Object[][] data() {
    return new Object[][] {
      {null},
      {"Сам"},
      {""}
    };
  }

  public LionExceptionTest(String sex) {
    this.sex = sex;
  }

  @Test
  public void doesHaveMane() {
    Exception exception = assertThrows(Exception.class, () -> new Lion(sex, null));
    assertEquals(EXPECTED_EXCEPTION, exception.getMessage());
  }
}
