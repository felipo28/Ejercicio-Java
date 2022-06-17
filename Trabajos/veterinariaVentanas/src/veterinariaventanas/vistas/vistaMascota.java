package veterinariaventanas.vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import veterinariaventanas.clases.claseMascota;
import veterinariaventanas.vistas.vistaPatologiaDialogo;

public class vistaMascota extends javax.swing.JFrame {

    DefaultListModel ListaModelo = new DefaultListModel();
    DefaultComboBoxModel comboModelo = new DefaultComboBoxModel();
    public static String nombreMascota = null, nombrepropietario = null;
    claseMascota mascota = new claseMascota();
    boolean prueba = false;

    public vistaMascota() {
        initComponents();
        comboModelo.addElement("Gato");
        comboModelo.addElement("Perro");
        comboModelo.addElement("Loro");
        cmbEspecie.setModel(comboModelo);
        try {
            ImageIcon p = new ImageIcon(getClass().getResource("../imagenes/1.jpg"));
            ImageIcon icono = new ImageIcon(p.getImage().getScaledInstance(Label_Icon.getWidth(), Label_Icon.getHeight(), Label_Icon.getWidth()));
            vistaMascota.Label_Icon.setIcon(icono);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar la imagen. ", e.getMessage(), HEIGHT);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Nombre_Mascota = new javax.swing.JTextField();
        TXT_Nombre_Dueño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbRaza = new javax.swing.JComboBox<>();
        cmbEspecie = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        checkBlanco = new javax.swing.JCheckBox();
        checkNegro = new javax.swing.JCheckBox();
        checkCafe = new javax.swing.JCheckBox();
        checkDorado = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        RadioHembra = new javax.swing.JRadioButton();
        RadioMacho = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TXTPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTedad = new javax.swing.JTextField();
        BotonVer = new javax.swing.JButton();
        BotonPatologias = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listar = new javax.swing.JList<>();
        Label_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de la mascota");

        jLabel2.setText("Nombre del dueño ");

        TXT_Nombre_Mascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Nombre_MascotaKeyTyped(evt);
            }
        });

        jLabel3.setText("Raza");

        jLabel4.setText("Especie");

        cmbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato = persa", "Gato = siames", "perro = jackRussell", "Perro = labrador" }));

        cmbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Color del pelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        checkBlanco.setText("Blanco");
        checkBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBlancoActionPerformed(evt);
            }
        });

        checkNegro.setText("Negro");
        checkNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNegroActionPerformed(evt);
            }
        });

        checkCafe.setText("Cafe");
        checkCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCafeActionPerformed(evt);
            }
        });

        checkDorado.setText("Dorado");
        checkDorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDoradoActionPerformed(evt);
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
                        .addComponent(checkBlanco)
                        .addGap(18, 18, 18)
                        .addComponent(checkCafe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkNegro)
                        .addGap(18, 18, 18)
                        .addComponent(checkDorado)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBlanco)
                    .addComponent(checkCafe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNegro)
                    .addComponent(checkDorado))
                .addGap(16, 16, 16))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        GrupoGenero.add(RadioHembra);
        RadioHembra.setSelected(true);
        RadioHembra.setText("Hembra");

        GrupoGenero.add(RadioMacho);
        RadioMacho.setText("Macho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioHembra)
                    .addComponent(RadioMacho))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioHembra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioMacho)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel5.setText("Peso");

        TXTPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPesoKeyTyped(evt);
            }
        });

        jLabel6.setText("Edad");

        TXTedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTedadKeyTyped(evt);
            }
        });

        BotonVer.setText("Agregar");
        BotonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerActionPerformed(evt);
            }
        });

        BotonPatologias.setText("Patologias");
        BotonPatologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPatologiasActionPerformed(evt);
            }
        });

        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Listar);

        Label_Icon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRaza, 0, 149, Short.MAX_VALUE)
                            .addComponent(TXT_Nombre_Mascota))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(TXT_Nombre_Dueño)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TXTPeso)
                                        .addGap(5, 5, 5)))
                                .addComponent(BotonVer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonPatologias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXTedad)
                                .addGap(80, 80, 80)
                                .addComponent(Boton_Salir)
                                .addGap(86, 86, 86))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Nombre_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_Nombre_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPatologias)
                            .addComponent(BotonVer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Salir))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(Label_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBlancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBlancoActionPerformed

    private void checkNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNegroActionPerformed

    private void checkCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCafeActionPerformed

    private void checkDoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDoradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDoradoActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "Realmente desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void BotonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerActionPerformed
        String nom = TXT_Nombre_Mascota.getText();

        if (TXT_Nombre_Mascota.getText().equals("") || TXT_Nombre_Dueño.getText().equals("") || TXTPeso.getText().equals("") || TXTedad.getText().equals("")
                || (!checkBlanco.isSelected() && !checkCafe.isSelected() && !checkNegro.isSelected() && !checkDorado.isSelected())) {
            JOptionPane.showMessageDialog(null,"Faltan datos por ingresar.");
        } else {
            String color = "", dato = null;
            mascota.setNombre(TXT_Nombre_Mascota.getText());
            mascota.setNombre_propietario(TXT_Nombre_Dueño.getText());
            mascota.setRaza(cmbRaza.getSelectedItem().toString());
            mascota.setEspecie(cmbEspecie.getSelectedItem().toString());
            if (checkBlanco.isSelected()) {
                color = "Blanco";
            }
            if (checkCafe.isSelected()) {
                color = color + ", Cafe";
            }
            if (checkDorado.isSelected()) {
                color = color + ", Dorado";
            }
            if (checkNegro.isSelected()) {
                color = color + ", Negro";
            }
            mascota.setColor(color);

            if (RadioHembra.isSelected()) {
                mascota.setGenero("Hembra");
            } else {
                mascota.setGenero("Macho");
            }
            mascota.setPeso(Double.parseDouble(TXTPeso.getText()));
            mascota.setEdad(Integer.parseInt(TXTedad.getText()));
            dato = "Mascota" + mascota.getNombre();
            dato += ", Propietario: " + mascota.getNombre_propietario();
            dato += ", Raza: " + mascota.getRaza();
            dato += ", Especie: " + mascota.getEspecie();
            dato += ", Color: " + mascota.getColor();
            dato += ", Genero: " + mascota.getGenero();
            dato += ", Peso: " + String.valueOf(mascota.getPeso()) + " Kg";
            dato += ", Edad: " + String.valueOf(mascota.getEdad()) + " Años";
            ListaModelo.addElement(dato);
            Listar.setModel(ListaModelo);
            prueba = true;
        }


    }//GEN-LAST:event_BotonVerActionPerformed

    private void BotonPatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPatologiasActionPerformed
        if (prueba == false) {
            JOptionPane.showMessageDialog(null, "Registrese primero");
        } else {
            nombreMascota = TXT_Nombre_Mascota.getText();
            nombrepropietario = TXT_Nombre_Dueño.getText();
            vistaPatologiaDialogo dialogo = new vistaPatologiaDialogo(new javax.swing.JFrame(), true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setTitle("Cuadro de dialogo para patologias");
            dialogo.setVisible(true);
        }

    }//GEN-LAST:event_BotonPatologiasActionPerformed

    private void TXT_Nombre_MascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Nombre_MascotaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Nombre_MascotaKeyTyped

    private void TXTPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPesoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTPesoKeyTyped

    private void TXTedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTedadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTedadKeyTyped

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
            java.util.logging.Logger.getLogger(vistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPatologias;
    public static javax.swing.JButton BotonVer;
    private javax.swing.JButton Boton_Salir;
    public static javax.swing.ButtonGroup GrupoGenero;
    public static javax.swing.JLabel Label_Icon;
    private javax.swing.JList<String> Listar;
    public static javax.swing.JRadioButton RadioHembra;
    public static javax.swing.JRadioButton RadioMacho;
    private javax.swing.JTextField TXTPeso;
    public static javax.swing.JTextField TXT_Nombre_Dueño;
    public static javax.swing.JTextField TXT_Nombre_Mascota;
    private javax.swing.JTextField TXTedad;
    public static javax.swing.JCheckBox checkBlanco;
    public static javax.swing.JCheckBox checkCafe;
    public static javax.swing.JCheckBox checkDorado;
    public static javax.swing.JCheckBox checkNegro;
    public static javax.swing.JComboBox<String> cmbEspecie;
    public static javax.swing.JComboBox<String> cmbRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
