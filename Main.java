import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) 
    {
        // creación del ArrayList
        ArrayList<Product> productos = new ArrayList<>();

        // prueba para agregar productos (aún no cuento con "Product.java" completo)
        productos.add(new Product(1, "arroz", 2, 27, "arroz", "alimentos", false));

        // mandamos a llamar DataStorage.save(productos);
        DataStorage.save(productos);

        System.out.println("Guardado correctamente...");
    }    
}