/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista.Productos;

import Modelo.Productos.Productos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian y Reyman
 */
public class ProductosBuscaView extends javax.swing.JDialog {

    Productos productos;
    ArrayList<Productos> lista;
    DefaultTableModel model;
    String cedula;
    Productos productoSeleccionado; // Nuevo atributo para guardar el producto completo

    /**
     * Creates new form DirectorBuscaView
     */
    public ProductosBuscaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ProductosBuscaView(java.awt.Frame parent, boolean modal,
            ArrayList<Productos> lista) {
        super(parent, modal);
        initComponents();
        this.lista = lista;
    }

    public JTable getTblDatos() {
        return tblProductos;
    }
    
    // Método para obtener el producto seleccionado
    public Productos getProductoSeleccionado() {
        return productoSeleccionado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscar.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        mostrarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String titulos[] = {"Cédula", "Nombre", "Fecha de nacimiento", "Fecha de ingreso", "Fecha de despido",
            "Dirección", "Teléfono", "Email", "Puesto", "CédulaJefe"};
        model = new DefaultTableModel(null, titulos);

        for (int i = 0; i < lista.size(); i++) {
            productos = lista.get(i);
            if (productos.getNombre().toLowerCase().contains(txtBuscar.getText().toLowerCase())) {
                Object nuevaFila[] = {productos.getCodigo(), productos.getNombre(),
                    productos.getCategoria(), productos.getPrecio(), productos.getCantDisponible(),
                    productos.getProveedor(), productos.getFechaPIngresado()};
                model.addRow(nuevaFila);
            }
        }
        tblProductos.setModel(model);

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMousePressed
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tblProductos.getSelectedRow();
            this.cedula = tblProductos.getValueAt(filaSeleccionada, 0).toString();
            
            // Recuperar el producto completo de la lista
            this.productoSeleccionado = lista.get(filaSeleccionada);
            this.dispose();
        }
    }//GEN-LAST:event_tblProductosMousePressed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
         if (tblProductos.getSelectedRowCount() == 1) {
            int filaSeleccionada = tblProductos.getSelectedRow();
            this.cedula = tblProductos.getValueAt(filaSeleccionada, 0).toString();
            
            // Recuperar el producto completo de la lista
            this.productoSeleccionado = lista.get(filaSeleccionada);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar 1 registro");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    public void mostrarTabla() {
        String titulos[] = {"Cédula", "Nombre", "Categoría",
            "Precio", "CantDisponible", "Proveedor", "FechaProductoIngresado"};
        model = new DefaultTableModel(null, titulos);
        //No se usó el foreach porque el índice no lo estamos necesitando 
        for (int i = 0; i < lista.size(); i++) {
            productos = lista.get(i);
            Object nuevaFila[] = {productos.getCodigo(), productos.getNombre(),
                productos.getCategoria(), productos.getPrecio(), productos.getCantDisponible(),
                productos.getProveedor(), productos.getFechaPIngresado()};

            model.addRow(nuevaFila);
        }
        tblProductos.setModel(model);
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
            java.util.logging.Logger.getLogger(ProductosBuscaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosBuscaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosBuscaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosBuscaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductosBuscaView dialog = new ProductosBuscaView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
