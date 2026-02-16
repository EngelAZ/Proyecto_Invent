package view.products;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SearchProductView extends JPanel
{
    public SearchProductView()
    {
        configurePanel();
        intComponents();
    }

    private void configurePanel()
    {
        this.setLayout(new BorderLayout(0,0));
        this.setBackground(new java.awt.Color(242,240,239));
    }

    private void intComponents()
    {
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 4, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Add Product"));
      /*   JLabel label = new JLabel("SearchProduct", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        this.add(label, BorderLayout.CENTER);*/
        this.add(formPanel, BorderLayout.CENTER);
    }
}