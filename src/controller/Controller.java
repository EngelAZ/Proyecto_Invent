package controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Product;
import model.Ventas;


public class Controller 
{
    Scanner sc = new Scanner(System.in);

    public void menu()
    {

        while (true)
        {

            cleanScreen();

            System.out.println("----- MENÚ ------");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Realizar venta");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int option;

            try
            {
                option = Integer.parseInt(sc.nextLine());
            }
            catch (InputMismatchException | NumberFormatException e)
            {
                continue;
            }

            switch (option)
            {
                case 1 -> {
                    //addProduct();
                }
                case 2 -> {
                    System.out.print("Ingrese el ID a buscar: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Product encontrado = DataStorage.buscarProductoId(id);

                    if (encontrado != null)
                    {
                        System.out.println("Producto encontrado: ");
                        System.out.println(encontrado);
                    }
                    else
                    {
                        System.out.println("Producto no encontrado");
                    }

                    waitUser();
                }
                case 3 ->{
                    System.out.print("Ingresar el ID del producto a eliminar: ");
                    int id = Integer.parseInt(sc.nextLine());

                    boolean eliminado = DataStorage.eliminarProductoId(id);

                    if (eliminado)
                    {
                        System.out.println("Producto eliminado correctamente");
                    }
                    else
                    {
                        System.out.println("Producto no encontrado");
                    }

                    waitUser();
                }

                 case 4 -> {
                 Ventas v = new Ventas();
                v.realizarVenta();
                waitUser();
                 }

                 case 5 ->{
                 System.out.println("Saliendo...");
                 return;
                }

                default -> {
                System.out.println("Opción inválida");

            }
          }

        }
    }

    private void waitUser()
    {
        System.out.println("\nPresione ENTER para volver al menú...");
        sc.nextLine();
    }

    public static void cleanScreen() {
        try
        {
            // Compatible con Windows y Linux
            if (System.getProperty("os.name").contains("Windows")) //consigue del sistema operativo su nombre y verifica si es windows 
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                /* Ejecuta el comando cls de windows para limpiar la consola
                new ProcessBuilder crea un nuevo proceso
                cmd /c indica que se va a ejecutar un comando y luego salir
                inheritIO() hace que el proceso hijo use la misma entrada/salida que el proceso padre
                start() inicia el proceso
                waitFor() espera a que el proceso termine antes de continuar*/
            }
            else
            {
                System.out.print("\033[H\033[2J\033[3J"); // ANSI codigos de escape
                System.out.flush();//Limpia la consola en sistemas tipo Unix (Linux, macOS), asegura que se apliquen los cambios inmediatamente

            }
        }
        catch (IOException | InterruptedException e)
        {
            System.out.println("No se pudo limpiar la consola.");
        }
    }
}
