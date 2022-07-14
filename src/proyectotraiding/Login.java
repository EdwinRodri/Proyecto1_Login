
package proyectotraiding;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.sql.*;


public class Login extends javax.swing.JFrame {
    int xMouse, yMouse;
    private ImageIcon titulo;
    private JLabel lbltitulo;
    public static String usuarioTexto="";//guardamos el usuario en esta variable
    
    public Login() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iniciarSesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        cuadroUsuaio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cuadroPass = new javax.swing.JPasswordField();
        panelTitulo = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        botonPanel = new javax.swing.JPanel();
        label_loginIniciar = new javax.swing.JLabel();
        imagenLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_crearCuenta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tituloImagen = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarSesion.setText("INICIAR SESIÓN");
        jPanel1.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 35));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 40));

        cuadroUsuaio.setBackground(new java.awt.Color(255, 255, 255));
        cuadroUsuaio.setForeground(new java.awt.Color(204, 204, 204));
        cuadroUsuaio.setText("Ingrese el usuario");
        cuadroUsuaio.setBorder(null);
        cuadroUsuaio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadroUsuaioMouseClicked(evt);
            }
        });
        cuadroUsuaio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroUsuaioActionPerformed(evt);
            }
        });
        jPanel1.add(cuadroUsuaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 10));

        cuadroPass.setBackground(new java.awt.Color(255, 255, 255));
        cuadroPass.setForeground(new java.awt.Color(204, 204, 204));
        cuadroPass.setText("******");
        cuadroPass.setBorder(null);
        cuadroPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadroPassMousePressed(evt);
            }
        });
        jPanel1.add(cuadroPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, -1));

        panelTitulo.setBackground(new java.awt.Color(204, 204, 204));

        panelSalir.setBackground(new java.awt.Color(0, 0, 0));
        panelSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSalirMouseDragged(evt);
            }
        });
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSalirMousePressed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 110));

        botonPanel.setBackground(new java.awt.Color(204, 204, 204));
        botonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPanelMouseExited(evt);
            }
        });

        label_loginIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_loginIniciar.setForeground(new java.awt.Color(0, 0, 0));
        label_loginIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_loginIniciar.setText("INICIAR");
        label_loginIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_loginIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_loginIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_loginIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_loginIniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonPanelLayout = new javax.swing.GroupLayout(botonPanel);
        botonPanel.setLayout(botonPanelLayout);
        botonPanelLayout.setHorizontalGroup(
            botonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_loginIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        botonPanelLayout.setVerticalGroup(
            botonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_loginIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(botonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        imagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otroLogo.png"))); // NOI18N
        imagenLogin.setText("jLabel1");
        jPanel1.add(imagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 410));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_crearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        label_crearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        label_crearCuenta.setForeground(new java.awt.Color(0, 0, 0));
        label_crearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_crearCuenta.setText("Crear Cuenta ");
        label_crearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_crearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_crearCuentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_crearCuentaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_crearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_crearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("¿No tienes Cuenta?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));
        jPanel1.add(tituloImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 370, 72));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void cuadroUsuaioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroUsuaioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroUsuaioActionPerformed

    //eventos para poder correr la pantalla con el mouse sin barra
    private void panelSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelSalirMousePressed

    //eventos para poder correr la pantalla con el mouse sin barra
    private void panelSalirMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_panelSalirMouseDragged

    //evento boton salir
    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    //evento que cuando pasa el cursor por el boton salir cambie de color
    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setForeground(Color.red);
    }//GEN-LAST:event_salirMouseEntered

    //evento que cuando pasa el cursor por el boton salir cambie de color
    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setForeground(Color.white);
    }//GEN-LAST:event_salirMouseExited

    //metodo cuadro de usuario 
    private void cuadroUsuaioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroUsuaioMouseClicked
        if(cuadroUsuaio.getText().equals("Ingrese el usuario") ){
            cuadroUsuaio.setText("");
            cuadroUsuaio.setForeground(Color.black);
        }
        //estas lineas de codigo lo hacen mas dinamico
        
        //estas lineas de codigo lo hacen mas dinamico
        /*if(String.valueOf(cuadroPass.getPassword()).isEmpty()){
            cuadroPass.setText("******"); 
            cuadroPass.setForeground(Color.gray);
        } */        
    }//GEN-LAST:event_cuadroUsuaioMouseClicked
    
    //Metodo cuadro Passwor
    private void cuadroPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroPassMousePressed
        if(String.valueOf(cuadroPass.getPassword()).equals("******")){
            cuadroPass.setText("");
            cuadroPass.setForeground(Color.black);
        }
        /*if(cuadroUsuaio.getText().isEmpty()){
            cuadroUsuaio.setText("Ingrese el usuario"); 
            cuadroUsuaio.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_cuadroPassMousePressed
    
   
    //evento para que la ventana salga en el centro de la pantalla
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
    
    //metodo para mandar a crear una cuenta nueva
    private void label_crearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuentaMousePressed
        NuevaCuenta cuentaNueva = new NuevaCuenta();
        cuentaNueva.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_label_crearCuentaMousePressed
    
    //metodo hover para crear una cuenta, entra mouse
    private void label_crearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuentaMouseEntered
        label_crearCuenta.setForeground(Color.blue);
    }//GEN-LAST:event_label_crearCuentaMouseEntered
    //metodo hover para crera una cuenta, sale mouse
    private void label_crearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_crearCuentaMouseExited
       label_crearCuenta.setForeground(Color.black);
    }//GEN-LAST:event_label_crearCuentaMouseExited

    //metodo hover para cuando entre el cursor
    private void botonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPanelMouseEntered
        botonPanel.setBackground(Color.black);
        label_loginIniciar.setForeground(Color.white);
    }//GEN-LAST:event_botonPanelMouseEntered
    
    //metod hover cuando salga el cursor 
    private void botonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPanelMouseExited
        botonPanel.setBackground(Color.gray);
        label_loginIniciar.setForeground(Color.black);
    }//GEN-LAST:event_botonPanelMouseExited
    
    //evento para validar si la cuenta tiene todo los campos llenos 
    private void label_loginIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_loginIniciarMouseClicked
        if(cuadroUsuaio.getText().equals("Ingrese el usuario") && String.valueOf(cuadroPass.getPassword()).equals("******")){
            JOptionPane.showMessageDialog(null, "Por Favor, Ingresa Usuario y Contraseña");
        }else if (cuadroUsuaio.getText()!=("Ingrese el usuario") && String.valueOf(cuadroPass.getPassword()).equals("******")){
            JOptionPane.showMessageDialog(null, "Por Favor, Ingresa la Contraseña");
        }else if(cuadroUsuaio.getText().equals("Ingrese el usuario") && String.valueOf(cuadroPass.getPassword())!=("******")){
            JOptionPane.showMessageDialog(null, "Por Favor, Ingresa el Usuario");
        }
        validarDatos();
    }//GEN-LAST:event_label_loginIniciarMouseClicked

    private void label_loginIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_loginIniciarMouseEntered
        botonPanel.setBackground(Color.black);
        label_loginIniciar.setForeground(Color.white);
    }//GEN-LAST:event_label_loginIniciarMouseEntered

    private void label_loginIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_loginIniciarMouseExited
        botonPanel.setBackground(Color.gray);
        label_loginIniciar.setForeground(Color.black);
    }//GEN-LAST:event_label_loginIniciarMouseExited

    
    
    //metodo validamos los datos usuario y contraseña para ingresar
    private void validarDatos(){
        //variables
        int resultado=0;
        String password = String.valueOf((cuadroPass.getPassword()));
        String miUsuario= cuadroUsuaio.getText();
        try{
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1_iniciarsesion", "root", "");// objeto que sirve para conectar con la base de SQL
            PreparedStatement pst = cn.prepareStatement("select * from registros_sesion where Usuario = '"+miUsuario+"'"
                    + " and Contraseña ='"+password+"' ");
            
            // objeto para buscar los valores en la base de datos
            ResultSet rs =  pst.executeQuery();
            
            if(rs.next()){//encontrar los valores
                resultado =1;
                
                if(resultado==1){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Correcto");
                    usuarioTexto = cuadroUsuaio.getText().trim();//guardamos el usuario en este variable para utilizarla en el Jframe "InformacionCuenta"
                    IntrefazApps ven = new IntrefazApps();
                    ven.setVisible(true);
                    this.dispose();
                }
                if(miUsuario.equals("")&&password.equals("")){
                    JOptionPane.showMessageDialog(null, "Porfavor ingresa Usuario y Contraseña");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no registrado, Crea un Cuenta");
            }
            
        }catch(Exception e){
            
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonPanel;
    private javax.swing.JPasswordField cuadroPass;
    private javax.swing.JTextField cuadroUsuaio;
    private javax.swing.JLabel imagenLogin;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_crearCuenta;
    private javax.swing.JLabel label_loginIniciar;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelTitulo;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel tituloImagen;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
