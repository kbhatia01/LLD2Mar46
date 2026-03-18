package SOLID.Openclose;

public class Peacock extends Bird implements Flyable, Dance{

    @Override
    public void make_sound() {
        System.out.println("Peacock..");
    }

    @Override
    public void fly() {
        System.out.println("Flyable peacock..");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }
}
