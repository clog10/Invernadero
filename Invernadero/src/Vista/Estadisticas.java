package Vista;

import Modelo.Venta;
import Modelo.puntoVentaDB;
import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * 
 * @author AMAURY
 */
public class Estadisticas extends javax.swing.JInternalFrame {
   
    private puntoVentaDB punto;

    /**
     * Creates new form Estadisticas
     */
   
    public Estadisticas() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#F0EFE8"));
        graph();
       punto=new puntoVentaDB();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(240, 239, 232));
        setTitle("Estadisticas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    public void graph() {
        
//        List<Venta> ventas= punto.listVentas();
  //       double total=0;
    //    for(Venta c:ventas){
      //      total+=c.getTotal();
        //}
        
        
        
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("carlos ", 90.0);
        data.setValue(" loaeza", 20.0);
        data.setValue("Ramos ", 30.0);
        data.setValue("Lo´pez ",10.0);
        


        JFreeChart chart = ChartFactory.createPieChart(
                "Los Mejores Clientes",
                data,
                true, // legend?
                true, // tooltips?
                false // URLs?
        );
// create and display a frame...
        ChartFrame frame = new ChartFrame("Invernadero Gran Valle, Estadisticas", chart);
        frame.pack();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
