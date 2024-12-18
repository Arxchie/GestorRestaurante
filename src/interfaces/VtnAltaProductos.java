/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import dao.ProductoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import modelo.Producto;

/**
 *
 * @author chemo
 */
public class VtnAltaProductos extends javax.swing.JFrame
{

    /**
     * Creates new form VtnAltaProductos
     */
    public VtnAltaProductos()
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        medida = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        brbr = new javax.swing.JScrollPane();
        descripccion = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant Esencia y Sazón");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alta Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        categoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Platos Fuertes", "Comida Rapida", "Bebidas", "Postres", "Desayunos" }));
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 165, 210, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Costo:");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        precio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 40));

        costo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descripccion:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 40));

        cantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 220, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Unidad de Medida:");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 40));

        medida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Kilogramos", "Litros" }));
        jPanel1.add(medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 110, -1));

        jButton1.setBackground(new java.awt.Color(207, 181, 59));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 140, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCELAR");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 140, 30));

        descripccion.setColumns(20);
        descripccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        descripccion.setRows(5);
        brbr.setViewportView(descripccion);

        jPanel1.add(brbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 650));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        String nombreProducto = nombre.getText();
        String categoriaSeleccionada = (String) categoria.getSelectedItem();
        String descripcionProducto = descripccion.getText();
        String unidadDeMedidaSeleccionada = (String) medida.getSelectedItem();

        float costoProducto;
        float precioProducto;
        int cantidadProducto;
        try
        {
            costoProducto = Float.parseFloat(costo.getText());
            precioProducto = Float.parseFloat(precio.getText());
            cantidadProducto = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e)
        {
            Mensaje.error(this, "Los valores de costo, precio y cantidad deben ser numéricos.");
            CtrlInterfaz.limpia(costo, precio, cantidad);
            return; 
        }

        ProductoDAO productoDAO = new ProductoDAO();

        if (productoDAO.existeNombreProducto(nombreProducto))
        {
            Mensaje.error(this, "El producto con el nombre ingresado ya existe. Por favor, ingrese un nombre diferente.");
            CtrlInterfaz.limpia(nombre);
            return; 
        }

        modelo.Producto nuevoProducto = new Producto(nombreProducto, categoriaSeleccionada, costoProducto, precioProducto, descripcionProducto, cantidadProducto, unidadDeMedidaSeleccionada);
        productoDAO.agregarProducto(nuevoProducto);

        Mensaje.exito(this, "Producto agregado con éxito.");

        CtrlInterfaz.limpia(nombre, categoria, costo, precio, descripccion, cantidad, medida);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        CtrlInterfaz.limpia(nombre, categoria, costo, precio, descripccion, cantidad, medida);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VtnAltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnAltaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane brbr;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField costo;
    private javax.swing.JTextArea descripccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> medida;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
