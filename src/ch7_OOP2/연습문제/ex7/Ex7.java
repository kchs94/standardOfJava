package ch7_OOP2.연습문제.ex7;

public class Ex7 {
  public static void main(String[] args) {

    Child c = new Child();
    System.out.println("x=" + c.getX());
  }
}

class Parent {
  int x = 100;

  public Parent() {
    this(200);
  }

  public Parent(int x) {
    super();
    this.x = x;
  }

  public int getX() {
    return x;
  }
}

class Child extends Parent {
  int x = 3000;

  public Child() {
    this(1000);
  }

  public Child(int x) {
    this.x = x;
  }
}