public class StaticMethod {
    public static  final double PI = 3.14;
    public  static  double calCircleArea(double radius){
        return  PI * radius * radius ;
    }
    public  static  double calRectangArea(double width, double height){
        return  width * height ;
    }
    public  static  double calTriangleArea(double sideA, double sideB,double sideC){
        double s = (sideA + sideB + sideC) / 2;
        return  Math.sqrt(s * (s - sideA ) * (s - sideB ) * (s - sideC));
    }



}
