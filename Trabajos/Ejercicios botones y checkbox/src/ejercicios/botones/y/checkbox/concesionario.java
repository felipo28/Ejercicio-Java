package ejercicios.botones.y.checkbox;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

public class concesionario extends javax.swing.JFrame {

    public concesionario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoCompra = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Panel_Marca = new javax.swing.JPanel();
        Radio_Com_Portatil = new javax.swing.JRadioButton();
        Radio_Com_Escritorio = new javax.swing.JRadioButton();
        Radio_Com_Play = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Check_usb = new javax.swing.JCheckBox();
        Check_Audiculares = new javax.swing.JCheckBox();
        Check_SSD = new javax.swing.JCheckBox();
        Check_Pantalla = new javax.swing.JCheckBox();
        Check_Camara = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Total = new javax.swing.JLabel();
        Boton_Calcular = new javax.swing.JButton();
        Boton_Borrar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("TIENDA ONLINE");

        Panel_Marca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Panel_Marca.setForeground(new java.awt.Color(0, 0, 0));
        Panel_Marca.setToolTipText("Seleciona una opcion");
        Panel_Marca.setName("marca"); // NOI18N

        GrupoCompra.add(Radio_Com_Portatil);
        Radio_Com_Portatil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Radio_Com_Portatil.setText("Comp. portatil");
        Radio_Com_Portatil.setToolTipText("Computador portatil");
        Radio_Com_Portatil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_Com_PortatilActionPerformed(evt);
            }
        });

        GrupoCompra.add(Radio_Com_Escritorio);
        Radio_Com_Escritorio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Radio_Com_Escritorio.setText("Comp. Escritorio");
        Radio_Com_Escritorio.setToolTipText("Computador de escritorio");

        GrupoCompra.add(Radio_Com_Play);
        Radio_Com_Play.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Radio_Com_Play.setText("Comprar PlayStation");
        Radio_Com_Play.setToolTipText("Comprar PlayStation");

        javax.swing.GroupLayout Panel_MarcaLayout = new javax.swing.GroupLayout(Panel_Marca);
        Panel_Marca.setLayout(Panel_MarcaLayout);
        Panel_MarcaLayout.setHorizontalGroup(
            Panel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MarcaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Radio_Com_Portatil)
                .addGap(40, 40, 40)
                .addComponent(Radio_Com_Escritorio)
                .addGap(40, 40, 40)
                .addComponent(Radio_Com_Play)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Panel_MarcaLayout.setVerticalGroup(
            Panel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MarcaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Panel_MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio_Com_Portatil)
                    .addComponent(Radio_Com_Escritorio)
                    .addComponent(Radio_Com_Play))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Opcionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        Check_usb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Check_usb.setText("Usb 2 TB");
        Check_usb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_usbActionPerformed(evt);
            }
        });

        Check_Audiculares.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Check_Audiculares.setText("Auriculares Gamer");

        Check_SSD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Check_SSD.setText("SSD 2 TB");

        Check_Pantalla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Check_Pantalla.setText("Pantalla 24 in");

        Check_Camara.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Check_Camara.setText("Camara Logitech");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Check_usb)
                    .addComponent(Check_Audiculares)
                    .addComponent(Check_SSD))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Check_Camara)
                    .addComponent(Check_Pantalla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Check_usb)
                    .addComponent(Check_Pantalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Check_Audiculares)
                    .addComponent(Check_Camara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Check_SSD)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Precio Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("$");

        TXT_Total.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Boton_Calcular.setText("Calcular");
        Boton_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CalcularActionPerformed(evt);
            }
        });

        Boton_Borrar.setText("Borrar");
        Boton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarActionPerformed(evt);
            }
        });

        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Boton_Calcular)
                                                .addGap(18, 18, 18)
                                                .addComponent(Boton_Borrar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(Boton_Salir)))))))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Panel_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Calcular)
                            .addComponent(Boton_Borrar))
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Salir)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Radio_Com_PortatilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_Com_PortatilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio_Com_PortatilActionPerformed

    private void Check_usbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_usbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Check_usbActionPerformed

    private void Boton_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CalcularActionPerformed
        String mensaje;
        int valor = 0;
        
        if (Radio_Com_Portatil.isSelected()) {
            valor += 3500000;
            
        }
        if (Radio_Com_Escritorio.isSelected()) {
            valor += 2100000;
        }
        
        if (Radio_Com_Play.isSelected()) {
            valor += 1950000;
        }
        if (Check_usb.isSelected()) {
            valor += 119700;
        }
        if (Check_Audiculares.isSelected()) {
            valor += 794300;
        } 
        if (Check_SSD.isSelected()) {
            valor += 874300;
        } 
        if (Check_Pantalla.isSelected()) {
            valor += 676500;
        } 
        if (Check_Camara.isSelected()) {
            valor += 271400;
        }
        
        
        
        if (valor == 0) {
             JOptionPane.showMessageDialog(null,"Por favor seleccione alguna opcion.");
        }else{
            TXT_Total.setText(String.valueOf(valor));
        }
    }//GEN-LAST:event_Boton_CalcularActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void Boton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarActionPerformed
        TXT_Total.setText("");
        GrupoCompra.clearSelection();
        Check_usb.setSelected(false);
        Check_Audiculares.setSelected(false);
        Check_SSD.setSelected(false);
        Check_Pantalla.setSelected(false);
        Check_Camara.setSelected(false);
    }//GEN-LAST:event_Boton_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(concesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new concesionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Borrar;
    private javax.swing.JButton Boton_Calcular;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JCheckBox Check_Audiculares;
    private javax.swing.JCheckBox Check_Camara;
    private javax.swing.JCheckBox Check_Pantalla;
    private javax.swing.JCheckBox Check_SSD;
    private javax.swing.JCheckBox Check_usb;
    private javax.swing.ButtonGroup GrupoCompra;
    private javax.swing.JPanel Panel_Marca;
    private javax.swing.JRadioButton Radio_Com_Escritorio;
    private javax.swing.JRadioButton Radio_Com_Play;
    private javax.swing.JRadioButton Radio_Com_Portatil;
    private javax.swing.JLabel TXT_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
