package fees_management_system;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnEditStudent = new javax.swing.JButton();
        btnDueFee = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("PINAKI FEES MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddStudent.setBackground(new java.awt.Color(102, 102, 0));
        btnAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 0));
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 40));

        btnViewStudent.setBackground(new java.awt.Color(153, 255, 255));
        btnViewStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewStudent.setForeground(new java.awt.Color(0, 0, 204));
        btnViewStudent.setText("View Student");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 167, 41));

        btnEditStudent.setBackground(new java.awt.Color(204, 0, 204));
        btnEditStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditStudent.setForeground(new java.awt.Color(255, 204, 204));
        btnEditStudent.setText("Edit Student");
        btnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 167, 41));

        btnDueFee.setBackground(new java.awt.Color(102, 255, 0));
        btnDueFee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDueFee.setForeground(new java.awt.Color(255, 0, 0));
        btnDueFee.setText("Fee Receipt");
        btnDueFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueFeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnDueFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 167, 41));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 315, 186, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 510, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 960, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        ViewStudent viewstudent=new ViewStudent();
        viewstudent.show();
        this.dispose();
        
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        AddStudent addstudent=new AddStudent();
        addstudent.show();
        this.dispose();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login login=new Login();
        login.show();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentActionPerformed
        EditStudent editstudent=new EditStudent();
        editstudent.show();
        this.dispose();
    }//GEN-LAST:event_btnEditStudentActionPerformed

    private void btnDueFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueFeeActionPerformed
        FeeReceipt feereceipt=new FeeReceipt();
        feereceipt.show();
        this.dispose();
        
    }//GEN-LAST:event_btnDueFeeActionPerformed


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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDueFee;
    private javax.swing.JButton btnEditStudent;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
