package src.factory.Android;

import factory.OS.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button Clicked");
    }
}
