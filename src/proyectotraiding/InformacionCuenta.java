
package proyectotraiding;
import java.awt.Color;
import java.sql.*; //base de datos
import javax.swing.JOptionPane;

public class InformacionCuenta extends javax.swing.JFrame {
    //usuario
    String UsuarioLogin ="";
    public InformacionCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(label_inforModificar, "src/images/informacionModificar.png");
        ingresarUser();
        coneBaseDeDatos();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cuadro_Nombre_tx = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cuadro_ape_tx = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cuadro_cel_tx = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label_inforModificar = new javax.swing.JLabel();
        label_User = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        label_respuesta = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        label_Modificar = new javax.swing.JLabel();
        cuadro_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre(s)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 138, 221, 25));

        cuadro_Nombre_tx.setBackground(new java.awt.Color(204, 204, 204));
        cuadro_Nombre_tx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cuadro_Nombre_tx.setForeground(new java.awt.Color(0, 51, 255));
        cuadro_Nombre_tx.setText("jTextField1");
        cuadro_Nombre_tx.setBorder(null);
        jPanel1.add(cuadro_Nombre_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 169, 190, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 196, 221, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido(s)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 234, 221, -1));

        cuadro_ape_tx.setBackground(new java.awt.Color(204, 204, 204));
        cuadro_ape_tx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cuadro_ape_tx.setForeground(new java.awt.Color(0, 51, 204));
        cuadro_ape_tx.setText("jTextField1");
        cuadro_ape_tx.setBorder(null);
        jPanel1.add(cuadro_ape_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 266, 235, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 297, 221, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Celular");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 339, 221, -1));

        cuadro_cel_tx.setBackground(new java.awt.Color(204, 204, 204));
        cuadro_cel_tx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cuadro_cel_tx.setForeground(new java.awt.Color(0, 51, 204));
        cuadro_cel_tx.setText("jTextField1");
        cuadro_cel_tx.setBorder(null);
        jPanel1.add(cuadro_cel_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 365, 221, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 396, 221, 10));

        label_inforModificar.setText("jLabel4");
        jPanel1.add(label_inforModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 274, 410));

        label_User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_User.setForeground(new java.awt.Color(102, 0, 0));
        label_User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_User.setText("jLabel4");
        jPanel1.add(label_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 264, 43));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
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

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label_respuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_respuesta.setForeground(new java.awt.Color(255, 255, 255));
        label_respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 381, Short.MAX_VALUE))
                    .addComponent(label_respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton3))
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        btn_modificar.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar_64.png"))); // NOI18N
        btn_modificar.setBorder(null);
        btn_modificar.setBorderPainted(false);
        btn_modificar.setContentAreaFilled(false);
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar_64.png"))); // NOI18N
        btn_modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar_72.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 110, 100));

        label_Modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Modificar.setForeground(new java.awt.Color(0, 0, 0));
        label_Modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Modificar.setText("Modificar");
        label_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ModificarMouseExited(evt);
            }
        });
        jPanel1.add(label_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 110, -1));

        cuadro_id.setBackground(new java.awt.Color(204, 204, 204));
        cuadro_id.setForeground(new java.awt.Color(204, 204, 204));
        cuadro_id.setBorder(null);
        jPanel1.add(cuadro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if(evt.getSource()==btn_modificar){
            try {
            String id=cuadro_id.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1_iniciarsesion","root","");
            PreparedStatement stm= cn.prepareStatement("UPDATE  registros_sesion SET NombreUser =?"
                    + ", ApellidoUser =?, CelularUser=? WHERE ID = "+id );
                   
            
            stm.setString(1, cuadro_Nombre_tx.getText().trim());
            stm.setString(2, cuadro_ape_tx.getText().trim());
            stm.setString(3, cuadro_cel_tx.getText().trim());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "El parametro se modifico con Exito");
            
            label_respuesta.setText("Modificacion Exitosa");
        } catch (Exception e) {
        }
        
        
        }
    }//GEN-LAST:event_btn_modificarActionPerformed
    //\nReinicia si quieres ver los cambios")
    //los dos codigos siguientes son para hacer efecto hover en el label_Modificar
    private void label_ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ModificarMouseEntered
        label_Modificar.setForeground(Color.red);
    }//GEN-LAST:event_label_ModificarMouseEntered

    private void label_ModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ModificarMouseExited
        label_Modificar.setForeground(Color.black);
    }//GEN-LAST:event_label_ModificarMouseExited
    
    //metodo devolverse a la ventana d las apps
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IntrefazApps llamado = new IntrefazApps();
        llamado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //metodo cerrar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    //conectamos con la base de datos
    private void coneBaseDeDatos(){
        //siempre se utiliza un try para conectar con la base
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1_iniciarsesion","root","");
            PreparedStatement stm = cn.prepareStatement("SELECT * FROM registros_sesion WHERE Usuario = '"+UsuarioLogin+"'");
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()){
                //isertamos los datos con un bucle do/while
                do {  
                    cuadro_id.setText(rs.getString("ID"));
                    cuadro_Nombre_tx.setText(rs.getString("NombreUser"));
                    cuadro_ape_tx.setText(rs.getString("ApellidoUser"));
                    cuadro_cel_tx.setText(rs.getString("CelularUser"));
                } while (rs.next());
            } 
        } catch (Exception e) {
        }
    }
    
    //metodo ingresar usuriao en el label_user
    private void ingresarUser(){
        Login userInformacion = new Login();
        UsuarioLogin = userInformacion.usuarioTexto;
        label_User.setText("Hola "+ "'"+UsuarioLogin+"'");
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modificar;
    private javax.swing.JTextField cuadro_Nombre_tx;
    private javax.swing.JTextField cuadro_ape_tx;
    private javax.swing.JTextField cuadro_cel_tx;
    private javax.swing.JTextField cuadro_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label_Modificar;
    private javax.swing.JLabel label_User;
    private javax.swing.JLabel label_inforModificar;
    private javax.swing.JLabel label_respuesta;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
