/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jsant
 */
public class Menu extends javax.swing.JFrame {
    
    private ImageIcon imagen;
    private Icon Icono;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Ajustar(jLabelVentas, "src/Imagenes/bolsa-de-la-compra.png");
        Ajustar(jLabelCompras, "src/Imagenes/compras.png");
        Ajustar(jLabelPedidos, "src/Imagenes/pedido-en-linea.png");
        Ajustar(jLabelClientes, "src/Imagenes/clasificacion.png");
        Ajustar(jLabelConfiguracion, "src/Imagenes/configuracion.png");
        Ajustar(jLabelProveedores, "src/Imagenes/mensajero.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVentas = new javax.swing.JLabel();
        jLabelProveedores = new javax.swing.JLabel();
        jLabelCompras = new javax.swing.JLabel();
        jLabelPedidos = new javax.swing.JLabel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelConfiguracion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonIniciar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolsa-de-la-compra.png"))); // NOI18N
        getContentPane().add(jLabelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 150, 140));

        jLabelProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mensajero.png"))); // NOI18N
        getContentPane().add(jLabelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 150, 140));

        jLabelCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        getContentPane().add(jLabelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 150, 140));

        jLabelPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedido-en-linea.png"))); // NOI18N
        getContentPane().add(jLabelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 140));

        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clasificacion.png"))); // NOI18N
        getContentPane().add(jLabelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 150, 140));

        jLabelConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png"))); // NOI18N
        getContentPane().add(jLabelConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 150, 140));

        jButton1.setText("Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));

        jButton2.setText("Proveedores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 120, -1));

        jButton3.setText("Compras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 120, -1));

        jButton4.setText("Pedidos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 120, -1));

        jButton5.setText("Clientes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, -1));

        jButton6.setText("Configuracion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 120, -1));

        jButtonIniciar1.setBackground(new java.awt.Color(255, 0, 0));
        jButtonIniciar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonIniciar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciar1.setText("Salir");
        jButtonIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 512));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Proveedores newframe = new Proveedores();
        newframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Pedidos newframe;
        try {
            newframe = new Pedidos();
            newframe.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Clientes newframe;
        try {
            newframe = new Clientes();
            newframe.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Configuración newframe = new Configuración();
        newframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIniciar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Venta newframe = new Venta();
        newframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    private void Ajustar(JLabel lbl, String ruta) {

        this.imagen = new ImageIcon(ruta);
        this.Icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.Icono);
        this.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonIniciar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelConfiguracion;
    private javax.swing.JLabel jLabelPedidos;
    private javax.swing.JLabel jLabelProveedores;
    private javax.swing.JLabel jLabelVentas;
    // End of variables declaration//GEN-END:variables
}
