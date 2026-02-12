import controller.Controller;
import view.Window;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(900, 900, "Inventory System",null,true);
        window.setVisible(true);

        Controller c = new Controller();
        c.menu();
    }
}
