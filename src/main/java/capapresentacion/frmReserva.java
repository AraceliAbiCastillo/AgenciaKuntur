/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capapresentacion;

/**
 *
 * @author uSUARIO
 */
public class frmReserva extends javax.swing.JFrame {

    /**
     * Creates new form frmReserva
     */
    public frmReserva() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAsistente = new javax.swing.JLabel();
        txtModalidad = new javax.swing.JTextField();
        lblReserva = new javax.swing.JLabel();
        lblModalidad = new javax.swing.JLabel();
        txtMetodoPago = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        lblMetodoPago = new javax.swing.JLabel();
        btnEscribir = new javax.swing.JButton();
        Panel12 = new javax.swing.JPanel();
        lblMensajeR12 = new javax.swing.JLabel();
        lblMensaje2R12 = new javax.swing.JLabel();
        lblMensaje3R12 = new javax.swing.JLabel();
        btnSeparar = new javax.swing.JButton();
        txtAsistente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(140, 204, 204));

        jPanel1.setBackground(new java.awt.Color(166, 204, 204));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N

        lblAsistente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAsistente.setText("Asistente:");

        txtModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModalidadActionPerformed(evt);
            }
        });

        lblReserva.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        lblReserva.setText("reservas");

        lblModalidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblModalidad.setText("Modalidad: ");

        txtMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoPagoActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        lblMetodoPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMetodoPago.setText("Método de pago:");

        btnEscribir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEscribir.setText("Escribir");
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        Panel12.setBackground(new java.awt.Color(255, 255, 255));

        lblMensajeR12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblMensaje2R12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblMensaje3R12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensajeR12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                        .addComponent(lblMensaje3R12, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(lblMensaje2R12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMensajeR12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje2R12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje3R12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        btnSeparar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSeparar.setText("Separar");
        btnSeparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepararActionPerformed(evt);
            }
        });

        txtAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsistenteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButton1.setText("Registro cliente");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAsistente)
                            .addComponent(lblMetodoPago)
                            .addComponent(lblModalidad))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeparar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 478, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 325, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAsistente)
                                    .addComponent(txtAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblModalidad)
                                .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMetodoPago)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeparar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModalidadActionPerformed

    private void txtMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoPagoActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String origen = txtModalidad.getText();
        String destino = txtDestino.getText();
        String fechaIda = txtAsistente.getText();
        String fechaVuelta = txtFechaVuelta.getText();
        String costo = txtMetodoPago.getText();
        String id = txtId.getText();

        PaqueteTuristico paquete =new PaqueteTuristico();
        paquete.setOrigen(origen);
        paquete.setDestino(destino);
        paquete.setFechaIda(fechaIda);
        paquete.setFechaVuelta(fechaVuelta);
        paquete.setCosto(costo);
        paquete.Id(id);

        lblMensajeR.setText("Se escribió los atributos del objeto vendedor");
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        String origen = txtModalidad.getText();
        String destino = txtDestino.getText();
        String fechaIda = txtAsistente.getText();
        String fechaVuelta = txtFechaVuelta.getText();
        String costo = txtMetodoPago.getText();
        String id = txtId.getText();

        lblMensajeR.setText("Origen: " + origen);
        lblMensaje2R.setText("Destino : " + destino);
        lblMensaje3R.setText("Fecha Ida: "+ fechaIda);
        lblMensajeR.setText("Fecha Retorno: " + fechaVuelta);
        lblMensaje2R.setText("Costo : " + costo);
        lblMensaje3R.setText("ID: "+ id);
    }//GEN-LAST:event_btnEscribirActionPerformed

    private void btnSepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSepararActionPerformed

    private void txtAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsistenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsistenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnSeparar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAsistente;
    private javax.swing.JLabel lblMensaje2R;
    private javax.swing.JLabel lblMensaje2R1;
    private javax.swing.JLabel lblMensaje2R10;
    private javax.swing.JLabel lblMensaje2R11;
    private javax.swing.JLabel lblMensaje2R12;
    private javax.swing.JLabel lblMensaje2R2;
    private javax.swing.JLabel lblMensaje2R3;
    private javax.swing.JLabel lblMensaje2R4;
    private javax.swing.JLabel lblMensaje2R5;
    private javax.swing.JLabel lblMensaje2R6;
    private javax.swing.JLabel lblMensaje2R7;
    private javax.swing.JLabel lblMensaje2R8;
    private javax.swing.JLabel lblMensaje2R9;
    private javax.swing.JLabel lblMensaje3R;
    private javax.swing.JLabel lblMensaje3R1;
    private javax.swing.JLabel lblMensaje3R10;
    private javax.swing.JLabel lblMensaje3R11;
    private javax.swing.JLabel lblMensaje3R12;
    private javax.swing.JLabel lblMensaje3R2;
    private javax.swing.JLabel lblMensaje3R3;
    private javax.swing.JLabel lblMensaje3R4;
    private javax.swing.JLabel lblMensaje3R5;
    private javax.swing.JLabel lblMensaje3R6;
    private javax.swing.JLabel lblMensaje3R7;
    private javax.swing.JLabel lblMensaje3R8;
    private javax.swing.JLabel lblMensaje3R9;
    private javax.swing.JLabel lblMensaje4R;
    private javax.swing.JLabel lblMensaje4R1;
    private javax.swing.JLabel lblMensaje4R10;
    private javax.swing.JLabel lblMensaje4R11;
    private javax.swing.JLabel lblMensaje4R2;
    private javax.swing.JLabel lblMensaje4R3;
    private javax.swing.JLabel lblMensaje4R4;
    private javax.swing.JLabel lblMensaje4R5;
    private javax.swing.JLabel lblMensaje4R6;
    private javax.swing.JLabel lblMensaje4R7;
    private javax.swing.JLabel lblMensaje4R8;
    private javax.swing.JLabel lblMensaje4R9;
    private javax.swing.JLabel lblMensaje5R;
    private javax.swing.JLabel lblMensaje5R1;
    private javax.swing.JLabel lblMensaje5R10;
    private javax.swing.JLabel lblMensaje5R11;
    private javax.swing.JLabel lblMensaje5R2;
    private javax.swing.JLabel lblMensaje5R3;
    private javax.swing.JLabel lblMensaje5R4;
    private javax.swing.JLabel lblMensaje5R5;
    private javax.swing.JLabel lblMensaje5R6;
    private javax.swing.JLabel lblMensaje5R7;
    private javax.swing.JLabel lblMensaje5R8;
    private javax.swing.JLabel lblMensaje5R9;
    private javax.swing.JLabel lblMensaje6R;
    private javax.swing.JLabel lblMensaje6R1;
    private javax.swing.JLabel lblMensaje6R10;
    private javax.swing.JLabel lblMensaje6R11;
    private javax.swing.JLabel lblMensaje6R2;
    private javax.swing.JLabel lblMensaje6R3;
    private javax.swing.JLabel lblMensaje6R4;
    private javax.swing.JLabel lblMensaje6R5;
    private javax.swing.JLabel lblMensaje6R6;
    private javax.swing.JLabel lblMensaje6R7;
    private javax.swing.JLabel lblMensaje6R8;
    private javax.swing.JLabel lblMensaje6R9;
    private javax.swing.JLabel lblMensajeR;
    private javax.swing.JLabel lblMensajeR1;
    private javax.swing.JLabel lblMensajeR10;
    private javax.swing.JLabel lblMensajeR11;
    private javax.swing.JLabel lblMensajeR12;
    private javax.swing.JLabel lblMensajeR2;
    private javax.swing.JLabel lblMensajeR3;
    private javax.swing.JLabel lblMensajeR4;
    private javax.swing.JLabel lblMensajeR5;
    private javax.swing.JLabel lblMensajeR6;
    private javax.swing.JLabel lblMensajeR7;
    private javax.swing.JLabel lblMensajeR8;
    private javax.swing.JLabel lblMensajeR9;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblModalidad;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JTextField txtAsistente;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JTextField txtModalidad;
    // End of variables declaration//GEN-END:variables
}
