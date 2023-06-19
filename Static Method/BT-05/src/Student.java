import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;


    public Student(int studentid, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentid;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public Student(int studentId, String studentName, boolean sex, int age, String address, String className) {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Student");
        studentId = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Enter Name Student");
        studentName = scanner.nextLine();
        System.out.println("Enter gender:");
        sex = scanner.nextBoolean();
        scanner.skip("\n");
        System.out.println("Enter ClassStudent");
        className = scanner.nextLine();
        System.out.println("Enter Age Student");
        age = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Enter Address Students");
        address = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ID: " + studentId);
        System.out.println("Tên: " + studentName);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lớp: " + className);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }
}
