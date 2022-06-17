package veterinariaventanas.vistas;


import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import veterinariaventanas.clases.clasePatologia;
import static veterinariaventanas.vistas.vistaMascota.TXT_Nombre_Dueño;
import static veterinariaventanas.vistas.vistaMascota.TXT_Nombre_Mascota;
import static veterinariaventanas.vistas.vistaMascota.checkBlanco;
import static veterinariaventanas.vistas.vistaMascota.checkCafe;
import static veterinariaventanas.vistas.vistaMascota.checkDorado;
import static veterinariaventanas.vistas.vistaMascota.checkNegro;

public class vistaPatologiaDialogo extends javax.swing.JDialog {

    DefaultTableModel tabla_Datos = new DefaultTableModel();
    clasePatologia [] patologia  = new clasePatologia[100];
    public static int contarPatologias = 0;
    
    
    
    public vistaPatologiaDialogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        vistaMascota vmascota = new vistaMascota();
        lblNombre.setText(vmascota.nombreMascota);
        System.out.println(vmascota.nombreMascota);
        lblPropietario.setText(vmascota.nombrepropietario);
        
        try {
            ImageIcon p = new ImageIcon(getClass().getResource("../imagenes/2.jpg"));
            ImageIcon icono = new ImageIcon(p.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), lblImagen.getWidth()));
            vistaPatologiaDialogo.lblImagen.setIcon(icono);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar la imagen. ", e.getMessage(), HEIGHT);
        }
        
        //agregarlo al objeto
        tabla_Datos.addColumn("Codigo");
        tabla_Datos.addColumn("Nombre Patologia");
        tabla_Datos.addColumn("Sistemas");
        tabla_Datos.addColumn("Medicamentos");
        tblDatos.setModel(tabla_Datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        Boton_Regresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblPropietario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXt_Codigo = new javax.swing.JTextField();
        TXT_Patologia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_Sistemas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXT_Medicamentos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        Boton_Agregar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel1.setText("Patologias de la mascota");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Propietario");

        lblImagen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Boton_Regresar.setText("Regresar");
        Boton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre.setText(" ");

        lblPropietario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPropietario.setText(" ");

        jLabel4.setText("Codigo");

        TXt_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXt_CodigoKeyTyped(evt);
            }
        });

        jLabel5.setText("Nombre Patologia");

        jLabel6.setText("Sistemas");

        jLabel7.setText("Medicamentos");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        Boton_Agregar.setText("Agregar al listado");
        Boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AgregarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Agregar)
                        .addGap(30, 30, 30)
                        .addComponent(Boton_Eliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(TXt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(TXT_Patologia, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_Sistemas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(Boton_Regresar))
                                        .addGap(129, 129, 129)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(117, 117, 117)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(lblPropietario))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_Patologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_Sistemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Agregar)
                    .addComponent(Boton_Eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(Boton_Regresar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Boton_RegresarActionPerformed

    private void Boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarActionPerformed
        if (TXt_Codigo.getText().equals("") || TXT_Patologia.getText().equals("") || TXT_Sistemas.getText().equals("") || TXT_Medicamentos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos por ingresar.");
        } else {
            patologia[contarPatologias] = new clasePatologia();
            patologia[contarPatologias].setCodigo(Integer.parseInt(TXt_Codigo.getText()));
            contarPatologias++;
            
            String[] datosBasicos = new String[4];
            datosBasicos[0] = TXt_Codigo.getText();
            datosBasicos[1] = TXT_Patologia.getText();
            datosBasicos[2] = TXT_Sistemas.getText();
            datosBasicos[3] = TXT_Medicamentos.getText();
            tabla_Datos.addRow(datosBasicos);

            TXt_Codigo.setText("");
            TXT_Patologia.setText("");
            TXT_Sistemas.setText("");
            TXT_Medicamentos.setText("");
        }
    }//GEN-LAST:event_Boton_AgregarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
        int prueba = tblDatos.getRowCount();
        int fila = tblDatos.getSelectedRow();
        System.out.println(fila + "   " + tblDatos.getSelectedColumn());
        if (prueba > 0) {
            if (fila >= 0) {
                tabla_Datos.removeRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione la casilla");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen datos registrados");
        }
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void TXt_CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXt_CodigoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXt_CodigoKeyTyped


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
            java.util.logging.Logger.getLogger(vistaPatologiaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPatologiaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPatologiaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPatologiaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vistaPatologiaDialogo dialog = new vistaPatologiaDialogo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Agregar;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JButton Boton_Regresar;
    private javax.swing.JTextField TXT_Medicamentos;
    private javax.swing.JTextField TXT_Patologia;
    private javax.swing.JTextField TXT_Sistemas;
    private javax.swing.JTextField TXt_Codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPropietario;
    public static javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
