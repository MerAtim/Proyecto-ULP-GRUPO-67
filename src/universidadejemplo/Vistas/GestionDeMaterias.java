package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class GestionDeMaterias extends javax.swing.JInternalFrame {

    private MateriaData md;

    public GestionDeMaterias() {
        initComponents();
        md = new MateriaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JtfCodigo = new javax.swing.JTextField();
        JrbEstado = new javax.swing.JRadioButton();
        JbBuscar = new javax.swing.JButton();
        JbNuevo = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();
        JbGuardar = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JtfAño = new javax.swing.JTextField();
        JtfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        escritorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MATERIA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Código");

        JtfCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JrbEstado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JrbEstado.setSelected(false);
        JrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbEstadoActionPerformed(evt);
            }
        });

        JbBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa1.png"))); // NOI18N
        JbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarActionPerformed(evt);
            }
        });

        JbNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbNuevo.setText("Nuevo");
        JbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNuevoActionPerformed(evt);
            }
        });

        JbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        JbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarActionPerformed(evt);
            }
        });

        JbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        JbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbGuardarActionPerformed(evt);
            }
        });

        JbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chau.png"))); // NOI18N
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Año");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Estado");

        JtfAño.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JtfNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ulp.png"))); // NOI18N

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JrbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JtfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(JbNuevo)
                            .addContainerGap(386, Short.MAX_VALUE))
                        .addGroup(escritorioLayout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(JbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(JbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(JbSalir)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(78, 197, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtfCodigo)
                            .addComponent(JtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbBuscar)
                        .addContainerGap())
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JrbEstado))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JbBuscar)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(JtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(JrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JbNuevo)
                    .addComponent(JbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbSalir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarActionPerformed
        Materia materia = new Materia();
        try {
            md.eliminarMateria(Integer.valueOf(JtfCodigo.getText()));
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros.");
        }
    }//GEN-LAST:event_JbEliminarActionPerformed

    private void JrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbEstadoActionPerformed

    }//GEN-LAST:event_JrbEstadoActionPerformed

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void JbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarActionPerformed
        Materia materia = new Materia();
        try {
            if (!JtfCodigo.getText().isBlank()) {
                materia = md.buscarMateria(Integer.parseInt(JtfCodigo.getText()));
                if (materia != null) {
                    JtfNombre.setText(materia.getNombre());
                    JtfAño.setText(String.valueOf(materia.getAnioMateria()));
                    JrbEstado.setSelected(materia.isActivo());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El campo no puede estar vacío. Por favor ingrese un Id de la materia a buscar.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero.");
        }
    }//GEN-LAST:event_JbBuscarActionPerformed

    private void JbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNuevoActionPerformed
        JtfAño.setText("");
        JtfCodigo.setEnabled(false);
        JtfNombre.setText("");
        JrbEstado.setSelected(false);
    }//GEN-LAST:event_JbNuevoActionPerformed

    private void JbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbGuardarActionPerformed
        Materia materia = new Materia();
        try {
            if (JtfNombre.getText().isBlank() || JtfAño.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Los campos Nombre y Año no deben estar vacíos.");
            } else {
                materia.setNombre(JtfNombre.getText());
                materia.setAnioMateria(Integer.valueOf(JtfAño.getText()));
                materia.setActivo(JrbEstado.isSelected());
                if (JtfCodigo.getText().isBlank()) {
                    JtfCodigo.setEnabled(false);
                    md.guardarMateria(materia);
                    limpiarCampos();
                    JtfCodigo.setEnabled(true);
                } else {
                    materia.setIdMateria(Integer.valueOf(JtfCodigo.getText()));
                    Materia materiaEncontrada = md.buscarMateria(materia.getIdMateria());
                    if (materiaEncontrada != null) {
                        md.modificarMateria(materia);
                        limpiarCampos();
                        JtfCodigo.setEnabled(true);
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros en Codigo y/o Año.");
        }

    }//GEN-LAST:event_JbGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscar;
    private javax.swing.JButton JbEliminar;
    private javax.swing.JButton JbGuardar;
    private javax.swing.JButton JbNuevo;
    private javax.swing.JButton JbSalir;
    private javax.swing.JRadioButton JrbEstado;
    private javax.swing.JTextField JtfAño;
    private javax.swing.JTextField JtfCodigo;
    private javax.swing.JTextField JtfNombre;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        JtfAño.setText("");
        JtfCodigo.setText("");
        JtfNombre.setText("");
        JrbEstado.setSelected(false);
    }
}
