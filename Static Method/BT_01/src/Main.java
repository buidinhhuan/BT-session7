// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyClass obj = new  MyClass("Helo");
        System.out.println("ivitial value " + obj.getMyString());
        obj.setMyString("New Value");
        System.out.println("Update value " + obj.getMyString());
    }
}