package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.dashboard.*;
import view.products.*;



public class MenuView extends JPanel {
    /**
     * Attributes
     */
    private JPanel sidebar;
    private JPanel contentPanel;
    private CardLayout cardLayout;
    private JLabel title;

    /**
     * Main constructor, which configures the panel and its components.
     */
    public MenuView() {
        configurePanel();
        initComponents();
    }

    /**
     * Configure the main panel with a background color and a specific layout to organize the components.
     */
    private void configurePanel() {
        this.setBackground(new Color(39, 39, 87));// Establece el color de fondo del panel principal
        this.setLayout(new BorderLayout(2, 10)); // Establece un layout de tipo BorderLayout para organizar los componentes en la ventana
    }

    /**
     * Method to initialize panel components, including the sidebar, buttons, and content panel using CardLayout.
     */
    private void initComponents() {

        // TITLE BAR
        title = new JLabel("Inventory System", JLabel.CENTER);// Crea un JLabel para el título de la ventana, centrado horizontalmente
        title.setFont(new Font("Lora", Font.BOLD, 24)); // Establece la fuente del título con un estilo negrita y un tamaño de 24 puntos
        title.setForeground(new Color(255, 255, 255)); // Establece el color del texto del título a blanco (RGB: 255, 255, 255)


        // SIDEBAR
        sidebar = new JPanel(); // Crea un nuevo JPanel para la barra lateral (sidebar) que se ubicará en el lado izquierdo de la ventana
        sidebar.setBackground(new Color(39, 39, 87)); // Establece el color de fondo del sidebar a un tono de verde (RGB: 5, 103, 79)
        sidebar.setPreferredSize(new Dimension(325, 0));// Sugiere un tamaño preferido para el sidebar al Layout Manager, con un ancho de 200 píxeles y una altura automática (0)
        sidebar.setLayout(new GridLayout(5, 1, 40, 30));// Establece un layout de tipo GridLayout(nos ofrece poder tener una organizacin en cuadricula) para organizar los botones en el sidebar, con 4 filas, 1 columna, y un espacio horizontal de 40 píxeles y vertical de 30 píxeles entre los componentes

        // SIDEBAR BUTTONS
        JButton btnDashboardView = new JButton("Dashboard");// Crea un nuevo JButton para el botón "Dashboard" que se mostrará en el sidebar
        btnDashboardView.setBackground(new Color(211, 211, 211)); // Establece el color de fondo del botón "Dashboard" a un tono de gris claro (RGB: 211, 211, 211)
        JButton btnAddProductsView = new JButton("Products");
        btnAddProductsView.setBackground(new Color(211, 211, 211));
        JButton btnSearchProductsView = new JButton("Search Product");
        btnSearchProductsView.setBackground(new Color(211, 211, 211));
        JButton btnRemoveProductsView = new JButton("Remove Product");
        btnRemoveProductsView.setBackground(new Color(211, 211, 211));

        sidebar.add(btnDashboardView);// Agrega el botón "Dashboard" al sidebar
        sidebar.add(btnAddProductsView);
        sidebar.add(btnSearchProductsView);
        sidebar.add(btnRemoveProductsView);

        // CONTENT PANEL WITH CARDLAYOUT TO SWITCH BETWEEN VIEWS
        cardLayout = new CardLayout();// Crea un nuevo CardLayout para el panel de contenido, que permitirá cambiar entre diferentes vistas (Dashboard, Products, Sales) dentro del mismo espacio
        contentPanel = new JPanel(cardLayout);// Crea un nuevo JPanel para el panel de contenido y le asigna el CardLayout creado anteriormente, lo que permitirá mostrar diferentes componentes (vistas) según la selección del usuario en el sidebar

        contentPanel.add(new DashboardView(), "DASHBOARD");// Agrega el panel del Dashboard al panel de contenido con la etiqueta "DASHBOARD" para identificarlo dentro del CardLayout
        contentPanel.add(new AddProductView(), "PRODUCTS");
        contentPanel.add(new SearchProductView(), "SEARCH_PRODUCT");
        contentPanel.add(new RemoveProductView(), "REMOVE_PRODUCT");

        // EVENTS
        btnDashboardView.addActionListener(e -> cardLayout.show(contentPanel, "DASHBOARD"));// Agrega un ActionListener al botón "Dashboard" que, al ser presionado, mostrará el panel del Dashboard en el panel de contenido utilizando el método show del CardLayout con la etiqueta "DASHBOARD"
        btnAddProductsView.addActionListener(e -> cardLayout.show(contentPanel, "PRODUCTS"));
        btnSearchProductsView.addActionListener(e -> cardLayout.show(contentPanel, "SEARCH_PRODUCT"));
        btnRemoveProductsView.addActionListener(e -> cardLayout.show(contentPanel, "REMOVE_PRODUCT"));

        // ADD EVERYTHING TO THE MAIN PANEL
        this.add(title, BorderLayout.NORTH); // Agrega el JLabel del título al panel principal en la posición norte (arriba) utilizando el BorderLayout
        this.add(sidebar, BorderLayout.WEST); // Agrega el panel del sidebar al panel principal en la posición oeste (izquierda) utilizando el BorderLayout, lo que permitirá que se ubique a la izquierda del título y del panel de contenido
        this.add(contentPanel, BorderLayout.CENTER); // Agrega el panel de contenido al panel principal en la posición central utilizando el BorderLayout, lo que permitirá que ocupe el espacio restante después de colocar el título y el sidebar
    }

    //*This Method is provisional*
    // Method for creating simple panels
   /*  private JPanel createPanel(String text) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(label, BorderLayout.CENTER);
        return panel;
    }*/
}
