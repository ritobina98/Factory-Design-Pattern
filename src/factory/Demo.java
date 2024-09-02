package factory;

import factory.components.button.Button;
import factory.components.dropDown.DropDown;
import factory.components.menu.Menu;
import factory.components.scrollWheel.ScrollWheel;

public class Demo {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.setSupportPlatform(SupportPlatform.MAC);

        //app building code
        UIFactory uiFactory = flutter.getUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        ScrollWheel scrollWheel = uiFactory.createScrollWheel();
    }
}
