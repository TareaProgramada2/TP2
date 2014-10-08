

package gráficos;

import java.awt.Image;
import java.io.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VentanaPrincipal extends javax.swing.JFrame {

    private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de imagen","jpg");
    public static String rutaimagen;
    
    public VentanaPrincipal() {
        initComponents();
        rutaimagen="";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonCambiarLogo = new javax.swing.JButton();
        BotonCambiarNombre = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        LabelParaCambiarNomb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NuevoNombre = new javax.swing.JLabel();
        BotonParaVerGraf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonCambiarLogo.setText("Definir logo");
        BotonCambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarLogoActionPerformed(evt);
            }
        });

        BotonCambiarNombre.setText("Definir nombre");
        BotonCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarNombreActionPerformed(evt);
            }
        });

        LabelParaCambiarNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelParaCambiarNombActionPerformed(evt);
            }
        });

        jLabel1.setText("Nuevo nombre:");

        NuevoNombre.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        BotonParaVerGraf.setText("Mostrar gráficos");
        BotonParaVerGraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParaVerGrafActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de cajas:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCambiarLogo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelParaCambiarNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonParaVerGraf)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BotonCambiarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LabelParaCambiarNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(BotonParaVerGraf)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarLogoActionPerformed
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        
        int opcion= dlg.showOpenDialog(this);
        if(opcion==JFileChooser.APPROVE_OPTION){
            String file = dlg.getSelectedFile().getPath();
            rutaimagen=file;
            
            
            Logo.setIcon(new ImageIcon(file));
            ImageIcon icono=new ImageIcon(file); 
            Image logo = icono.getImage();
            Image newimagen=logo.getScaledInstance(175, 175, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newicono =new ImageIcon(newimagen);
            Logo.setIcon(newicono);
            Logo.setSize(200,200);   
        }
        File nombreylogo;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        
            try{
                nombreylogo=new File("C:\\Users\\gollo\\Desktop\\Nueva Carpeta\\nombreylogo.txt");
                w=new FileWriter(nombreylogo);
                bw= new BufferedWriter(w);
                wr = new PrintWriter(bw);
                
                
                wr.write(rutaimagen);
                wr.write("\n "+variable);
                
                
               
                

                
            wr.close();
            bw.close();
            }catch(IOException e){
                System.err.println("No se creo el archivo");
            }
        

    }//GEN-LAST:event_BotonCambiarLogoActionPerformed

    private void BotonCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarNombreActionPerformed
        variable=LabelParaCambiarNomb.getText();
        NuevoNombre.setText(variable);
    }//GEN-LAST:event_BotonCambiarNombreActionPerformed

    private void LabelParaCambiarNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelParaCambiarNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelParaCambiarNombActionPerformed

    private void BotonParaVerGrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParaVerGrafActionPerformed
        Graficoss pantallagraficos=new Graficoss();
        pantallagraficos.setVisible(true);
    }//GEN-LAST:event_BotonParaVerGrafActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCambiarLogo;
    private javax.swing.JButton BotonCambiarNombre;
    private javax.swing.JButton BotonParaVerGraf;
    private javax.swing.JTextField LabelParaCambiarNomb;
    private javax.swing.JLabel Logo;
    public javax.swing.JLabel NuevoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    public static String variable;
    
}
