/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Car;

/**
 *
 * @author Prathamesh
 */
public class UserJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserJFrame
     */
    private Car car;
    public UserJFrame() {
        initComponents();
        car = new Car();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seperatingPane = new javax.swing.JSplitPane();
        interactiveJPanel = new javax.swing.JPanel();
        enterBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interactiveJPanel.setBackground(new java.awt.Color(51, 255, 255));

        enterBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        enterBtn.setText("Enter Details");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        showBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        showBtn.setText("Show Details");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interactiveJPanelLayout = new javax.swing.GroupLayout(interactiveJPanel);
        interactiveJPanel.setLayout(interactiveJPanelLayout);
        interactiveJPanelLayout.setHorizontalGroup(
            interactiveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interactiveJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interactiveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterBtn)
                    .addComponent(showBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        interactiveJPanelLayout.setVerticalGroup(
            interactiveJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interactiveJPanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(enterBtn)
                .addGap(33, 33, 33)
                .addComponent(showBtn)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        seperatingPane.setLeftComponent(interactiveJPanel);

        displayJPanel.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        seperatingPane.setRightComponent(displayJPanel);

        getContentPane().add(seperatingPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
       // TODO add your handling code here:
        EnterPanel enterPanel = new EnterPanel(car);
        seperatingPane.setRightComponent(enterPanel);
        
    }//GEN-LAST:event_enterBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        ShowPanel showPanel = new ShowPanel(car);
        seperatingPane.setRightComponent(showPanel);
    }//GEN-LAST:event_showBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JButton enterBtn;
    private javax.swing.JPanel interactiveJPanel;
    private javax.swing.JSplitPane seperatingPane;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}
