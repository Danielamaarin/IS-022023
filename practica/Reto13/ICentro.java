import javax.swing.*;
import java.awt.*;

public class ICentro extends JFrame {
    public ICentro() {
        setTitle("Registro y Control de Equipos en Centro de Investigación");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Descripción:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField descripcionField = new JTextField(20);
        panel.add(descripcionField, gbc);
        gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Cantidad:"), gbc);
        gbc.gridx = 1;
        JTextField cantidadField = new JTextField(5);
        panel.add(cantidadField, gbc);
        
        gbc.gridx = 2;
        panel.add(new JLabel("Costo unitario (Bs.):"), gbc);
        gbc.gridx = 3;
        JTextField costoField = new JTextField(10);
        panel.add(costoField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Fecha de adquisición:"), gbc);
        gbc.gridx = 1;
        JTextField fechaField = new JTextField("dd/mm/aaaa", 10);
        panel.add(fechaField, gbc);
        
        gbc.gridx = 2;
        panel.add(new JLabel("Nro. de Factura:"), gbc);
        gbc.gridx = 3;
        JTextField facturaField = new JTextField(10);
        panel.add(facturaField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("C.I. del Responsable del equipo:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField ciField = new JTextField(15);
        panel.add(ciField, gbc);
        gbc.gridwidth = 1;
        
        JPanel buttonPanel = new JPanel();
        JButton registerButton = new JButton("Registrar data");
        JButton reportButton = new JButton("Generar Reporte");
        JButton exitButton = new JButton("Salir");
        
        buttonPanel.add(registerButton);
        buttonPanel.add(reportButton);
        buttonPanel.add(exitButton);
        
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ICentro().setVisible(true);
        });
    }
}