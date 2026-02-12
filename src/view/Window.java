package view;

import java.awt.Color;
import javax.swing.JFrame;
public class Window extends JFrame 
{

    /**
     * Constructor principal
     */
    public Window(int width, int height, String title, Color color, boolean resizable)
    {
        this.setSize(width, height); // Establece el tamaño de la ventana
        configureWindow(title, color, resizable); // Configura la ventana utilizando el método configureWindow
        initComponents();
    }

    /**
     * Constructores secundarios
     */
    public Window(int width, int height)
    {
        this(width, height, "Inventory", Color.WHITE, true); // Llama al constructor principal con valores predeterminados
    }
    public Window(int width, int height, String title)
    {
        this(width, height, title, Color.WHITE, true); // Llama al constructor principal con valores predeterminados
    }
    public Window(int width, int height, String title, Color color)
    {
        this(width, height, title, color, true); // Llama al constructor principal con valores predeterminados
    }
    public Window(int width, int height, String title, boolean resizable)
    {
        this(width, height, title, Color.WHITE, resizable); // Llama al constructor principal con valores predeterminados
    }
    public Window(int width, int height, Color color)
    {
        this(width, height, "Inventory", color, true); // Llama al constructor principal con valores predeterminados
    }
    public Window(int width, int height, Color color, boolean resizable)
    {
        this(width, height, "Inventory", color, resizable); // Llama al constructor principal con valores predeterminados
    }

    /**
     * Método para configurar la ventana con los parámetros proporcionados
     */
    private void configureWindow(String title, Color color, boolean resizable)
    {
        this.setTitle(title); // Establece el título de la ventana
        this.getContentPane().setBackground(color); // Establece el color de fondo de la ventana
        this.setResizable(resizable);// Permite redimensionar la ventana
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permite cerrar la ventana y la ejecucion del proyecto al hacer clic en la "X"
    }

    /**
     * Método para inicializar los componentes de la ventana
     */
    private void initComponents()
    {
        // Aquí se inicializaran los componentes de la ventana, como botones, etiquetas, etc.
        // posiblemente se necesite un layout manager para organizar los componentes dentro de la ventana
        this.add(new MenuView()); // Agrega la vista del menú a la ventana
    }

}