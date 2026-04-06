package src.factory.AbstractFactory;

import factory.Android.AndroidButton;
import factory.OS.Button;
import factory.Android.AndroidCheckbox;
import factory.OS.Checkbox;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }

//    public checkbox createCheckbox(){
//
//    }
}
