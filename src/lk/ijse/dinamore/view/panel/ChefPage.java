/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.view.panel;


import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kavindu
 */
public class ChefPage extends javax.swing.JPanel {

    private long start;
    private long end;
    
    private int chid;
    private int amount;

    /**
     * Creates new form TelephoneOP
     */
    public ChefPage(int chid) {
        initComponents();
        lblDelivery.setVisible(false);
        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ijse/dinamore/img/images (2).png")));
        this.chid = chid;
        id.setText(chid + "");
    }

    public ChefPage(CheckOrders pnl) {
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDelivery = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtTid = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        id = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCon = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtOID = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblTake = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(570, 380));

        jPanel3.setBackground(new java.awt.Color(254, 253, 238));
        jPanel3.setPreferredSize(new java.awt.Dimension(598, 390));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/girl-chef-256x256.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(253, 28, 22));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-chef-30.png"))); // NOI18N
        jLabel9.setText("    Chef Tool");

        lblDelivery.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblDelivery.setForeground(new java.awt.Color(3, 132, 0));
        lblDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-delivery-30.png"))); // NOI18N
        lblDelivery.setText("       Delivery");
        lblDelivery.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeliveryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeliveryMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeliveryMouseEntered(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 117, 128));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Customer Name");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 117, 128));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tel ID ");

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(254, 253, 238));
        txtName.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtTid.setEditable(false);
        txtTid.setBackground(new java.awt.Color(254, 253, 238));
        txtTid.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtTid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTid.setBorder(null);

        id.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(205, 2, 5));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 117, 128));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Customer Contract");

        txtCon.setEditable(false);
        txtCon.setBackground(new java.awt.Color(254, 253, 238));
        txtCon.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCon.setBorder(null);
        txtCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 117, 128));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("OID");

        txtOID.setEditable(false);
        txtOID.setBackground(new java.awt.Color(254, 253, 238));
        txtOID.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtOID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOID.setBorder(null);
        txtOID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOIDActionPerformed(evt);
            }
        });

        lblTake.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblTake.setForeground(new java.awt.Color(3, 132, 0));
        lblTake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/dinamore/img/icons8-view-30.png"))); // NOI18N
        lblTake.setText("Take The Order");
        lblTake.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTakeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTakeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTakeMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(17, 117, 128));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText(" seconds");

        txtTime.setEditable(false);
        txtTime.setBackground(new java.awt.Color(254, 253, 238));
        txtTime.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTime.setText("-");
        txtTime.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 117, 128));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Processing time is");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17)
                                .addComponent(txtTid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addComponent(lblTake, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(txtOID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(lblDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblTake, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtOID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblDeliveryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeliveryMouseExited
        lblDelivery.setForeground(new Color(3, 132, 0));
    }//GEN-LAST:event_lblDeliveryMouseExited

    private void lblDeliveryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeliveryMouseEntered
        lblDelivery.setForeground(new Color(190, 0, 103));
    }//GEN-LAST:event_lblDeliveryMouseEntered

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void lblTakeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTakeMouseExited
        lblTake.setForeground(new Color(3, 132, 0));
    }//GEN-LAST:event_lblTakeMouseExited

    private void lblTakeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTakeMouseEntered
        lblTake.setForeground(new Color(190, 0, 103));
    }//GEN-LAST:event_lblTakeMouseEntered

    private void lblTakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTakeMouseClicked
        txtTime.setText("");
        takeOrder();


    }//GEN-LAST:event_lblTakeMouseClicked

    private void lblDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeliveryMouseClicked
        
    }

    public void clearText(JPanel panel) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);

        Component[] components = panel.getComponents();
        for (Component com : components) {
            if (com instanceof JTextField) {
                ((JTextField) com).setText("");
            }
        }


    }//GEN-LAST:event_lblDeliveryMouseClicked

    private void txtOIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOIDActionPerformed

    private void txtConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTake;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOID;
    private javax.swing.JTextField txtTid;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    public void takeOrder() {
        
    }

    private void loadTable() {

    }
   
}
