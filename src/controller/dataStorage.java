package controller;
import model.product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;




public class dataStorage 
{
    public static final String data = "src/db/Data.txt";

    public static void save(ArrayList<product> productos) 
    {

        try (PrintWriter writer = new PrintWriter(new FileWriter(data,true))) 
        {

            for (int i = 0; i < productos.size(); i++) 
            {
                product p = productos.get(i);
                writer.println(p.toString());
            }

        } catch (IOException e) {
            System.out.println("Error al guardar archivo");
        }
    }

    public static ArrayList<product> downloadData()
    {
        ArrayList<product> productos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(data)))
        {

           String linea;

           
           

        } catch (Exception e) {
            // TODO: handle exception
        }

        return productos;
    }
}
