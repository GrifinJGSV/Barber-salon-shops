/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import javax.swing.table.DefaultTableModel;
import Conexion.Conexion;

import java.awt.Color;

import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;


public class MostrarInventario extends javax.swing.JPanel {
        private int paginaActual = 1;
    public static int totalPages = Controlador.InventarioProductos.NumeroPages();
    public MostrarInventario() {
        initComponents();
        tblMostrarInventario.getTableHeader().setReorderingAllowed(false);
        Controlador.InventarioProductos.MostrarProductos("", paginaActual);
        PromptSupport.setPrompt("Buscar por nombre del producto o por su marca", txtBusqueda);
      
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        seguimiento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMostrarInventario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Listado de productos en inventario");

        txtBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusLost(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 248));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes proyecto/atras.jpg"))); // NOI18N
        btnAtras.setToolTipText("");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAdelante.setBackground(new java.awt.Color(255, 255, 248));
        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes proyecto/adelante.jpg"))); // NOI18N
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        seguimiento.setText("Página: ");

        tblMostrarInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Núm", "Producto", "Marca", "Cantidad", "Precio de compra", "Id", "Precio de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMostrarInventario);
        if (tblMostrarInventario.getColumnModel().getColumnCount() > 0) {
            tblMostrarInventario.getColumnModel().getColumn(5).setMinWidth(0);
            tblMostrarInventario.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.jpg"))); // NOI18N
        jLabel4.setText("Buscar ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ListaodologoBarberia.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)))
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdelante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seguimiento)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdelante)
                            .addComponent(btnAtras)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(seguimiento)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
       String textoBusqueda = txtBusqueda.getText();
        Controlador.InventarioProductos.MostrarProductos(textoBusqueda, paginaActual);

        
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusGained
        // TODO add your handling code here:
        //placeholder para notificar como realizar la busqueda
        JTextField textField = (JTextField) evt.getSource();
        String placeholder = "Buscar por nombre del producto o por su marca";

        if (textField.getText().equals(placeholder)) {
            textField.setText("");
            textField.setForeground(Color.BLACK); // Establece el color de fuente adecuado
        }
    }//GEN-LAST:event_txtBusquedaFocusGained

    private void txtBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusLost
        // TODO add your handling code here:
        //placeholder para notificar como realizar la busqueda
          JTextField textField = (JTextField) evt.getSource();
          String placeholder = "Buscar por nombre del producto o por su marca";

          if (textField.getText().isEmpty()) {
            textField.setText(placeholder);
            textField.setForeground(Color.GRAY); // Establece el color de fuente del placeholder
          }
    }//GEN-LAST:event_txtBusquedaFocusLost

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (paginaActual > 1) {
            paginaActual--;
           // Controlador.InventarioProductos.MostrarProductos(txtBusqueda.getText(), paginaActual, totalPages);
            Controlador.InventarioProductos.MostrarProductos(txtBusqueda.getText(), paginaActual);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        if (paginaActual < totalPages) {
            paginaActual++;
            Controlador.InventarioProductos.MostrarProductos(txtBusqueda.getText(), paginaActual);
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAdelante;
    public static javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel seguimiento;
    public static javax.swing.JTable tblMostrarInventario;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

}
