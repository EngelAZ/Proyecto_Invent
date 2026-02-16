import controller.Controller;
import java.awt.Color;
import view.Window;

public class Main {
    public static void main(String[] args) {

        Window window = new Window(700, 1000, "Invent System", Color.WHITE, true);
        window.isVisible();
        Controller c = new Controller();
        c.menu();
    }
}
