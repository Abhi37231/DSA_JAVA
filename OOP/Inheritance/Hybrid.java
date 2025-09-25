public class Hybrid {
    public static void main(String[] args) {
        
        Mammal m = new Mammal();
        System.out.println(m.dog);
        m.eat();

        Bird b = new Bird();
        b.peacock();

        
        
    }
}
class Animal{
    void eat(){
        System.out.println("Can eat..");
    }
    void breathe(){
        System.out.println("Can Breathe..");
    }
}
class fish extends Animal{
void tuna(){
    System.out.println("tuna");
}
void shark(){
    System.out.println("Tuna");
}

}
class Bird{
    void peacock(){
        System.out.println("Peacockj");
    }
}
class Mammal extends Animal{
    String dog = "dobby";
    int cat;
    int human;
}

