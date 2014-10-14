package gráficos;

import gráficos.Email;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.*;







public class Graficoss extends javax.swing.JFrame {

    Email email = new Email();

    public Graficoss() {
        initComponents();
        this.setLocationRelativeTo(this);//Ubica el panel
        this.Pastel.setVisible(false);//Hace visible el panel donde estará el grafico pastel
        this.Barras.setVisible(false);//Hace visible el panel donde estará el grafico de barras
        NuevoNombre2.setText(VentanaPrincipal.variable2);//define el nombre
        ImagenIcono.setIcon(new ImageIcon(VentanaPrincipal.rutaimagen));
        ImagenIcono.setSize(200,200);

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
        NuevoNombre2 = new javax.swing.JLabel();
        ImagenIcono = new javax.swing.JLabel();

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

        PanelPrinc.setBackground(new java.awt.Color(0, 153, 153));

        OpciondeBarras.setBackground(new java.awt.Color(0, 153, 153));
        OpciondeBarras.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpciondeBarras.setText("Barras");
        OpciondeBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondeBarrasActionPerformed(evt);
            }
        });

        OpciondePastel.setBackground(new java.awt.Color(0, 153, 153));
        OpciondePastel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpciondePastel.setText("Pastel");
        OpciondePastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpciondePastelActionPerformed(evt);
            }
        });

        BotonGraficar.setBackground(new java.awt.Color(0, 153, 153));
        BotonGraficar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonGraficar.setText("Gráficar Datos");
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
            }
        });

        capas.setBackground(new java.awt.Color(0, 153, 153));

        BarrasDia.setBackground(new java.awt.Color(0, 153, 153));
        BarrasDia.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout BarrasDiaLayout = new javax.swing.GroupLayout(BarrasDia);
        BarrasDia.setLayout(BarrasDiaLayout);
        BarrasDiaLayout.setHorizontalGroup(
            BarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        BarrasDiaLayout.setVerticalGroup(
            BarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        PastelDia.setBackground(new java.awt.Color(0, 153, 153));
        PastelDia.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelDiaLayout = new javax.swing.GroupLayout(PastelDia);
        PastelDia.setLayout(PastelDiaLayout);
        PastelDiaLayout.setHorizontalGroup(
            PastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        PastelDiaLayout.setVerticalGroup(
            PastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        Pastel.setBackground(new java.awt.Color(0, 153, 153));
        Pastel.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelLayout = new javax.swing.GroupLayout(Pastel);
        Pastel.setLayout(PastelLayout);
        PastelLayout.setHorizontalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        PastelLayout.setVerticalGroup(
            PastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        Barras.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout BarrasLayout = new javax.swing.GroupLayout(Barras);
        Barras.setLayout(BarrasLayout);
        BarrasLayout.setHorizontalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
        );
        BarrasLayout.setVerticalGroup(
            BarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        BarrasHora.setBackground(new java.awt.Color(0, 153, 153));
        BarrasHora.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout BarrasHoraLayout = new javax.swing.GroupLayout(BarrasHora);
        BarrasHora.setLayout(BarrasHoraLayout);
        BarrasHoraLayout.setHorizontalGroup(
            BarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        BarrasHoraLayout.setVerticalGroup(
            BarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        PastelHora.setBackground(new java.awt.Color(0, 153, 153));
        PastelHora.setPreferredSize(new java.awt.Dimension(401, 347));

        javax.swing.GroupLayout PastelHoraLayout = new javax.swing.GroupLayout(PastelHora);
        PastelHora.setLayout(PastelHoraLayout);
        PastelHoraLayout.setHorizontalGroup(
            PastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );
        PastelHoraLayout.setVerticalGroup(
            PastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(Barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PastelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Pastel, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasHora, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PastelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addComponent(Barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(PastelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 46, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(Pastel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarrasHora, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(PastelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 58, Short.MAX_VALUE)))
        );
        capas.setLayer(BarrasDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(PastelDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(Pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(Barras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(BarrasHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(PastelHora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        OpcionTipo.setBackground(new java.awt.Color(0, 153, 153));
        OpcionTipo.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpcionTipo.setText("Tipo de cliente");
        OpcionTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionTipoActionPerformed(evt);
            }
        });

        OpcionDia.setBackground(new java.awt.Color(0, 153, 153));
        OpcionDia.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        OpcionDia.setText("Día");
        OpcionDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDiaActionPerformed(evt);
            }
        });

        OpcionHora.setBackground(new java.awt.Color(0, 153, 153));
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

        NuevoNombre2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        javax.swing.GroupLayout PanelPrincLayout = new javax.swing.GroupLayout(PanelPrinc);
        PanelPrinc.setLayout(PanelPrincLayout);
        PanelPrincLayout.setHorizontalGroup(
            PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPrincLayout.createSequentialGroup()
                                .addComponent(OpciondeBarras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OpciondePastel))
                            .addGroup(PanelPrincLayout.createSequentialGroup()
                                .addComponent(OpcionHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OpcionDia))
                            .addComponent(jLabel2)
                            .addComponent(OpcionTipo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelPrincLayout.setVerticalGroup(
            PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addComponent(ImagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OpcionTipo)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpcionHora)
                            .addComponent(OpcionDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpciondeBarras)
                            .addComponent(OpciondePastel))
                        .addGap(18, 18, 18)
                        .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void OpcionPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionPastelActionPerformed

    }//GEN-LAST:event_OpcionPastelActionPerformed

    private void BotonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficarActionPerformed
        ChartPanel panel;
        baseDeDatos lista = new baseDeDatos();
        /**
         * llama a la base de datos para poder acceder a los datos necesarios para los gráficos
         */
        int [] graf = new int[31];

        JFreeChart chart=null;
        /**
         * empieza a pregunta por las opciones que el usuario eligió y depediendo de eso hace visible el panel en donde esta el gráfico deseado
         * en este caso es por la cantidad de clientes por tipo
         */
        if (OpcionTipo.isSelected()){
            if (OpciondeBarras.isSelected()) {
                Barras.setVisible(true);
                Pastel.setVisible(false);
                PastelDia.setVisible(false);
                BarrasDia.setVisible(false);
                PastelHora.setVisible(false);
                BarrasHora.setVisible(false);
                
                //GRAFICO DE BARRAS
                try {
                    lista.leerFicherosHoraAtencion();
                } catch (IOException ex) {
                    Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    graf = lista.listaParaGraficosPorPrioridad();
                } catch (IOException ex) {
                    Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultCategoryDataset data = new DefaultCategoryDataset();
                /**
                 * Acá empieza a guardar los datos y hacer las variaciones
                 */

                String producto1 = "Persona con discapacidad";
                String producto2 = "Adulto mayor";
                String producto3 = "Mujer embarazada";
                String producto4 = "Cliente corporativo";
                String producto5 = "Cliente regular";

                String dia1 = "Tipo";

                
                data.addValue(graf[0], producto1, dia1);

              
                data.addValue(graf[1], producto2, dia1);

              
                data.addValue(graf[2], producto3, dia1);

               
                data.addValue(graf[3], producto4, dia1);

              
                data.addValue(graf[4], producto5, dia1);

                chart = ChartFactory.createBarChart("Gráfico de barras", "Tipo", "Cantidad", data, PlotOrientation.HORIZONTAL, true, true, true);
                CategoryPlot plot = (CategoryPlot) chart.getPlot();
                plot.setDomainGridlinesVisible(false);
            }

        
        else {
                /**
                 * este es en el caso del gráfico pastel
                 */
                if (OpciondePastel.isSelected()) {



                    Pastel.setVisible(true);
                    Barras.setVisible(false);
                    PastelDia.setVisible(false);
                    BarrasDia.setVisible(false);
                    PastelHora.setVisible(false);
                    BarrasHora.setVisible(false);
                    //GRAFICO DE PASTEL  

                    try {
                        //GRAFICO DE PASTEL
                        lista.leerFicherosHoraAtencion();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        graf= lista.listaParaGraficosPorPrioridad();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    


                    try {
                        //GRAFICO DE PASTEL
                        lista.leerFicherosHoraAtencion();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        graf= lista.listaParaGraficosPorPrioridad();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    try {
                        //GRAFICO DE PASTEL
                        lista.leerFicherosHoraAtencion();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        graf= lista.listaParaGraficosPorPrioridad();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    DefaultPieDataset data = new DefaultPieDataset();
                    data.setValue("Persona con discapacidad", graf[0]);
                    data.setValue("Adulto mayor", graf[1]);
                    data.setValue("Mujer embarazada", graf[2]);
                    data.setValue("Cliente corporativo", graf[3]);
                    data.setValue("Cliente regular", graf[4]);




                    chart = ChartFactory.createPieChart3D("Grafico", data, true, true, false);
                }
             
        }




            
        panel = new ChartPanel(chart);
        /**
         * le da tamaño a los gráficos
         */
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
            /**
             * acá es en caso de que se eliga la opción de la hora
             * de igual forma pregunta cual opción esta seleccioanda o pastel o barras
             */
            if(OpcionHora.isSelected()){
                if (OpciondeBarras.isSelected()){
                    BarrasHora.setVisible(true);
                    Barras.setVisible(false);
                    PastelDia.setVisible(false);
                    BarrasDia.setVisible(false);
                    PastelHora.setVisible(false);
                    Pastel.setVisible(false);
                    //GRAFICO DE BARRAS
                    try {
                        lista.leerFicherosHoraAtencion();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        graf=lista.listaGraficosHora();
                    } catch (IOException ex) {
                        Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                    DefaultCategoryDataset data=new DefaultCategoryDataset();
                    String producto1 = "7 a.m a 8 a.m";
                    String producto2="8a.m a 9a.m";
                    String producto3="9a.m a 10a.m";  
                    String producto8="10a.m a 11a.m";
                    String producto4="11a.m a 12 m.d";
                    String producto9="12m.d a 1p.m";
                    String producto5="1 p.m a 2 p.m";
                    String producto6="2p.m a 3p.m";
                    String producto10="3p.m a 4p.m";
                    String producto7="4p.m a 5p.m";
                    
                    

                    String dia1="Tipo";


                    
                    data.addValue(graf[0], producto1, dia1);
                 
                    data.addValue(graf[1], producto2, dia1);
                   
                    data.addValue(graf[2], producto3, dia1);
                    
                    data.addValue(graf[3], producto8, dia1);
                  
                    data.addValue(graf[4], producto4, dia1);
                                       
                    data.addValue(graf[5], producto9, dia1);
                    
                    data.addValue(graf[6], producto5, dia1);
                    
                    data.addValue(graf[7], producto6, dia1);
                    
                    data.addValue(graf[8], producto10, dia1);
                    
                    data.addValue(graf[9], producto7, dia1);
                    
                    

                    chart=ChartFactory.createBarChart("Gráfico de barras", "Hora", "", data, PlotOrientation.HORIZONTAL, true, true, true);
                    CategoryPlot plot = (CategoryPlot) chart.getPlot();
                    plot.setDomainGridlinesVisible(false);





                }
                else{
                    if (OpciondePastel.isSelected()){
                        PastelHora.setVisible(true);
                        Barras.setVisible(false);
                        PastelDia.setVisible(false);
                        BarrasDia.setVisible(false);
                        Pastel.setVisible(false);
                        BarrasHora.setVisible(false);
                        
                        try {
                            lista.leerFicherosHoraAtencion();
                        } catch (IOException ex) {
                            Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                        }
                   
                        try {
                            graf=lista.listaGraficosHora();
                        } catch (IOException ex) {
                            Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                        }
                   
                            //GRAFICO DE PASTEL  

                        DefaultPieDataset data =new DefaultPieDataset();
                        data.setValue("7a.m a 8a.m", graf[0]);
                        data.setValue("8a.m a 9a.m", graf[1]);
                        data.setValue("9a.m a 10a.m", graf[2]);
                        data.setValue("10a.m a 11a.m", graf[3]);
                        data.setValue("11a.m a 12m.d",graf[4]);
                        data.setValue("12 m.d a 1p.m",graf[5]);
                        data.setValue("1p.m a 2p.m", graf[6]);
                        data.setValue("2p.m a 3p.m", graf[7]);
                        data.setValue("3p.m a 4p.m", graf[8]);
                        data.setValue("4p.m a 5p.m", graf[9]);

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
                /**
                 * esta opción es en caso de que se desee ver el grafico de los dias
                 */
                if(OpcionDia.isSelected()){
                    if (OpciondeBarras.isSelected()){
                        BarrasDia.setVisible(true);
                        Barras.setVisible(false);
                        PastelDia.setVisible(false);
                        BarrasHora.setVisible(false);
                        PastelHora.setVisible(false);
                        Pastel.setVisible(false);
                        try {
                            lista.leerFicherosHoraAtencion();
                        } catch (IOException ex) {
                            Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            graf = lista.lis();
                        } catch (IOException ex) {
                            Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //GRAFICO DE BARRAS
                        DefaultCategoryDataset data=new DefaultCategoryDataset();


                        

                        String a="Día 1";
                        String b="Día 2";
                        String c="Día 3";
                        String d="Día 4";
                        String e="Día 5";
                        String f="Día 6";
                        String g="Día 7";
                        String h="Día 8";
                        String i="Día 9";
                        String j="Día 10";
                        String k="Día 11";
                        String l="Día 12";
                        String m="Día 13";
                        String n="Día 14";
                        String o="Día 15";
                        String p="Día 16";
                        String q="Día 17";
                        String r="Día 18";
                        String s="Día 19";
                        String t="Día 20";
                        String u="Día 21";
                        String v="Día 22";
                        String w="Día 23";
                        String x="Día 24";
                        String y="Día 25";
                        String z="Día 26";
                        String z1="Día 27";
                        String z2="Día 28";
                        String z3="Día 29";
                        String z4="Día 30";
                        String z5="Día 31";
                        
                        
                        String dias ="Días";
                        

                        /**
                        * en todas estas variables se almacenan los números de os días del mes
                        */
                        
                        data.addValue(graf[0], a, dias);
                        data.addValue(graf[1], b, dias);
                        data.addValue(graf[2], c, dias);
                        data.addValue(graf[3], d, dias);
                        data.addValue(graf[4], e, dias);
                        data.addValue(graf[5], f, dias);
                        data.addValue(graf[6], g, dias);
                        data.addValue(graf[7], h, dias);
                        data.addValue(graf[8], i, dias);
                        data.addValue(graf[9], j, dias);
                        data.addValue(graf[10], k, dias);
                        data.addValue(graf[11], l, dias);
                        data.addValue(graf[12], m, dias);
                        data.addValue(graf[13], n, dias);
                        data.addValue(graf[14], o, dias);
                        data.addValue(graf[15], p, dias);
                        data.addValue(graf[16], q, dias);
                        data.addValue(graf[17], r, dias);
                        data.addValue(graf[18], s, dias);
                        data.addValue(graf[19], t, dias);
                        data.addValue(graf[20], u, dias);
                        data.addValue(graf[21], v, dias);
                        data.addValue(graf[22], w, dias);
                        data.addValue(graf[23], x, dias);
                        data.addValue(graf[24], y, dias);
                        data.addValue(graf[25], z, dias);
                        data.addValue(graf[26], z1, dias);
                        data.addValue(graf[27], z2, dias);
                        data.addValue(graf[28], z3, dias);
                        data.addValue(graf[29], z4, dias);
                        data.addValue(graf[30], z5, dias);

                        chart=ChartFactory.createBarChart("Gráfico de barras", "Dia", "", data, PlotOrientation.HORIZONTAL, true, true, true);
                        CategoryPlot plot = (CategoryPlot) chart.getPlot();
                        plot.setDomainGridlinesVisible(false);





                    }
                    else{
                        if (OpciondePastel.isSelected()){
                            PastelDia.setVisible(true);
                            Barras.setVisible(false);
                            Pastel.setVisible(false);
                            BarrasDia.setVisible(false);
                            PastelHora.setVisible(false);
                            BarrasHora.setVisible(false);
                            try {
                                lista.leerFicherosHoraAtencion();
                            } catch (IOException ex) {
                                Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                graf = lista.lis();
                                //GRAFICO DE PASTEL  
                            } catch (IOException ex) {
                                Logger.getLogger(Graficoss.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            DefaultPieDataset data =new DefaultPieDataset();
                            data.setValue("Día 1", graf[0]);
                            data.setValue("Día 2", graf[1]);
                            data.setValue("Día 3", graf[2]);
                            data.setValue("Día 4", graf[3]);
                            data.setValue("Día 5", graf[4]);
                            data.setValue("Día 6", graf[5]);
                            data.setValue("Día 7", graf[6]);
                            data.setValue("Día 8", graf[7]);
                            data.setValue("Día 9", graf[8]);
                            data.setValue("Día 10", graf[9]);
                            data.setValue("Día 11", graf[10]);
                            data.setValue("Día 12", graf[11]);
                            data.setValue("Día 13", graf[12]);
                            data.setValue("Día 14", graf[13]);
                            data.setValue("Día 15", graf[14]);
                            data.setValue("Día 16", graf[15]);
                            data.setValue("Día 17", graf[16]);
                            data.setValue("Día 18", graf[17]);
                            data.setValue("Día 19", graf[18]);
                            data.setValue("Día 20", graf[19]);
                            data.setValue("Día 21", graf[20]);
                            data.setValue("Día 22", graf[21]);
                            data.setValue("Día 23", graf[22]);
                            data.setValue("Día 24", graf[23]);
                            data.setValue("Día 25", graf[24]);
                            data.setValue("Día 26", graf[25]);
                            data.setValue("Día 27", graf[26]);
                            data.setValue("Día 28", graf[27]);
                            data.setValue("Día 29", graf[28]);
                            data.setValue("Día 30", graf[29]);
                            data.setValue("Día 31", graf[30]);

                            chart = ChartFactory.createPieChart3D("Grafico Dia", data, true, true, false);




                        }
                        
                        
                    }
                    panel = new ChartPanel(chart);
                    panel.setBounds(1, 2, 800, 500);






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
        /**
         * esta opción no permite que se tengan seleccionadas dos opciones al mismo tiempo.
         */
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
        /**
         * esta opción no permite que se tengan seleccionadas dos opciones al mismo tiempo.
         */
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
    /**
     * todas estas opciones son para que solo se pueda seleccionar una a la vez
     * @param evt 
     */
    private void OpcionTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionTipoActionPerformed
        OpcionHora.setSelected(false);
        OpcionDia.setSelected(false);
       
        
    }//GEN-LAST:event_OpcionTipoActionPerformed

    private void OpcionHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionHoraActionPerformed
        OpcionTipo.setSelected(false);
        OpcionDia.setSelected(false);
    }//GEN-LAST:event_OpcionHoraActionPerformed

    private void OpcionDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDiaActionPerformed
        OpcionHora.setSelected(false);
        OpcionTipo.setSelected(false);
    }//GEN-LAST:event_OpcionDiaActionPerformed

    public static void main(String args[]) throws MessagingException, IOException {

        
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
    private javax.swing.JLabel ImagenIcono;
    private javax.swing.JLabel NuevoNombre2;
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

