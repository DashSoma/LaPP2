package Vistas;

import clases.Pluses;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian y Reyman 
 */
public class PlusesView extends javax.swing.JDialog {
    //Array Lits y objetos de clases determinadas
    Pluses pluses;
    ArrayList<Pluses> lista;
    DefaultTableModel model;

    /**
     *
     * @param parent
     * @param modal
     * @param lista de pluses.
     */
    public PlusesView(java.awt.Frame parent, boolean modal, ArrayList<Pluses> lista) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.lista = lista;
    }

    /**
     *
     * @param parent
     * @param modal
     */
    public PlusesView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtIdPlus = new javax.swing.JTextField();
        lblPorcIncre = new javax.swing.JLabel();
        txtPorcIncremento = new javax.swing.JTextField();
        lblTituloPlus = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlus = new javax.swing.JTable();
        pnlBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblCant = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Pluses ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gestión de Pluses ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id del Plus:");

        txtIdPlus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPorcIncre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPorcIncre.setText("Porcentaje Incremento");

        txtPorcIncremento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTituloPlus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTituloPlus.setText("Título del Plus:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPorcIncre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(txtPorcIncremento, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtIdPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloPlus)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcIncre)
                    .addComponent(txtPorcIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        tblPlus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPlus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPlus.getTableHeader().setReorderingAllowed(false);
        tblPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPlusMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlus);

        pnlBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insert.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clean.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnInsertar)
                .addGap(15, 15, 15)
                .addComponent(btnEditar)
                .addGap(15, 15, 15)
                .addComponent(btnEliminar)
                .addGap(15, 15, 15)
                .addComponent(btnLimpiar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        lblBuscar.setText("Buscar: ");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCant.setText("Cantidad de registros:");

        txtCant.setEditable(false);
        txtCant.setBackground(new java.awt.Color(204, 204, 204));
        txtCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCant)
                                .addGap(18, 18, 18)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     * Botón para limpiar los campos de escritura o asignación.
     *
     * @param evt ActionPerformed
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdPlus.setText("");
        txtTitulo.setText("");
        txtPorcIncremento.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    /**
     * Botón para insertar todos los datos al JTable de Pluses.
     *
     * @param evt ActionPerformed
     */
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Pluses pluses = new Pluses();

        if (!txtIdPlus.getText().isEmpty() && !txtPorcIncremento.getText().isEmpty()) {
            try {
                // Establece el ID y el título del plus
                pluses.setIdPlus(Integer.parseInt(txtIdPlus.getText()));
                pluses.setTitulo(txtTitulo.getText());

                // Obtén el porcentaje de incremento y verifica si está en el rango de 1 a 100
                int porcIncremento = Integer.parseInt(txtPorcIncremento.getText());
                if (porcIncremento < 1 || porcIncremento > 100) {
                    JOptionPane.showMessageDialog(this, "El porcentaje de incremento debe estar entre 1 y 100");
                    txtPorcIncremento.requestFocus();
                    return;
                }

                pluses.setPorIncremento(porcIncremento);

                // Verifica si el ID o el título ya existen
                if (existeIdPlus(pluses.getIdPlus())) {
                    JOptionPane.showMessageDialog(this, "El ID ya existe");
                } else if (existeTitulo(pluses.getTitulo())) {
                    JOptionPane.showMessageDialog(this, "El título del plus ya existe");
                } else {
                    // Agrega el plus a la lista y actualiza la tabla
                    lista.add(pluses);
                    JOptionPane.showMessageDialog(this, "Plus agregado");
                    mostrarTabla();
                    btnLimpiarActionPerformed(null);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El ID y el Porcentaje deben ser numéricos");
                txtIdPlus.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Se requiere el ID y el Porcentaje");
        }

    }//GEN-LAST:event_btnInsertarActionPerformed
    /**
     * Evento en el cual busca los registros que hay en el JTable.
     *
     * @param evt
     */
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String titulos[] = {"Id Plus", "Título", "Porcentaje Incremento"};
        model = new DefaultTableModel(null, titulos);

        for (int i = 0; i < lista.size(); i++) {
            pluses = lista.get(i);
            if (pluses.getTitulo().toLowerCase().contains(txtBuscar.getText().toLowerCase())) {
                Object nuevaFila[] = {pluses.getIdPlus(), pluses.getTitulo(), pluses.getPorIncremento()
                };
                model.addRow(nuevaFila);
            }
        }
        tblPlus.setModel(model);

        txtCant.setText(String.valueOf(model.getRowCount()));
    }//GEN-LAST:event_txtBuscarKeyReleased
    /**
     * Evento que se atica cuando se presiona los registros del JTable y se
     * muesrran en los cuadros de texto.
     *
     * @param evt
     */
    private void tblPlusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlusMousePressed
        if (evt.getClickCount() == 1) {
            txtIdPlus.setText(String.valueOf(tblPlus.getValueAt(tblPlus.getSelectedRow(), 0)));
            txtTitulo.setText(String.valueOf(tblPlus.getValueAt(tblPlus.getSelectedRow(), 1)));
            txtPorcIncremento.setText(String.valueOf(tblPlus.getValueAt(tblPlus.getSelectedRow(), 2)));
        }
    }//GEN-LAST:event_tblPlusMousePressed
    /**
     * Botón para eliminar un registro seleccionado.
     *
     * @param evt
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblPlus.getSelectedRowCount() == 1) {
            int resp = JOptionPane.showConfirmDialog(this, "¿Desea borrar el resgitro?");
            if (resp == 0) {  //El usuario quiere eliminar, Respuesta si
                int fila = tblPlus.getSelectedRow();
                if (lista.remove(lista.get(fila))) {
                    mostrarTabla();

                } else {
                    JOptionPane.showMessageDialog(this, "Error de borado");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar 1 registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Botón para editar un regsitro seleccionado.
     *
     * @param evt
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblPlus.getSelectedRowCount() == 1) {

            int fila = tblPlus.getSelectedRow();
            pluses = new Pluses();

            if (!txtTitulo.getText().isEmpty()) {

                pluses.setIdPlus(Integer.parseInt(
                tblPlus.getValueAt(fila, 0).toString()));
                pluses.setTitulo(txtTitulo.getText());
                pluses.setPorIncremento(Integer.parseInt(txtPorcIncremento.getText()));

                if (lista.set(fila, pluses) != null) {
                    JOptionPane.showMessageDialog(
                            this, "Plus editado");
                    mostrarTabla();
                    btnLimpiarActionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(
                            this, "Error al editar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar 1 registro para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Refresca la tabla
        mostrarTabla();
    }//GEN-LAST:event_formWindowActivated
    // TODO add your handling code here:
    private void txtNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacActionPerformed
    /**
     * Método para verificar que el ID sea única
     *
     * @param id
     * @return
     */
    public boolean existeIdPlus(int id) {
        for (int i = 0; i < lista.size(); i++) {
            pluses = lista.get(i);
            if (pluses.getIdPlus() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica que el Nombres del puesto sea único
     *
     * @param titulo
     * @return
     */
    public boolean existeTitulo(String titulo) {
        // Convertir el título ingresado a mayúsculas
        String tituloEnMayusculas = titulo.toUpperCase();

        for (int i = 0; i < lista.size(); i++) {
            pluses = lista.get(i);
            // Convertir el título del plus a mayúsculas antes de compararlo
            if (pluses.getTitulo().toUpperCase().equals(tituloEnMayusculas)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra los datos y títulos en el JTable
     */
    public void mostrarTabla() {
        String titulos[] = {"Id Plus", "Título", "Porcentaje Incremento"};
        model = new DefaultTableModel(null, titulos);
        //No se usó el foreach porque el índice lo estamos necesitando 
        for (int i = 0; i < lista.size(); i++) {
            pluses = lista.get(i);
            Object nuevaFila[] = {pluses.getIdPlus(), pluses.getTitulo(),
                pluses.getPorIncremento()};
            model.addRow(nuevaFila);
        }
        tblPlus.setModel(model);

        txtCant.setText(String.valueOf(model.getRowCount()));
    }

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
            java.util.logging.Logger.getLogger(PlusesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlusesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlusesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlusesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlusesView dialog = new PlusesView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPorcIncre;
    private javax.swing.JLabel lblTituloPlus;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTable tblPlus;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtIdPlus;
    private javax.swing.JTextField txtPorcIncremento;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
