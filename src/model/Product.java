package model;


public class Product
{
    // Attributes
    /**
     * Id del producto
     */
    private final int id;
    /**
     * Nombre del producto
     */
    private String name;
    /**
     * Cantidad del producto
     */
    private double quantity;
    /**
     * Precio del producto
     */
    private int price;
    /**
     * Descripción del producto
     */
    private String description;
    /**
     * Categoría del producto
     */
    private String category;
    /**
     * Estado del producto (true = en stock, false = agotado)
     */
    private boolean status;

    // Constructors
    /**
     * Constructor por defecto
     */
    public Product()
    {
        this.id = 0;
        this.name = " ";
        this.quantity = 0;
        this.price = 0;
        this.description = " ";
        this.category = " ";
        this.status = false;
    }

    /**
     * Constructor con parámetros
     * @param id - Id del producto
     * @param name - Nombre del producto
     * @param quantity - Cantidad del producto
     * @param price - Precio del producto
     * @param description - Descripción del producto
     * @param category - Categoría del producto
     * @param status - Estado del producto (true = en stock, false = agotado)
     */
    public Product(int id, String name, double quantity, int price, String description, String category) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.category = category;
        this.status = true;
    }

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
    
    // Getters y Setters
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

    // Methods
    /**
     * Método toString para representar el producto como una cadena de texto con sus atributos separados por comas
     * @return String - Representación del producto en formato CSV (id,name,quantity,price,description,category,status)
     */
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