/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import cjb.ci.CtrlInterfaz;
import controlador.controladorLogin;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author chemo
 */
public class VtnContraseña extends javax.swing.JFrame
{

    /**
     * Creates new form Login
     */
    public VtnContraseña()
    {
        initComponents();
        setIconImage(getIconImage());
    }

    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.png"));
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

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpfContrasenia = new javax.swing.JPasswordField();
        jchMostrarContra = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Esencia y Sazón");
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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 20));

        jpfContrasenia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jpfContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 330, 30));

        jchMostrarContra.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jchMostrarContra.setForeground(new java.awt.Color(255, 255, 255));
        jchMostrarContra.setText("Mostrar Contraseña");
        jchMostrarContra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jchMostrarContraActionPerformed(evt);
            }
        });
        jPanel1.add(jchMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, -1));

        btnAceptar.setBackground(new java.awt.Color(207, 181, 59));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton rojo.png"))); // NOI18N
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton amarillo.png"))); // NOI18N
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton verde.png"))); // NOI18N
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        controladorLogin.vtnLogin.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jchMostrarContraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jchMostrarContraActionPerformed
    {//GEN-HEADEREND:event_jchMostrarContraActionPerformed
        // TODO add your handling code here:
        if (jchMostrarContra.isSelected())
        {
            jpfContrasenia.setEchoChar((char) 0);
        } else
        {
            jpfContrasenia.setEchoChar('*');
        }
    }//GEN-LAST:event_jchMostrarContraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed

        String hasContra = seguridad.Seguridad.generarHash(new String(jpfContrasenia.getPassword()));
        if (controladorLogin.login.iniciarSesion(hasContra))
        {   
            dispose();
            new VtnOpccionesAdmin().setVisible(true);
            CtrlInterfaz.limpia(jpfContrasenia);
            System.out.println("inicado");
        } else
        {
            System.out.println("Contraseña Erronea");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu1MouseClicked
    {//GEN-HEADEREND:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu2MouseClicked
    {//GEN-HEADEREND:event_jMenu2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMenu2MouseClicked

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

        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
        {
            if ("Nimbus".equals(info.getName()))
            {
                try
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(VtnContraseña.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex)
                {
                    Logger.getLogger(VtnContraseña.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex)
                {
                    Logger.getLogger(VtnContraseña.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex)
                {
                    Logger.getLogger(VtnContraseña.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnContraseña().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jchMostrarContra;
    private javax.swing.JPasswordField jpfContrasenia;
    // End of variables declaration//GEN-END:variables
}
