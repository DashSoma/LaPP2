/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vistas;

import Modelo.Productos.Productos;
import clases.Planilla;
import clases.Pluses;
import clases.PlusesColab;
import Modelo.Proveedores.Proveedor;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class PlanillaView extends javax.swing.JDialog {

    Planilla planilla;
    Productos colaborador;
    Proveedor puestos;
    PlusesColab plusesColab;
    MostrarPlanillaView mostrar;
    ArrayList<Planilla> listaPlanilla;
    ArrayList<PlusesColab> listaPColab;
    ArrayList<Pluses> listaPluses;
    ArrayList<Productos> listaC;
    ArrayList<Proveedor> listaPuesto;
    DefaultTableModel model;

    
    public PlanillaView(java.awt.Frame parent, boolean modal, ArrayList<Planilla> listaPlanilla, ArrayList<Proveedor> listaPuesto,
            ArrayList<PlusesColab> listaPColab, ArrayList<Pluses> listaPluses, ArrayList<Productos> listaC) {
        super(parent, modal);
        initComponents();
        this.listaPlanilla = listaPlanilla;
        this.listaPuesto = listaPuesto;
        this.listaPColab = listaPColab;
        this.listaPluses = listaPluses;
        this.listaC = listaC;
    }

    public PlanillaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGenerar = new javax.swing.JPanel();
        lblFechaActual = new javax.swing.JLabel();
        lblMesGenerar = new javax.swing.JLabel();
        lblAñoGenerar = new javax.swing.JLabel();
        cmbMesGenPlant = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        fmtAñoPago = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        pnlMostrarPlanilla = new javax.swing.JPanel();
        lblMesMostrar = new javax.swing.JLabel();
        lblAñoMostrar = new javax.swing.JLabel();
        cmbMesMostrarP = new javax.swing.JComboBox<>();
        btnMostrarPlanilla = new javax.swing.JButton();
        fmtAñoMostrar = new javax.swing.JFormattedTextField();
        pnlRegistrosPlanilla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlanilla = new javax.swing.JTable();
        pnlFiltrar = new javax.swing.JPanel();
        lblFiltrar = new javax.swing.JLabel();
        lblColaborador = new javax.swing.JLabel();
        chkFiltColab = new javax.swing.JCheckBox();
        chkFiltMes = new javax.swing.JCheckBox();
        lblMes = new javax.swing.JLabel();
        chkAño = new javax.swing.JCheckBox();
        lblAño = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblCant = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Planillas ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlGenerar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Generar Planilla "));

        lblFechaActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaActual.setText("Fecha Actual:");

        lblMesGenerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMesGenerar.setText("Mes:");

        lblAñoGenerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAñoGenerar.setText("Año:");

        cmbMesGenPlant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMesGenPlant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesGenPlantActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        try {
            fmtAñoPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGenerarLayout = new javax.swing.GroupLayout(pnlGenerar);
        pnlGenerar.setLayout(pnlGenerarLayout);
        pnlGenerarLayout.setHorizontalGroup(
            pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenerarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGenerarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGenerarLayout.createSequentialGroup()
                        .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAñoGenerar)
                            .addComponent(lblMesGenerar)
                            .addComponent(lblFechaActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbMesGenPlant, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fmtAñoPago))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        pnlGenerarLayout.setVerticalGroup(
            pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenerarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaActual)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMesGenPlant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMesGenerar))
                .addGap(46, 46, 46)
                .addGroup(pnlGenerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAñoGenerar)
                    .addComponent(fmtAñoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlMostrarPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Mostrar Planilla "));

        lblMesMostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMesMostrar.setText("Mes:");

        lblAñoMostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAñoMostrar.setText("Año:");

        cmbMesMostrarP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        btnMostrarPlanilla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMostrarPlanilla.setText("Mostrar Planilla ");
        btnMostrarPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPlanillaActionPerformed(evt);
            }
        });

        try {
            fmtAñoMostrar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlMostrarPlanillaLayout = new javax.swing.GroupLayout(pnlMostrarPlanilla);
        pnlMostrarPlanilla.setLayout(pnlMostrarPlanillaLayout);
        pnlMostrarPlanillaLayout.setHorizontalGroup(
            pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarPlanillaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAñoMostrar)
                    .addComponent(lblMesMostrar))
                .addGap(33, 33, 33)
                .addGroup(pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMostrarPlanillaLayout.createSequentialGroup()
                        .addComponent(cmbMesMostrarP, 0, 161, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(pnlMostrarPlanillaLayout.createSequentialGroup()
                        .addComponent(fmtAñoMostrar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostrarPlanillaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnlMostrarPlanillaLayout.setVerticalGroup(
            pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarPlanillaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMesMostrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMesMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMostrarPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAñoMostrar)
                    .addComponent(fmtAñoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btnMostrarPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pnlRegistrosPlanilla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Todos los registros de planillas "));

        tblPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPlanilla);

        javax.swing.GroupLayout pnlRegistrosPlanillaLayout = new javax.swing.GroupLayout(pnlRegistrosPlanilla);
        pnlRegistrosPlanilla.setLayout(pnlRegistrosPlanillaLayout);
        pnlRegistrosPlanillaLayout.setHorizontalGroup(
            pnlRegistrosPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosPlanillaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlRegistrosPlanillaLayout.setVerticalGroup(
            pnlRegistrosPlanillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrosPlanillaLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblFiltrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltrar.setText("Filtrar por:");

        lblColaborador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblColaborador.setText("Colaborador:");

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMes.setText("Mes: ");

        lblAño.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAño.setText("Año:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlFiltrarLayout = new javax.swing.GroupLayout(pnlFiltrar);
        pnlFiltrar.setLayout(pnlFiltrarLayout);
        pnlFiltrarLayout.setHorizontalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkFiltColab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkFiltMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAño)
                .addGap(12, 12, 12)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFiltrarLayout.setVerticalGroup(
            pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkFiltColab)
                    .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblColaborador, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFiltrar))
                    .addGroup(pnlFiltrarLayout.createSequentialGroup()
                        .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMes)
                                .addComponent(lblAño)
                                .addComponent(chkAño, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(1, 1, 1))
                    .addComponent(chkFiltMes))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblCant.setText("Cantidad de Registros:");

        txtCant.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(pnlGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(pnlMostrarPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistrosPlanilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMostrarPlanilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(pnlFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegistrosPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        mostrarTabla();

    }//GEN-LAST:event_formWindowActivated
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        String mesSeleccionado = cmbMesGenPlant.getSelectedItem().toString();
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaSeleccionada = dtpFechActual.getDate();
        String textoAño = fmtAñoPago.getText().trim();

        if (listaC.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aún no se ha registrado ningún colaborador. \nPor favor, haga el registro antes de generar la planilla", "Sin colaboradores registrados", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Es obligatorio seleccionar una fecha actual. \nPor favor, seleccione una.", "Fecha Actual Vacía", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!fechaActual.equals(fechaSeleccionada)) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es la actual. \nPor favor revise la fecha de creación de la planilla.", "Fecha Incorrecta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (textoAño.length() != 10) {
            JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto. \nPor favor, ingrese la fecha en formato dd-MM-yyyy.", "Formato Incorrecto", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String año = textoAño.substring(6, 10);

        int añoPago = Integer.parseInt(año);
        int añoActual = fechaActual.getYear();

        if (añoPago < añoActual) {
            JOptionPane.showMessageDialog(this, "La fecha de pago que estás tratando de decretar, ya pasó.", "Fecha Obsoleta", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!listaC.isEmpty()) {

            for (Planilla p : listaPlanilla) {
                if (p.getMesPuesto().equals(mesSeleccionado)) {
                    JOptionPane.showMessageDialog(null, "El mes ya ha sido registrado. \nPor favor, elige otro mes.", "Mes Repetido", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            for (int i = 0; i < listaC.size(); i++) {
                planilla = new Planilla();
                colaborador = listaC.get(i);

                planilla.setFechaCreacion(txtFecha);
                planilla.setMesPuesto(cmbMesGenPlant.getSelectedItem().toString());
                planilla.setFechaPago(fmtAñoPago.getText());
                planilla.setCedulaEmpleado(colaborador.getCodigo());
                planilla.setNomEmpleado(colaborador.getNombre());
                planilla.setSalBase(getSalarioEmpleado(colaborador.getPrecio()));

                float salarioBase = getSalarioEmpleado(colaborador.getPrecio());

                // Busca el PlusesColab asociado con la cédula del colaborador actual
                plusesColab = obtenerPlusesColabPorCedula(colaborador.getCodigo());

                if (plusesColab != null) {
                    planilla.setTotalPluses(getAsignarPlus(plusesColab.getCedula(), salarioBase));
                } else {
                    planilla.setTotalPluses(0); // Si no hay pluses, asigna 0
                }
                listaPlanilla.add(planilla);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnGenerarActionPerformed

    
    public float getSalarioEmpleado(int idPuesto) {
        for (int i = 0; i < listaPuesto.size(); i++) {
            puestos = listaPuesto.get(i);
            if (idPuesto == puestos.getIdPuesto()) {
                return puestos.getIdPuesto();

            }
        }
        return 0;
    }

   
    public float getAsignarPlus(int cedula, float salarioBase) {
        float totalIncremento = 0;

        for (PlusesColab plusesColab : listaPColab) {
            if (plusesColab.getCedula() == cedula) {
                String[] pluses = plusesColab.getNombresPluses().split(",");

                for (String nombrePlus : pluses) {
                    for (Pluses plus : listaPluses) {
                        if (plus.getTitulo().equals(nombrePlus)) {
                            totalIncremento += (salarioBase * (plus.getPorIncremento() / 100.0)); // Calcula el incremento en base al porcentaje
                        }
                    }
                }
            }
        }

        return totalIncremento; 
    }

    
    private PlusesColab obtenerPlusesColabPorCedula(int cedula) {
        for (PlusesColab plus : listaPColab) {
            if (plus.getCedula() == cedula) {
                return plus;
            }
        }
        return null; 
    }

    
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String titulos[] = {"Id Planilla", "Fecha Creación", "Mes a Pagar", "Fecha Pago", "Ced Empleado", "Empleado",
            "Sal Base", "Total x Pluses", "Salario Bruto", "Deducc CCSS", "Deducción BP", "Salario Neto"};
        model = new DefaultTableModel(null, titulos);

        if (chkFiltColab.isSelected()) {
            String textoBuscar = txtBuscar.getText();
            int cedulaEmpleado = 0;
            try {
                cedulaEmpleado = Integer.parseInt(textoBuscar);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El texto ingresado no es un número entero");
                return;
            }

            for (int i = 0; i < listaPlanilla.size(); i++) {
                planilla = listaPlanilla.get(i);
                if (planilla.getCedulaEmpleado() == cedulaEmpleado) {
                    Object nuevaFila[] = {planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                        planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(),
                        planilla.getSalBase(), planilla.getTotalPluses(), planilla.getSalBruto(),
                        calcularSalarioBruto(), calcularDeduccionCCSS(),
                        calcularDeduccionBP(), calcularSalarioNeto()};
                    model.addRow(nuevaFila);
                }
            }
            tblPlanilla.setModel(model);

            txtCant.setText(String.valueOf(model.getRowCount()));

        } else if (chkFiltMes.isSelected()) {
            for (int i = 0; i < listaPlanilla.size(); i++) {
                planilla = listaPlanilla.get(i);

                if (planilla.getMesPuesto().equals(String.valueOf(txtBuscar.getText()))) {
                    Object nuevaFila[] = {planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                        planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(), planilla.getSalBase(),
                        planilla.getTotalPluses(), planilla.getSalBruto(), planilla.getDeducCCSS(), planilla.getDeducBP(), planilla.getSalNeto()};
                    model.addRow(nuevaFila);
                }
            }
            tblPlanilla.setModel(model);

            txtCant.setText(String.valueOf(model.getRowCount()));
        } else if (chkAño.isSelected()) {
            for (int i = 0; i < listaPlanilla.size(); i++) {
                planilla = listaPlanilla.get(i);
                if (planilla.getFechaPago().substring(6, 10).equals(txtBuscar.getText())) {
                    Object nuevaFila[] = {planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                        planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(), planilla.getSalBase(),
                        planilla.getTotalPluses(), planilla.getSalBruto(), planilla.getDeducCCSS(), planilla.getDeducBP(), planilla.getSalNeto()};
                    model.addRow(nuevaFila);
                }
            }
            tblPlanilla.setModel(model);

            txtCant.setText(String.valueOf(model.getRowCount()));
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
   
    private void btnMostrarPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPlanillaActionPerformed

        if (listaPlanilla.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aún no hay registros para mostrar. Por favor, genere una planilla antes de mostrar.", "Planilla vacía", JOptionPane.INFORMATION_MESSAGE);
        } else if (!cmbMesMostrarP.getSelectedItem().toString().equals("")) {
            model.setRowCount(0);
            boolean coincideMes = false;
            double sumaSalarios = 0.0;

            mostrar = new MostrarPlanillaView(null, false, listaPlanilla);

            for (int i = 0; i < listaPlanilla.size(); i++) {
                planilla = listaPlanilla.get(i);

                if (planilla.getMesPuesto().equals(cmbMesMostrarP.getSelectedItem())) {
                    Object nuevaFila[] = {
                        planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                        planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(),
                        planilla.getSalBase(), planilla.getTotalPluses(), planilla.getSalBruto(),
                        planilla.getDeducCCSS(), planilla.getDeducBP(), planilla.getSalNeto()
                    };
                    model.addRow(nuevaFila);

                    sumaSalarios += planilla.getSalNeto();
                    coincideMes = true;
                }
            }

            if (coincideMes) {
                mostrar.getTxtSumSalarios().setText(String.valueOf(sumaSalarios));
                mostrar.getTblMostrarP().setModel(model);
                mostrar.setVisible(true);
                this.listaPlanilla = mostrar.listaPlanilla;
            } else {
                JOptionPane.showMessageDialog(null, "El mes no coincide con los registros", "No coinciden los datos", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (!fmtAñoMostrar.getText()
                .trim().equals("")) {
            model.setRowCount(0);
            String añoFiltro = fmtAñoMostrar.getText().substring(6, 10);
            boolean coincideAño = false;
            double sumaSalarios = 0.0;

            mostrar = new MostrarPlanillaView(null, false, listaPlanilla);

            for (int i = 0; i < listaPlanilla.size(); i++) {
                planilla = listaPlanilla.get(i);
                String añoPlanilla = planilla.getFechaPago().substring(6, 10);
                if (añoPlanilla.equals(añoFiltro)) {
                    Object nuevaFila[] = {
                        planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                        planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(), planilla.getSalBase(),
                        planilla.getTotalPluses(), planilla.getSalBruto(), planilla.getDeducCCSS(), planilla.getDeducBP(), planilla.getSalNeto()
                    };
                    model.addRow(nuevaFila);

                    sumaSalarios += planilla.getSalNeto();
                    coincideAño = true;
                }
            }

            if (coincideAño) {
                mostrar.getTxtSumSalarios().setText(String.valueOf(sumaSalarios));
                mostrar.getTblMostrarP().setModel(model);
                mostrar.setVisible(true);
                this.listaPlanilla = mostrar.listaPlanilla;
            } else {
                JOptionPane.showMessageDialog(null, "El año no coincide con los registros", "No coinciden los datos", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnMostrarPlanillaActionPerformed

    private void cmbMesGenPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesGenPlantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesGenPlantActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed
    public void mostrarTabla() {
        String titulos[] = {"Id Planilla", "Fecha Creación", "Mes a Pagar", "Fecha Pago", "Ced Empleado", "Empleado",
            "Sal Base", "Total x Pluses", "Salario Bruto", "Deducc CCSS", "Deducción BP", "Salario Neto"};
        model = new DefaultTableModel(null, titulos);

        for (int i = 0; i < listaPlanilla.size(); i++) {
            planilla = listaPlanilla.get(i);
            Object nuevaFila[] = {
                planilla.getIdPlanilla(), planilla.getFechaCreacion(), planilla.getMesPuesto(),
                planilla.getFechaPago(), planilla.getCedulaEmpleado(), planilla.getNomEmpleado(),
                planilla.getSalBase(), planilla.getTotalPluses(), calcularSalarioBruto(), calcularDeduccionCCSS(),
                calcularDeduccionBP(), calcularSalarioNeto()
            };

            model.addRow(nuevaFila);
        }

        tblPlanilla.setModel(model);

        txtCant.setText(String.valueOf(model.getRowCount()));

    }

  
        public float calcularSalarioBruto() {
        float salBruto = planilla.getSalBase() + planilla.getTotalPluses();
        planilla.setSalBruto(salBruto);
        return planilla.getSalBruto();
    }

    public float calcularDeduccionCCSS() {
        float deduCCSS = (float) (0.10 * calcularSalarioBruto());
        planilla.setDeducCCSS(deduCCSS); 
        return planilla.getDeducCCSS();
    }

    public float calcularDeduccionBP() {
        float deducBP = (float) (0.05 * calcularSalarioBruto());
        planilla.setDeducBP(deducBP); 
        return planilla.getDeducBP();
    }

       public float calcularSalarioNeto() {

        float salarioBruto = calcularSalarioBruto();
        float deduccionCCSS = calcularDeduccionCCSS();
        float deduccionBP = calcularDeduccionBP();
        float salarioNeto = salarioBruto - deduccionCCSS - deduccionBP;
        planilla.setSalNeto(salarioNeto);
        return planilla.getSalNeto();
    }

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
            java.util.logging.Logger.getLogger(PlanillaView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanillaView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanillaView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanillaView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanillaView dialog = new PlanillaView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMostrarPlanilla;
    private javax.swing.JCheckBox chkAño;
    private javax.swing.JCheckBox chkFiltColab;
    private javax.swing.JCheckBox chkFiltMes;
    private javax.swing.JComboBox<String> cmbMesGenPlant;
    private javax.swing.JComboBox<String> cmbMesMostrarP;
    private javax.swing.JFormattedTextField fmtAñoMostrar;
    private javax.swing.JFormattedTextField fmtAñoPago;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblAñoGenerar;
    private javax.swing.JLabel lblAñoMostrar;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMesGenerar;
    private javax.swing.JLabel lblMesMostrar;
    private javax.swing.JPanel pnlFiltrar;
    private javax.swing.JPanel pnlGenerar;
    private javax.swing.JPanel pnlMostrarPlanilla;
    private javax.swing.JPanel pnlRegistrosPlanilla;
    private javax.swing.JTable tblPlanilla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCant;
    private javax.swing.JFormattedTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
