import javafx.scene.shape.Circle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính của Circle: " + circle.getRadius());
        System.out.println("Diện tích của Circle: " + circle.getArea());

        circle = new Circle(2.5);
        System.out.println("Bán kính của Circle: " + circle.getRadius());
        System.out.println("Diện tích của Circle: " + circle.getArea());
    }
}