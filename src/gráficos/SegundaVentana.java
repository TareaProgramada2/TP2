/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;

/**
 *
 * @author gollo
 */
public class SegundaVentana extends javax.swing.JFrame {

    int numeroAux = 0;
    Cajero cajass = new Cajero();
    IngresoClientes ingreso = new IngresoClientes();
    Email email = new Email();
    /**
     * Creates new form SegundaVentana
     */
    baseDeDatos a = new baseDeDatos();
    public void getLogo() throws IOException{
        a.leerFicherosNombreLogo();
        a.listaNombreLogo();
        String nombre = a.generica[0];
        String logo = a.generica[1];
//        NuevaImagen.setIcon(new ImageIcon(logo));
        NuevaImagen.setIcon(new ImageIcon(new ImageIcon(logo).getImage().getScaledInstance(125,125,Image.SCALE_SMOOTH)));
        NuevoNombre.setText(nombre);        
        NuevaImagen.setSize(200,200);
    }
    
    public SegundaVentana() throws IOException {
        initComponents();
        getLogo();
        TXTCajeros.setText(cajass.getCajeros());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegistrarCliente = new javax.swing.JButton();
        liberarCajero = new javax.swing.JButton();
        Botongraficos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTCajeros = new javax.swing.JTextArea();
        NuevoNombre = new javax.swing.JLabel();
        NuevaImagen = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        BotonAsignarCajero = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        BotonRegistrarCliente.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        BotonRegistrarCliente.setText("Registrar cliente");
        BotonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarClienteActionPerformed(evt);
            }
        });

        liberarCajero.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        liberarCajero.setText("Liberar cajero");
        liberarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liberarCajeroActionPerformed(evt);
            }
        });

        Botongraficos.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        Botongraficos.setText("Mostrar gráficos");
        Botongraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotongraficosActionPerformed(evt);
            }
        });

        TXTCajeros.setColumns(20);
        TXTCajeros.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        TXTCajeros.setRows(5);
        jScrollPane1.setViewportView(TXTCajeros);

        NuevoNombre.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        jButton3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jButton3.setText("Mostrar tabla de clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BotonAsignarCajero.setText("Asignar cajero a cliente");
        BotonAsignarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignarCajeroActionPerformed(evt);
            }
        });

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(liberarCajero)
                            .addComponent(BotonRegistrarCliente)
                            .addComponent(jButton3)
                            .addComponent(Botongraficos)
                            .addComponent(BotonAsignarCajero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(NuevaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(113, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCerrar)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(NuevaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(BotonRegistrarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(liberarCajero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botongraficos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonAsignarCajero)
                                .addContainerGap(114, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnCerrar)
                                .addGap(27, 27, 27))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotongraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotongraficosActionPerformed
        Graficoss grafico = null;
        try {
            grafico = new Graficoss();
        } catch (IOException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
        grafico.setVisible(true);
    }//GEN-LAST:event_BotongraficosActionPerformed

    private void BotonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarClienteActionPerformed
        ingreso.setVisible(true);
        
    }//GEN-LAST:event_BotonRegistrarClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Table tabla;
        try {
            tabla = new Table();
            tabla.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void liberarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liberarCajeroActionPerformed
        if(this.numeroAux < cajass.getCajas())
        {
            cajass.setCondicion(this.numeroAux);
            this.numeroAux++;
            TXTCajeros.setText(cajass.getCajeros());
            
        }
        else
        {
            this.numeroAux=0;
            cajass.setCondicion(this.numeroAux);
            this.numeroAux++;
            TXTCajeros.setText(cajass.getCajeros());
        }
    }//GEN-LAST:event_liberarCajeroActionPerformed

    private void BotonAsignarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarCajeroActionPerformed
        String [] EmailAndPrioridad = new String[3];
        String Asignacion = (String)this.ingreso.cola.salir();
        cajass.asignar(Asignacion);
        TXTCajeros.setText(cajass.getCajeros());
        char[] arregloLinea = Asignacion.toCharArray();
        String linea = "";
        int aux=0;
        for(int ind = 0; ind < arregloLinea.length ; ind++ )
        {
            if(arregloLinea[ind]=='#')
            {
                break;
            }
            if(arregloLinea[ind]!=',')
            {
                linea = linea + arregloLinea[ind] + "";
            }
            else
            {
                EmailAndPrioridad[aux]=linea;
                linea="";
                aux++;
            }
        }
        try {
            
            a.almacenarFicherosHoraAtencion(EmailAndPrioridad[1]);
            
        } catch (IOException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
        email.cambioDePropiedadesDeCorreo();
        try {
            a.leerFicherosNombreLogo();
            a.listaNombreLogo();
            email.email(EmailAndPrioridad[0],a.getNombreEmpresa(), EmailAndPrioridad[2]+"\n"+"prioridad tipo:"+EmailAndPrioridad[1]+", ya es su turno de atencion ");
        } catch (MessagingException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            email.enviarEmail();
        } catch (MessagingException ex) {
            Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAsignarCajeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SegundaVentana().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SegundaVentana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsignarCajero;
    private javax.swing.JButton BotonRegistrarCliente;
    private javax.swing.JButton Botongraficos;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JLabel NuevaImagen;
    private javax.swing.JLabel NuevoNombre;
    private javax.swing.JTextArea TXTCajeros;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton liberarCajero;
    // End of variables declaration//GEN-END:variables
}
