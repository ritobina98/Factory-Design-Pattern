package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.dropDown.AndroidDropDown;
import factory.components.dropDown.DropDown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;
import factory.components.scrollWheel.AndroidScrollWheel;
import factory.components.scrollWheel.ScrollWheel;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new AndroidScrollWheel();
    }
}

