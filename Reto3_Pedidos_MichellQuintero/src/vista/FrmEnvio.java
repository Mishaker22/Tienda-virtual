/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.time.*;
import javax.swing.*;
import modelo.*;

public class FrmEnvio extends javax.swing.JFrame {

    /**
     * Creates new form FrmEnvio
     */
    public FrmEnvio() {
        initComponents();
        setLocationRelativeTo(null);
        this.jTxtEnvio.setLineWrap(true);
        this.jTxtEnvio.setWrapStyleWord(true);
        CargarDatos();
        CargarListaEnvios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblFechaEnvio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbCompania = new javax.swing.JComboBox<>();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEnvios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtEnvio = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIdPago = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jLabel4.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enviar Pedido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Envio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        txtDireccion.setBackground(new java.awt.Color(51, 51, 51));
        txtDireccion.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaEnvio.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        lblFechaEnvio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaEnvio.setText("hoy");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Direccion de envio");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Compañia");

        cmbCompania.setBackground(new java.awt.Color(51, 51, 51));
        cmbCompania.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbCompania.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaEnvio)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(cmbCompania, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechaEnvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnFinalizar.setBackground(new java.awt.Color(51, 51, 51));
        btnFinalizar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar Envio");
        btnFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jTablaEnvios.setBackground(new java.awt.Color(51, 51, 51));
        jTablaEnvios.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jTablaEnvios.setForeground(new java.awt.Color(255, 255, 255));
        jTablaEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Pago", "Direccion", "Fecha", "Compañia", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTablaEnvios);
        if (jTablaEnvios.getColumnModel().getColumnCount() > 0) {
            jTablaEnvios.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTablaEnvios.getColumnModel().getColumn(1).setPreferredWidth(35);
        }

        jTxtEnvio.setBackground(new java.awt.Color(204, 204, 204));
        jTxtEnvio.setColumns(20);
        jTxtEnvio.setRows(5);
        jScrollPane2.setViewportView(jTxtEnvio);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Detalles de envio:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id Pago:");

        lblIdPago.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        lblIdPago.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPago.setText("ID");

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar Envio");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIdPago))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblIdPago))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if(this.txtDireccion.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Debe completar los campos vacios");
        }else{
            InsertarEnvio();
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int salida=JOptionPane.showConfirmDialog(null,"Continuar para Cancelar el envio?", "Esta seguro de cancelar el envio ",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                
                if (salida==0) {
                    InsertarEnvioNoFinalizado();
                    this.dispose();
                    FrmMenu f = new FrmMenu();
                    f.setVisible(true);
                }else
                {
                    JOptionPane.showMessageDialog(this,"Para finalizar el envio debe oprimir finalizar envio.");
                }
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void InsertarEnvio()
    {
        Envio e= new Envio();
        Administrar admi= new Administrar();
        e.setIdPago(Integer.parseInt(this.lblIdPago.getText()));
        e.setDireccionFac(this.txtDireccion.getText());
        e.setFechaPedido(LocalDate.parse(this.lblFechaEnvio.getText()));
        e.setCompania((Envio.Compania)this.cmbCompania.getSelectedItem());
        e.setEstado(Envio.Estado.FINALIZADO);
        
        int r=admi.AgregarEnvio(e);
        this.jTxtEnvio.setText("\nId pago: "+e.getIdPago()+"\nDireccion de envio: "+e.getDireccionFac()+
                "\nFecha De envio: "+e.getFechaPedido()+"\nCompañia :"+e.getCompania()+
                "\nEstado de envio: "+e.getEstado());
        CargarListaEnvios();
        if (r==1) {
            JOptionPane.showMessageDialog(this,"Envio Finalizado");
        }else
        {
            JOptionPane.showInputDialog(this,"Hubo un error al finalizar el envio.");
        }
        
    }
    public void InsertarEnvioNoFinalizado()
    {
        Envio e= new Envio();
        Administrar admi= new Administrar();
        e.setIdPago(Integer.parseInt(this.lblIdPago.getText()));
        e.setDireccionFac(this.txtDireccion.getText());
        e.setFechaPedido(LocalDate.parse(this.lblFechaEnvio.getText()));
        e.setCompania((Envio.Compania)this.cmbCompania.getSelectedItem());
        e.setEstado(Envio.Estado.NOFINALIZADO);
        
        int r=admi.AgregarEnvio(e);
        
        if (r==1) {
            JOptionPane.showMessageDialog(this,"No se realizo el envio, estado de Envio: "+e.getEstado());
        }else
        {
            JOptionPane.showInputDialog(this,"Hubo un error al finalizar el envio.");
        }
        
    }
    //Carga el id del pago en el label y la fecha y el combobox con los enumerados de las compañias
    public void CargarDatos()
    {
        this.lblFechaEnvio.setText(LocalDate.now().toString());
        Administrar admi= new Administrar();
        int idPago=admi.SeleccionarRegistro(FrmPedidos.idPedido);
        this.lblIdPago.setText(String.valueOf(idPago));
        for (Envio.Compania c : Envio.Compania.values()) {
            this.cmbCompania.addItem(c);
        }
    }
    public void EliminarPedidoFinalizado()
    {
        
    }
    public void CargarListaEnvios()
    {
        Envio e= new Envio();
        e.Listar(this.jTablaEnvios);
        e.LimpiarTabla(jTablaEnvios);
        e.Listar(jTablaEnvios);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<Envio.Compania> cmbCompania;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaEnvios;
    private javax.swing.JTextArea jTxtEnvio;
    private javax.swing.JLabel lblFechaEnvio;
    private javax.swing.JLabel lblIdPago;
    private javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables
}
