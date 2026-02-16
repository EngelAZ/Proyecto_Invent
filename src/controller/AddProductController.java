package controller;

import config.PathsConfig;
import java.util.ArrayList;
import model.*;
import view.products.AddProductView;



public class AddProductController
{
    AddProductView addProductView;

    public AddProductController(AddProductView addProductView)
    {
        this.addProductView = addProductView;
        loadTable();
    }

    public void addProduct()
    {
        int id = DetermineId.getId(PathsConfig.DATA_PRODUCT.toString());
        String name = addProductView.getNameField();
        double quantity = addProductView.getQuantityField();
        int price = addProductView.getPriceField();
        String description = addProductView.getDescriptionField();
        String category = addProductView.getCategory();

        Product nuevo = new Product(id, name, quantity, price, description, category);

        DataStorage.save(nuevo);
        //products.add(nuevo);

        loadTable();
        addProductView.clearFields();
    }

    private void loadTable()
    {
        ArrayList<Product> list = DataStorage.downloadData();
        addProductView.updateTable(list);
    }
}
