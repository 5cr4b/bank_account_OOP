package main;
import src.account;
import user_func_frame.show_hop_thu;
import user_func_frame.show_gd;
import user_func_frame.show_nap_tien;
import user_func_frame.show_chuyen_tien;
import user_func_frame.show_children;
import user_func_frame.show_rut_tien;
import user_func_frame.show_thong_tin;
import user_func_frame.show_vac_xin;
import src.bank;

public class mainMenu extends javax.swing.JFrame {
    public account acc;
    public bank bank;
    public account tuan123;
    public account linda1;
    public account peter010;

    public mainMenu(account acc,bank bank_system,account tuan123,account linda1 ,account peter010) {
        initComponents();
        this.acc = acc;
        this.bank = bank_system;
        this.tuan123 = tuan123;
        this.linda1 = linda1;
        this.peter010 = peter010;
    }
    public mainMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_thu = new javax.swing.JButton();
        but_thong_tin = new javax.swing.JButton();
        btn_chuyen_tk = new javax.swing.JButton();
        btn_rut_tien = new javax.swing.JButton();
        btn_lich_su = new javax.swing.JButton();
        btn_children = new javax.swing.JButton();
        btn_vac_xin = new javax.swing.JButton();
        btn_nap_tien = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_chuyen_tien = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_thu.setText("Hộp thư đến");
        btn_thu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thuActionPerformed(evt);
            }
        });

        but_thong_tin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        but_thong_tin.setText("Thông tin TK");
        but_thong_tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_thong_tinActionPerformed(evt);
            }
        });

        btn_chuyen_tk.setText("Chuyển tài khoản");
        btn_chuyen_tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyen_tkActionPerformed(evt);
            }
        });

        btn_rut_tien.setText("Rút tiền");
        btn_rut_tien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rut_tienActionPerformed(evt);
            }
        });

        btn_lich_su.setText("Lịch sử giao dịch");
        btn_lich_su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lich_suActionPerformed(evt);
            }
        });

        btn_children.setText("Cùng chung tay giúp đỡ trẻ em khó khăn");
        btn_children.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_childrenActionPerformed(evt);
            }
        });

        btn_vac_xin.setText("Cùng chung tay ủng hộ quỹ vắc xin");
        btn_vac_xin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vac_xinActionPerformed(evt);
            }
        });

        btn_nap_tien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_nap_tien.setText("Nạp tiền");
        btn_nap_tien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nap_tienMouseClicked(evt);
            }
        });
        btn_nap_tien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nap_tienActionPerformed(evt);
            }
        });

        jLabel7.setText("29/12/2021");

        btn_chuyen_tien.setText("Chuyển tiền");
        btn_chuyen_tien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyen_tienActionPerformed(evt);
            }
        });

        welcome.setText("                                 ");
        welcome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                welcomeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_nap_tien, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_lich_su, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_thu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_rut_tien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_chuyen_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_chuyen_tien, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(but_thong_tin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_vac_xin, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_children, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vac_xin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_children, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_nap_tien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_chuyen_tien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(but_thong_tin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_rut_tien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(btn_chuyen_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_lich_su, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63))
                        .addComponent(btn_thu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    private void btn_thuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thuActionPerformed
        show_hop_thu thu = new show_hop_thu(this.acc);
        thu.setVisible(true);
        
        
    }//GEN-LAST:event_btn_thuActionPerformed

    private void but_thong_tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_thong_tinActionPerformed
        show_thong_tin thong_tin = new show_thong_tin(this.acc);
        thong_tin.setVisible(true);
    }//GEN-LAST:event_but_thong_tinActionPerformed

    private void btn_rut_tienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rut_tienActionPerformed
        show_rut_tien rut = new show_rut_tien(this.acc);
        rut.setVisible(true);
    }//GEN-LAST:event_btn_rut_tienActionPerformed

    private void btn_childrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_childrenActionPerformed
        show_children children = new show_children(this.acc);
        children.setVisible(true);
    }//GEN-LAST:event_btn_childrenActionPerformed

    private void btn_vac_xinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vac_xinActionPerformed
        show_vac_xin vac_xin = new show_vac_xin(this.acc);
        vac_xin.setVisible(true);
    }//GEN-LAST:event_btn_vac_xinActionPerformed

    private void btn_nap_tienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nap_tienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nap_tienMouseClicked

    private void btn_nap_tienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nap_tienActionPerformed
        show_nap_tien nap = new show_nap_tien(this.acc);
        nap.setVisible(true);
    }//GEN-LAST:event_btn_nap_tienActionPerformed

    private void btn_chuyen_tienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyen_tienActionPerformed
        show_chuyen_tien chuyen = new show_chuyen_tien(this.acc,this.bank,this.tuan123, this.linda1,this.peter010);
        chuyen.setVisible(true);
    }//GEN-LAST:event_btn_chuyen_tienActionPerformed

    private void btn_lich_suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lich_suActionPerformed
        show_gd giao_dich = new show_gd(this.acc);
        giao_dich.setVisible(true);
    }//GEN-LAST:event_btn_lich_suActionPerformed

    private void btn_chuyen_tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyen_tkActionPerformed
        sign_in_up sign_in1 = new sign_in_up(this.bank,this.linda1, this.peter010,this.tuan123);
        sign_in1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_chuyen_tkActionPerformed

    private void welcomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_welcomeAncestorAdded
        welcome.setText("chao mung "+ this.acc.get_username() + " den ngan hang");
    }//GEN-LAST:event_welcomeAncestorAdded

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_children;
    private javax.swing.JButton btn_chuyen_tien;
    private javax.swing.JButton btn_chuyen_tk;
    private javax.swing.JButton btn_lich_su;
    private javax.swing.JButton btn_nap_tien;
    private javax.swing.JButton btn_rut_tien;
    private javax.swing.JButton btn_thu;
    private javax.swing.JButton btn_vac_xin;
    private javax.swing.JButton but_thong_tin;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
