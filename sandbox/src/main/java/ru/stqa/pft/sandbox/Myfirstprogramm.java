package ru.stqa.pft.sandbox;

public class Myfirstprogramm {

  public static void main(String[] args) {
   hello("world");
    hello("user");
    hello("Aleksey");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(1, 1);
    Point p2 = new Point(3,5);
    double d = p1.distance(p2);
    System.out.println("Расстоание между точками " + "X" + " и " + "Y " + " = " + d);
  }
  public static void hello(String somebody) {
    System.out.println("Hello," + somebody +"!");
  }


}
