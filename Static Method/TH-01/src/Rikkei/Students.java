package Rikkei;

public class Students {
    private int rollNo;
    private  String name;
    private static  String college = "BBDIT";

    Students(int r, String n){
        rollNo = r ;
        name = n;
    }
    static  void change(){
        college = "Rikkei";
    }
    void display(){
        System.out.println(rollNo + "" + name + " " + college);
    }

}
