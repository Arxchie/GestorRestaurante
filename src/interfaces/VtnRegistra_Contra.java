/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.ValidarDatos;
import controlador.controladorLogin;
import dao.LoginDAO;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import seguridad.Seguridad;

/**
 *
 * @author chemo
 */
public class VtnRegistra_Contra extends javax.swing.JFrame
{

    /**
     * Creates new form Login
     */
    public VtnRegistra_Contra()
    {
        initComponents();
        CtrlInterfaz.habilita(false, btnAceptar1);
        lblNoCoinciden.setVisible(false);
        setIconImage(getIconImage());

    }

    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAceptar1 = new javax.swing.JButton();
        jpfConfirmar = new javax.swing.JPasswordField();
        jpfContrasenia = new javax.swing.JPasswordField();
        jchMostrarContra = new javax.swing.JCheckBox();
        lblNoCoinciden = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(207, 181, 59));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 150, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIRMAR CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton rojo.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton amarillo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton verde.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        btnAceptar1.setBackground(new java.awt.Color(207, 181, 59));
        btnAceptar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar1.setText("ACEPTAR");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 150, 40));

        jpfConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpfConfirmar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jpfConfirmarActionPerformed(evt);
            }
        });
        jpfConfirmar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jpfConfirmarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jpfConfirmarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jpfConfirmarKeyTyped(evt);
            }
        });
        jPanel1.add(jpfConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 310, 30));

        jpfContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpfContrasenia.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jpfContraseniaActionPerformed(evt);
            }
        });
        jpfContrasenia.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jpfContraseniaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jpfContraseniaKeyReleased(evt);
            }
        });
        jPanel1.add(jpfContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, 30));

        jchMostrarContra.setForeground(new java.awt.Color(255, 255, 255));
        jchMostrarContra.setText("Mostrar Contraseña");
        jchMostrarContra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jchMostrarContraActionPerformed(evt);
            }
        });
        jPanel1.add(jchMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, -1));

        lblNoCoinciden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNoCoinciden.setForeground(new java.awt.Color(255, 102, 102));
        lblNoCoinciden.setText("Las contraseñas no coinciden");
        lblNoCoinciden.setToolTipText("");
        lblNoCoinciden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblNoCoinciden, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        volverA(controladorLogin.vtnLogin);
        jpfConfirmar.setText("");
        jpfContrasenia.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void volverA(JFrame ventana)
    {
        this.setVisible(false);
        ventana.setVisible(true);
    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptar1ActionPerformed
    {//GEN-HEADEREND:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        if (ValidarDatos.validarPassword(new String(jpfContrasenia.getPassword())))
        {
            if (verificarCoincidencia(jpfContrasenia, jpfConfirmar))
            {
                String hasContra = Seguridad.generarHash(new String(jpfContrasenia.getPassword()));
                LoginDAO.guardarUsuarioEnBD("Admin", hasContra);
                Mensajes.exito(this, "Contraseña guardada con éxito");
                CtrlInterfaz.limpia(jpfConfirmar);
                CtrlInterfaz.limpia(jpfContrasenia);
                controladorLogin.login = LoginDAO.cargarUsuarioPorNombre("Admin");
                this.dispose();
                controladorLogin.vtnContra.setVisible(true);

            } else
            {
                Mensajes.error(this, "Las contraseñas no coinciden");
            }

        } else
        {
            Mensajes.error(this, "La contrasenia debe tener al menos:\n8 caracteres \n1 Minuscula \n1 Mayuscula \n1 Caracter Especial");
        }


    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void jpfConfirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jpfConfirmarActionPerformed
    {//GEN-HEADEREND:event_jpfConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfConfirmarActionPerformed

    private void jpfContraseniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jpfContraseniaActionPerformed
    {//GEN-HEADEREND:event_jpfContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfContraseniaActionPerformed
    private void contraseniasCoinciden(boolean coinciden)
    {
        if (!coinciden)
        {
            lblNoCoinciden.setVisible(true);
        }
    }
    private void jchMostrarContraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jchMostrarContraActionPerformed
    {//GEN-HEADEREND:event_jchMostrarContraActionPerformed
        // TODO add your handling code here:
        if (jchMostrarContra.isSelected())
        {
            jpfContrasenia.setEchoChar((char) 0);
            jpfConfirmar.setEchoChar((char) 0);
        } else
        {
            jpfContrasenia.setEchoChar('*');
            jpfConfirmar.setEchoChar('*');
        }
    }//GEN-LAST:event_jchMostrarContraActionPerformed

    private void jpfConfirmarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jpfConfirmarKeyTyped
    {//GEN-HEADEREND:event_jpfConfirmarKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jpfConfirmarKeyTyped

    private void jpfContraseniaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jpfContraseniaKeyReleased
    {//GEN-HEADEREND:event_jpfContraseniaKeyReleased
        // TODO add your handling code here:
        mostrarVerificacionCoincidencia();
    }//GEN-LAST:event_jpfContraseniaKeyReleased

    private void jpfConfirmarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jpfConfirmarKeyReleased
    {//GEN-HEADEREND:event_jpfConfirmarKeyReleased
        // TODO add your handling code here:
        mostrarVerificacionCoincidencia();


    }//GEN-LAST:event_jpfConfirmarKeyReleased

    private void jpfContraseniaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jpfContraseniaKeyPressed
    {//GEN-HEADEREND:event_jpfContraseniaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            CtrlInterfaz.cambia(jpfConfirmar);
        }
    }//GEN-LAST:event_jpfContraseniaKeyPressed

    private void jpfConfirmarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jpfConfirmarKeyPressed
    {//GEN-HEADEREND:event_jpfConfirmarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            CtrlInterfaz.cambia(jpfContrasenia);
        }
    }//GEN-LAST:event_jpfConfirmarKeyPressed
    private void mostrarVerificacionCoincidencia()
    {
        if (verificarCoincidencia(jpfContrasenia, jpfConfirmar))
        {
            CtrlInterfaz.habilita(true, btnAceptar1);
        } else
        {
            CtrlInterfaz.habilita(false, btnAceptar1);
        }
        if (verificarCoincidencia(jpfContrasenia, jpfConfirmar) || jpfConfirmar.getPassword().length == 0 || jpfContrasenia.getPassword().length == 0)
        {

            lblNoCoinciden.setVisible(false);

        } else
        {
            lblNoCoinciden.setVisible(true);

        }
    }

    private boolean verificarCoincidencia(JPasswordField p1, JPasswordField p2)
    {
        String contra = new String(p1.getPassword());
        String confirmacion = new String(p2.getPassword());
        return (!confirmacion.isEmpty() && !contra.isEmpty()) && contra.equals(confirmacion);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistra_Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistra_Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistra_Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistra_Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnRegistra_Contra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jchMostrarContra;
    private javax.swing.JPasswordField jpfConfirmar;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JLabel lblNoCoinciden;
    // End of variables declaration//GEN-END:variables
}
