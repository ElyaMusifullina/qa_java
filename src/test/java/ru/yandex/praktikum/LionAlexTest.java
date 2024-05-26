package ru.yandex.praktikum;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class LionAlexTest {

  private Feline feline;
  LionAlex lionAlex = new LionAlex(feline);

  public LionAlexTest() throws Exception {
  }

  @Test
  public void getKittensReturn0() {
    assertEquals(0, lionAlex.getKittens());
  }

  @Test
  public void getFriendsReturnListOfFriends() {
    List<String> friends = List.of("Марти", "Глория", "Мелман");
    assertEquals(friends, lionAlex.getFriends());
  }

  @Test
  public void getPlaceOfLivingReturnZoo() {
    assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
  }


}
