package src.factory.IOS;

import factory.OS.Button;

public class IosButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS Button Clicked");
    }
}
