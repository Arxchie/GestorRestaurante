/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import cjb.ci.CtrlInterfaz;
import dao.ProductoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author chemo
 */
public class VtnOpccionesAdmin extends javax.swing.JFrame
{

    public VtnOpccionesAdmin()
    {
        initComponents();

        jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener()
        {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e)
            {
                filtrarProductos();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e)
            {
                filtrarProductos();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e)
            {
                filtrarProductos();
            }
        });
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
    //"unchecked"
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        fefesw = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        actNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        actCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        actPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        actDescripccion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        actCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        actMedida = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        actCosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant Esencia y Sazón");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fefesw.setBackground(new java.awt.Color(0, 0, 0));
        fefesw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR");
        fefesw.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });
        fefesw.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 630, -1));

        tablaProductos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Codigo", "Nombre", "Categoria", "Costo", "Precio", "Descripccion ", "Stock", "U. Medida"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        fefesw.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 380));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        fefesw.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, -1, -1));

        actNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fefesw.add(actNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 230, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria:");
        fefesw.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        actCategoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Platos Fuertes", "Comida Rapida", "Bebidas", "Postres", "Desayunos" }));
        fefesw.add(actCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 210, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODIFICAR");
        fefesw.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Costo:");
        fefesw.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 70, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:");
        fefesw.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, -1, -1));

        actPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fefesw.add(actPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 90, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripccion:");
        fefesw.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        actDescripccion.setColumns(20);
        actDescripccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actDescripccion.setRows(5);
        jScrollPane2.setViewportView(actDescripccion);

        fefesw.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 320, 90));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad:");
        fefesw.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        actCantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actCantidad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                actCantidadActionPerformed(evt);
            }
        });
        fefesw.add(actCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 220, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unidad de Medida:");
        fefesw.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, -1));

        actMedida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Kilogramos", "Litros" }));
        fefesw.add(actMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 120, -1));

        jButton1.setBackground(new java.awt.Color(207, 181, 59));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        fefesw.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 130, -1));

        actCosto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fefesw.add(actCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel11MouseClicked(evt);
            }
        });
        fefesw.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bote-de-basura.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel12MouseClicked(evt);
            }
        });
        fefesw.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        fefesw.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 130, -1));

        getContentPane().add(fefesw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 480));

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

        jMenu6.setText("Estadisticas");
        jMenu6.setActionCommand("Es");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu4.setText("Empleados");

        jMenu7.setText("Dar Alta");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu7);

        jMenu9.setText("Mostrar Empleados");
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu1MouseClicked
    {//GEN-HEADEREND:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu2MouseClicked
    {//GEN-HEADEREND:event_jMenu2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        llenarTablaProductos();
    }//GEN-LAST:event_formWindowOpened

    private void actCantidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_actCantidadActionPerformed
    {//GEN-HEADEREND:event_actCantidadActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_actCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        int filaSeleccionada = tablaProductos.getSelectedRow();
        if (filaSeleccionada == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
        long codigo = (long) modeloTabla.getValueAt(filaSeleccionada, 0);

        String nuevoNombre = actNombre.getText();
        String nuevaCategoria = (String) actCategoria.getSelectedItem();
        float nuevoCosto = Float.parseFloat(actCosto.getText());
        float nuevoPrecio = Float.parseFloat(actPrecio.getText());
        String nuevaDescripcion = actDescripccion.getText();
        int nuevoStock = Integer.parseInt(actCantidad.getText());
        String nuevaUnidadMedida = (String) actMedida.getSelectedItem();

        ProductoDAO productoDAO = new ProductoDAO();
        Producto productoActualizado = new Producto();
        productoActualizado.setCodigo(codigo);
        productoActualizado.setNombre(nuevoNombre);
        productoActualizado.setCategoria(nuevaCategoria);
        productoActualizado.setCostoCompra(nuevoCosto);
        productoActualizado.setPrecioVenta(nuevoPrecio);
        productoActualizado.setDescripcion(nuevaDescripcion);
        productoActualizado.setCantidadStock(nuevoStock);
        productoActualizado.setUnidadDeMedida(nuevaUnidadMedida);

        boolean exito = productoDAO.modificarProducto(productoActualizado);

        if (exito)
        {
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            llenarTablaProductos();
        } else
        {
            JOptionPane.showMessageDialog(this, "Error al actualizar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tablaProductosMouseClicked
    {//GEN-HEADEREND:event_tablaProductosMouseClicked
        int filaSeleccionada = tablaProductos.getSelectedRow();
        if (filaSeleccionada != -1)
        {
            DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();

            long codigo = (long) modeloTabla.getValueAt(filaSeleccionada, 0);
            String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
            String categoria = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
            float costo = (float) modeloTabla.getValueAt(filaSeleccionada, 3);
            float precio = (float) modeloTabla.getValueAt(filaSeleccionada, 4);
            String descripcion = (String) modeloTabla.getValueAt(filaSeleccionada, 5);
            int stock = (int) modeloTabla.getValueAt(filaSeleccionada, 6);
            String unidadMedida = (String) modeloTabla.getValueAt(filaSeleccionada, 7);

            actNombre.setText(nombre);
            actCategoria.setSelectedItem(categoria);
            actCosto.setText(String.valueOf(costo));
            actPrecio.setText(String.valueOf(precio));
            actDescripccion.setText(descripcion);
            actCantidad.setText(String.valueOf(stock));
            actMedida.setSelectedItem(unidadMedida);
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel12MouseClicked
    {//GEN-HEADEREND:event_jLabel12MouseClicked
        int filaSeleccionada = tablaProductos.getSelectedRow();

        if (filaSeleccionada == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de que desea eliminar el producto seleccionado?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmacion == JOptionPane.YES_OPTION)
            {
                DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
                long codigoProducto = (long) modeloTabla.getValueAt(filaSeleccionada, 0);

                ProductoDAO productoDAO = new ProductoDAO();
                productoDAO.eliminarProducto(codigoProducto);

                llenarTablaProductos();
                JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel11MouseClicked
    {//GEN-HEADEREND:event_jLabel11MouseClicked
        new VtnAltaProductos().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        CtrlInterfaz.limpia(actCantidad, actCategoria, actCosto, actDescripccion, actMedida, actNombre, actPrecio);
        llenarTablaProductos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu5MouseClicked
    {//GEN-HEADEREND:event_jMenu5MouseClicked
        dispose();
        dispose();
        new VtnLogin().setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu6MouseClicked
    {//GEN-HEADEREND:event_jMenu6MouseClicked
        new VtnEstadisticas().setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu7MouseClicked
    {//GEN-HEADEREND:event_jMenu7MouseClicked
        new VtnAltaEmpleados().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu9MouseClicked
    {//GEN-HEADEREND:event_jMenu9MouseClicked
         //new VtnMostrarEmpleados().setVisible(true);
         new VtnMostrarEmpleados().setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

    public void filtrarProductos()
    {
        String textoBusqueda = jTextField1.getText().trim().toLowerCase();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();

        modeloTabla.setRowCount(0);

        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> productos = productoDAO.obtenerTodosLosProductos();

        for (Producto producto : productos)
        {
            if (producto.getNombre().toLowerCase().contains(textoBusqueda))
            {
                Object[] fila =
                {
                    producto.getCodigo(),
                    producto.getNombre(),
                    producto.getCategoria(),
                    producto.getCostoCompra(),
                    producto.getPrecioVenta(),
                    producto.getDescripcion(),
                    producto.getCantidadStock(),
                    producto.getUnidadDeMedida()
                };
                modeloTabla.addRow(fila);
            }
        }
    }

    public void llenarTablaProductos()
    {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();

        modeloTabla.setRowCount(0);

        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> productos = productoDAO.obtenerTodosLosProductos();

        for (Producto producto : productos)
        {
            Object[] fila =
            {
                producto.getCodigo(),
                producto.getNombre(),
                producto.getCategoria(),
                producto.getCostoCompra(),
                producto.getPrecioVenta(),
                producto.getDescripcion(),
                producto.getCantidadStock(),
                producto.getUnidadDeMedida()
            };
            modeloTabla.addRow(fila);
        }
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
            java.util.logging.Logger.getLogger(VtnOpccionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnOpccionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnOpccionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnOpccionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnOpccionesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actCantidad;
    private javax.swing.JComboBox<String> actCategoria;
    private javax.swing.JTextField actCosto;
    private javax.swing.JTextArea actDescripccion;
    private javax.swing.JComboBox<String> actMedida;
    private javax.swing.JTextField actNombre;
    private javax.swing.JTextField actPrecio;
    private javax.swing.JPanel fefesw;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
