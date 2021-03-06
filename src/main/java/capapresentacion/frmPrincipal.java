/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capapresentacion;

/**
 *
 * @author uSUARIO
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opPaqueteTuristico = new javax.swing.JMenu();
        opReserva = new javax.swing.JMenu();
        opProveedores = new javax.swing.JMenu();
        opMantenimiento = new javax.swing.JMenu();
        opAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capapresentacion/Diseño sin título (1).png"))); // NOI18N

        opPaqueteTuristico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opPaqueteTuristico.setText("Paquetes Turisticos");
        opPaqueteTuristico.setFocusable(false);
        opPaqueteTuristico.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        opPaqueteTuristico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opPaqueteTuristicoMouseClicked(evt);
            }
        });
        opPaqueteTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPaqueteTuristicoActionPerformed(evt);
            }
        });
        jMenuBar1.add(opPaqueteTuristico);

        opReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opReserva.setText("Reservas");
        opReserva.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        opReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opReservaMouseClicked(evt);
            }
        });
        opReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReservaActionPerformed(evt);
            }
        });
        jMenuBar1.add(opReserva);

        opProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opProveedores.setText("Proveedores");
        opProveedores.setFocusable(false);
        opProveedores.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        opProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opProveedoresMouseClicked(evt);
            }
        });
        opProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opProveedoresActionPerformed(evt);
            }
        });
        jMenuBar1.add(opProveedores);

        opMantenimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opMantenimiento.setText("Mantenimiento");
        opMantenimiento.setFocusable(false);
        opMantenimiento.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        opMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opMantenimientoMouseClicked(evt);
            }
        });
        opMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMantenimientoActionPerformed(evt);
            }
        });
        jMenuBar1.add(opMantenimiento);

        opAyuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opAyuda.setText("Ayuda");
        opAyuda.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jMenuBar1.add(opAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void opReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReservaActionPerformed
    }//GEN-LAST:event_opReservaActionPerformed

    private void opProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opProveedoresActionPerformed
    }//GEN-LAST:event_opProveedoresActionPerformed

    private void opMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMantenimientoActionPerformed
    }//GEN-LAST:event_opMantenimientoActionPerformed

    private void opReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opReservaMouseClicked
        //capapresentacion.frmReservas reserva = new capapresentacion.frmReservas();
        //reserva.show();
    }//GEN-LAST:event_opReservaMouseClicked

    private void opProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opProveedoresMouseClicked
        //capapresentacion.frmProveedor proveedor = new capapresentacion.frmProveedor();
        //proveedor.show();
    }//GEN-LAST:event_opProveedoresMouseClicked

    private void opMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opMantenimientoMouseClicked
        //capapresentacion.frmMantenimiento mantenimiento = new capapresentacion.frmMantenimiento();
        //mantenimiento.show();
    }//GEN-LAST:event_opMantenimientoMouseClicked

    private void opPaqueteTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPaqueteTuristicoActionPerformed

    }//GEN-LAST:event_opPaqueteTuristicoActionPerformed

    private void opPaqueteTuristicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opPaqueteTuristicoMouseClicked
        capapresentacion.frmPaqueteTuristico paquete = new capapresentacion.frmPaqueteTuristico();
        paquete.show();
    }//GEN-LAST:event_opPaqueteTuristicoMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu opAyuda;
    private javax.swing.JMenu opMantenimiento;
    private javax.swing.JMenu opPaqueteTuristico;
    private javax.swing.JMenu opProveedores;
    private javax.swing.JMenu opReserva;
    // End of variables declaration//GEN-END:variables
}

