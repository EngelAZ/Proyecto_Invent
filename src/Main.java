import config.PathsConfig;
import controller.DataStorage;
import java.util.ArrayList;
import java.util.Scanner;
import model.DetermineId;
import model.Product;

public class Main
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in)){

            // descarga de los datos
            ArrayList<Product> productos = DataStorage.downloadData();

            // Ingreso de datos
            //System.out.print("ID: ");
            int id = DetermineId.getId(PathsConfig.DATA_PRODUCT.toString());
            //sc.nextLine(); // limpiar el buffer

            System.out.print("Nombre: ");
            String name = sc.nextLine();

            System.out.print("Cantidad: ");
            double quantity = sc.nextDouble();

            System.out.print("Precio: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("Descripción: ");
            String description = sc.nextLine();

            System.out.print("Categoría: ");
            String category = sc.nextLine();

            System.out.print("¿Está disponible? (true / false): ");
            boolean status = sc.nextBoolean();

            // creación del producto con los datos ingresados
            Product nuevo = new Product(id, name, quantity, price, description, category, status);

            // Guardado en archivo
            DataStorage.save(nuevo);

            // mantenerlo en memoria
            productos.add(nuevo);
            
            System.out.println("Guardado correctamente...");

        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}