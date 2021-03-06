package view;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLookAndFeel();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMouseTrailComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBackGroundComboBox = new javax.swing.JComboBox<>();
        jBackGroundLabel = new javax.swing.JLabel();
        jCleanButton = new javax.swing.JButton();
        jMouseTrailLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        canvas = new model.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jMouseTrailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Red", "Blue", "Green" }));
        jMouseTrailComboBox.setSelectedIndex(1);
        jMouseTrailComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMouseTrailComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Trail");

        jBackGroundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Red", "Blue", "Green" }));
        jBackGroundComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackGroundComboBoxActionPerformed(evt);
            }
        });

        jBackGroundLabel.setText("Background");

        jCleanButton.setText("Clean");
        jCleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBackGroundLabel)
                .addGap(18, 18, 18)
                .addComponent(jBackGroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jMouseTrailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jCleanButton)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMouseTrailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBackGroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBackGroundLabel)
                    .addComponent(jCleanButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jMouseTrailLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jMouseTrailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMouseTrailLabel.setText("Mouse Trail");

        jLabel1.setText("By Jesús Lárez & Ignacio Marín");

        canvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                canvasMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMouseTrailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel1))
                            .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jMouseTrailLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseMoved

        try {
            canvas.createTrail(evt.getPoint());
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint();

    }//GEN-LAST:event_canvasMouseMoved

    private void jBackGroundComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackGroundComboBoxActionPerformed
        switch (jBackGroundComboBox.getSelectedIndex()) {
            case 0:
                canvas.setBackgroundColour(Color.WHITE);
                break;
            case 1:
                canvas.setBackgroundColour(new Color(255, 153, 153));

                break;
            case 2:
                canvas.setBackgroundColour(Color.CYAN);
                break;
            case 3:
                canvas.setBackgroundColour(new Color(153, 255, 153));
                break;
        }
        repaint();

    }//GEN-LAST:event_jBackGroundComboBoxActionPerformed

    private void jMouseTrailComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMouseTrailComboBoxActionPerformed

        switch (jMouseTrailComboBox.getSelectedIndex()) {
            case 0:
                canvas.setTrailColour(Color.WHITE);

                break;
            case 1:
                canvas.setTrailColour(new Color(255, 153, 153));

                break;
            case 2:
                canvas.setTrailColour(Color.CYAN);

                break;
            case 3:
                canvas.setTrailColour(new Color(153, 255, 153));
                break;
        }
        repaint();
    }//GEN-LAST:event_jMouseTrailComboBoxActionPerformed

    private void jCleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleanButtonActionPerformed
        canvas.cleanPanel();
        jBackGroundComboBox.setSelectedIndex(0);
        jMouseTrailComboBox.setSelectedIndex(1);
        repaint();
    }//GEN-LAST:event_jCleanButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Canvas canvas;
    private javax.swing.JComboBox<String> jBackGroundComboBox;
    private javax.swing.JLabel jBackGroundLabel;
    private javax.swing.JButton jCleanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jMouseTrailComboBox;
    private javax.swing.JLabel jMouseTrailLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
