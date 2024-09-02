package factory;

import factory.components.button.Button;
import factory.components.button.IosButton;
import factory.components.dropDown.DropDown;
import factory.components.dropDown.IosDropDown;
import factory.components.menu.IosMenu;
import factory.components.menu.Menu;
import factory.components.scrollWheel.IosScrollWheel;
import factory.components.scrollWheel.ScrollWheel;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new IosScrollWheel();
    }
}
