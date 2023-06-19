import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> students;

    public static void main(String[] args) {
        students = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("++++++++ Menu ++++++++");
            System.out.println("1. Show list of Students");
            System.out.println("2. Add New Student");
            System.out.println("3. Update Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. EXIT");
            System.out.print("Choose (1-5): ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showListOfStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    updateStudentById();
                    break;
                case 4:
                    deleteStudentById();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
        System.out.println("EXIT GOOD BYE MY FRIEND!!!!");
    }

    public static void showListOfStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List Students");
            for (Student student : students) {
                student.displayData();
                System.out.println("--------------------");
            }
        }
    }

    public static void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter New Student");
        System.out.print("Enter ID student: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name Student: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Gender Student (true/false): ");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Enter Class Name: ");
        String className = scanner.nextLine();
        System.out.print("Enter Age Student: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Address Students: ");
        String address = scanner.nextLine();
        Student student = new Student(studentId, studentName, sex, age, address, className);
        students.add(student);
        System.out.println("Congratulations! New student added.");
    }

    public static void updateStudentById(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of the student to update: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println("Enter updated info for student:");
                System.out.print("Enter ID student: ");
                student.setStudentId(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Enter Name Student: ");
                student.setStudentName(scanner.nextLine());
                System.out.print("Enter Gender Student (true/false): ");
                student.setSex(scanner.nextBoolean());
                scanner.nextLine();
                System.out.print("Enter Class Name: ");
                student.setClassName(scanner.nextLine());
                System.out.print("Enter Age Student: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Enter Address Students: ");
                student.setAddress(scanner.nextLine());
                System.out.println("Congratulations! Student info updated.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public static void deleteStudentById(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of the student to delete: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                System.out.println("Student with ID " + id + " deleted.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
