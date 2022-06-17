package ejerciciostablas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

public class tablas extends javax.swing.JFrame {


    public tablas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum_1 = new javax.swing.JTextField();
        txtNum_2 = new javax.swing.JTextField();
        Boton_suma = new javax.swing.JButton();
        Boton_resta = new javax.swing.JButton();
        Boton_multiplicacion = new javax.swing.JButton();
        Boton_divicion = new javax.swing.JButton();
        labelres = new javax.swing.JLabel();
        TXTResultado1 = new javax.swing.JLabel();
        Boton_raizcuadrada = new javax.swing.JButton();
        BotonPotencia = new javax.swing.JButton();
        TXT_segunda_res = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Primer numero");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Segundo numero");

        txtNum_1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtNum_2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Boton_suma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Boton_suma.setText("Suma");
        Boton_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_sumaActionPerformed(evt);
            }
        });

        Boton_resta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Boton_resta.setText("Resta");
        Boton_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_restaActionPerformed(evt);
            }
        });

        Boton_multiplicacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Boton_multiplicacion.setText("Multiplicacion");
        Boton_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_multiplicacionActionPerformed(evt);
            }
        });

        Boton_divicion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Boton_divicion.setText("Divicion");
        Boton_divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_divicionActionPerformed(evt);
            }
        });

        labelres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelres.setText("Resultado");

        TXTResultado1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTResultado1.setText(" ");

        Boton_raizcuadrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Boton_raizcuadrada.setText("Raiz cuadrada");
        Boton_raizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_raizcuadradaActionPerformed(evt);
            }
        });

        BotonPotencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotonPotencia.setText("Potencia");
        BotonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPotenciaActionPerformed(evt);
            }
        });

        TXT_segunda_res.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXT_segunda_res.setText(" ");

        Exit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum_2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum_1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_divicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_raizcuadrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelres)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_segunda_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TXTResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_suma)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton_resta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_multiplicacion)
                    .addComponent(labelres)
                    .addComponent(TXTResultado1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_divicion)
                    .addComponent(TXT_segunda_res))
                .addGap(18, 18, 18)
                .addComponent(Boton_raizcuadrada)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPotencia)
                    .addComponent(Exit))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_sumaActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            num1 = Long.parseLong(txtNum_1.getText());
            num2 = Long.parseLong(txtNum_2.getText());
            res = num1 + num2;
            TXTResultado1.setText(String.valueOf(res));
            TXT_segunda_res.setText(" ");
        }
    }//GEN-LAST:event_Boton_sumaActionPerformed

    private void Boton_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_restaActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            num1 = Long.parseLong(txtNum_1.getText());
            num2 = Long.parseLong(txtNum_2.getText());
            res = num1 - num2;
            TXTResultado1.setText(String.valueOf(res));
            TXT_segunda_res.setText(" ");
        }
    }//GEN-LAST:event_Boton_restaActionPerformed

    private void Boton_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_multiplicacionActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            num1 = Long.parseLong(txtNum_1.getText());
            num2 = Long.parseLong(txtNum_2.getText());
            res = num1 * num2;
            TXTResultado1.setText(String.valueOf(res));
            TXT_segunda_res.setText(" ");
        }
    }//GEN-LAST:event_Boton_multiplicacionActionPerformed

    private void Boton_divicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_divicionActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            num1 = Long.parseLong(txtNum_1.getText());
            num2 = Long.parseLong(txtNum_2.getText());
            res = num1 / num2;
            TXTResultado1.setText(String.valueOf(res));
            TXT_segunda_res.setText(" ");
        }
    }//GEN-LAST:event_Boton_divicionActionPerformed

    private void Boton_raizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_raizcuadradaActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            double num;
            num = Long.parseLong(txtNum_1.getText());
            num = Math.sqrt(num);
            TXTResultado1.setText(String.valueOf(num));
            num2 = Long.parseLong(txtNum_2.getText());
            num = Math.sqrt(num);
            TXT_segunda_res.setText(String.valueOf(num));
        }
    }//GEN-LAST:event_Boton_raizcuadradaActionPerformed

    private void BotonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPotenciaActionPerformed
        if (txtNum_1.getText().equals("") || txtNum_2.getText().equals("")) {
            //error
            JOptionPane.showMessageDialog(rootPane, "Error. Los textos no pueden estar vacios", " errores", HEIGHT);

        } else {
            long num1 = 0, num2 = 0, res = 0;
            double num;
            num1 = Long.parseLong(txtNum_1.getText());
            
            num2 = Long.parseLong(txtNum_2.getText());
            num = Math.pow(num1,num2);
            TXTResultado1.setText(String.valueOf(num));
            TXT_segunda_res.setText(" ");
        }
    }//GEN-LAST:event_BotonPotenciaActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPotencia;
    private javax.swing.JButton Boton_divicion;
    private javax.swing.JButton Boton_multiplicacion;
    private javax.swing.JButton Boton_raizcuadrada;
    private javax.swing.JButton Boton_resta;
    private javax.swing.JButton Boton_suma;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel TXTResultado1;
    private javax.swing.JLabel TXT_segunda_res;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelres;
    private javax.swing.JTextField txtNum_1;
    private javax.swing.JTextField txtNum_2;
    // End of variables declaration//GEN-END:variables
}
