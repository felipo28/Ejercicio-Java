package vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.claseEstante;
import modelo.claseLibro;

public class vistaInternaEstanteLibros extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeloLibros;
    ArrayList<claseEstante> listaEstantes;

    public vistaInternaEstanteLibros() {
        initComponents();
        this.setTitle("Estanterias de libros");
        modelo = new DefaultTableModel();
        modeloLibros = new DefaultTableModel();
        listaEstantes = new ArrayList();
        btnGuardar.setVisible(false);
        panelLibros.setVisible(false);
    }

    public void listarTabla() {
        modelo = (DefaultTableModel) tblEstantes.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[3]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaEstantes.size(); i++) {
            obj[0] = listaEstantes.get(i).getId();
            obj[1] = listaEstantes.get(i).getNombre();
            obj[2] = listaEstantes.get(i).getDescripcion();
            modelo.addRow(obj);
        }
        tblEstantes.setModel(modelo);
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    
    
    public void listarTablaLibros(int index) {
        modeloLibros = (DefaultTableModel) tblLibros.getModel(); // deja por omision los valores de jtable segun diseño
        Object[] obj = new Object[6]; //cree un objeto tipo arreglo
        for (int i = 0; i < listaEstantes.get(index).libros.size(); i++) {
            obj[0] = listaEstantes.get(index).libros.get(i).getEstanteria();
            obj[1] = listaEstantes.get(index).libros.get(i).getIsbn();
            obj[2] = listaEstantes.get(index).libros.get(i).getNombre();
            obj[3] = listaEstantes.get(index).libros.get(i).getAutor();
            obj[4] = listaEstantes.get(index).libros.get(i).getPaginas();
            obj[5] = listaEstantes.get(index).libros.get(i).isPrestado();
            modeloLibros.addRow(obj);
        }
        tblLibros.setModel(modeloLibros);
    }

    public void limpiarTablaLibros(int index) {
        for (int i = 0; i < modeloLibros.getRowCount(); i++) {
            modeloLibros.removeRow(i);
            i -= 1;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstantes = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElimiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        panelLibros = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXTIsbn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXTNombreLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTAutor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        TXTPaginas = new javax.swing.JTextField();
        CheckPrestado = new javax.swing.JCheckBox();
        BTNAgregarBiblioteca = new javax.swing.JButton();
        BtnCerrarBiblioteca = new javax.swing.JButton();
        TXTEstanteria = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Estanterias de libros");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripcion");

        TXTArea.setColumns(20);
        TXTArea.setRows(5);
        jScrollPane1.setViewportView(TXTArea);

        tblEstantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblEstantesFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(tblEstantes);

        jToolBar1.setRollover(true);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-agregar-archivo-16.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setFocusable(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-propiedad-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-agregar-archivo-16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnElimiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-eliminar-16.png"))); // NOI18N
        btnElimiar.setText("Eliminar");
        btnElimiar.setFocusable(false);
        btnElimiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnElimiar);

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

        panelLibros.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar libro por estanteria"));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Libros biblioteca");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Estanteria");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("ISBN");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Autor");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estanterias", "ISBN", "Nombre", "Autor", "Paginas", "Prestado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblLibros);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Paginas");

        CheckPrestado.setText("Prestado");

        BTNAgregarBiblioteca.setText("Agregar");
        BTNAgregarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarBibliotecaActionPerformed(evt);
            }
        });

        BtnCerrarBiblioteca.setText("Cerrar");
        BtnCerrarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLibrosLayout = new javax.swing.GroupLayout(panelLibros);
        panelLibros.setLayout(panelLibrosLayout);
        panelLibrosLayout.setHorizontalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addComponent(CheckPrestado)
                        .addGap(72, 72, 72)
                        .addComponent(BTNAgregarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCerrarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(TXTIsbn)
                            .addComponent(TXTNombreLibro)
                            .addComponent(TXTAutor)
                            .addComponent(jLabel10)
                            .addComponent(TXTPaginas)
                            .addComponent(TXTEstanteria, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLibrosLayout.setVerticalGroup(
            panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLibrosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckPrestado)
                    .addComponent(BTNAgregarBiblioteca)
                    .addComponent(BtnCerrarBiblioteca))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(TXTNombre)
                            .addComponent(TXTIdentificacion)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(panelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int id = Integer.parseInt(TXTIdentificacion.getText());
        String nombre = TXTNombre.getText();
        String descripcion = TXTArea.getText();

        claseEstante estante = new claseEstante();
        estante.setId(id);
        estante.setNombre(nombre);
        estante.setDescripcion(descripcion);

        listaEstantes.add(estante);

        limpiarTabla();
        listarTabla();

        TXTIdentificacion.setText("");
        TXTNombre.setText("");
        TXTArea.setText("");

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tblEstantes.getSelectedRow();
        TXTIdentificacion.setText(String.valueOf(listaEstantes.get(index).getId()));
        TXTNombre.setText(listaEstantes.get(index).getNombre());
        TXTArea.setText(listaEstantes.get(index).getDescripcion());

        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnElimiar.setVisible(false);
        btnGuardar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int id = Integer.parseInt(TXTIdentificacion.getText());
        int index = tblEstantes.getSelectedRow();
        String nombre = TXTNombre.getText();
        String descripcion = TXTArea.getText();

        listaEstantes.get(index).setId(id);
        listaEstantes.get(index).setNombre(nombre);
        listaEstantes.get(index).setDescripcion(descripcion);

        limpiarTabla();
        listarTabla();

        TXTIdentificacion.setText("");
        TXTNombre.setText("");
        TXTArea.setText("");
        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnElimiar.setVisible(true);
        btnGuardar.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiarActionPerformed
        int index = tblEstantes.getSelectedRow();
        listaEstantes.remove(index);
        limpiarTabla();
        listarTabla();

        TXTIdentificacion.setText("");
        TXTNombre.setText("");
        TXTArea.setText("");
    }//GEN-LAST:event_btnElimiarActionPerformed

    private void tblEstantesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblEstantesFocusGained
        int index = tblEstantes.getSelectedRow();
        if (index>=0) {
            panelLibros.setVisible(true);
        String nombreEstante = listaEstantes.get(index).getNombre();
        TXTEstanteria.setText(nombreEstante);
        listarTablaLibros(index);
        }
        
        
    }//GEN-LAST:event_tblEstantesFocusGained

    private void BtnCerrarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarBibliotecaActionPerformed
        panelLibros.setVisible(false);
        int index = tblLibros.getSelectedRow(); 
        limpiarTablaLibros(index);
    }//GEN-LAST:event_BtnCerrarBibliotecaActionPerformed

    private void BTNAgregarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarBibliotecaActionPerformed
        int index = tblEstantes.getSelectedRow();
        
        claseLibro libroNuevo = new claseLibro();
       
        String Estanteria = TXTEstanteria.getText();
        String Isbn = TXTIsbn.getText();
        String NombreLibro = TXTNombreLibro.getText();
        String Autor = TXTAutor.getText();
        int Paginas = Integer.valueOf(TXTPaginas.getText());
        boolean Prestado = CheckPrestado.isSelected();
        
        claseLibro estante = new claseLibro();
        
        estante.setEstanteria(Estanteria);
        estante.setIsbn(Isbn);
        estante.setNombre(NombreLibro);
        estante.setAutor(Autor);
        estante.setPaginas(Paginas);
        estante.setPrestado(Prestado);
        
        listaEstantes.get(index).libros.add(estante);
        
        limpiarTablaLibros(index);
        
        listarTablaLibros(index);
        
        TXTIsbn.setText("");
        TXTNombreLibro.setText("");
        TXTAutor.setText("");
        TXTPaginas.setText("");
        
        CheckPrestado.setSelected(false);
        
    }//GEN-LAST:event_BTNAgregarBibliotecaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregarBiblioteca;
    private javax.swing.JButton BtnCerrarBiblioteca;
    private javax.swing.JCheckBox CheckPrestado;
    private javax.swing.JTextArea TXTArea;
    private javax.swing.JTextField TXTAutor;
    private javax.swing.JTextField TXTEstanteria;
    private javax.swing.JTextField TXTIdentificacion;
    private javax.swing.JTextField TXTIsbn;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTNombreLibro;
    private javax.swing.JTextField TXTPaginas;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnElimiar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JPanel panelLibros;
    private javax.swing.JTable tblEstantes;
    private javax.swing.JTable tblLibros;
    // End of variables declaration//GEN-END:variables
}
