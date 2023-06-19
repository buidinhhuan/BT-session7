package Rikkei;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Students.change();
        Students s1 = new Students(111, "Chinh");
        Students s2 = new Students(222, "Hieu");
        Students s3 = new Students(333, "Hoang");
        s1.display();
        s2.display();
        s3.display();
    }
}