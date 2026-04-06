package src.factory.AbstractFactory;

import factory.IOS.IosCheckbox;
import factory.OS.Button;
import factory.IOS.IosButton;
import factory.OS.Checkbox;

public class IosFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    public Checkbox createCheckbox(){
        return new IosCheckbox();
    }
}
