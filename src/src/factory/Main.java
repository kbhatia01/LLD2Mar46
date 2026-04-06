package src.factory;

import factory.AbstractFactory.UIFactory;

public class Main {
    public static void main() {
        String os = "ios";

        ComponentFactory factory = new ComponentFactory();
        UIFactory uiFactory = factory.getFactory(os);
        Application app = new Application(uiFactory.createButton(), uiFactory.createCheckbox());
        app.run();
    }
}
