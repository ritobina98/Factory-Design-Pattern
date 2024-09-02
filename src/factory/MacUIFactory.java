package factory;

import factory.components.button.Button;
import factory.components.button.MacButton;
import factory.components.dropDown.DropDown;
import factory.components.dropDown.MacDropDown;
import factory.components.menu.MacMenu;
import factory.components.menu.Menu;
import factory.components.scrollWheel.MacScrollWheel;
import factory.components.scrollWheel.ScrollWheel;

public class MacUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new MacScrollWheel();
    }
}
