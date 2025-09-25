public class multiLevel{

    public static void main(String[] args) {
        dog dobby = new  dog();
        dobby.eat();
        
        dobby.legs = 4;
        System.out.println(dobby.legs);


    }
}
class Animal1{
    void eat(){
        System.out.println("Eats..");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Mammal extends Animal1{
    int legs;


}
class dog extends Mammal{

    String breed;
    
}