/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.view;

import java.awt.Color;
import java.awt.Font;
import lk.ijse.dinamore.view.panel.LoginAdmin;

import lk.ijse.dinamore.view.panel.LoginCall;
import lk.ijse.dinamore.view.panel.LoginChef;

/**
 *
 * @author acer
 */
public class Main extends javax.swing.JFrame {
int x=20;
int y=18;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlLayout = new javax.swing.JPanel();
        lblTel = new javax.swing.JLabel();
        lblChef = new javax.swing.JLabel();
        lblOwner = new javax.swing.JLabel();
        lblHidden = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 480));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/logo_image.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/Minus_30px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/Cancel_30px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTel.setForeground(new java.awt.Color(255, 0, 0));
        lblTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-phone-20.png"))); // NOI18N
        lblTel.setText("Teliphone Operator");
        lblTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTelMouseExited(evt);
            }
        });
        pnlLayout.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 40));

        lblChef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblChef.setForeground(new java.awt.Color(255, 0, 0));
        lblChef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-chef-20.png"))); // NOI18N
        lblChef.setText("Chef");
        lblChef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChefMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChefMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChefMouseExited(evt);
            }
        });
        pnlLayout.add(lblChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 40));

        lblOwner.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOwner.setForeground(new java.awt.Color(255, 0, 0));
        lblOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-customer-20.png"))); // NOI18N
        lblOwner.setText("Owner");
        lblOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOwnerMouseExited(evt);
            }
        });
        pnlLayout.add(lblOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 40));

        lblHidden.setBackground(new java.awt.Color(255, 255, 255));
        lblHidden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/vladimir-lenin_1.png"))); // NOI18N
        lblHidden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHidden.setOpaque(true);
        pnlLayout.add(lblHidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 420));

        jPanel3.add(pnlLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 420));

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/quiz.gif"))); // NOI18N

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3.add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 610, 420));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerMouseEntered
        
        lblOwner.setForeground(Color.blue);
        lblOwner.setFont(new Font("", x, x));
    }//GEN-LAST:event_lblOwnerMouseEntered

    private void lblOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerMouseExited

        lblOwner.setForeground(Color.red);
        lblOwner.setFont(new Font("", y, y));
    }//GEN-LAST:event_lblOwnerMouseExited

    private void lblTelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelMouseEntered
        lblTel.setForeground(Color.blue);
        lblTel.setFont(new Font("", x, x));
    }//GEN-LAST:event_lblTelMouseEntered

    private void lblTelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelMouseExited
        lblTel.setForeground(Color.red);
        lblTel.setFont(new Font("", y, y));
    }//GEN-LAST:event_lblTelMouseExited

    private void lblChefMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChefMouseEntered
        lblChef.setForeground(Color.BLUE);
        lblChef.setFont(new Font("", x, x));
    }//GEN-LAST:event_lblChefMouseEntered

    private void lblChefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChefMouseExited
        lblChef.setForeground(Color.red);
        lblChef.setFont(new Font("", y, y));
    }//GEN-LAST:event_lblChefMouseExited

    private void lblOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerMouseClicked
        lblClose();
        lblOwner.setForeground(new Color(226, 178, 0));
        lblChef.setForeground(new Color(17, 117, 128));
        lblTel.setForeground(new Color(17, 117, 128));
        
        LoginAdmin la=new LoginAdmin();
        pnlTop.removeAll();
        pnlTop.repaint();
        pnlTop.revalidate();
        
        la.setSize(pnlTop.getSize());
        pnlTop.add(la);
    }//GEN-LAST:event_lblOwnerMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelMouseClicked
        lblClose();
        lblOwner.setForeground(new Color(226, 178, 0));
        lblChef.setForeground(new Color(17, 117, 128));
        lblTel.setForeground(new Color(17, 117, 128));
        
        LoginCall lc=new LoginCall();
        pnlTop.removeAll();
        pnlTop.repaint();
        pnlTop.revalidate();
        
        lc.setSize(pnlTop.getSize());
        pnlTop.add(lc);
    }//GEN-LAST:event_lblTelMouseClicked

    private void lblChefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChefMouseClicked
        lblClose();
        lblOwner.setForeground(new Color(226, 178, 0));
        lblChef.setForeground(new Color(17, 117, 128));
        lblTel.setForeground(new Color(17, 117, 128));
        
        LoginChef lch=new LoginChef();
        pnlTop.removeAll();
        pnlTop.repaint();
        pnlTop.revalidate();
        
        lch.setSize(pnlTop.getSize());
        pnlTop.add(lch);
    }//GEN-LAST:event_lblChefMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblHidden;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pnlLayout;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables

    private void lblClose() {
        lblHidden.setVisible(true);
        lblTel.setVisible(false);
        lblChef.setVisible(false);
        lblOwner.setVisible(false);
    }
}
