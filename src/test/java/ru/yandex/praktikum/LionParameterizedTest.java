package ru.yandex.praktikum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

  private final String sex;
  private final boolean expectedResult;

  @Parameterized.Parameters
  public static Object[][] data() {
    return new Object[][] {
      {"Самец", true},
      {"Самка", false}
    };
  }

  public LionParameterizedTest(String sex, boolean expectedResult) {
    this.sex = sex;
    this.expectedResult = expectedResult;
  }

  @Test
  public void doesHaveMane() throws Exception {
    Lion lion = new Lion(sex, null);
    assertEquals(expectedResult, lion.doesHaveMane());
  }
}
