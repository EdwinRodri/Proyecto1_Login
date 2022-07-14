/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectotraiding;

import java.awt.Color;

/**
 *
 * @author famil
 */
public class ContadorApp extends javax.swing.JFrame {
    int contador;
    public ContadorApp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        rSScaleLabel1 = new rsscalelabel.RSScaleLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Reset = new javax.swing.JButton();
        btn_Disminuir = new javax.swing.JButton();
        btn_Aumentar = new javax.swing.JButton();
        label_cuenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Cerrar_app = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Reset.setBackground(new java.awt.Color(204, 204, 204));
        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset_96.png"))); // NOI18N
        btn_Reset.setBorder(null);
        btn_Reset.setBorderPainted(false);
        btn_Reset.setContentAreaFilled(false);
        btn_Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, 90));

        btn_Disminuir.setBackground(new java.awt.Color(204, 204, 204));
        btn_Disminuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menos_96.png"))); // NOI18N
        btn_Disminuir.setBorder(null);
        btn_Disminuir.setBorderPainted(false);
        btn_Disminuir.setContentAreaFilled(false);
        btn_Disminuir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Disminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisminuirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Disminuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 150, 120));

        btn_Aumentar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Aumentar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Aumentar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Aumentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas_96.png"))); // NOI18N
        btn_Aumentar.setBorder(null);
        btn_Aumentar.setBorderPainted(false);
        btn_Aumentar.setContentAreaFilled(false);
        btn_Aumentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Aumentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AumentarMouseClicked(evt);
            }
        });
        btn_Aumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AumentarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Aumentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 130));

        label_cuenta.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        label_cuenta.setForeground(new java.awt.Color(0, 0, 0));
        label_cuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cuenta.setText("0");
        jPanel1.add(label_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 110));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cerrar_app.setBackground(new java.awt.Color(0, 0, 0));
        btn_Cerrar_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btn_Cerrar_app.setBorder(null);
        btn_Cerrar_app.setBorderPainted(false);
        btn_Cerrar_app.setContentAreaFilled(false);
        btn_Cerrar_app.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cerrar_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cerrar_appActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cerrar_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 60));

        btn_atras.setBackground(new java.awt.Color(0, 0, 0));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras.png"))); // NOI18N
        btn_atras.setBorder(null);
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -10, -1, 80));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AumentarActionPerformed

            contador++;
                label_cuenta.setForeground(Color.blue);
                label_cuenta.setText(Integer.toString(contador));  
    }//GEN-LAST:event_btn_AumentarActionPerformed

    private void btn_AumentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AumentarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AumentarMouseClicked

    private void btn_DisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisminuirActionPerformed

        contador--;

            label_cuenta.setForeground(Color.red);
            label_cuenta.setText(Integer.toString(contador));  
                
        
    }//GEN-LAST:event_btn_DisminuirActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        contador=0;
        if(contador==0){
                label_cuenta.setForeground(Color.black);
                label_cuenta.setText(Integer.toString(contador));  
            }
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_Cerrar_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cerrar_appActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Cerrar_appActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        IntrefazApps llamdo = new IntrefazApps();
        llamdo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    
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
            java.util.logging.Logger.getLogger(ContadorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContadorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContadorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContadorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aumentar;
    private javax.swing.JButton btn_Cerrar_app;
    private javax.swing.JButton btn_Disminuir;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_cuenta;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private rsscalelabel.RSScaleLabel rSScaleLabel1;
    // End of variables declaration//GEN-END:variables
}
