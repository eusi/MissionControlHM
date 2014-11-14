package cs.hm.edu.sam.mc.emergency;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cs.hm.edu.sam.mc.misc.CONSTANTS;

/**
 * ReportSheet class. This module creates a report sheet from specific files.
 *
 * @author Christoph Friegel
 * @version 0.1
 */

@SuppressWarnings("serial")
public class Emergency extends JInternalFrame {

    /**
     * Create the frame.
     */
    public Emergency() {
        setFrameIcon(new ImageIcon(Emergency.class.getResource(CONSTANTS.ICON_DIR
                + "emergency_icon_mini.png")));
        setTitle("Emergency");
        setIconifiable(true);
        setClosable(true);
        setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        setBounds(0, 0, 500, 400);

        final JPanel panel = new JPanel();
        final GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
                groupLayout.createSequentialGroup().addContainerGap()
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
                groupLayout.createSequentialGroup().addContainerGap()
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addContainerGap()));

        final JLabel lblEmergency = new JLabel("Emergency");
        final GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup().addComponent(lblEmergency)
                .addContainerGap(31, Short.MAX_VALUE)));
        gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup().addGap(24).addComponent(lblEmergency)
                .addContainerGap(302, Short.MAX_VALUE)));
        panel.setLayout(gl_panel);
        getContentPane().setLayout(groupLayout);

    }
}
