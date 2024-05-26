package ru.yandex.praktikum;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.List;
import org.hamcrest.core.AnyOf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

  @Mock
  Feline feline;

  @Test
  public void getKittensReturnSameResultWithFeline() throws Exception {
    Lion lion = new Lion("Самец", feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    assertEquals(1,lion.getKittens());
  }

  @Test
  public void getKittensReturnDifferentResultWithFeline() throws Exception {
    Lion lion = new Lion("Самка", feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    assertNotEquals(2,lion.getKittens());
  }

  @Test
  public void getFoodReturnSameResultWithFeline() throws Exception {
    Lion lion = new Lion("Самка", feline);
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава", "Различные растения"));
    assertEquals(List.of("Трава", "Различные растения"),lion.getFood());
  }

  @Test
  public void getFoodReturnDifferentResultWithFeline() throws Exception {
    Lion lion = new Lion("Самец", feline);
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трын-трава","Печенька"));
    assertNotEquals(List.of("Трава", "Различные растения"),lion.getFood());
  }
}