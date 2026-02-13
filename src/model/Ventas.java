package model;

import java.util.Scanner;
import controller.DataStorage;

public class Ventas {

    Scanner sc = new Scanner(System.in);

    public void realizarVenta() {

        System.out.print("Ingrese ID del producto: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese cantidad a vender: ");
        double cantidad = Double.parseDouble(sc.nextLine());

        boolean resultado = DataStorage.disminuirCantidad(id, cantidad);

        if (resultado) {
            System.out.println("Venta realizada correctamente");
        } else {
            System.out.println("No se pudo realizar la venta");
        }
    }
}
