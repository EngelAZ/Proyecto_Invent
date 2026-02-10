package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Product;
import model.DetermineId;

public class Controller {

    Scanner sc = new Scanner(System.in);
    ArrayList<Product> productos = DataStorage.downloadData();

    public void menu() {

        while (true) {

            limpiarPantalla(); 

            System.out.println("----- MENÚ ------");
            System.out.println("1. Agregar producto");
            System.out.println("2. Salir");
            System.out.print("Opción: ");

            int opcion;

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    return;
                default:
                    break;
            }
        }
    }

    private void agregarProducto() {

        limpiarPantalla();

        int id = DetermineId.getId("src/db/Data.txt");

        System.out.print("Nombre: ");
        String name = sc.nextLine();

        System.out.print("Cantidad: ");
        double quantity = Double.parseDouble(sc.nextLine());

        System.out.print("Precio: ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.print("Descripción: ");
        String description = sc.nextLine();

        System.out.print("Categoría: ");
        String category = sc.nextLine();

        System.out.print("¿Está disponible? (true/false): ");
        boolean status = Boolean.parseBoolean(sc.nextLine());

        Product nuevo = new Product(id, name, quantity, price, description, category, status);

        DataStorage.save(nuevo);
        productos.add(nuevo);

        System.out.println("\nProducto guardado correctamente!");
        pausar();
    }

    private void pausar() {
        System.out.println("\nPresione ENTER para volver al menú...");
        sc.nextLine();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error al limpiar pantalla");
        }
    }
}
