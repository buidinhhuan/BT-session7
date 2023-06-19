// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("JOHN","CARTER",22,true);
        Person p2 = new Person("MARK","DOMMM",25,false);
//        System.out.println(p1.firstname);
        System.out.println(p1.getFirstname());
        System.out.println("Name P2: " + p2.getFirstname()+""+p2.getLastname());
    }
}