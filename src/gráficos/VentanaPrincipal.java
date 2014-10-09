package gráficos;

import java.awt.Image;
import java.io.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import gráficos.baseDeDatos;
import gráficos.Email;
import java.util.logging.Level;
import java.util.logging.Logger;
//ejkrjf
//dhjshdjhs

public class VentanaPrincipal extends javax.swing.JFrame {

    private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de imagen","jpg");
    public static String rutaimagen;
    public static String variable2;
    baseDeDatos a = new baseDeDatos();
    public int cajeros;
    
    public String getLogo() throws IOException{
        a.leerFicherosNombreLogo();
        a.listaNombreLogo();
        return a.NyL[2];
    }
    
    
    
    public VentanaPrincipal() {
        initComponents();
        rutaimagen="";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonCambiarLogo = new javax.swing.JButton();
        BotonCambiarNombre = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        LabelParaCambiarNomb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NuevoNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCajeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        BotonCambiarLogo.setBackground(new java.awt.Color(153, 153, 153));
        BotonCambiarLogo.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        BotonCambiarLogo.setText("Definir logo");
        BotonCambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarLogoActionPerformed(evt);
            }
        });

        BotonCambiarNombre.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel1.setText("Nuevo nombre:");

        NuevoNombre.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de cajas:");

        TxtCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCajerosActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jButton1.setText("Ingresar al sistema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelParaCambiarNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)))
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonCambiarLogo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BotonCambiarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LabelParaCambiarNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
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
                .addGap(0, 0, Short.MAX_VALUE))
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
        
        
            try{
                a.almacenarnNombreyLogo(variable2, rutaimagen);
                
            }catch(IOException e){
                System.err.println("No se creo el archivo");
            }
    }//GEN-LAST:event_BotonCambiarLogoActionPerformed

    private void BotonCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarNombreActionPerformed
        variable2=LabelParaCambiarNomb.getText();
        NuevoNombre.setText(variable2);
    }//GEN-LAST:event_BotonCambiarNombreActionPerformed

    private void LabelParaCambiarNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelParaCambiarNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelParaCambiarNombActionPerformed

    private void TxtCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCajerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SegundaVentana ventana2=new SegundaVentana();
        ventana2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                VentanaPrincipal f = new VentanaPrincipal();
                String r;
                try{
                    r = f.getLogo();
                    new SegundaVentana().setVisible(true);
                    f.setVisible(false);
                }
                catch(NullPointerException ex){
                    f.setVisible(true);
                    } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            }
    });    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCambiarLogo;
    private javax.swing.JButton BotonCambiarNombre;
    private javax.swing.JTextField LabelParaCambiarNomb;
    private javax.swing.JLabel Logo;
    public javax.swing.JLabel NuevoNombre;
    private javax.swing.JTextField TxtCajeros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public static String variable;   
}
