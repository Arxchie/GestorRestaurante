package interfaces;

import dao.EstadisticasDAO;
import dao.ProductoDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Producto;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author chemo
 */
public class VtnEstadisticas extends javax.swing.JFrame
{

    /**
     * Creates new form VtnEstadisticas
     */
    public VtnEstadisticas()
    {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        panelEstadisticas = new javax.swing.JPanel();
        masVendido = new javax.swing.JPanel();
        estadisticaStock = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));
        jPanel1.add(masVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 300));
        jPanel1.add(estadisticaStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 900, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton rojo.png"))); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton amarillo.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton verde.png"))); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu1MouseClicked
    {//GEN-HEADEREND:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu2MouseClicked
    {//GEN-HEADEREND:event_jMenu2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        mostrarGraficoDeBarrasEnPanel(panelEstadisticas);
        mostrarGraficoProductosMasVendidos(masVendido);
        mostrarGraficoStockPorProducto(estadisticaStock);
    }//GEN-LAST:event_formWindowOpened

    public void mostrarGraficoStockPorProducto(JPanel panel)
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        EstadisticasDAO estadisticaDao = new EstadisticasDAO();
        List<Object[]> stockPorProducto = estadisticaDao.getStockPorProducto();

        for (Object[] fila : stockPorProducto)
        {
            String nombreProducto = (String) fila[0];
            int cantidadStock = (int) fila[1];

            dataset.addValue(cantidadStock, "Stock", nombreProducto);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Stock por Producto", 
                "Producto", 
                "Cantidad en Stock", 
                dataset 
        );

        chart.setBackgroundPaint(java.awt.Color.BLACK); 
        chart.getPlot().setBackgroundPaint(java.awt.Color.BLACK); 
        chart.getPlot().setOutlinePaint(java.awt.Color.WHITE); 

        chart.getTitle().setPaint(java.awt.Color.WHITE); 
        chart.getCategoryPlot().getDomainAxis().setLabelPaint(java.awt.Color.WHITE); 
        chart.getCategoryPlot().getRangeAxis().setLabelPaint(java.awt.Color.WHITE); 
        chart.getCategoryPlot().getDomainAxis().setTickLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getRangeAxis().setTickLabelPaint(java.awt.Color.WHITE); 

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(panel.getWidth(), panel.getHeight()));
        chartPanel.setSize(panel.getSize());

        panel.removeAll();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(chartPanel, java.awt.BorderLayout.CENTER);
        panel.validate();
        panel.repaint();
    }

    public void mostrarGraficoDeBarrasEnPanel(JPanel panel)
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        EstadisticasDAO estadisticasDAO = new EstadisticasDAO();
        List<Object[]> totales = estadisticasDAO.obtenerTotalesVentasPorProducto();

        for (Object[] fila : totales)
        {
            String nombreProducto = (String) fila[0];
            double totalVentas = (double) fila[1];
            dataset.addValue(totalVentas, "Ventas", nombreProducto);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Total de Ventas por Producto",
                "Producto",
                "Total de Ventas",
                dataset
        );

        chart.setBackgroundPaint(java.awt.Color.BLACK);
        chart.getPlot().setBackgroundPaint(java.awt.Color.BLACK);
        chart.getPlot().setOutlinePaint(java.awt.Color.WHITE);

        chart.getTitle().setPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getDomainAxis().setLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getRangeAxis().setLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getDomainAxis().setTickLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getRangeAxis().setTickLabelPaint(java.awt.Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(panel.getWidth(), panel.getHeight()));
        chartPanel.setSize(panel.getSize());

        panel.removeAll();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(chartPanel, java.awt.BorderLayout.CENTER);
        panel.validate();
        panel.repaint();
    }

    public void mostrarGraficoProductosMasVendidos(JPanel panel)
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        EstadisticasDAO estadisticasDAO = new EstadisticasDAO();
        List<Object[]> productosMasVendidos = estadisticasDAO.getProductosMasVendidos();

        for (Object[] fila : productosMasVendidos)
        {
            Producto producto = (Producto) fila[0];
            int totalVendida = (int) fila[1];

            dataset.addValue(totalVendida, "Productos", producto.getNombre());
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Productos Más Vendidos",
                "Producto",
                "Cantidad Vendida",
                dataset
        );

        chart.setBackgroundPaint(java.awt.Color.BLACK);
        chart.getPlot().setBackgroundPaint(java.awt.Color.BLACK);
        chart.getPlot().setOutlinePaint(java.awt.Color.WHITE);

        chart.getTitle().setPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getDomainAxis().setLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getRangeAxis().setLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getDomainAxis().setTickLabelPaint(java.awt.Color.WHITE);
        chart.getCategoryPlot().getRangeAxis().setTickLabelPaint(java.awt.Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(panel.getWidth(), panel.getHeight()));
        chartPanel.setSize(panel.getSize());

        panel.removeAll();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(chartPanel, java.awt.BorderLayout.CENTER);
        panel.validate();
        panel.repaint();
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
            java.util.logging.Logger.getLogger(VtnEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel estadisticaStock;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel masVendido;
    private javax.swing.JPanel panelEstadisticas;
    // End of variables declaration//GEN-END:variables
}
