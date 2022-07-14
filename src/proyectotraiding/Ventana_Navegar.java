/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectotraiding;

import java.awt.Color;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author famil
 */
public class Ventana_Navegar extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Navegar
     */
    public Ventana_Navegar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_chrome = new javax.swing.JButton();
        btn_youtube = new javax.swing.JButton();
        btn_linkedin = new javax.swing.JButton();
        label_linkedin = new javax.swing.JLabel();
        label_youtube = new javax.swing.JLabel();
        label_chrome = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jPanel2 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_chrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Youtube_96_apagado_1.png"))); // NOI18N
        btn_chrome.setBorder(null);
        btn_chrome.setBorderPainted(false);
        btn_chrome.setContentAreaFilled(false);
        btn_chrome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_chrome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/YouTube_64.png"))); // NOI18N
        btn_chrome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/YouTube_96.png"))); // NOI18N
        btn_chrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chromeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_chrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 130, 110));

        btn_youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redSocial_96_apagado.png"))); // NOI18N
        btn_youtube.setBorder(null);
        btn_youtube.setBorderPainted(false);
        btn_youtube.setContentAreaFilled(false);
        btn_youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_youtube.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redSocial64.png"))); // NOI18N
        btn_youtube.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redSocial_96.png"))); // NOI18N
        btn_youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_youtubeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 130, 110));

        btn_linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrom_96_apagado.png"))); // NOI18N
        btn_linkedin.setBorder(null);
        btn_linkedin.setBorderPainted(false);
        btn_linkedin.setContentAreaFilled(false);
        btn_linkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_linkedin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrome_64.png"))); // NOI18N
        btn_linkedin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrome_96.png"))); // NOI18N
        btn_linkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_linkedinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 110));

        label_linkedin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_linkedin.setForeground(new java.awt.Color(0, 0, 0));
        label_linkedin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_linkedin.setText("Linkedin");
        label_linkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_linkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_linkedinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_linkedinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_linkedinMouseExited(evt);
            }
        });
        jPanel1.add(label_linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 110, -1));

        label_youtube.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_youtube.setForeground(new java.awt.Color(0, 0, 0));
        label_youtube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_youtube.setText("Youtube");
        label_youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_youtube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_youtubeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_youtubeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_youtubeMouseExited(evt);
            }
        });
        jPanel1.add(label_youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 110, -1));

        label_chrome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_chrome.setForeground(new java.awt.Color(0, 0, 0));
        label_chrome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_chrome.setText("Google Chrome");
        label_chrome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_chrome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_chromeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_chromeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_chromeMouseExited(evt);
            }
        });
        jPanel1.add(label_chrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 250, 110, -1));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 120, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar_apagado.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_chromeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_chromeMouseEntered
        label_chrome.setForeground(Color.blue);
    }//GEN-LAST:event_label_chromeMouseEntered

    private void label_chromeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_chromeMouseExited
        label_chrome.setForeground(Color.black);
    }//GEN-LAST:event_label_chromeMouseExited

    private void label_youtubeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_youtubeMouseEntered
        label_youtube.setForeground(Color.blue);
    }//GEN-LAST:event_label_youtubeMouseEntered

    private void label_youtubeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_youtubeMouseExited
        label_youtube.setForeground(Color.black);
    }//GEN-LAST:event_label_youtubeMouseExited

    private void label_linkedinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_linkedinMouseEntered
        label_linkedin.setForeground(Color.blue);
    }//GEN-LAST:event_label_linkedinMouseEntered

    private void label_linkedinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_linkedinMouseExited
        label_linkedin.setForeground(Color.black);
    }//GEN-LAST:event_label_linkedinMouseExited

    //los sigueientes 6 metodos son para abrir enlaces 
    private void btn_linkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linkedinActionPerformed
        
    //para agregar un link siempre tiene que ir dentro una sentecia try/catch
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.google.com/");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            }          
        
    }//GEN-LAST:event_btn_linkedinActionPerformed

    private void btn_chromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chromeActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.youtube.com/");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            }          
    }//GEN-LAST:event_btn_chromeActionPerformed

    private void btn_youtubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_youtubeActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.linkedin.com/login/es");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            }          
    }//GEN-LAST:event_btn_youtubeActionPerformed

    private void label_chromeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_chromeMouseClicked
        if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.google.com/");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            } 
    }//GEN-LAST:event_label_chromeMouseClicked

    private void label_youtubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_youtubeMouseClicked
        if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.youtube.com/");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            } 
    }//GEN-LAST:event_label_youtubeMouseClicked

    private void label_linkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_linkedinMouseClicked
        if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try {
                        JOptionPane.showMessageDialog(null, "Espere un Momento");
                        java.net.URI uri = new java.net.URI("https://www.linkedin.com/login/es");
                        desktop.browse(uri);
                    } catch (IOException | URISyntaxException e) {
                    }
                }
            }  
    }//GEN-LAST:event_label_linkedinMouseClicked

    //metodo cerrar el programa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IntrefazApps llamar = new IntrefazApps();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Navegar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Navegar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Navegar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Navegar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Navegar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chrome;
    private javax.swing.JButton btn_linkedin;
    private javax.swing.JButton btn_youtube;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_chrome;
    private javax.swing.JLabel label_linkedin;
    private javax.swing.JLabel label_youtube;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
