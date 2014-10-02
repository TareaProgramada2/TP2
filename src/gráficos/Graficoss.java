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

import gráficos.Email;
import java.io.IOException;
import javax.mail.MessagingException;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.data.general.DefaultPieDataset;








public class Graficoss extends javax.swing.JFrame {

    Email email = new Email();

    public Graficoss() {
        initComponents();
        this.setLocationRelativeTo(this);//Ubica el panel
        this.Pastel.setVisible(false);//Hace visible el panel donde estará el grafico pastel
        this.Barras.setVisible(false);//Hace visible el panel donde estará el grafico de barras

        this.setVisible(true);
    }

    public void correo() throws MessagingException {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        OpcionBarras = new javax.swing.JCheckBox();
        OpcionPastel = new javax.swing.JCheckBox();
        PanelPrinc = new javax.swing.JPanel();
        OpciondeBarras = new javax.swing.JRadioButton();
        OpciondePastel = new javax.swing.JRadioButton();
        BotonGraficar = new javax.swing.JButton();
        capas = new javax.swing.JLayeredPane();
        BarrasDia = new javax.swing.JPanel();
        PastelDia = new javax.swing.JPanel();
        Pastel = new javax.swing.JPanel();
        Barras = new javax.swing.JPanel();
        BarrasHora = new javax.swing.JPanel();
        PastelHora = new javax.swing.JPanel();
        OpcionTipo = new javax.swing.JRadioButton();
        OpcionDia = new javax.swing.JRadioButton();
        OpcionHora = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(0, 153, 102));

        PanelPrinc.setBackground(new java.awt.Color(0, 102, 102));

