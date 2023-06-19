public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private boolean gender;

    public Person() {
    }

    public Person(String firstname, String lastname, int age, boolean gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname() {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person p1 = new Person("JOHN", "CARTER", 22, true);
        Person p2 = new Person("MARK", "DOMMM", 25, false);
        System.out.println(p1.firstname);
        System.out.println(p1.getFirstname());
        System.out.println("Name P2: " + p2.getFirstname() + "" + p2.getLastname());
    }
}
