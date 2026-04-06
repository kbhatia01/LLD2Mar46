package src.factory.AbstractFactory;

import factory.OS.Checkbox;
import factory.OS.Button;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
