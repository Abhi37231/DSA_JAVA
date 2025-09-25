import java.util.*;

public class Static {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.schoolName= "DYP";

        Student1 s2 = new Student1();

        System.out.println(s2.schoolName);
    }
}

class Student1{
    String name;
    int rollno;

    static String schoolName;

    void setName(String name){
        this.name = name;

    }
    String getName(){
        return this.name;
    }
}