        OpciondeBarras.setBackground(new java.awt.Color(0, 102, 102));
        OpciondeBarras.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpciondeBarras.setText("Barras");
        OpciondeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondeBarrasActionPerformed(evt);
            }
        });

        OpciondePastel.setBackground(new java.awt.Color(0, 102, 102));
        OpciondePastel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpciondePastel.setText("Pastel");
        OpciondePastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondePastelActionPerformed(evt);
            }
        });

        BotonGraficar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonGraficar.setText("Gráficar Datos");
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
            }
        });

        capas.setBackground(new java.awt.Color(51, 102, 0));

        BarrasDia.setBackground(new java.awt.Color(0, 102, 102));
        BarrasDia.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout BarrasDiaLayout = new javax.swing.GroupLayout(BarrasDia);
        BarrasDia.setLayout(BarrasDiaLayout);
        BarrasDiaLayout.setHorizontalGroup(
            BarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        BarrasDiaLayout.setVerticalGroup(
            BarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        PastelDia.setBackground(new java.awt.Color(0, 102, 102));
        PastelDia.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelDiaLayout = new javax.swing.GroupLayout(PastelDia);
        PastelDia.setLayout(PastelDiaLayout);
        PastelDiaLayout.setHorizontalGroup(
            PastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        PastelDiaLayout.setVerticalGroup(
            PastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        Pastel.setBackground(new java.awt.Color(0, 102, 102));
        Pastel.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelLayout = new javax.swing.GroupLayout(Pastel);
        Pastel.setLayout(PastelLayout);
        PastelLayout.setHorizontalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        PastelLayout.setVerticalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        Barras.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout BarrasLayout = new javax.swing.GroupLayout(Barras);
        Barras.setLayout(BarrasLayout);
        BarrasLayout.setHorizontalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        BarrasLayout.setVerticalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        BarrasHora.setBackground(new java.awt.Color(0, 102, 102));
        BarrasHora.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout BarrasHoraLayout = new javax.swing.GroupLayout(BarrasHora);
        BarrasHora.setLayout(BarrasHoraLayout);
        BarrasHoraLayout.setHorizontalGroup(
            BarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        BarrasHoraLayout.setVerticalGroup(
            BarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        PastelHora.setBackground(new java.awt.Color(0, 102, 102));
        PastelHora.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelHoraLayout = new javax.swing.GroupLayout(PastelHora);
        PastelHora.setLayout(PastelHoraLayout);
        PastelHoraLayout.setHorizontalGroup(
            PastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        PastelHoraLayout.setVerticalGroup(
            PastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(PastelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Pastel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasHora, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PastelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addComponent(Barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(BarrasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 39, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(PastelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 39, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(Pastel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(BarrasHora, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(PastelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 38, Short.MAX_VALUE)))
        );
        capas.setLayer(BarrasDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(PastelDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(Pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(Barras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(BarrasHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(PastelHora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        OpcionTipo.setBackground(new java.awt.Color(0, 102, 102));
        OpcionTipo.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpcionTipo.setText("Tipo de cliente");
        OpcionTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionTipoActionPerformed(evt);
            }
        });

        OpcionDia.setBackground(new java.awt.Color(0, 102, 102));
        OpcionDia.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpcionDia.setText("Día");

        OpcionHora.setBackground(new java.awt.Color(0, 102, 102));
        OpcionHora.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpcionHora.setText("Hora");
        OpcionHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionHoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel1.setText("Gráfico");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel2.setText("Tipo de gráfico");

        javax.swing.GroupLayout PanelPrincLayout = new javax.swing.GroupLayout(PanelPrinc);
        PanelPrinc.setLayout(PanelPrincLayout);
        PanelPrincLayout.setHorizontalGroup(
            PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OpcionTipo)
                        .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelPrincLayout.createSequentialGroup()
                            .addComponent(OpcionHora)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(OpcionDia)))
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addComponent(OpciondeBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpciondePastel)))
                .addGap(78, 78, 78)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelPrincLayout.setVerticalGroup(
            PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincLayout.createSequentialGroup()
                .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpcionTipo)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpcionHora)
                            .addComponent(OpcionDia))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpciondeBarras)
                            .addComponent(OpciondePastel))
                        .addGap(39, 39, 39)
                        .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (OpcionTipo.isSelected()){
            if (OpciondeBarras.isSelected()) {
                //GRAFICO DE BARRAS
                DefaultCategoryDataset data = new DefaultCategoryDataset();

                String producto1 = "Persona con discapacidad";
                String producto2 = "Adulto mayor";
                String producto3 = "Mujer embarazada";
                String producto4 = "Cliente corporativo";
                String producto5 = "Cliente regular";

                String dia1 = "Tipo";

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

                chart = ChartFactory.createBarChart("Gráfico de barras", "Tipo", "Cantidad", data, PlotOrientation.HORIZONTAL, true, true, true);
                CategoryPlot plot = (CategoryPlot) chart.getPlot();
                plot.setDomainGridlinesVisible(false);
            }

        
        else {
                if (OpciondePastel.isSelected()) {
                    //GRAFICO DE PASTEL  
                    DefaultPieDataset data = new DefaultPieDataset();
                    data.setValue("Persona con discapacidad", 30);
                    data.setValue("Adulto mayor", 10);
                    data.setValue("Mujer embarazada", 20);
                    data.setValue("Cliente corporativo", 15);
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
        }
        else{
            if(OpcionHora.isSelected()){
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

                    chart=ChartFactory.createBarChart("Gráfico de barras", "Hora", "lalalala", data, PlotOrientation.HORIZONTAL, true, true, true);
                    CategoryPlot plot = (CategoryPlot) chart.getPlot();
                    plot.setDomainGridlinesVisible(false);





                }
                else{
                    if (OpciondePastel.isSelected()){
                            //GRAFICO DE PASTEL  

                        DefaultPieDataset data =new DefaultPieDataset();
                        data.setValue("Persona con discapacidad", 30);
                        data.setValue("Adulto mayor", 10);
                        data.setValue("Mujer embarazada", 20);
                        data.setValue("Cliente corporativo",15 );
                        data.setValue("Cliente regular", 25);

                        chart = ChartFactory.createPieChart3D("Grafico Hora", data, true, true, false);




                    }
                }    
                panel = new ChartPanel(chart);
                panel.setBounds(5, 10, 410, 350);
                if(OpciondePastel.isSelected()){
                        PastelHora.add(panel);
                        PastelHora.repaint();


                }
                else{
                    if(OpciondeBarras.isSelected()){
                        BarrasHora.add(panel);
                        BarrasHora.repaint();

                    }
                }




            }
            else{
                if(OpcionDia.isSelected()){
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

                        chart=ChartFactory.createBarChart("Gráfico de barras", "Dia", "lalalala", data, PlotOrientation.HORIZONTAL, true, true, true);
                        CategoryPlot plot = (CategoryPlot) chart.getPlot();
                        plot.setDomainGridlinesVisible(false);





                    }
                    else{
                        if (OpciondePastel.isSelected()){
                                //GRAFICO DE PASTEL  

                            DefaultPieDataset data =new DefaultPieDataset();
                            data.setValue("Persona con discapacidad", 30);
                            data.setValue("Adulto mayor", 10);
                            data.setValue("Mujer embarazada", 20);
                            data.setValue("Cliente corporativo",15 );
                            data.setValue("Cliente regular", 25);

                            chart = ChartFactory.createPieChart3D("Grafico Dia", data, true, true, false);




                        }
                    }
                    panel = new ChartPanel(chart);
                    panel.setBounds(5, 10, 410, 350);






                    if(OpciondePastel.isSelected()){
                            PastelDia.add(panel);
                            PastelDia.repaint();


                    }
                    else{
                        if(OpciondeBarras.isSelected()){
                            BarrasDia.add(panel);
                            BarrasDia.repaint();

                        }
                    }
                    
                    
                }
                
            }
        }

    }//GEN-LAST:event_BotonGraficarActionPerformed

    private void OpcionBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionBarrasActionPerformed


    }//GEN-LAST:event_OpcionBarrasActionPerformed

    private void OpciondeBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpciondeBarrasActionPerformed

        if (OpcionHora.isSelected()){
            BarrasHora.setVisible(true);
        }
        else{
            if (OpcionDia.isSelected()){
                BarrasDia.setVisible(true);
            }
            else{
                Barras.setVisible(true);
            }
       
       
        }
       OpciondePastel.setSelected(false);
       
        

        



    }//GEN-LAST:event_OpciondeBarrasActionPerformed

    private void OpciondePastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpciondePastelActionPerformed

        if (OpcionHora.isSelected()){
            PastelHora.setVisible(true);
        }
        else{
            if (OpcionDia.isSelected()){
                PastelDia.setVisible(true);
            }
            else{
                Pastel.setVisible(true);
            }
        }
   
        OpciondeBarras.setSelected(false);

    }//GEN-LAST:event_OpciondePastelActionPerformed

    private void OpcionTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionTipoActionPerformed
        
       
        
    }//GEN-LAST:event_OpcionTipoActionPerformed

    private void OpcionHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionHoraActionPerformed

    public static void main(String args[]) throws MessagingException, IOException {

    
        baseDeDatos a = new baseDeDatos();
        a.leerFicheros();
        a.listaDeDatos();
        a.imprimirDatos();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficoss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barras;
    private javax.swing.JPanel BarrasDia;
    private javax.swing.JPanel BarrasHora;
    private javax.swing.JButton BotonGraficar;
    private javax.swing.JCheckBox OpcionBarras;
    private javax.swing.JRadioButton OpcionDia;
    private javax.swing.JRadioButton OpcionHora;
    private javax.swing.JCheckBox OpcionPastel;
    private javax.swing.JRadioButton OpcionTipo;
    private javax.swing.JRadioButton OpciondeBarras;
    private javax.swing.JRadioButton OpciondePastel;
    private javax.swing.JPanel PanelPrinc;
    private javax.swing.JPanel Pastel;
    private javax.swing.JPanel PastelDia;
    private javax.swing.JPanel PastelHora;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
//eklderfdlosdisjdsdsjcdsjfskjd
