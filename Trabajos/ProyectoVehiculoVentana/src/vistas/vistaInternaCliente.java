package vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.claseCliente;
import modelo.claseVehiculo;

public class vistaInternaCliente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeloCarro;
    public static ArrayList<claseCliente> listaClientes = new ArrayList();

    public vistaInternaCliente() {
        initComponents();
        this.setTitle("Cliente");
        modelo = new DefaultTableModel();
        modeloCarro = new DefaultTableModel();
        
        btnGuardar.setVisible(false);
        panelCarro.setVisible(false);
        listarTabla();
        ocultar();
    }

    public void ocultar() {
        int index = modelo.getRowCount();
        if (index == 0) {
            btnAgregarCarro.setVisible(false);
        } else {
            btnAgregarCarro.setVisible(true);
        }
    }

    public void listarTabla() {
        modelo = (DefaultTableModel) tblRegistro.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[6]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaClientes.size(); i++) {
            obj[0] = listaClientes.get(i).getId();
            obj[1] = listaClientes.get(i).getNombre();
            obj[2] = listaClientes.get(i).getApellido();
            obj[3] = listaClientes.get(i).getCorreo();
            obj[4] = listaClientes.get(i).getTelefono();
            obj[5] = listaClientes.get(i).getDomicilio();
            modelo.addRow(obj);
        }
        tblRegistro.setModel(modelo);
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
        btnAgregarCarro = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXTApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXTCorreo = new javax.swing.JTextField();
        TXTTelefono = new javax.swing.JTextField();
        TXTDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        panelCarro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTMarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTModelo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TXTPlaca = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        TXTColor = new javax.swing.JTextField();
        BTNAgregarCarro = new javax.swing.JButton();
        BtnCerrarCarro = new javax.swing.JButton();
        TXTCedula = new javax.swing.JTextField();

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

        btnAgregarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/coche.png"))); // NOI18N
        btnAgregarCarro.setText("Agregar Carro");
        btnAgregarCarro.setFocusable(false);
        btnAgregarCarro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCarro.setMaximumSize(new java.awt.Dimension(110, 44));
        btnAgregarCarro.setMinimumSize(new java.awt.Dimension(89, 44));
        btnAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarroActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregarCarro);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N

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
        jLabel2.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Telefono");

        TXTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTelefonoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Domicilio");

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTId)
                    .addComponent(TXTApellido)
                    .addComponent(TXTCorreo)
                    .addComponent(TXTTelefono)
                    .addComponent(TXTDomicilio)
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
                    .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Telefono", "Domicilio"
            }
        ));
        tblRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblRegistroFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        panelCarro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agregar Carro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("C.C.");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Marca");

        TXTMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTMarcaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Modelo");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Placa");

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "Marca", "Modelo", "Placa", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCarros);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Color");

        TXTColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTColorKeyTyped(evt);
            }
        });

        BTNAgregarCarro.setText("Agregar");
        BTNAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarCarroActionPerformed(evt);
            }
        });

        BtnCerrarCarro.setText("Cerrar");
        BtnCerrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarCarroActionPerformed(evt);
            }
        });

        TXTCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCedulaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelCarroLayout = new javax.swing.GroupLayout(panelCarro);
        panelCarro.setLayout(panelCarroLayout);
        panelCarroLayout.setHorizontalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarroLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTColor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BTNAgregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCerrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelCarroLayout.setVerticalGroup(
            panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarroLayout.createSequentialGroup()
                .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TXTColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNAgregarCarro)
                            .addComponent(BtnCerrarCarro)))
                    .addGroup(panelCarroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int id = Integer.parseInt(TXTId.getText());
        String nombre = TXTNombre.getText();
        String apellido = TXTApellido.getText();
        String correo = TXTCorreo.getText();
        String domicilio = TXTDomicilio.getText();
        long telefono = Long.parseLong(TXTTelefono.getText());

        claseCliente cliente = new claseCliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCorreo(correo);
        cliente.setDomicilio(domicilio);
        cliente.setTelefono(telefono);

        listaClientes.add(cliente);

        limpiarTabla();
        listarTabla();

        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTCorreo.setText("");
        TXTDomicilio.setText("");
        TXTTelefono.setText("");
        btnAgregarCarro.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tblRegistro.getSelectedRow();
        TXTId.setText(String.valueOf(listaClientes.get(index).getId()));
        TXTNombre.setText(listaClientes.get(index).getNombre());
        TXTApellido.setText(listaClientes.get(index).getApellido());
        TXTCorreo.setText(listaClientes.get(index).getCorreo());
        TXTDomicilio.setText(listaClientes.get(index).getDomicilio());
        TXTTelefono.setText(String.valueOf(listaClientes.get(index).getTelefono()));

        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnElimiar.setVisible(false);
        btnAgregarCarro.setVisible(false);
        btnGuardar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int index = tblRegistro.getSelectedRow();

        int id = Integer.parseInt(TXTId.getText());
        String nombre = TXTNombre.getText();
        String apellido = TXTApellido.getText();
        String correo = TXTCorreo.getText();
        String domicilio = TXTDomicilio.getText();
        long telefono = Long.valueOf(TXTTelefono.getText());

        listaClientes.get(index).setId(id);
        listaClientes.get(index).setNombre(nombre);
        listaClientes.get(index).setApellido(apellido);
        listaClientes.get(index).setCorreo(correo);
        listaClientes.get(index).setDomicilio(domicilio);
        listaClientes.get(index).setTelefono(telefono);

        limpiarTabla();
        listarTabla();

        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTCorreo.setText("");
        TXTDomicilio.setText("");
        TXTTelefono.setText("");

        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnElimiar.setVisible(true);
        btnGuardar.setVisible(false);
        btnAgregarCarro.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiarActionPerformed
        int index = tblRegistro.getSelectedRow();
        listaClientes.remove(index);
        limpiarTabla();
        listarTabla();

        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTCorreo.setText("");
        TXTDomicilio.setText("");
        TXTTelefono.setText("");
        ocultar();
    }//GEN-LAST:event_btnElimiarActionPerformed

    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
                
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void BTNAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarCarroActionPerformed
        int index = tblRegistro.getSelectedRow();

        int idCliente = Integer.valueOf(TXTCedula.getText());
        String marca = TXTMarca.getText();
        String modelo = TXTModelo.getText();
        String placa = TXTPlaca.getText();
        String color = TXTColor.getText();

        claseVehiculo estante = new claseVehiculo();

        estante.setIdCliente(idCliente);
        estante.setMarca(marca);
        estante.setModelo(modelo);
        estante.setPlaca(placa);
        estante.setColor(color);

        listaClientes.get(index).vehiculo.add(estante);

        limpiarTablaCarro();

        listarTablaCarro(index);

        TXTCedula.setText("");
        TXTMarca.setText("");
        TXTModelo.setText("");
        TXTPlaca.setText("");
        TXTColor.setText("");
    }//GEN-LAST:event_BTNAgregarCarroActionPerformed

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void listarTablaCarro(int index) {
        modeloCarro = (DefaultTableModel) tblCarros.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[5]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaClientes.get(index).vehiculo.size(); i++) {
            obj[0] = listaClientes.get(index).vehiculo.get(i).getIdCliente();
            obj[1] = listaClientes.get(index).vehiculo.get(i).getMarca();
            obj[2] = listaClientes.get(index).vehiculo.get(i).getModelo();
            obj[3] = listaClientes.get(index).vehiculo.get(i).getPlaca();
            obj[4] = listaClientes.get(index).vehiculo.get(i).getColor();
            modeloCarro.addRow(obj);
        }
        tblCarros.setModel(modeloCarro);
    }

    public void limpiarTablaCarro() {
        for (int i = 0; i < modeloCarro.getRowCount(); i++) {
            modeloCarro.removeRow(i);
            i -= 1;
        }
    }


    private void BtnCerrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarCarroActionPerformed
        panelCarro.setVisible(false);
        limpiarTablaCarro();
    }//GEN-LAST:event_BtnCerrarCarroActionPerformed

    private void tblRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRegistroFocusGained

    }//GEN-LAST:event_tblRegistroFocusGained

    private void btnAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarroActionPerformed

        int index = tblRegistro.getSelectedRow();
        panelCarro.setVisible(true);
        TXTCedula.setText(String.valueOf(listaClientes.get(index).getId()));
        limpiarTablaCarro();
        listarTablaCarro(index);

    }//GEN-LAST:event_btnAgregarCarroActionPerformed

    private void TXTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTIdKeyTyped

    private void TXTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTTelefonoKeyTyped

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

        if (!(minusculas || mayusculas || espacio)) {
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

    private void TXTMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTMarcaKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTMarcaKeyTyped

    private void TXTColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTColorKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTColorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregarCarro;
    private javax.swing.JButton BtnCerrarCarro;
    private javax.swing.JTextField TXTApellido;
    private javax.swing.JTextField TXTCedula;
    private javax.swing.JTextField TXTColor;
    private javax.swing.JTextField TXTCorreo;
    private javax.swing.JTextField TXTDomicilio;
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTModelo;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTPlaca;
    private javax.swing.JTextField TXTTelefono;
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCarro;
    public static javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnElimiar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JPanel panelCarro;
    private javax.swing.JTable tblCarros;
    public static javax.swing.JTable tblRegistro;
    // End of variables declaration//GEN-END:variables
}
