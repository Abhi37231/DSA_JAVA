
public class OOP {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhinandan";
        s1.roll = 65;

        s1.mark[0]=100;
        s1.mark[1]=90;
        s1.mark[2]= 80;



        Student s2 = new Student(s1);
        s1.mark[1]=100; 
        for(int i=0;i<3;i++){
            System.out.println(s2.mark[i]);

        }
        System.out.println(s2.name);
        

    }
}

class Student{
    String name;
    int roll;
    int mark[];

    //copy 
    Student(Student s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.mark = s1.mark;

    }
    Student(){
        mark = new int[3];
        System.out.println(" ");
    }
    Student(String name){
        mark = new int[3];
        this.name = name;
    }
    Student(int roll){
        mark = new int[3];
        this.roll = roll;

    }
    
}