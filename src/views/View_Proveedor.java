/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Liz
 */
public class View_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form View_Proveedor
     */
    public View_Proveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenumodificar = new javax.swing.JMenuItem();
        jMenueliminar = new javax.swing.JMenuItem();
        jbtn_buscar_proveedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jl_descripcion = new javax.swing.JLabel();
        jl_precio_compra = new javax.swing.JLabel();
        jl_precio_venta = new javax.swing.JLabel();
        jl_existencia = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jtf_calle = new javax.swing.JTextField();
        jtf_numero = new javax.swing.JTextField();
        jbtn_save = new javax.swing.JButton();
        jbtn_update = new javax.swing.JButton();
        jl_id = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_colonia = new javax.swing.JTextField();
        jtf_estado = new javax.swing.JTextField();
        jtf_nombredecontacto = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_busca_id = new javax.swing.JTextField();
        jbtn_buscar_id = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtf_buscaproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_proveedores = new javax.swing.JTable();
        jbtn_todo = new javax.swing.JButton();

        jMenumodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/editar.png"))); // NOI18N
        jMenumodificar.setText("Modificar");
        jMenumodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenumodificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenumodificar);

        jMenueliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/eliminarchico.png"))); // NOI18N
        jMenueliminar.setText("Eliminar");
        jMenueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenueliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenueliminar);

        jbtn_buscar_proveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn_buscar_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/Busqueda.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jl_descripcion.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jl_descripcion.setText("Nombre");

        jl_precio_compra.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jl_precio_compra.setText("RFC");

        jl_precio_venta.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jl_precio_venta.setText("Calle");

        jl_existencia.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jl_existencia.setText("Numero");

        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });

        jbtn_save.setBackground(new java.awt.Color(204, 204, 255));
        jbtn_save.setForeground(new java.awt.Color(240, 240, 240));
        jbtn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/save.png"))); // NOI18N
        jbtn_save.setBorder(null);
        jbtn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_saveActionPerformed(evt);
            }
        });

        jbtn_update.setBackground(new java.awt.Color(204, 204, 255));
        jbtn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/update.png"))); // NOI18N
        jbtn_update.setBorder(null);
        jbtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_updateActionPerformed(evt);
            }
        });

        jl_id.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jl_id.setText("Id");

        jtf_id.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 11)); // NOI18N
        jLabel1.setText("Colonia");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 11)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 11)); // NOI18N
        jLabel4.setText("Nombre de contacto");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel8.setText("Email");

        jtf_colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_coloniaActionPerformed(evt);
            }
        });

        jtf_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_estadoActionPerformed(evt);
            }
        });

        jtf_nombredecontacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombredecontactoActionPerformed(evt);
            }
        });

        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });

        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_descripcion)
                            .addComponent(jl_precio_compra)
                            .addComponent(jl_precio_venta)
                            .addComponent(jl_existencia)
                            .addComponent(jl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_colonia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_calle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_numero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jtf_id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombredecontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_id)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_update))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_descripcion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_precio_compra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_existencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_nombredecontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID");

        jtxt_busca_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxt_busca_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_busca_idActionPerformed(evt);
            }
        });

        jbtn_buscar_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn_buscar_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/Busqueda.png"))); // NOI18N
        jbtn_buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscar_idActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Proveedor");

        jtf_buscaproveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtbl_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtbl_proveedores.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtbl_proveedores);

        jbtn_todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imges/ojo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxt_busca_id)
                                    .addComponent(jtf_buscaproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn_buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn_buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(jbtn_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jtf_buscaproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_todo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtn_buscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jbtn_buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jtxt_busca_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_saveActionPerformed

    private void jbtn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_updateActionPerformed

    private void jtf_coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_coloniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_coloniaActionPerformed

    private void jtf_nombredecontactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombredecontactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombredecontactoActionPerformed

    private void jtxt_busca_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_busca_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_busca_idActionPerformed

    private void jbtn_buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_buscar_idActionPerformed

    private void jMenumodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenumodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenumodificarActionPerformed

    private void jMenueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenueliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenueliminarActionPerformed

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jtf_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_estadoActionPerformed

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

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
            java.util.logging.Logger.getLogger(View_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JMenuItem jMenueliminar;
    public javax.swing.JMenuItem jMenumodificar;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_buscar_id;
    public javax.swing.JButton jbtn_buscar_proveedor;
    public javax.swing.JButton jbtn_save;
    public javax.swing.JButton jbtn_todo;
    public javax.swing.JButton jbtn_update;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_existencia;
    public javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_precio_compra;
    private javax.swing.JLabel jl_precio_venta;
    public javax.swing.JTable jtbl_proveedores;
    public javax.swing.JTextField jtf_buscaproveedor;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_estado;
    public javax.swing.JTextField jtf_id;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_nombredecontacto;
    public javax.swing.JTextField jtf_numero;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_telefono;
    public javax.swing.JTextField jtxt_busca_id;
    // End of variables declaration//GEN-END:variables
}
