import sealed.Cat;
import sealed.Dog;

public class Main {

    public static void main(String[] args) {

        var dog = new Dog();
        var cat = new Cat();

        System.out.println("#########################");
        System.out.println("Dog: ");
        dog.eat();
        dog.bark();
        System.out.println("#########################");

        System.out.println("");

        System.out.println("#########################");
        System.out.println("Cat: ");
        cat.eat();
        System.out.println("#########################");

    }

}
