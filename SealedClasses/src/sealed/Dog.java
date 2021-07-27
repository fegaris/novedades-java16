package sealed;

public final class Dog extends Animal implements Bark {
    @Override
    public void bark() {
        System.out.println("Guau!!");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }
}
