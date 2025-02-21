import javax.swing.*;
import java.awt.*;

public class InventarioCentroInvestigacion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InventariooFrame().setVisible(true);
        });
    }
}

class InventariooFrame extends JFrame {
    private JRadioButton individualRadio;
    private JRadioButton generalRadio;
    private JTextField ciField;
    private JButton totalizarButton;
    private JLabel totalEquiposLabel;
    private JLabel totalBsLabel;
    private JButton continuarButton;

    public InventariooFrame() {
        setTitle("Reporte del Inventario");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Tipo de Reporte
        JLabel tipoReporteLabel = new JLabel("Tipo reporte:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(tipoReporteLabel, gbc);

        individualRadio = new JRadioButton("Individual");
        generalRadio = new JRadioButton("General");
        ButtonGroup reportTypeGroup = new ButtonGroup();
        reportTypeGroup.add(individualRadio);
        reportTypeGroup.add(generalRadio);
        
        gbc.gridx = 1;
        add(individualRadio, gbc);
        gbc.gridx = 2;
        add(generalRadio, gbc);

        // CI del Responsable
        JLabel ciLabel = new JLabel("C.I. del Responsable de equipos:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(ciLabel, gbc);

        ciField = new JTextField(10);
        gbc.gridx = 1;
        add(ciField, gbc);

        totalizarButton = new JButton("Totalizar");
        gbc.gridx = 2;
        add(totalizarButton, gbc);

        // Totalización
        JLabel totalizacionLabel = new JLabel("Totalización:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(totalizacionLabel, gbc);

        totalEquiposLabel = new JLabel("__ equipos");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(totalEquiposLabel, gbc);

        totalBsLabel = new JLabel("_____ Bs.");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(totalBsLabel, gbc);

        // Botón Continuar
        continuarButton = new JButton("Continuar");
        gbc.gridx = 1;
        gbc.gridy = 10;
        add(continuarButton, gbc);
    }
}