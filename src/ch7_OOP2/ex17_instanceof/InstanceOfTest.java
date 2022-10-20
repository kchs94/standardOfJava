package ch7_OOP2.ex17_instanceof;

public class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance");
        }

        if (fe instanceof Car) {
            System.out.println("This is an Car Instance");
        }

        if (fe instanceof Object) {
            System.out.println("This is an Object instance");
        }
        System.out.println(fe.getClass().getName());
   }
}
class Car {
}
class FireEngine extends Car {

}
