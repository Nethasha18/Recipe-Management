/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author TS
 */
public class Update_Recipe extends javax.swing.JFrame {

    /**
     * Creates new form Update_Recipe
     */
    public Update_Recipe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrecipename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbcate = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtingredients = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsteps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnuinfo = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 180, 560));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Update Recipe");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Recipe Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));
        jPanel1.add(txtrecipename, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 500, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, -1));

        cmbcate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Category", "Breakfast", "Lunch", "Snacks", "Dinner" }));
        cmbcate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcateActionPerformed(evt);
            }
        });
        jPanel1.add(cmbcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 500, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ingredients");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 90, -1));
        jPanel1.add(txtingredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 500, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Steps");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, -1));
        jPanel1.add(txtsteps, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 500, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nutritional Info");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 160, -1));
        jPanel1.add(txtnuinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 500, 70));

        btnupdate.setBackground(new java.awt.Color(204, 0, 204));
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 490, 90, -1));

        btncancel.setBackground(new java.awt.Color(153, 153, 153));
        btncancel.setText("Cancel");
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 490, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbcateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcateActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbcate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtingredients;
    private javax.swing.JTextField txtnuinfo;
    private javax.swing.JTextField txtrecipename;
    private javax.swing.JTextField txtsteps;
    // End of variables declaration//GEN-END:variables
}
