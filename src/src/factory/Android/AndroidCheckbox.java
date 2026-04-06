package src.factory.Android;

public class AndroidCheckbox implements factory.OS.Checkbox {
    @Override
    public void tick() {
        System.out.println("Android AndroidCheckbox Ticked");
    }
}
