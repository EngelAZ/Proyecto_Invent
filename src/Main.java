import java.util.ArrayList;
import controller.dataStorage;
import java.util.Scanner;
import model.product;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // descarga de los datos
        ArrayList<product> productos = dataStorage.downloadData();

        // Ingreso de datos
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // limpiar el buffer

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
        product nuevo = new product(id, name, quantity, price, description, category, status);

        // Guardado en archivo
        dataStorage.save(nuevo);

        // mantenerlo en memoria
        productos.add(nuevo);
        
        System.out.println("Guardado correctamente...");

        sc.close();
    }    
}