
package vistas;

import com.cfs3.proyectopets.UsuarioDto;
import javax.swing.JOptionPane;


public class CargarUsuario extends javax.swing.JFrame {
    private UsuarioDto Usu;
    private String apellidoynombre="";
    private String correo="";
    private String contrasenia="";
    private String direccion="";
    private int telefono=0;
    
    public CargarUsuario(UsuarioDto Usu1) {
        
        Usu=Usu1;
        initComponents();
    }

    public UsuarioDto getUsu() {
        return Usu;
    }

    public String getApellidoynombre() {
        return apellidoynombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
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
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        apellidoynombref = new javax.swing.JTextField();
        direccionf = new javax.swing.JTextField();
        telefonof = new javax.swing.JTextField();
        correof = new javax.swing.JTextField();
        jBmodificar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        contraseniaf = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adminstración de usuario");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Apellido y nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("correo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("dirección:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Telefono:");

        apellidoynombref.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        apellidoynombref.setText("apellido y nombre");
        apellidoynombref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoynombrefActionPerformed(evt);
            }
        });

        direccionf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        direccionf.setText("direccion");
        direccionf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionfActionPerformed(evt);
            }
        });

        telefonof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefonof.setText("telefono");
        telefonof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonofActionPerformed(evt);
            }
        });

        correof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        correof.setText("correo");
        correof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correofActionPerformed(evt);
            }
        });

        jBmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcancelarMouseClicked(evt);
            }
        });
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("contraseña:");

        contraseniaf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contraseniaf.setText("contraseña");
        contraseniaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniafActionPerformed(evt);
            }
        });

        jBguardar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBguardar1.setText("Guardar");
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jBguardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefonof, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(direccionf)
                                    .addComponent(correof)
                                    .addComponent(contraseniaf))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apellidoynombref, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidoynombref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contraseniaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(correof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(telefonof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBguardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoynombrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoynombrefActionPerformed
        if (Usu!=null){
           apellidoynombref.setText(Usu.getApellidoynombre());
        }
        else{
           apellidoynombref.getText();
        }
    }//GEN-LAST:event_apellidoynombrefActionPerformed

    private void direccionfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionfActionPerformed
        if (Usu!=null){
           direccionf.setText(Usu.getDireccion());
        }
        else{
           direccionf.getText();
        }
    }//GEN-LAST:event_direccionfActionPerformed

    private void telefonofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonofActionPerformed
        if (Usu!=null){
           telefonof.setText(String.valueOf(Usu.getTelefono()));
        }
        else{
           telefonof.getText();
        }
        
    }//GEN-LAST:event_telefonofActionPerformed

    private void correofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correofActionPerformed
        if (Usu!=null){
           correof.setText(Usu.getCorreo());
        }
        else{
           correof.getText();
        }correof.getText();
    }//GEN-LAST:event_correofActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        //el usuario ya existe
        this.Usu.getIdUsuario();
        this.apellidoynombre=String.valueOf(apellidoynombref);
        this.contrasenia=String.valueOf(contraseniaf);
        this.correo=String.valueOf(correof);
        this.direccion=String.valueOf(direccionf);
        this.telefono=Integer.parseInt(telefonof.getText());
        //carga los datos del formulario al objeto usuario
        Usu.setApellidoynombre(this.apellidoynombre);
        Usu.setCorreo(this.correo);
        Usu.setContrasenia(this.contrasenia);
        Usu.setDireccion(this.direccion);
        Usu.setTelefono(this.telefono);
        JOptionPane.showMessageDialog(null, "Ha modifcado el usuario "+this.apellidoynombre+"Correo: "+this.correo+" contraseña: "+this.contrasenia+" Dirección: "+this.direccion+" Teléfono: "+this.telefono);

    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcancelarMouseClicked
        // Cancelar, sale de la pantalla:
        this.dispose();
    }//GEN-LAST:event_jBcancelarMouseClicked

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // Cancelar, sale de la pantalla:
        this.dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void contraseniafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniafActionPerformed
        if (Usu!=null){
           contraseniaf.setText(Usu.getContrasenia());
        }
        else{
           contraseniaf.getText();
        }
    }//GEN-LAST:event_contraseniafActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        this.Usu=null;//usuario nuevo
        this.apellidoynombre=String.valueOf(apellidoynombref);
        this.contrasenia=String.valueOf(contraseniaf);
        this.correo=String.valueOf(correof);
        this.direccion=String.valueOf(direccionf);
        this.telefono=Integer.parseInt(telefonof.getText());
        JOptionPane.showMessageDialog(null, "Se dará de alta al usuario "+this.apellidoynombre+"Correo: "+this.correo+" contraseña: "+this.contrasenia+" Dirección: "+this.direccion+" Teléfono: "+this.telefono);
    }//GEN-LAST:event_jBguardar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CargarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoynombref;
    private javax.swing.JTextField contraseniaf;
    private javax.swing.JTextField correof;
    private javax.swing.JTextField direccionf;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField telefonof;
    // End of variables declaration//GEN-END:variables
}
