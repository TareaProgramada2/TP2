
package gráficos;

import java.util.Locale;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import org.jfree.chart.plot.CategoryPlot;

import org.jfree.data.general.DefaultPieDataset;







public class Graficoss extends javax.swing.JFrame {

    
    public Graficoss() {
        initComponents();
        this.setLocationRelativeTo(this);//Ubica el panel
        this.Pastel.setVisible(false);//Hace visible el panel donde estará el grafico pastel
        this.Barras.setVisible(false);//Hace visible el panel donde estará el grafico de barras
        
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        OpcionBarras = new javax.swing.JCheckBox();
        OpcionPastel = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        BotonGraficar = new javax.swing.JButton();
        OpciondeBarras = new javax.swing.JRadioButton();
        OpciondePastel = new javax.swing.JRadioButton();
        capas = new javax.swing.JLayeredPane();
        Pastel = new javax.swing.JPanel();
        Barras = new javax.swing.JPanel();

        jCheckBox2.setText("Barras");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        OpcionBarras.setText("Barras");
        OpcionBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionBarrasActionPerformed(evt);
            }
        });

        OpcionPastel.setText("Pastel");
        OpcionPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionPastelActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de Gráfico");

        BotonGraficar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonGraficar.setText("Gráficar Datos");
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
            }
        });

        OpciondeBarras.setText("Barras");
        OpciondeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondeBarrasActionPerformed(evt);
            }
        });

        OpciondePastel.setText("Pastel");
        OpciondePastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondePastelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PastelLayout = new javax.swing.GroupLayout(Pastel);
        Pastel.setLayout(PastelLayout);
        PastelLayout.setHorizontalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        PastelLayout.setVerticalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarrasLayout = new javax.swing.GroupLayout(Barras);
        Barras.setLayout(BarrasLayout);
        BarrasLayout.setHorizontalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        BarrasLayout.setVerticalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Pastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                .addComponent(Barras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                    .addComponent(Pastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capas.setLayer(Pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(Barras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BotonGraficar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(OpciondeBarras)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OpciondePastel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(149, 149, 149)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpciondeBarras)
                    .addComponent(OpciondePastel))
                .addGap(33, 33, 33)
                .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capas)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void OpcionPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionPastelActionPerformed
       
    }//GEN-LAST:event_OpcionPastelActionPerformed

    private void BotonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficarActionPerformed
        ChartPanel panel;
        JFreeChart chart=null;
        
        
        if (OpciondeBarras.isSelected()){
            //GRAFICO DE BARRAS
            DefaultCategoryDataset data=new DefaultCategoryDataset();
            
            
            String producto1 = "Persona con discapacidad";
            String producto2="Adulto mayor";
            String producto3="Mujer embarazada";
            String producto4="Cliente corporativo";
            String producto5="Cliente regular";
                   
            
            String dia1="Tipo";
            
            
            data.addValue(18, producto1, dia1);
            data.addValue(10, producto1, dia1);
            data.addValue(6, producto1, dia1);
            data.addValue(1, producto1, dia1);
            
            data.addValue(7, producto2, dia1);
            data.addValue(8, producto2, dia1);
            data.addValue(18, producto2, dia1);
            data.addValue(2, producto2, dia1);
            
            data.addValue(2, producto3, dia1);
            data.addValue(8, producto3, dia1);
            data.addValue(1, producto3, dia1);
            data.addValue(5, producto3, dia1);
            
            data.addValue(7, producto4, dia1);
            data.addValue(8, producto4, dia1);
            data.addValue(18, producto4, dia1);
            data.addValue(2, producto4, dia1);
            
            data.addValue(7, producto5, dia1);
            data.addValue(3, producto5, dia1);
            data.addValue(8, producto5, dia1);
            data.addValue(12, producto5, dia1);
            
            chart=ChartFactory.createBarChart("Gráfico de barras", "Tipo", "Cantidad", data, PlotOrientation.HORIZONTAL, true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setDomainGridlinesVisible(false);
            
                          

          
                    
        }else{
            if (OpciondePastel.isSelected()){
                    //GRAFICO DE PASTEL  

                DefaultPieDataset data =new DefaultPieDataset();
                data.setValue("Persona con discapacidad", 30);
                data.setValue("Adulto mayor", 10);
                data.setValue("Mujer embarazada", 20);
                data.setValue("Cliente corporativo",15 );
                data.setValue("Cliente regular", 25);

                chart = ChartFactory.createPieChart3D("Grafico", data, true, true, false);
                
                
               

                }
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5, 10, 410, 350);
        
        
        
            
        
    
        if(OpciondePastel.isSelected()){
                Pastel.add(panel);
                Pastel.repaint();
       

        }
        else{
            if(OpciondeBarras.isSelected()){
                Barras.add(panel);
                Barras.repaint();

            }
        }
        
    }//GEN-LAST:event_BotonGraficarActionPerformed

    private void OpcionBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionBarrasActionPerformed
   
       
       
    }//GEN-LAST:event_OpcionBarrasActionPerformed

    private void OpciondeBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpciondeBarrasActionPerformed
       Barras.setVisible(true);
       
       OpciondePastel.setSelected(false);
       
       
    }//GEN-LAST:event_OpciondeBarrasActionPerformed

    private void OpciondePastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpciondePastelActionPerformed
        Pastel.setVisible(true);
        
        OpciondeBarras.setSelected(false);
        
    }//GEN-LAST:event_OpciondePastelActionPerformed

   public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficoss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barras;
    private javax.swing.JButton BotonGraficar;
    private javax.swing.JCheckBox OpcionBarras;
    private javax.swing.JCheckBox OpcionPastel;
    private javax.swing.JRadioButton OpciondeBarras;
    private javax.swing.JRadioButton OpciondePastel;
    private javax.swing.JPanel Pastel;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
