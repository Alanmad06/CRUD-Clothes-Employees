/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;
import Back.*;
import BD.*;

import javax.swing.JOptionPane;

/**
 *
 * @author alanm
 */
public class VentanaRegistroPrinci extends javax.swing.JFrame {
    Dueño dñ=null;
VentanaLogin v2= null;
 Login lg=null;
  BD BD = null;
 
    /**
     * Creates new form Ventana1
     */
    public VentanaRegistroPrinci() {
       dñ=new Dueño();
  lg=new Login();
  BD = new BD();
        initComponents();
        nover.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PnlRegistro = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ver = new javax.swing.JLabel();
        nover = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombreEmpresa = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblFondo = new javax.swing.JLabel();
        lblPercha = new javax.swing.JLabel();
        lblRegistroT = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 400));
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 225));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PnlRegistro.setBackground(new java.awt.Color(179, 164, 117));
        PnlRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuario ");
        PnlRegistro.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 171, 116, -1));

        txtUsuario.setBackground(new java.awt.Color(179, 164, 117));
        txtUsuario.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        PnlRegistro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 259, 34));

        btnRegresar.setBackground(new java.awt.Color(197, 170, 140));
        btnRegresar.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Registrarse");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        PnlRegistro.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 493, 153, 37));
        PnlRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 192, 234, 10));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
        });
        PnlRegistro.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 30, 30));

        nover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/nover.png"))); // NOI18N
        nover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                noverMouseReleased(evt);
            }
        });
        PnlRegistro.add(nover, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 30, 30));

        lblContraseña.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("Contraseña");
        PnlRegistro.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 208, 116, -1));
        PnlRegistro.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 235, 234, 10));

        lblNombre.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        PnlRegistro.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 259, 116, -1));

        txtNombre.setBackground(new java.awt.Color(179, 164, 117));
        txtNombre.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        PnlRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 257, 240, 25));
        PnlRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 288, 234, 10));

        lblEdad.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 0, 0));
        lblEdad.setText("Edad");
        PnlRegistro.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 116, -1));

        txtEdad.setBackground(new java.awt.Color(179, 164, 117));
        txtEdad.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(null);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        PnlRegistro.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 310, 259, 25));
        PnlRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 337, 234, 10));

        lblEmail.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email");
        PnlRegistro.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 353, 116, -1));

        txtEmail.setBackground(new java.awt.Color(179, 164, 117));
        txtEmail.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        PnlRegistro.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 353, 259, 28));
        PnlRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 383, 234, 10));

        lblNombreEmpresa.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreEmpresa.setText("Nombre de la Empresa");
        lblNombreEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PnlRegistro.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 411, 208, 48));

        txtNombreEmpresa.setBackground(new java.awt.Color(179, 164, 117));
        txtNombreEmpresa.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        txtNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEmpresa.setBorder(null);
        txtNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpresaActionPerformed(evt);
            }
        });
        PnlRegistro.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 411, 234, 48));
        PnlRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 465, 234, 10));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/camisas2.jpg"))); // NOI18N
        lblFondo.setText("jLabel2");
        PnlRegistro.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 2, 411, 548));

        lblPercha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosProyecto/Imagen2.png"))); // NOI18N
        lblPercha.setText("jLabel4");
        PnlRegistro.add(lblPercha, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 47, 64, -1));

        lblRegistroT.setFont(new java.awt.Font("MS UI Gothic", 3, 36)); // NOI18N
        lblRegistroT.setForeground(new java.awt.Color(0, 0, 0));
        lblRegistroT.setText("REGISTRO ");
        PnlRegistro.add(lblRegistroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 61, 232, -1));

        password.setBackground(new java.awt.Color(179, 164, 117));
        password.setFont(new java.awt.Font("MS UI Gothic", 3, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        PnlRegistro.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
     
       
        lg.setContraseña(password.getText());
        lg.setUsuario(txtUsuario.getText());
        dñ.setLg(lg);
        dñ.setNombre(txtNombre.getText());
        dñ.setEmail(txtEmail.getText());
        dñ.setEdad(Integer.parseInt(txtEdad.getText()));
        dñ.setNombreEmpresa(txtNombreEmpresa.getText());
        
        BD.abrir_ConexionDñ();
        BD.insertar_Dueño(dñ);
        BD.cerrar_ConexionDñ();
        
        
        
        
        if(v2==null){
             v2 = new VentanaLogin(this,lg,dñ);
        }
        this.setVisible(false);
        v2.setVisible(true);
        
            
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        BD.abrir_ConexionDñ();
        if(BD.Verificar()==1){
             BD.cerrar_ConexionDñ();
        if(v2==null){
             v2 = new VentanaLogin(this,lg,dñ);
        }
        this.setVisible(false);
        v2.setVisible(true);
        }
        BD.cerrar_ConexionDñ();
        
    }//GEN-LAST:event_formWindowActivated

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpresaActionPerformed

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        // TODO add your handling code here:
        
        ver.setVisible(false);
        nover.setVisible(true);
        password.setEchoChar((char)0);

    }//GEN-LAST:event_verMousePressed

    private void noverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noverMouseReleased
        // TODO add your handling code here:
        ver.setVisible(true);
        nover.setVisible(false);
        password.setEchoChar('*');
    }//GEN-LAST:event_noverMouseReleased

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VentanaRegistroPrinci().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblPercha;
    private javax.swing.JLabel lblRegistroT;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel nover;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}