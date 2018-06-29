package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint1() {

    Point p1 = new Point(2,4);
    Point p2 = new Point(5, 10);
    Assert.assertEquals(p1.distance(p2), 6.708203932499369);
  }

  @Test
  public void testPoint2() {

    Point p1 = new Point(40,30);
    Point p2 = new Point(12, 10);
    Assert.assertEquals(p1.distance(p2), 34.40930106817051);
  }

  @Test
  public void testPoint3() {

    Point p1 = new Point(1,2);
    Point p2 = new Point(2, 1);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
  }
}
