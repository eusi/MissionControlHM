package cs.hm.edu.sam.mc.ir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class Ir extends JInternalFrame {
    private final JTextField txtIRStaticLongitude;
    private final JTextField txtIRStaticLatitude;
    private final JTextField txtIRDynamicLongitude;
    private final JTextField txtIRDynamicLatitude;
    private final JTextField txtEmergentLongitude;
    private final JTextField txtEmergentLatitude;
    private final JTextField txtLongSA;
    private final JTextField txtLatSA;

    /**
     * Create the frame.
     */
    public Ir() {
        setTitle("IR");
        setIconifiable(true);
        setClosable(true);
        setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        setBounds(0, 0, 819, 651);

        final JPanel pnlSouth = new JPanel();
        getContentPane().add(pnlSouth, BorderLayout.SOUTH);
        pnlSouth.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][]", "[]"));

        final JButton btnIrStatic = new JButton("IR Static");
        pnlSouth.add(btnIrStatic, "cell 0 0");

        final JButton btnIrDynamic = new JButton("IR Dynamic");
        pnlSouth.add(btnIrDynamic, "cell 9 0");

        final JButton btnEmergent = new JButton("Emergent");
        pnlSouth.add(btnEmergent, "cell 15 0");

        final JPanel pnlWest = new JPanel();
        getContentPane().add(pnlWest, BorderLayout.WEST);
        pnlWest.setLayout(new MigLayout("", "[]", "[][][][]"));

        // IR - Static
        final JPanel panelTitleIRStatic = new JPanel();
        panelTitleIRStatic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("Frame Static Click");
            }
        });
        panelTitleIRStatic.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
                "IR - Static", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        pnlWest.add(panelTitleIRStatic, "cell 0 0,grow");
        panelTitleIRStatic.setLayout(new MigLayout("", "[][]", "[][]"));

        final JLabel lblIRStaticLongitude = new JLabel("Longitude:");
        panelTitleIRStatic.add(lblIRStaticLongitude, "cell 0 0");

        txtIRStaticLongitude = new JTextField();
        panelTitleIRStatic.add(txtIRStaticLongitude, "cell 1 0");
        txtIRStaticLongitude.setColumns(10);

        final JLabel lblIRStaticLatitude = new JLabel("Latitude:");
        panelTitleIRStatic.add(lblIRStaticLatitude, "cell 0 1");

        txtIRStaticLatitude = new JTextField();
        panelTitleIRStatic.add(txtIRStaticLatitude, "cell 1 1");
        txtIRStaticLatitude.setColumns(10);

        final JButton btnRStaticCalculate = new JButton("Calculate Waypoints");
        panelTitleIRStatic.add(btnRStaticCalculate, "cell 1 2");

        // IR - Dynamic
        final JPanel panelTitleIRDynamic = new JPanel();
        panelTitleIRDynamic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("Frame Dynamic Click");
            }
        });
        panelTitleIRDynamic.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
                "IR - Dynamic", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        pnlWest.add(panelTitleIRDynamic, "cell 0 1,grow");
        panelTitleIRDynamic.setLayout(new MigLayout("", "[][]", "[][]"));

        final JLabel lblIRDynamicLongitude = new JLabel("Longitude:");
        panelTitleIRDynamic.add(lblIRDynamicLongitude, "cell 0 0");

        txtIRDynamicLongitude = new JTextField();
        panelTitleIRDynamic.add(txtIRDynamicLongitude, "cell 1 0");
        txtIRDynamicLongitude.setColumns(10);

        final JLabel lblIRDynamicLatitude = new JLabel("Latitude:");
        panelTitleIRDynamic.add(lblIRDynamicLatitude, "cell 0 1");

        txtIRDynamicLatitude = new JTextField();
        panelTitleIRDynamic.add(txtIRDynamicLatitude, "cell 1 1");
        txtIRDynamicLatitude.setColumns(10);

        final JButton btnIRDynamicCalculate = new JButton("Calculate Waypoints");
        panelTitleIRDynamic.add(btnIRDynamicCalculate, "cell 1 2");

        // Emergent
        final JPanel panelTitleEmergent = new JPanel();
        panelTitleEmergent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("Frame Emergent Click");
            }
        });
        panelTitleEmergent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
                "Emergent", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        pnlWest.add(panelTitleEmergent, "cell 0 2,grow");
        panelTitleEmergent.setLayout(new MigLayout("", "[][]", "[][]"));

        final JLabel lblEmergentLongitude = new JLabel("Longitude:");
        panelTitleEmergent.add(lblEmergentLongitude, "cell 0 0");

        txtEmergentLongitude = new JTextField();
        panelTitleEmergent.add(txtEmergentLongitude, "cell 1 0");
        txtEmergentLongitude.setColumns(10);

        final JLabel lblEmergentLatitude = new JLabel("Latitude:");
        panelTitleEmergent.add(lblEmergentLatitude, "cell 0 1");

        txtEmergentLatitude = new JTextField();
        panelTitleEmergent.add(txtEmergentLatitude, "cell 1 1");
        txtEmergentLatitude.setColumns(10);

        final JButton btnEmergentCalculate = new JButton("Calculate Waypoints");
        panelTitleEmergent.add(btnEmergentCalculate, "cell 1 2");

        final JPanel pnlNorth = new JPanel();
        getContentPane().add(pnlNorth, BorderLayout.NORTH);
        pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        final JButton btnOnboardUnit = new JButton("Onboard Unit");
        btnOnboardUnit.setHorizontalAlignment(SwingConstants.LEFT);
        btnOnboardUnit.setForeground(Color.RED);
        btnOnboardUnit.setBackground(Color.RED);
        pnlNorth.add(btnOnboardUnit);

        final JPanel pnlMiddle = new JPanel();
        pnlMiddle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        getContentPane().add(pnlMiddle, BorderLayout.CENTER);
        final GridBagLayout gbl_pnlMiddle = new GridBagLayout();
        gbl_pnlMiddle.columnWidths = new int[] { 0, 394, 0, 0, 0, 0, 0, 0 };
        gbl_pnlMiddle.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gbl_pnlMiddle.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlMiddle.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
                Double.MIN_VALUE };
        pnlMiddle.setLayout(gbl_pnlMiddle);

        final JPanel pnlListButtonSearchArea = new JPanel();
        final GridBagConstraints gbc_pnlListButtonSearchArea = new GridBagConstraints();
        gbc_pnlListButtonSearchArea.anchor = GridBagConstraints.WEST;
        gbc_pnlListButtonSearchArea.insets = new Insets(0, 0, 0, 5);
        gbc_pnlListButtonSearchArea.fill = GridBagConstraints.VERTICAL;
        gbc_pnlListButtonSearchArea.gridx = 1;
        gbc_pnlListButtonSearchArea.gridy = 8;
        pnlMiddle.add(pnlListButtonSearchArea, gbc_pnlListButtonSearchArea);
        pnlListButtonSearchArea.setLayout(new BorderLayout(0, 0));

        final JList lstSearchAreaWP = new JList();
        pnlListButtonSearchArea.add(lstSearchAreaWP, BorderLayout.CENTER);

        final JPanel panel_2 = new JPanel();
        pnlListButtonSearchArea.add(panel_2, BorderLayout.NORTH);
        panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        final JPanel pnlLongLatSA = new JPanel();
        pnlLongLatSA.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));
        panel_2.add(pnlLongLatSA);

        final JLabel lblLongSA = new JLabel("Long:");
        pnlLongLatSA.add(lblLongSA);

        txtLongSA = new JTextField();
        pnlLongLatSA.add(txtLongSA);
        txtLongSA.setColumns(10);

        final JLabel lblLatSA = new JLabel("Lat:");
        pnlLongLatSA.add(lblLatSA);

        txtLatSA = new JTextField();
        pnlLongLatSA.add(txtLatSA);
        txtLatSA.setColumns(10);

        final JButton btnAddSA = new JButton("add");
        pnlLongLatSA.add(btnAddSA);

    }

}
