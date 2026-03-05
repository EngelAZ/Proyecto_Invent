package test;

import infrastructure.ProductRepositoryImpl;
import model.Product;

public class MainTest {

    public static void main(String[] args) {

        ProductRepositoryImpl repo = new ProductRepositoryImpl();

        Product producto = new Product(
                0,
                "Teclado",
                5,
                50,
                "Teclado mecánico RGB",
                "Perifericos",
                true
                
        );

        boolean resultado = repo.insertProduct(producto);

        if(resultado){
            System.out.println("Producto guardado correctamente");
        } else {
            System.out.println("Error al guardar producto");
        }
    }
}