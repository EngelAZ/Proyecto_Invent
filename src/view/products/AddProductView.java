package view.products;

import controller.*;
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

public class AddProductView extends JPanel
{
    private JTextField txtName;
    private JTextField txtQuantity;
    private JTextField txtPrice;
    private JTextField txtDescription;
    private JTextField txtCategory;
    private JButton btnAdd;
    private JPanel formPanel;
    private JPanel tablePanel;
    private DefaultTableModel model;

    public AddProductView()
    {
        configurePanel();
        initComponents();
    }

    private void configurePanel()
    {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
    }

    private void initComponents()
    {

        // ===== PANEL SUPERIOR (Formulario) =====
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 6, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Add Product"));

        txtName = new JTextField();
        txtQuantity = new JTextField();
        txtPrice = new JTextField();
        txtDescription = new JTextField();
        txtCategory = new JTextField();

        btnAdd = new JButton("Add");

        formPanel.add(new JLabel("Name:"));
        formPanel.add(txtName);
        formPanel.add(new JLabel("Description:"));
        formPanel.add(txtDescription);
        formPanel.add(new JLabel("Quantity:"));
        formPanel.add(txtQuantity);
        formPanel.add(new JLabel("Category:"));
        formPanel.add(txtCategory);
        formPanel.add(new JLabel("Price:"));
        formPanel.add(txtPrice);
        formPanel.add(new JLabel(""));
        formPanel.add(btnAdd);

        btnAdd.addActionListener(e -> addProduct());

        // ===== PANEL CENTRAL (Tabla) =====
        tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createTitledBorder("Product List"));

        String[] columns = {"Id","Name", "Quantity", "Price", "Description", "Category", "Status"};
        //esto lo debe de hacer el controlador, no la vista, pero lo hago aquí para mostrar la tabla con datos...
        model = new DefaultTableModel(columns, 0);
        /*
        ArrayList<Product> list = DataStorage.downloadData();

        for (Product p : list) {
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
        // ... del controlador es que tiene que venir este model*/
        refreshTable();
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // ===== AGREGAR TODO =====
        this.add(formPanel, BorderLayout.NORTH);
        this.add(tablePanel, BorderLayout.CENTER);
    }

    private void addProduct()
    {
        String name = txtName.getText();
        String description = txtDescription.getText();
        double quantity = Double.parseDouble(txtQuantity.getText());
        String category = txtCategory.getText();
        int price = Integer.parseInt(txtPrice.getText());

        Controller c = new Controller();
        c.addProduct(name, quantity, price, description, category);

        refreshTable(); // Actualizar la tabla después de agregar el producto

        clearFields();
    }

    private void refreshTable()
    {
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos
        ArrayList<Product> list = DataStorage.downloadData();

        for (Product p : list) {
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

    private void clearFields() {
    txtName.setText("");
    txtQuantity.setText("");
    txtPrice.setText("");
    txtDescription.setText("");
    txtCategory.setText("");
}
    /*
    public AddProductView()
    {
        configurePanel();
        intComponents();
    }

    private void configurePanel()
    {
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(242,240,239));
    }

    private void intComponents()
    {
        JLabel label = new JLabel("AddProduct", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        this.add(label, BorderLayout.CENTER);
    }*/
}