import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class ICentroInvestigacion extends JFrame {

    public ICentroInvestigacion() {
        setTitle("Reporte del Inventario del Centro de Investigación");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel superior con opciones de tipo de reporte
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lblTipoReporte = new JLabel("Tipo reporte:");
        JRadioButton rbIndividual = new JRadioButton("Individual");
        JRadioButton rbGeneral = new JRadioButton("General", true);
        ButtonGroup grupoReporte = new ButtonGroup();
        grupoReporte.add(rbIndividual);
        grupoReporte.add(rbGeneral);

        panelSuperior.add(lblTipoReporte);
        panelSuperior.add(rbIndividual);
        panelSuperior.add(rbGeneral);
        
        add(panelSuperior, BorderLayout.NORTH);

        // Tabla para mostrar datos
        String[] columnas = {"C.I. Responsable", "Cantidad equipos", "Monto total (Bs.)"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 40);
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        add(scrollPane, BorderLayout.CENTER);

        // Panel inferior con totalización en estructura vertical
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());

        // Panel para etiquetas alineadas en vertical
        JPanel panelTotalizacion = new JPanel();
        panelTotalizacion.setLayout(new BoxLayout(panelTotalizacion, BoxLayout.Y_AXIS));

        JLabel lblTotalizacion = new JLabel("Totalización:");
        JLabel lblTotalEquipos = new JLabel("------ equipos");
        JLabel lblTotalMonto = new JLabel("------ Bs.");

        // Alinear textos al inicio (izquierda)
        lblTotalizacion.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblTotalEquipos.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblTotalMonto.setAlignmentX(Component.LEFT_ALIGNMENT);

        panelTotalizacion.add(lblTotalizacion);
        panelTotalizacion.add(lblTotalEquipos);
        panelTotalizacion.add(lblTotalMonto);

        // Panel para el botón "Continuar"
        JPanel panelBoton = new JPanel();
        JButton btnContinuar = new JButton("Continuar");
        panelBoton.add(btnContinuar);

        panelInferior.add(panelTotalizacion, BorderLayout.WEST);
        panelInferior.add(panelBoton, BorderLayout.EAST);

        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ICentroInvestigacion().setVisible(true);
        });
    }
}