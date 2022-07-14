package proyectotraiding;

import java.awt.Color;
import javax.swing.JOptionPane;


public class IntrefazApps extends javax.swing.JFrame {
    
    public IntrefazApps() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        label_header_misProyectos = new javax.swing.JLabel();
        btn_app1 = new javax.swing.JButton();
        btn_app2 = new javax.swing.JButton();
        btn_app3 = new javax.swing.JButton();
        btn_app4 = new javax.swing.JButton();
        btn_app5 = new javax.swing.JButton();
        btn_app6 = new javax.swing.JButton();
        label_Contador_miProyecto = new javax.swing.JLabel();
        label_Calendario_miProyecto = new javax.swing.JLabel();
        label_Informacion_miProyecto = new javax.swing.JLabel();
        label_Contacto_miProyecto = new javax.swing.JLabel();
        label_Calculadora_miProyecto = new javax.swing.JLabel();
        label_WhBot_miProyecto = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mis Proyectos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 630, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar_apagado.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 40, 40));

        label_header_misProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerMisProyectos.jpg"))); // NOI18N
        label_header_misProyectos.setText("jLabel2");
        jPanel2.add(label_header_misProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        btn_app1.setBackground(new java.awt.Color(204, 204, 204));
        btn_app1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app1.setForeground(new java.awt.Color(0, 0, 0));
        btn_app1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_me_96.png"))); // NOI18N
        btn_app1.setBorder(null);
        btn_app1.setBorderPainted(false);
        btn_app1.setContentAreaFilled(false);
        btn_app1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_me_64.png"))); // NOI18N
        btn_app1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_me_64.png"))); // NOI18N
        btn_app1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 130, 120));

        btn_app2.setBackground(new java.awt.Color(204, 204, 204));
        btn_app2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app2.setForeground(new java.awt.Color(0, 0, 0));
        btn_app2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario_64.png"))); // NOI18N
        btn_app2.setBorder(null);
        btn_app2.setBorderPainted(false);
        btn_app2.setContentAreaFilled(false);
        btn_app2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario_64.png"))); // NOI18N
        btn_app2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario_96.png"))); // NOI18N
        btn_app2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 120));

        btn_app3.setBackground(new java.awt.Color(204, 204, 204));
        btn_app3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app3.setForeground(new java.awt.Color(0, 0, 0));
        btn_app3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informacionPersonal_64.png"))); // NOI18N
        btn_app3.setBorder(null);
        btn_app3.setBorderPainted(false);
        btn_app3.setContentAreaFilled(false);
        btn_app3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informacionPersonal_64.png"))); // NOI18N
        btn_app3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informacionPersonal_96.png"))); // NOI18N
        btn_app3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 170, 130));

        btn_app4.setBackground(new java.awt.Color(204, 204, 204));
        btn_app4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app4.setForeground(new java.awt.Color(0, 0, 0));
        btn_app4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/counter_64.png"))); // NOI18N
        btn_app4.setBorder(null);
        btn_app4.setBorderPainted(false);
        btn_app4.setContentAreaFilled(false);
        btn_app4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/counter_64.png"))); // NOI18N
        btn_app4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/counter_96.png"))); // NOI18N
        btn_app4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 120));

        btn_app5.setBackground(new java.awt.Color(204, 204, 204));
        btn_app5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app5.setForeground(new java.awt.Color(0, 0, 0));
        btn_app5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calculator_64.png"))); // NOI18N
        btn_app5.setBorder(null);
        btn_app5.setBorderPainted(false);
        btn_app5.setContentAreaFilled(false);
        btn_app5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calculator_64.png"))); // NOI18N
        btn_app5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calculator_96.png"))); // NOI18N
        btn_app5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 150, 120));

        btn_app6.setBackground(new java.awt.Color(204, 204, 204));
        btn_app6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_app6.setForeground(new java.awt.Color(0, 0, 0));
        btn_app6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browser_64.png"))); // NOI18N
        btn_app6.setBorder(null);
        btn_app6.setBorderPainted(false);
        btn_app6.setContentAreaFilled(false);
        btn_app6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_app6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_app6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browser_64.png"))); // NOI18N
        btn_app6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browser_96.png"))); // NOI18N
        btn_app6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_app6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_app6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_app6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, 130));

        label_Contador_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Contador_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_Contador_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Contador_miProyecto.setText("Contador");
        label_Contador_miProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_Contador_miProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_Contador_miProyectoMouseExited(evt);
            }
        });
        jPanel1.add(label_Contador_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, -1));

        label_Calendario_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Calendario_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_Calendario_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Calendario_miProyecto.setText("Calendario");
        jPanel1.add(label_Calendario_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, -1));

        label_Informacion_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Informacion_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_Informacion_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Informacion_miProyecto.setText("Informacion");
        jPanel1.add(label_Informacion_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, -1));

        label_Contacto_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Contacto_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_Contacto_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Contacto_miProyecto.setText("Navegar");
        jPanel1.add(label_Contacto_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 90, -1));

        label_Calculadora_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Calculadora_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_Calculadora_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Calculadora_miProyecto.setText("Calculadora");
        jPanel1.add(label_Calculadora_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 90, -1));

        label_WhBot_miProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_WhBot_miProyecto.setForeground(new java.awt.Color(0, 0, 0));
        label_WhBot_miProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_WhBot_miProyecto.setText("Acerca de mi");
        jPanel1.add(label_WhBot_miProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 110, -1));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 100, 20));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_Contador_miProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Contador_miProyectoMouseEntered
        label_Contador_miProyecto.setForeground(Color.blue);
    }//GEN-LAST:event_label_Contador_miProyectoMouseEntered

    private void label_Contador_miProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Contador_miProyectoMouseExited
        label_Contador_miProyecto.setForeground(Color.black);
    }//GEN-LAST:event_label_Contador_miProyectoMouseExited

    private void btn_app4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app4ActionPerformed
        ContadorApp llamar = new ContadorApp();
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_app4ActionPerformed

    private void btn_app2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app2ActionPerformed
        Calender cal = new Calender();
        cal.setVisible(true);
        
    }//GEN-LAST:event_btn_app2ActionPerformed

    private void btn_app3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app3ActionPerformed
        if (evt.getSource() == btn_app3) {
            InformacionCuenta entrar = new InformacionCuenta();
            entrar.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_app3ActionPerformed
    //metodo mandar a ventana_navegar
    private void btn_app6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app6ActionPerformed
        Ventana_Navegar navegar = new Ventana_Navegar();
        navegar.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btn_app6ActionPerformed

    private void btn_app1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app1ActionPerformed
        if(evt.getSource()==btn_app1){
            JOptionPane.showMessageDialog(null, "Hola Programador\nSoy Edwin Rodriguez, tengo 23 años\ndecidi estudiar "
                    + "Programacion\nya que, me encanta 'IMAGINAR ALGO Y PODER CREARLO',\nte dejo mis datos de contacto\n"
                    + "por si me quieres dar una oportunidad\n para una entrevista\nCel: 3213447667\nEmail:edwinrodriguez955@gmail.com");
        }
    }//GEN-LAST:event_btn_app1ActionPerformed

    private void btn_app5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_app5ActionPerformed
        Ventana_Calcu calcular = new Ventana_Calcu();
        calcular.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_app5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
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
            java.util.logging.Logger.getLogger(IntrefazApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntrefazApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntrefazApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntrefazApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntrefazApps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_app1;
    private javax.swing.JButton btn_app2;
    private javax.swing.JButton btn_app3;
    private javax.swing.JButton btn_app4;
    private javax.swing.JButton btn_app5;
    private javax.swing.JButton btn_app6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Calculadora_miProyecto;
    private javax.swing.JLabel label_Calendario_miProyecto;
    private javax.swing.JLabel label_Contacto_miProyecto;
    private javax.swing.JLabel label_Contador_miProyecto;
    private javax.swing.JLabel label_Informacion_miProyecto;
    private javax.swing.JLabel label_WhBot_miProyecto;
    private javax.swing.JLabel label_header_misProyectos;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
