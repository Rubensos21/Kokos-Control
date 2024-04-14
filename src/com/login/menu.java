/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author braul
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        SetDate();       
    }
    private void SetDate() {
        LocalDate now = LocalDate.now();
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy")));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCP = new javax.swing.JPanel();
        txtCP = new javax.swing.JLabel();
        btnInv = new javax.swing.JPanel();
        txInv = new javax.swing.JLabel();
        btnRC = new javax.swing.JPanel();
        txRC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCS = new javax.swing.JPanel();
        txtCS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txLogin = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 640));

        btnCP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtCP.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCP.setText("Crear pedido");
        txtCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCPLayout = new javax.swing.GroupLayout(btnCP);
        btnCP.setLayout(btnCPLayout);
        btnCPLayout.setHorizontalGroup(
            btnCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        btnCPLayout.setVerticalGroup(
            btnCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        btnInv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txInv.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txInv.setText("Inventario");
        txInv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txInvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txInvMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInvLayout = new javax.swing.GroupLayout(btnInv);
        btnInv.setLayout(btnInvLayout);
        btnInvLayout.setHorizontalGroup(
            btnInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInvLayout.setVerticalGroup(
            btnInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txInv, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        btnRC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txRC.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txRC.setText("Reporte de caja");
        txRC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txRCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txRCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRCLayout = new javax.swing.GroupLayout(btnRC);
        btnRC.setLayout(btnRCLayout);
        btnRCLayout.setHorizontalGroup(
            btnRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRCLayout.setVerticalGroup(
            btnRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txRC, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(247, 148, 29));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("KOKO'S");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTROL");

        btnCS.setBackground(new java.awt.Color(247, 148, 29));
        btnCS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtCS.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCS.setForeground(new java.awt.Color(255, 255, 255));
        txtCS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCS.setText("Cerrar Sesión");
        txtCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCSLayout = new javax.swing.GroupLayout(btnCS);
        btnCS.setLayout(btnCSLayout);
        btnCSLayout.setHorizontalGroup(
            btnCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCS, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        btnCSLayout.setVerticalGroup(
            btnCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCS, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LogoBN2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        txLogin.setFont(new java.awt.Font("Roboto", 1, 95)); // NOI18N
        txLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txLogin.setText("BIENVENIDO");
        txLogin.setToolTipText("");

        fecha.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es {dayname} {day} de {moth} de {year}");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(txLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(254, 254, 254))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPMouseEntered
        // TODO add your handling code here:
        btnCP.setBackground(Color.orange);
    }//GEN-LAST:event_txtCPMouseEntered

    private void txtCPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPMouseExited
        // TODO add your handling code here:
        btnCP.setBackground(new Color(224,224,224));
    }//GEN-LAST:event_txtCPMouseExited

    private void txInvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txInvMouseEntered
        // TODO add your handling code here:
        btnInv.setBackground(Color.orange);
    }//GEN-LAST:event_txInvMouseEntered

    private void txInvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txInvMouseExited
        // TODO add your handling code here:
        btnInv.setBackground(new Color(224,224,224));
    }//GEN-LAST:event_txInvMouseExited

    private void txRCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txRCMouseEntered
        // TODO add your handling code here:
        btnRC.setBackground(Color.orange);
    }//GEN-LAST:event_txRCMouseEntered

    private void txRCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txRCMouseExited
        // TODO add your handling code here:
        btnRC.setBackground(new Color(224,224,224));
    }//GEN-LAST:event_txRCMouseExited

    private void txtCSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCSMouseEntered
        // TODO add your handling code here:
        btnCS.setBackground(Color.orange);
    }//GEN-LAST:event_txtCSMouseEntered

    private void txtCSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCSMouseExited
        // TODO add your handling code here:
        btnCS.setBackground(new Color(247,148,29));
    }//GEN-LAST:event_txtCSMouseExited

    private void txtCSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCSMouseClicked
        // TODO add your handling code here:

        int option = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) 
        {
        // Si, cierra sesion
            login lg = new login();
            lg.setVisible(true);
            this.dispose();
        } else 
        {
        //"No", no hace nada
        }
    }//GEN-LAST:event_txtCSMouseClicked

    private void txtCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCPMouseClicked
        CrearPedido cp = new CrearPedido();
        
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtCPMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCP;
    private javax.swing.JPanel btnCS;
    private javax.swing.JPanel btnInv;
    private javax.swing.JPanel btnRC;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txInv;
    private javax.swing.JLabel txLogin;
    private javax.swing.JLabel txRC;
    private javax.swing.JLabel txtCP;
    private javax.swing.JLabel txtCS;
    // End of variables declaration//GEN-END:variables

    

    
}
