package controller;

import java.util.ArrayList;
import model.Product;
import view.products.RemoveProductView;

public class RemoveProductController
{
    RemoveProductView RemoveProductView;

    public RemoveProductController(RemoveProductView removeProductView)
    {
        this.RemoveProductView = removeProductView;
        loadTable();
    }

    public void removeProduct()
    {
        int id = Integer.parseInt(RemoveProductView.getTxtId());

        DataStorage.eliminarProductoId(id);

        loadTable();
        RemoveProductView.clearField();
    }

    private void loadTable()
    {
        ArrayList<Product> products = DataStorage.downloadData();
        RemoveProductView.updateTable(products);
    }
}