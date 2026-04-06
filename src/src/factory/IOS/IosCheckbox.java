package src.factory.IOS;

public class IosCheckbox implements factory.OS.Checkbox {
    @Override
    public void tick() {
        System.out.println("IOS checkbox Ticked");
    }
}
