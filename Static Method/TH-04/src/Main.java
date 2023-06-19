// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Name : " + StaticMethod.name);
        System.out.println("age : " + StaticMethod.age);

        StaticMethod.showInfo();
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Name : " + StaticMethod.name);
        System.out.println("age : " + StaticMethod.age);
        staticMethod.showInfo();


    }
}