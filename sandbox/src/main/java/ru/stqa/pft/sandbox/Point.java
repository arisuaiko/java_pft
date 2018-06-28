package ru.stqa.pft.sandbox;

public class Point {

  public double x;

  public double y;

  public Point (double x, double y) {

    this.x = x;

    this.y = y;
  }

  public double distance(Point p1) {
    return Math.sqrt(Math.pow(p1.x - this.x, 2) + Math.pow(p1.y - this.y, 2));
  }
  public static void main(String[] args) {
    Point p1 = new Point(50, 4);
    Point p2 = new Point(10, 10);
    System.out.println("Расстояние между точкой " + p1 + " и точкой " + p2 + " составляет " + p1.distance(p2));
  }
}
