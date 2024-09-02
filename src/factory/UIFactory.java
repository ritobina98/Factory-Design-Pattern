package factory;

import factory.components.button.Button;
import factory.components.dropDown.DropDown;
import factory.components.menu.Menu;
import factory.components.scrollWheel.ScrollWheel;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
    ScrollWheel createScrollWheel();
}
