import java.awt.Color;
import view.Window;
import infrastructure.DatabaseConnection;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) {
        Window window = new Window(1000, 800, "Inventory System",Color.WHITE,true);
        window.setVisible(true);
       // Controller c = new Controller();
      //  c.menu();
      try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Conexión exitosa 🚀");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
