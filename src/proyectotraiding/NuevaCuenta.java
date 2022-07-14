
package proyectotraiding;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.sql.*;
import javax.swing.JOptionPane;

public class NuevaCuenta extends javax.swing.JFrame {

    public NuevaCuenta() {
        initComponents();
        //metodo con la ibreria RSS, la diferencia es que solo se necesita este codigo, pero hay que importar la libreria
        rsscalelabel.RSScaleLabel.setScaleLabel(label_header1, "src/images/header.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen_crear, "src/images/registrarse.png");
        
        SetImageLabel(imagenPorFin, "src/images/crearNuevo.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        label_header1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_Registro_Nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txt_Registro_Celular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Registro_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_Registro_Apell = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        panel_botonCrear = new javax.swing.JPanel();
        label_crearCuenta2 = new javax.swing.JLabel();
        imagenPorFin = new javax.swing.JLabel();
        imagen_crear = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        crearCuenta_Registro = new javax.swing.JButton();
        txt_Registro_contra = new javax.swing.JPasswordField();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        label_header1.setBackground(new java.awt.Color(255, 255, 255));
        label_header1.setText("jLabel2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(label_header1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(label_header1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, 79));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido(s):");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 81, -1));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 200, 10));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre(s):");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 181, 81, -1));

        txt_Registro_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Registro_Nombre.setForeground(new java.awt.Color(204, 204, 204));
        txt_Registro_Nombre.setText("nombres...");
        txt_Registro_Nombre.setBorder(null);
        txt_Registro_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Registro_NombreMouseClicked(evt);
            }
        });
        jPanel4.add(txt_Registro_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 203, 200, -1));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 225, 200, 10));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Celular:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 80, -1));

        txt_Registro_Celular.setBackground(new java.awt.Color(255, 255, 255));
        txt_Registro_Celular.setForeground(new java.awt.Color(204, 204, 204));
        txt_Registro_Celular.setText("000-000-0000");
        txt_Registro_Celular.setBorder(null);
        txt_Registro_Celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Registro_CelularMouseClicked(evt);
            }
        });
        txt_Registro_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Registro_CelularActionPerformed(evt);
            }
        });
        jPanel4.add(txt_Registro_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 80, -1));

        txt_Registro_User.setBackground(new java.awt.Color(255, 255, 255));
        txt_Registro_User.setForeground(new java.awt.Color(204, 204, 204));
        txt_Registro_User.setText("ejm: user78");
        txt_Registro_User.setBorder(null);
        txt_Registro_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Registro_UserMouseClicked(evt);
            }
        });
        txt_Registro_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Registro_UserActionPerformed(evt);
            }
        });
        jPanel4.add(txt_Registro_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 200, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 200, 10));

        txt_Registro_Apell.setBackground(new java.awt.Color(255, 255, 255));
        txt_Registro_Apell.setForeground(new java.awt.Color(204, 204, 204));
        txt_Registro_Apell.setText("apellidos...");
        txt_Registro_Apell.setBorder(null);
        txt_Registro_Apell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Registro_ApellMouseClicked(evt);
            }
        });
        jPanel4.add(txt_Registro_Apell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, -1));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 200, 10));

        panel_botonCrear.setBackground(new java.awt.Color(204, 204, 204));
        panel_botonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_botonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_botonCrearMouseExited(evt);
            }
        });

        label_crearCuenta2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_crearCuenta2.setForeground(new java.awt.Color(0, 0, 0));
        label_crearCuenta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_crearCuenta2.setText("INICIAR SESION");
        label_crearCuenta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_crearCuenta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_crearCuenta2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_crearCuenta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_crearCuenta2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_crearCuenta2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonCrearLayout = new javax.swing.GroupLayout(panel_botonCrear);
        panel_botonCrear.setLayout(panel_botonCrearLayout);
        panel_botonCrearLayout.setHorizontalGroup(
            panel_botonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_crearCuenta2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panel_botonCrearLayout.setVerticalGroup(
            panel_botonCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonCrearLayout.createSequentialGroup()
                .addComponent(label_crearCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(panel_botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 200, 30));

        imagenPorFin.setBackground(new java.awt.Color(204, 204, 204));
        imagenPorFin.setText("jLabel1");
        jPanel4.add(imagenPorFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, 90));

        imagen_crear.setText("jLabel9");
        jPanel4.add(imagen_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 470));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 38));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 70, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 200, 10));

        crearCuenta_Registro.setBackground(new java.awt.Color(204, 204, 204));
        crearCuenta_Registro.setForeground(new java.awt.Color(0, 0, 0));
        crearCuenta_Registro.setText("CREAR");
        crearCuenta_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuenta_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuenta_RegistroActionPerformed(evt);
            }
        });
        jPanel4.add(crearCuenta_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        txt_Registro_contra.setBackground(new java.awt.Color(255, 255, 255));
        txt_Registro_contra.setForeground(new java.awt.Color(204, 204, 204));
        txt_Registro_contra.setText("***");
        txt_Registro_contra.setBorder(null);
        txt_Registro_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Registro_contraMouseClicked(evt);
            }
        });
        jPanel4.add(txt_Registro_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 200, -1));
        jPanel4.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 90, 20));
        jPanel4.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //iniciar ventana en el centro
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    //codigo no sirve
    private void txt_Registro_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Registro_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Registro_UserActionPerformed

    //codigo no sirve
    private void txt_Registro_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Registro_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Registro_CelularActionPerformed
   
    //codigo no sirve
    private void panel_botonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonCrearMouseEntered
        
    }//GEN-LAST:event_panel_botonCrearMouseEntered
  
    //codigo no sirve
    private void panel_botonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonCrearMouseExited
        
    }//GEN-LAST:event_panel_botonCrearMouseExited
   
    //meto llamar venta login con el boton iniciar sesion
    private void label_crearCuenta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuenta2MousePressed
        Login inicia = new Login();
        inicia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_label_crearCuenta2MousePressed
   
    //meto hover boton iniciar sesion, entra mouse
    private void label_crearCuenta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuenta2MouseEntered
        panel_botonCrear.setBackground(Color.black);
        label_crearCuenta2.setForeground(Color.white);
    }//GEN-LAST:event_label_crearCuenta2MouseEntered
   
    //meto hover boton iniciar sesion, sale mouse
    private void label_crearCuenta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuenta2MouseExited
        panel_botonCrear.setBackground(Color.gray);
        label_crearCuenta2.setForeground(Color.black);
    }//GEN-LAST:event_label_crearCuenta2MouseExited

       
    //Las siguientes lineas son el codigo para eliminar el texto predeterminado de las cajas de texto 
    private void txt_Registro_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Registro_NombreMouseClicked
        if(txt_Registro_Nombre.getText().equals("nombres...")){
            txt_Registro_Nombre.setText("");
            txt_Registro_Nombre.setForeground(Color.black);
        } 
    }//GEN-LAST:event_txt_Registro_NombreMouseClicked

    private void txt_Registro_ApellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Registro_ApellMouseClicked
        if(txt_Registro_Apell.getText().equals("apellidos...")){
            txt_Registro_Apell.setText("");
            txt_Registro_Apell.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_Registro_ApellMouseClicked

    private void txt_Registro_CelularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Registro_CelularMouseClicked
        if(txt_Registro_Celular.getText().equals("000-000-0000")){
            txt_Registro_Celular.setText("");
            txt_Registro_Celular.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_Registro_CelularMouseClicked

    private void txt_Registro_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Registro_UserMouseClicked
        if(txt_Registro_User.getText().equals("ejm: user78")){
            txt_Registro_User.setText("");
            txt_Registro_User.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_Registro_UserMouseClicked

    //evento para subir datos a la bases de datos
    private void label_crearCuenta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuenta2MouseClicked
        
    }//GEN-LAST:event_label_crearCuenta2MouseClicked

    //evento insertar datos en la base MySql
    private void crearCuenta_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuenta_RegistroActionPerformed
        int result = 0;
        //condicional para cuando se deja un acampo bacio
        //falta hacerlo
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1_iniciarsesion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into registros_sesion values(?,?,?,?,?,?)");

                pst.setString(1, "0");
                pst.setString(2, txt_Registro_Nombre.getText().trim());
                pst.setString(3, txt_Registro_Apell.getText().trim());
                pst.setString(4, txt_Registro_Celular.getText().trim());
                pst.setString(5, txt_Registro_User.getText().trim());
                pst.setString(6, String.valueOf(txt_Registro_contra.getPassword()).trim());
                //ejecutamos el codigo
                pst.executeUpdate();

                //Limpiamos los campos apenas se envien a la base los datos
                txt_Registro_Nombre.setText("");
                txt_Registro_Apell.setText("");
                txt_Registro_Celular.setText("");
                txt_Registro_User.setText("");
                txt_Registro_contra.setText("");

                //un mensaje la cuenta se creo con Exito
                JOptionPane.showMessageDialog(null, "Cuenta creada con Exito"); 



        }catch(HeadlessException | SQLException e){

        }
        
    }//GEN-LAST:event_crearCuenta_RegistroActionPerformed
    //linea de codigo para eliminar texto predeterminado caja password
    private void txt_Registro_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Registro_contraMouseClicked
        if(String.valueOf(txt_Registro_contra.getPassword()).equals("***")){
            txt_Registro_contra.setText("");
            txt_Registro_contra.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_Registro_contraMouseClicked

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCuenta().setVisible(true);
            }
        });
    }
    
    //este es un metodo para ajustar tamaño a las imagenes sin la libreria RSS
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon= new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearCuenta_Registro;
    private javax.swing.JLabel imagenPorFin;
    private javax.swing.JLabel imagen_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label_crearCuenta2;
    private javax.swing.JLabel label_header1;
    private javax.swing.JPanel panel_botonCrear;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTextField txt_Registro_Apell;
    private javax.swing.JTextField txt_Registro_Celular;
    private javax.swing.JTextField txt_Registro_Nombre;
    private javax.swing.JTextField txt_Registro_User;
    private javax.swing.JPasswordField txt_Registro_contra;
    // End of variables declaration//GEN-END:variables
}
