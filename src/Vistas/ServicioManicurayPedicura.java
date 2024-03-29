/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.Manicura;
import Controlador.ServiciosParaVenta;
import static Vistas.CrearVentaServicio.btnManicura;
import static Vistas.CrearVentaServicio.tblServicio;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author Andrea
 */
public class ServicioManicurayPedicura extends javax.swing.JFrame {

    /**
     * Creates new form ServicioManicurayPedicura
     */
    public ServicioManicurayPedicura() {
        initComponents();
        
        Controlador.ServiciosParaVenta.ServicioDeManicura("");
        PromptSupport.setPrompt("Buscar por nombre", txtBuscar);
      
        // Agregar ListSelectionListener a la tabla
        tblManicura.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificar si la selección ha cambiado y no está ajustándose
                if (!e.getValueIsAdjusting()) {
                    // Obtener la fila seleccionada
                    int filaSeleccionada = tblManicura.getSelectedRow();

                    // Verificar si hay una fila seleccionada
                    if (filaSeleccionada != -1) {
                        // Obtener el valor de la columna 1 (precio)
                        Object precio = tblManicura.getValueAt(filaSeleccionada, 2);

                        // Establecer el valor en el campo de texto
                        txtPrecio.setText(precio.toString());
                    }
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManicura = new javax.swing.JTable();
        btnAgregarM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Agregar manicura y pedicura a la venta");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.jpg"))); // NOI18N

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblManicura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Núm.", "Estilo", "Precio", "idManicura", "tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManicura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManicuraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManicura);
        if (tblManicura.getColumnModel().getColumnCount() > 0) {
            tblManicura.getColumnModel().getColumn(3).setMinWidth(0);
            tblManicura.getColumnModel().getColumn(3).setMaxWidth(0);
            tblManicura.getColumnModel().getColumn(4).setMinWidth(0);
            tblManicura.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        btnAgregarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAgregarM.setText("Agregar a la venta");
        btnAgregarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarr.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Precio:");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAgregarM)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarM)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMActionPerformed
        int fila = tblManicura.getSelectedRow();

    try {
        String estilo, precio, id;

        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún estilo de manicura y pedicura",
                    "Error de validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El precio no puede estar vacío",
                    "Error de validación", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener el texto actual en txtCantidad
        String precioTexto = txtPrecio.getText().trim();
        // Obtener la cantidad ingresada en txtCantidad
            double precioTransferir = Double.parseDouble(precioTexto);

            // Validar que la cantidad a transferir no sea 0 ni mayor que la cantidad original
            if (precioTransferir < Double.parseDouble(tblManicura.getValueAt(fila, 2).toString())) {
                JOptionPane.showMessageDialog(this, "El precio no puede ser menor al precio establecido.", "Error de validación",
                        JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si la cantidad no es válida
            }

        DefaultTableModel modeloManicura = (DefaultTableModel) tblManicura.getModel();
        DefaultTableModel modeloServicio = (DefaultTableModel) tblServicio.getModel();

        // Obtener datos de la fila seleccionada en la tabla de cortes
        String num = String.valueOf(modeloServicio.getRowCount() + 1); // Valor autoincrementable
        estilo = modeloManicura.getValueAt(fila, 1).toString();
        id = modeloManicura.getValueAt(fila, 3).toString();
        String tipo = modeloManicura.getValueAt(fila, 4).toString();
        precio = txtPrecio.getText();

        // Verificar si el corte ya existe en la tabla de servicio
        boolean corteEncontrado = false;
        for (int i = 0; i < modeloServicio.getRowCount(); i++) {
            String idEnTabla = modeloServicio.getValueAt(i, 3).toString(); // Comparar con la columna 'id'
            if (idEnTabla.equals(id)) {
                corteEncontrado = true;
                break;
            }
        }

        if (corteEncontrado) {
            JOptionPane.showMessageDialog(null, "El estilo de manicura y pedicura ya existe en la tabla", "Duplicado", JOptionPane.WARNING_MESSAGE);
        } else {
            // Agregar el corte como una nueva fila en la tabla de servicio
            String filaElemento[] = {num, estilo, precio, id, tipo};
            modeloServicio.addRow(filaElemento);
        }

        // Limpiar el campo de precio y mostrar un mensaje
        txtPrecio.setText("");
        JOptionPane.showMessageDialog(null, "Se agregó la manicura y pedicura!");
        btnManicura.setEnabled(false);
        CrearVentaServicio.calculos();
        //dispose();

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnAgregarMActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String textoBusqueda = txtBuscar.getText();
        
        
        ServiciosParaVenta.ServicioDeManicura(textoBusqueda);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        String precio= txtPrecio.getText();

         if (precio.length() > 4) { 
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void tblManicuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManicuraMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = tblManicura.getSelectedRow();
            if (filaSeleccionada >= 0) {
                String idManicura = (String) tblManicura.getValueAt(filaSeleccionada, 0); // Supongo que el ID está en la primera columna.
                VerdetallesManicura verdetallesManicura = null;
                try {
                    verdetallesManicura = new VerdetallesManicura(idManicura);
                } catch (IOException ex) {
                   // Logger.getLogger(MostrarCortes.class.getName()).log(Level.SEVERE, null, ex);
                }
                verdetallesManicura.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblManicuraMouseClicked

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
            java.util.logging.Logger.getLogger(ServicioManicurayPedicura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicioManicurayPedicura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicioManicurayPedicura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicioManicurayPedicura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicioManicurayPedicura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarM;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblManicura;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
