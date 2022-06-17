package vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.claseMecanico;
import modelo.claseOrdenReparacion;
import vistas.vistaInternaCliente;

public class vistaInternaMecanico extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloOrden = new DefaultTableModel();
    ArrayList<claseMecanico> listaMecanico = new ArrayList();

    public vistaInternaMecanico() {
        initComponents();
        this.setTitle("Mecanico");
        
        btnGuardar.setVisible(false);
        panelCarro.setVisible(false);
        listarTabla();
        ocultar();
    }
    
    public void ocultar() {
        int index = tblMecanico.getSelectedRow();
        if (index == 0) {
            btnAgregarOrder.setVisible(true);
        } else {
            btnAgregarOrder.setVisible(false);
        }
    }
    
    public void listarTabla() {
        modelo = (DefaultTableModel) tblMecanico.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[4]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaMecanico.size(); i++) {
            obj[0] = listaMecanico.get(i).getIdentificacion();
            obj[1] = listaMecanico.get(i).getNombre();
            obj[2] = listaMecanico.get(i).getApellido();
            obj[3] = listaMecanico.get(i).getEspecialidad();
            modelo.addRow(obj);
        }
        tblMecanico.setModel(modelo);
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElimiar = new javax.swing.JButton();
        btnAgregarOrder = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXTApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXTEspecialidad = new javax.swing.JTextField();
        TXTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMecanico = new javax.swing.JTable();
        panelCarro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXTFechaIngreso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TXTFechaSalida = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrdenReparacion = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        TXTHoraIngreso = new javax.swing.JTextField();
        BTNAgregar = new javax.swing.JButton();
        BtnCerrarOrden = new javax.swing.JButton();
        TXTCedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TXTHoraSalida = new javax.swing.JTextField();
        TXTPlaca = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(469, 53));
        jToolBar1.setMinimumSize(new java.awt.Dimension(448, 53));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-agregar-archivo-16.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setFocusable(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-propiedad-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-agregar-archivo-16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnElimiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-eliminar-16.png"))); // NOI18N
        btnElimiar.setText("Eliminar");
        btnElimiar.setFocusable(false);
        btnElimiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnElimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnElimiar);

        btnAgregarOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista-de-verificacion.png"))); // NOI18N
        btnAgregarOrder.setText("Agregar Orden");
        btnAgregarOrder.setFocusable(false);
        btnAgregarOrder.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarOrder.setMaximumSize(new java.awt.Dimension(115, 49));
        btnAgregarOrder.setMinimumSize(new java.awt.Dimension(115, 49));
        btnAgregarOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOrderActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregarOrder);

        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Mecanico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("C.C.");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        TXTId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTIdKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");

        TXTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTApellidoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Especialidad");

        TXTEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTEspecialidadKeyTyped(evt);
            }
        });

        TXTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTId)
                    .addComponent(TXTApellido)
                    .addComponent(TXTEspecialidad)
                    .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblMecanico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Especialidad"
            }
        ));
        tblMecanico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblMecanicoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblMecanico);

        panelCarro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agregar Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("C.C. Mecanico");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Placa");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Fecha Ingreso");

        TXTFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTFechaIngresoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Fecha Salida");

        TXTFechaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTFechaSalidaKeyTyped(evt);
            }
        });

        tblOrdenReparacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdMecanico", "Consecutivo", "Placa", "Fecha Ingreso", "Fecha Salida", "Hora Ingreso", "Hora Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblOrdenReparacion);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Hora Ingreso");

        TXTHoraIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHoraIngresoKeyTyped(evt);
            }
        });

        BTNAgregar.setText("Agregar");
        BTNAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarActionPerformed(evt);
            }
        });

        BtnCerrarOrden.setText("Cerrar");
        BtnCerrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarOrdenActionPerformed(evt);
            }
        });

        TXTCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCedulaKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Hora Salida");

        TXTHoraSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHoraSalidaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelCarroLayout = new javax.swing.GroupLayout(panelCarro);
        panelCarro.setLayout(panelCarroLayout);
        panelCarroLayout.setHorizontalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCarroLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCarroLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXTFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(TXTPlaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(panelCarroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(TXTHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(BTNAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCerrarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelCarroLayout.setVerticalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarroLayout.createSequentialGroup()
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXTFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TXTFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TXTHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TXTHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAgregar)
                    .addComponent(BtnCerrarOrden))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(panelCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int id = Integer.parseInt(TXTId.getText());
        String nombre = TXTNombre.getText();
        String apellido = TXTApellido.getText();
        String especialidad = TXTEspecialidad.getText();

        claseMecanico mecanico = new claseMecanico();
        mecanico.setIdentificacion(id);
        mecanico.setNombre(nombre);
        mecanico.setApellido(apellido);
        mecanico.setEspecialidad(especialidad);

        listaMecanico.add(mecanico);

        limpiarTabla();
        listarTabla();

        
        
        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTEspecialidad.setText("");
        btnAgregarOrder.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tblMecanico.getSelectedRow();
        
        TXTId.setText(String.valueOf(listaMecanico.get(index).getIdentificacion()));
        TXTNombre.setText(listaMecanico.get(index).getNombre());
        TXTApellido.setText(listaMecanico.get(index).getApellido());
        TXTEspecialidad.setText(listaMecanico.get(index).getEspecialidad());
        

        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnElimiar.setVisible(false);
        btnAgregarOrder.setVisible(false);
        btnGuardar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int index = tblMecanico.getSelectedRow();

        int id = Integer.parseInt(TXTId.getText());
        String nombre = TXTNombre.getText();
        String apellido = TXTApellido.getText();
        String especialidad = TXTEspecialidad.getText();

        listaMecanico.get(index).setIdentificacion(id);
        listaMecanico.get(index).setNombre(nombre);
        listaMecanico.get(index).setApellido(apellido);
        listaMecanico.get(index).setEspecialidad(especialidad);
        
        limpiarTabla();
        listarTabla();

        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTEspecialidad.setText("");

        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnElimiar.setVisible(true);
        btnGuardar.setVisible(false);
        btnAgregarOrder.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiarActionPerformed
        int index = tblMecanico.getSelectedRow();
        
        listaMecanico.remove(index);
        limpiarTabla();
        listarTabla();
        
        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTEspecialidad.setText("");
        ocultar();
    }//GEN-LAST:event_btnElimiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void BTNAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarActionPerformed
        int index = tblMecanico.getSelectedRow();

        int cedula = Integer.valueOf(TXTCedula.getText());
        String placa = TXTPlaca.getSelectedItem().toString();
        int consecutivo = 0;///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String fechaIngreso = TXTFechaIngreso.getText();
        String fechaSalida = TXTFechaSalida.getText();
        String horaIngreso = TXTHoraIngreso.getText();
        String horaSalida = TXTHoraSalida.getText();

        claseOrdenReparacion ordenReparacion = new claseOrdenReparacion();

        ordenReparacion.setIdMecanico(Integer.valueOf(cedula));
        ordenReparacion.setPlaca(placa);
        ordenReparacion.setConsecutivo(consecutivo);
        ordenReparacion.setFechaIngreso(fechaIngreso);
        ordenReparacion.setFechaSalida(fechaSalida);
        ordenReparacion.setHoraIngreso(horaIngreso);
        ordenReparacion.setHoraSalida(horaSalida);

        listaMecanico.get(index).OrdenReparacion.add(ordenReparacion);

        limpiarTablaOrden();
        listarTablaOrden();

        TXTFechaIngreso.setText("");
        TXTFechaSalida.setText("");
        TXTHoraIngreso.setText("");
        TXTHoraSalida.setText("");
    }//GEN-LAST:event_BTNAgregarActionPerformed

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void listarTablaOrden() {
        int index = tblMecanico.getSelectedRow();
        modeloOrden = (DefaultTableModel) tblOrdenReparacion.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[7]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaMecanico.get(index).OrdenReparacion.size(); i++) {
            obj[0] = listaMecanico.get(index).OrdenReparacion.get(i).getIdMecanico();
            obj[1] = listaMecanico.get(index).OrdenReparacion.get(i).getPlaca();
            obj[2] = listaMecanico.get(index).OrdenReparacion.get(i).getConsecutivo();
            obj[3] = listaMecanico.get(index).OrdenReparacion.get(i).getFechaIngreso();
            obj[4] = listaMecanico.get(index).OrdenReparacion.get(i).getFechaSalida();
            obj[5] = listaMecanico.get(index).OrdenReparacion.get(i).getHoraIngreso();
            obj[6] = listaMecanico.get(index).OrdenReparacion.get(i).getHoraSalida();
            modeloOrden.addRow(obj);
        }
        tblOrdenReparacion.setModel(modeloOrden);
    }

    public void limpiarTablaOrden() {
        for (int i = 0; i < modeloOrden.getRowCount(); i++) {
            modeloOrden.removeRow(i);
            i -= 1;
        }
    }


    private void BtnCerrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarOrdenActionPerformed

        panelCarro.setVisible(false);
        limpiarTablaOrden();
        listarTablaOrden();

    }//GEN-LAST:event_BtnCerrarOrdenActionPerformed

    private void tblMecanicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblMecanicoFocusGained

    }//GEN-LAST:event_tblMecanicoFocusGained

    private void btnAgregarOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOrderActionPerformed
        int index = tblMecanico.getSelectedRow();
        int valor = vistaInternaCliente.listaClientes.get(0).vehiculo.size();
        for (int i = 0; i < valor; i++) {
            String prueba = vistaInternaCliente.listaClientes.get(0).getVehiculo().get(i).getPlaca();
            TXTPlaca.addItem(prueba);
        }
        
        panelCarro.setVisible(true);
        TXTCedula.setText(String.valueOf(listaMecanico.get(index).getIdentificacion()));
        limpiarTablaOrden();
        listarTablaOrden();

    }//GEN-LAST:event_btnAgregarOrderActionPerformed

    private void TXTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTIdKeyTyped

    private void TXTCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCedulaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTCedulaKeyTyped

    private void TXTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombreKeyTyped
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_TXTNombreKeyTyped

    private void TXTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTApellidoKeyTyped

    private void TXTEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTEspecialidadKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTEspecialidadKeyTyped

    private void TXTFechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTFechaIngresoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTFechaIngresoKeyTyped

    private void TXTFechaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTFechaSalidaKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTFechaSalidaKeyTyped

    private void TXTHoraIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHoraIngresoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTHoraIngresoKeyTyped

    private void TXTHoraSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHoraSalidaKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTHoraSalidaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregar;
    private javax.swing.JButton BtnCerrarOrden;
    private javax.swing.JTextField TXTApellido;
    private javax.swing.JTextField TXTCedula;
    private javax.swing.JTextField TXTEspecialidad;
    private javax.swing.JTextField TXTFechaIngreso;
    private javax.swing.JTextField TXTFechaSalida;
    private javax.swing.JTextField TXTHoraIngreso;
    private javax.swing.JTextField TXTHoraSalida;
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JComboBox<String> TXTPlaca;
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarOrder;
    public static javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnElimiar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JPanel panelCarro;
    private javax.swing.JTable tblMecanico;
    private javax.swing.JTable tblOrdenReparacion;
    // End of variables declaration//GEN-END:variables
}
