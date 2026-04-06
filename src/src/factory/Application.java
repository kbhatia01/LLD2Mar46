package src.factory;

import factory.OS.Button;
import factory.OS.Checkbox;

public class Application {
    Button button;
    Checkbox checkbox;


    Application(Button button, Checkbox checkbox) {
        this.button = button;
        this.checkbox = checkbox;
    }
    void run() {
        button.click();
        checkbox.tick();
    }
}
