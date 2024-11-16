
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuConversor {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Conversor de Moneda y Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(null); //



        // Crear y añadir etiquetas e instrucciones
        JLabel titleLabel = new JLabel("Bienvenido al Conversor de moneda y temperatura");
        titleLabel.setBounds(120, 10, 500, 30);
        frame.add(titleLabel);


        JLabel instructionLabel = new JLabel("Selecciona una opción:");
        instructionLabel.setBounds(120, 50, 200, 30);
        frame.add(instructionLabel);

        // Crear y añadir botones para opciones
        JButton monedaButton = new JButton("Conversión de Moneda");
        monedaButton.setBounds(100, 100, 200, 30);
        frame.add(monedaButton);

        // Crear y añadir botones para opciones
        JButton TempButton = new JButton("Conversión de Temperatura");
        TempButton.setBounds(100, 150, 200, 30);
        frame.add(TempButton);

        // Crear y añadir botones salir
        JButton ExitButton = new JButton("Salir del programa.");
        ExitButton.setBounds(100, 200, 200, 30);
        frame.add(ExitButton);

        // Añadir acción al botón de conversión de moneda
        monedaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Iniciando Conversión de Moneda");
                Conversores.iniciarConversorMoneda(); // Llamada al método de conversión
            }
        });

        // Añadir acción al botón de conversión de temperatura
        TempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Iniciando Conversión de Temperatura");
                Conversores.iniciarConversorTemp();

            }
        });

        // Añadir acción al botón de salir
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Saliendo del programa...");
                System.exit(0);
            }
        });

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}



