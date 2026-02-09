package model;

import java.io.*;

public class determineId
{
    //private final String direccionTxt;
    //private int id;

    public static int getId(String direccionTxt)
    {
        int id = 0;
        try(BufferedReader bf = new BufferedReader(new FileReader(direccionTxt)))
        {
            while(bf.readLine() != null)
                id++;
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        } 
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return id + 1;
    }

}