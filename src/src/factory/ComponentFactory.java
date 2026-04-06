package src.factory;

import factory.AbstractFactory.AndroidFactory;
import factory.AbstractFactory.IosFactory;
import factory.AbstractFactory.UIFactory;
import factory.OS.Button;

public class ComponentFactory {


//    Button createButton(String os) {
//        if (os.equals("android")) {
//            return new AndroidButton();
//        } else {
//            return new IosButton();
//        }
//    }
//
//    AndroidCheckbox createCheckbox(String os) {
//        if (os.equals("android")) {
//
//        }
//    }

    UIFactory getFactory(String os) {
        if (os.equals("android")) {
            return new AndroidFactory();
        } else {
            return new IosFactory();
        }
    }
}
