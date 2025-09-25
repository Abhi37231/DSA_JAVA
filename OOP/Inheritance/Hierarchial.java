public class Hierarchial {
    public static void main(String[] args) {
         bard Bird= new bard();
         Bird.fly();

    }
}
class Animal{
    void eat(){
        System.out.println("Eats..");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims..");
    }

}
class bard extends Animal{
    void fly(){
        System.out.println("Flys");
    }
}
class Mammal{

    void walk(){
        System.out.println("Can walk.");
    }
}
