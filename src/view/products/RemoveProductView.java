package view.products;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RemoveProductView extends JPanel {
    public RemoveProductView()
    {
        configurePanel();
        intComponents();
    }

    private void configurePanel()
    {
        this.setLayout(new BorderLayout(0,0));
        this.setBackground(new Color(242,240,239));
    }

    private void intComponents()
    {
        JLabel label = new JLabel("RemoveProduct", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        this.add(label, BorderLayout.CENTER);
    }
}
