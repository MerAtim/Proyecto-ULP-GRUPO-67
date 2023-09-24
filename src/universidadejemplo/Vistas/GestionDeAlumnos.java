/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author estudiante
 */
public class GestionDeAlumnos extends javax.swing.JInternalFrame {
    private AlumnoData alumData = new AlumnoData();
    private Alumno alumnoEncontrado = null;
    
    public GestionDeAlumnos() {
        initComponents();
        limpiarCampos();
        desactivarCampos();
        desactivarBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jDateCalendario = new com.toedter.calendar.JDateChooser();
        jREstado = new javax.swing.JRadioButton();
        jLBaja = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setTitle("Gestión de Alumnos");
        setPreferredSize(new java.awt.Dimension(609, 426));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("N° Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jREstado.setSelected(true);

        jLBaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLBaja.setForeground(new java.awt.Color(255, 0, 0));
        jLBaja.setText("Alumno dado de Baja!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(53, 53, 53)
                        .addComponent(jBEliminar)
                        .addGap(48, 48, 48)
                        .addComponent(jBGuardar)
                        .addGap(41, 41, 41)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBBuscar))
                                .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addComponent(jDateCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jREstado)
                                .addGap(49, 49, 49)
                                .addComponent(jLBaja)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLBaja)
                        .addComponent(jREstado)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateCalendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalir)
                        .addComponent(jBGuardar)
                        .addComponent(jBNuevo))
                    .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jTDni.getText());
            alumnoEncontrado = alumData.buscarAlumnoPorDni(dni);
            if (alumnoEncontrado != null) {
                jTApellido.setText(alumnoEncontrado.getApellido());
                jTNombre.setText(alumnoEncontrado.getNombre());
                jREstado.setSelected(alumnoEncontrado.isActivo());
                LocalDate localDate = alumnoEncontrado.getFechaNacimiento();
                Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()); //se genera un instant que pasado al from genera un date
                jDateCalendario.setDate(date);
                if (jREstado.isSelected()) {
                    habilitarCampos();
                    habilitarBotones();
                } else {
                    desactivarCampos();
                    jLBaja.setVisible(true);
                    jREstado.setEnabled(true);
                    jBGuardar.setEnabled(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El Dni no existe");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dni invalido");
        }   
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        habilitarCampos();
        limpiarCampos();
        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(false);
        alumnoEncontrado = null;
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            int dni = Integer.parseInt(jTDni.getText());
            String apellido = jTApellido.getText();
            String nombre = jTNombre.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            java.util.Date fecha = jDateCalendario.getDate();
            LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jREstado.isSelected();

            if (alumnoEncontrado == null) {
                alumnoEncontrado = new Alumno(dni, apellido, nombre, fechaN, estado);
                alumData.guardarAlumno(alumnoEncontrado);
            } else if ((alumnoEncontrado != null) && (alumnoEncontrado.isActivo() == true)) {
                alumnoEncontrado.setDni(dni);
                alumnoEncontrado.setApellido(apellido);
                alumnoEncontrado.setNombre(nombre);
                alumnoEncontrado.setFechaNacimiento(fechaN);
                alumData.modificarAlumno(alumnoEncontrado);
                JOptionPane.showMessageDialog(this, "Alumno Modificado");

            } else if ((alumnoEncontrado != null) && (alumnoEncontrado.isActivo() == false)) {
                alumnoEncontrado.setActivo(true);
                alumData.modificarAlumno(alumnoEncontrado);
                jLBaja.setVisible(false);
                jREstado.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Alumno dado de alta");

            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese Dni Válido");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "No debe haber campos vácios");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (alumnoEncontrado != null){
            alumData.eliminarAlumno(alumnoEncontrado.getIdAlumno());
            alumnoEncontrado = null;
            //limpiarCampos();
            JOptionPane.showMessageDialog(this, "Alumno eliminado");
        }else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Alumno");
        }          
    }//GEN-LAST:event_jBEliminarActionPerformed
    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDateCalendario;
    private javax.swing.JLabel jLBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
    
    public void limpiarCampos(){
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jREstado.setEnabled(false);
        jDateCalendario.setDate(null);
        jLBaja.setVisible(false);
    }
   
    public void desactivarCampos(){
        jTApellido.setEnabled(false);
        jTNombre.setEnabled(false);
        jREstado.setEnabled(false);
        jDateCalendario.setEnabled(false);
    }
    
    public void habilitarCampos(){
        jTApellido.setEnabled(true);
        jTNombre.setEnabled(true);
        //jREstado.setEnabled(true);
        jDateCalendario.setEnabled(true);
    }
    
    public void desactivarBotones() {
        jBEliminar.setEnabled(false);
        jBGuardar.setEnabled(false);
    }
    
    public void habilitarBotones(){
        jBEliminar.setEnabled(true);
        jBGuardar.setEnabled(true);
    }    
}
