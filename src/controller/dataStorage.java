package controller;

import config.PathsConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.product;




public class dataStorage 
{
    public static final String DATA = PathsConfig.DATA_PRODUCT.toString();

    public static void save(product p) 
    {

        try (PrintWriter writer = new PrintWriter(new FileWriter(DATA,true))) 
        {
            writer.println(p.toString());
        } catch (IOException e) {
            System.out.println("Error al guardar archivo");
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static ArrayList<product> downloadData()
    {
        ArrayList<product> productos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(DATA)))
        {

           String linea;

           while ((linea = reader.readLine()) != null) 
            {
                // ignorar líneas vacías 
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(",");

                // validar la cantidad de datos de product
                if (datos.length != 7)
                {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                product p = new product
                (
                    Integer.parseInt(datos[0].trim()),
                    datos[1].trim(),
                    Double.parseDouble(datos[2].trim()),
                    Integer.parseInt(datos[3].trim()), 
                    datos[4].trim(),
                    datos[5].trim(),
                    Boolean.parseBoolean(datos[6].trim())
                );

                productos.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace(); // for debugging
        }

        return productos;
    }
}
