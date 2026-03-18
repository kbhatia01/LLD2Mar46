package SOLID.Openclose;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void make_sound() {
        System.out.println("sparrow");
    }

    @Override
    public void fly() {
        System.out.println("sparrow fly");
    }
}
