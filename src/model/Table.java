package model;

import javax.swing.table.DefaultTableModel;

public class Table extends DefaultTableModel
{
    private DefaultTableModel model;

    public Table() {
        String[] columns = {"Id","Name", "Quantity", "Price", "Description", "Category", "Status"};
        model = new DefaultTableModel(columns, 0);
    }


    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
}
