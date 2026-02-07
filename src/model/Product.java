package model;
public class Product
{
//Attributes
    private final int id;
    private String name;
    private double quantity;
    private int price;
    private String description;
    private String category;
    private boolean status;

    public Product(int id, String name, double quantity, int price, String description, String category, boolean status) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.category = category;
        this.status = status;
    }
//getters y setters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void statusOutOfStock()
    {
        this.status = false;
    }

    public void statusInStock()
    {
        this.status = true;
    }

    @Override
    public String toString()
    {
        return id + "," + name + "," + quantity + "," + price + "," + description + "," + category + "," + status;
    }
    /*public Editing
    {

    }
    public  verification

    */
}