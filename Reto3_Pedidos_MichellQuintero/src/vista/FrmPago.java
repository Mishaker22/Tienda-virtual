/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.*;


/**
 *
 * @author miche
 */
public class FrmPago extends javax.swing.JFrame {

    /**
     * Creates new form FrmPago
     */
    public FrmPago() {
        initComponents();
        setLocationRelativeTo(null);
        this.jTxtArea.setLineWrap(true);
        this.jTxtArea.setWrapStyleWord(true);
        Facturar();
    }

    public void Facturar()
    {
        this.jTxtArea.setText("Id Pedido: "+FrmPedidos.p.getIdPedido()+"\nId Cliente: "+FrmPedidos.p.getIdCliente()+
                "\nFecha: "+FrmPedidos.p.getFechaPago()+"\nTotal: "+FrmPedidos.p.getTotal());
        
    }
    public void InsertarPago(){
        
        Administrar admi= new Administrar();
        Pago p1= new Pago();
        Pedido p = new Pedido();
        p1.setIdPedido(FrmPedidos.p.getIdPedido());
        p1.setIdCliente(FrmPedidos.p.getIdCliente());
        p1.setFechaPago(FrmPedidos.p.getFechaPago());
        p1.setTotal(FrmPedidos.p.getTotal());
        
        int r= admi.AgregarPago(p1);
        if (r==1) {
            JOptionPane.showMessageDialog(this,"Se realizo el pago correctamente");
            ActualizarPedidos();
            
        }else
        {
            JOptionPane.showInputDialog(this,"Error al cargar el pedido");
        }
    }
    public void ActualizarPedidos()
    {
        Pedido p= new Pedido();
        Administrar admi=new Administrar();
        
        p.setIdPedido(FrmPedidos.p.getIdPedido());
        p.setIdCliente(FrmPedidos.p.getIdCliente());
        p.setFechaPedido(FrmPedidos.p.getFechaPago());
        p.setTotal(FrmPedidos.p.getTotal());
        p.setEstado(Pedido.Estado.PAGADO);
        int r= admi.ModificarPedido(p);
         if (r==1) {
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente. ");
        }else
         {
             JOptionPane.showMessageDialog(this, "Error al actualizar la DB");
         }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea = new javax.swing.JTextArea();
        btnPagarP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facturacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxtArea.setBackground(new java.awt.Color(102, 102, 102));
        jTxtArea.setColumns(20);
        jTxtArea.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        jTxtArea.setRows(5);
        jTxtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jScrollPane1.setViewportView(jTxtArea);

        btnPagarP.setBackground(new java.awt.Color(51, 51, 51));
        btnPagarP.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        btnPagarP.setForeground(new java.awt.Color(255, 255, 255));
        btnPagarP.setText("Realizar Pago");
        btnPagarP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        btnPagarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPagarP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPActionPerformed
        int salida=JOptionPane.showConfirmDialog(null,"Desea Continuar?", "Pagar total de pedido",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (salida==0) {
            InsertarPago();
            this.dispose();
            FrmPedidos p= new FrmPedidos();
            p.setVisible(true);
        }else
        {
            JOptionPane.showMessageDialog(null, "Pago sin realizar");
            this.dispose();
            
        }
        
        
    }//GEN-LAST:event_btnPagarPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        FrmPedidos p= new FrmPedidos();
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagarP;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea;
    // End of variables declaration//GEN-END:variables
}
