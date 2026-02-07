package model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DataStorage 
{
    public static void save(ArrayList<Product> productos) 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Data.txt"))) 
        {

            for (int i = 0; i < productos.size(); i++) 
            {
                Product p = productos.get(i);
                writer.println(p.toString());
            }

        } catch (IOException e) {
            System.out.println("Error al guardar archivo");
        }
    }
}
