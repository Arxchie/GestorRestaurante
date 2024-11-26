/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import java.awt.Component;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class PanelDetalle extends javax.swing.JPanel
{

    /**
     * Creates new form detalle
     */
    public PanelDetalle(String nombre, String precioUnitario)
    {

        initComponents();
        jtfPrecioU.setText(precioUnitario);
        lblNombreProducto.setText(nombre);
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

        lblNombreProducto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jtfPrecioU = new javax.swing.JTextField();
        jtfSubtotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(234, 236, 238));
        setMaximumSize(new java.awt.Dimension(800, 110));
        setMinimumSize(new java.awt.Dimension(800, 110));
        setPreferredSize(new java.awt.Dimension(500, 110));

        lblNombreProducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNombreProducto.setText("NombreProducto");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Precio Unitario");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Subtotal");

        jtfCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfCantidad.setText("1");
        jtfCantidad.setToolTipText("");
        jtfCantidad.setPreferredSize(new java.awt.Dimension(70, 25));
        jtfCantidad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfCantidadActionPerformed(evt);
            }
        });

        jtfPrecioU.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfPrecioU.setFocusable(false);
        jtfPrecioU.setPreferredSize(new java.awt.Dimension(70, 25));
        jtfPrecioU.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfPrecioUActionPerformed(evt);
            }
        });

        jtfSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfSubtotal.setFocusable(false);
        jtfSubtotal.setPreferredSize(new java.awt.Dimension(70, 25));

        btnEliminar.setText("jButton1");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(130, 130, 130)
                        .addComponent(jtfPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(130, 130, 130)
                        .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNombreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(132, 132, 132)
                            .addComponent(jLabel3)
                            .addGap(102, 102, 102)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(111, 111, 111)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNombreProducto)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPrecioUActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfPrecioUActionPerformed
    {//GEN-HEADEREND:event_jtfPrecioUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioUActionPerformed

    public JButton getBtnEliminar()
    {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar)
    {
        this.btnEliminar = btnEliminar;
    }

    private void jtfCantidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfCantidadActionPerformed
    {//GEN-HEADEREND:event_jtfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantidadActionPerformed

    public JTextField getJtfCantidad()
    {
        return jtfCantidad;
    }

    public void setJtfCantidad(JTextField jtfCantidad)
    {
        this.jtfCantidad = jtfCantidad;
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed

        Container parent = getParent();
        if (parent != null)
        {
            int index = parent.getComponentZOrder(this);
            parent.remove(this); // Eliminar este panel del contenedor
            // Si hay un componente siguiente (el espacio), eliminarlo también
            if (index < parent.getComponentCount())
            {
                Component siguiente = parent.getComponent(index);
                if (siguiente instanceof Box.Filler)
                { // Verifica que sea el espacio creado con Box.createRigidArea
                    parent.remove(siguiente);
                }
            }
            parent.revalidate(); // Recalcular el layout
            parent.repaint();    // Redibujar el contenedor
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    public JTextField getJtfSubtotal()
    {
        return jtfSubtotal;
    }

    public void setJtfSubtotal(JTextField jtfSubtotal)
    {
        this.jtfSubtotal = jtfSubtotal;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfPrecioU;
    private javax.swing.JTextField jtfSubtotal;
    private javax.swing.JLabel lblNombreProducto;
    // End of variables declaration//GEN-END:variables
}
