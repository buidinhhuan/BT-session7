// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double  circleArea1 = StaticMethod.calCircleArea(3.5);
        double  circleArea2 = StaticMethod.calCircleArea(6);
        System.out.println("Circle 1 Area: " + circleArea1);
        System.out.println("Circle 2 Area: " + circleArea2);


        double triangleArea1 = StaticMethod.calTriangleArea(3,4,5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5,7,6);
        System.out.println("Triangle 1 Area: " + triangleArea1);
        System.out.println("Triangle 2 Area: " + triangleArea2);

        double rectangleArea1 = StaticMethod.calRectangArea(2.5,6);
        double rectangleArea2 = StaticMethod.calRectangArea(4,7);

    }
}