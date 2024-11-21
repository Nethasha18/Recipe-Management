/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author TS
 */
public class Add_Recipe extends javax.swing.JFrame {

    /**
     * Creates new form Add_Recipe
     */
    public Add_Recipe() {
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
        txtnuinfo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtrecipename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtingredients = new javax.swing.JTextField();
        txtsteps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        cmbcategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Recipe");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nutritional Info");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        txtnuinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuinfoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnuinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 610, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Recipe Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 20));

        txtrecipename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecipenameActionPerformed(evt);
            }
        });
        jPanel1.add(txtrecipename, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ingredients");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtingredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingredientsActionPerformed(evt);
            }
        });
        jPanel1.add(txtingredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 610, 50));

        txtsteps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstepsActionPerformed(evt);
            }
        });
        jPanel1.add(txtsteps, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 610, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Steps");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        btncancel.setBackground(new java.awt.Color(153, 153, 153));
        btncancel.setText("Cancel");
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 110, -1));

        btnsave.setBackground(new java.awt.Color(204, 0, 204));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 120, -1));

        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Category", "Breakfast", "Lunch", "Snack", "Dinner" }));
        cmbcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcategoryActionPerformed(evt);
            }
        });
        jPanel1.add(cmbcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 610, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrecipenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecipenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecipenameActionPerformed

    private void txtnuinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuinfoActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtstepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstepsActionPerformed

    private void cmbcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcategoryActionPerformed

    private void txtingredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingredientsActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbcategory;
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