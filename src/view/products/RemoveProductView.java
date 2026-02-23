package view.products;

import controller.RemoveProductController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Product;

public class RemoveProductView extends JPanel
{
    private JTextField txtId;
    private JButton btnRemove;
    private JPanel formPanel;
    private JPanel tablePanel;
    private DefaultTableModel model;

    public RemoveProductView()
    {
        configurePanel();
        intComponents();
    }

    public void setController(RemoveProductController controller)
    {
        btnRemove.addActionListener(e -> controller.removeProduct());
    }

    public String getTxtId()
    {
        return txtId.getText();
    }


    private void configurePanel()
    {
        this.setLayout(new BorderLayout(0,0));
        //this.setBackground(new Color(242,240,239));
    }

    private void intComponents()
    {
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1,3,20,20));
        formPanel.setBorder(BorderFactory.createTitledBorder("Remove Product"));
        formPanel.setBackground(new Color(242,240,239));

        txtId = new JTextField();
        btnRemove = new JButton("Remove");
        JLabel txt =  new JLabel("Id:", JLabel.RIGHT);
        JPanel r = new JPanel();
        r.setLayout(new GridLayout(1,2,10,20));
        r.add(txt);
        r.add(txtId);

        formPanel.add(r);
        formPanel.add(btnRemove);
        formPanel.add(new JLabel(""));

        tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createTitledBorder("Product List"));

        String[] columns = {"Id", "Name", "Quantity", "Price", "Description", "Category", "Status"};
        model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.add(scrollPane);

        this.add(formPanel, BorderLayout.NORTH);
        this.add(tablePanel, BorderLayout.CENTER);
    }

    public void updateTable(ArrayList<Product> products)
    {
        model.setRowCount(0);

        for(Product p : products )
        {
            model.addRow(new Object[]{
                p.getId(),
                p.getName(),
                p.getQuantity(),
                p.getPrice(),
                p.getDescription(),
                p.getCategory(),
                p.getStatus()
            });
        }
    }

    public void clearField()
    {
        txtId.setText("");
    }
}
