import java.util.ArrayList;
import model.dataStorage;
import model.product;

public class Main
{
    public static void main(String[] args) 
    {
        // creación del ArrayList
        ArrayList<product> productos = new ArrayList<>();

        // prueba para agregar productos (aún no cuento con "Product.java" completo)
        productos.add(new product(1, "arroz", 2, 27, "arroz", "alimentos", false));

        // mandamos a llamar DataStorage.save(productos);
        dataStorage.save(productos);

        System.out.println("Guardado correctamente...");
    }    
}