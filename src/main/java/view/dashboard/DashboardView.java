package view.dashboard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DashboardView extends JPanel
{
    public DashboardView()
    {
            configurePanel();
            initComponents();
    }

    private void configurePanel()
    {
        this.setLayout(new BorderLayout(0,0));
        this.setBackground(new Color(242,240,239));
    }

    private void initComponents()
    {
        JLabel label = new JLabel("Dashboard", JLabel.CENTER);
        label.setFont(new Font("Arial",Font.BOLD, 22));
        this.add(label, BorderLayout.CENTER);
    }
}