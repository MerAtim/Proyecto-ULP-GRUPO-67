package universidadejemplo.Vistas;

import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class ManejoDeInscripciones extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    AlumnoData ad = new AlumnoData();
    InscripcionData id = new InscripcionData();

    public ManejoDeInscripciones() {
        initComponents();
        armarCabecera();
        JrInscriptas.setSelected(true);//Seleccionada por defecto
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadoMaterias = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
        JbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JcbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JrInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        JbAnular = new javax.swing.JButton();
        JbInscribir = new javax.swing.JButton();
        JrbNoInscriptas = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();

        escritorio.setMaximumSize(null);
        escritorio.setMinimumSize(null);
        escritorio.setPreferredSize(new java.awt.Dimension(600, 900));

        JbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        JcbAlumnos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Listado de Materias");

        estadoMaterias.add(JrInscriptas);
        JrInscriptas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JrInscriptas.setText("Materias Inscriptas");
        JrInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrInscriptasActionPerformed(evt);
            }
        });

        jTMaterias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTMaterias.setCellSelectionEnabled(true);
        jTMaterias.setRowHeight(30);
        jScrollPane1.setViewportView(jTMaterias);

        JbAnular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbAnular.setText("Anular inscripción");
        JbAnular.setEnabled(false);
        JbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAnularActionPerformed(evt);
            }
        });

        JbInscribir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbInscribir.setText("Inscribir");
        JbInscribir.setEnabled(false);
        JbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbInscribirActionPerformed(evt);
            }
        });

        estadoMaterias.add(JrbNoInscriptas);
        JrbNoInscriptas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JrbNoInscriptas.setText("Materias no inscriptas");
        JrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbNoInscriptasActionPerformed(evt);
            }
        });

        escritorio.setLayer(JbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JcbAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JrInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbAnular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbInscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JrbNoInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JcbAlumnos, 0, 314, Short.MAX_VALUE))))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(JrInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JrbNoInscriptas))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioLayout.createSequentialGroup()
                                .addComponent(JbInscribir)
                                .addGap(32, 32, 32)
                                .addComponent(JbAnular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JbSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addGap(16, 16, 16))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JrInscriptas)
                    .addComponent(JrbNoInscriptas))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbInscribir)
                    .addComponent(JbAnular)
                    .addComponent(JbSalir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void JcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbAlumnosActionPerformed
        buscarMateriasDeAlumnos();
    }//GEN-LAST:event_JcbAlumnosActionPerformed

    private void JrInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrInscriptasActionPerformed
        JbInscribir.setEnabled(false);
        JbAnular.setEnabled(true);
        buscarMateriasDeAlumnos();
    }//GEN-LAST:event_JrInscriptasActionPerformed

    private void JbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAnularActionPerformed
        Alumno alumno = (Alumno) JcbAlumnos.getSelectedItem();
        int filaSelec = jTMaterias.getSelectedRow();
        if (filaSelec != -1) {
            int idMateria = (Integer) modelo.getValueAt(filaSelec, 0);
            id.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), idMateria);
            buscarMateriasDeAlumnos();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia.");
        }
    }//GEN-LAST:event_JbAnularActionPerformed

    private void JbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbInscribirActionPerformed

        Double nota = 0.0;
        Alumno alumno = (Alumno) JcbAlumnos.getSelectedItem();
        int filaSelec = jTMaterias.getSelectedRow();
        if (filaSelec != -1) {
            Materia materia = new Materia();
            int idMateria = (Integer) modelo.getValueAt(filaSelec, 0);
            materia.setIdMateria(idMateria);
            Inscripcion insc = new Inscripcion(nota, alumno, materia, true);
            id.guardarInscripcion(insc);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia.");
        }
    }//GEN-LAST:event_JbInscribirActionPerformed

    private void JrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbNoInscriptasActionPerformed
        Alumno alumno = (Alumno) JcbAlumnos.getSelectedItem();
        JbInscribir.setEnabled(true);
        JbAnular.setEnabled(false);
        List<Materia> materias = id.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        borrarFilas();
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnioMateria()});
        }
    }//GEN-LAST:event_JrbNoInscriptasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAnular;
    private javax.swing.JButton JbInscribir;
    private javax.swing.JButton JbSalir;
    private javax.swing.JComboBox<Alumno> JcbAlumnos;
    private javax.swing.JRadioButton JrInscriptas;
    private javax.swing.JRadioButton JrbNoInscriptas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.ButtonGroup estadoMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTMaterias.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTMaterias.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTMaterias.setModel(modelo);

    }

    private void cargarCombo() {
        JcbAlumnos.removeAllItems();
        JcbAlumnos.addItem(null);
        for (Alumno alumno : ad.listarAlumnos()) {
            JcbAlumnos.addItem(alumno);
        }
        JcbAlumnos.setRenderer(new DefaultListCellRenderer() { //Un "renderer" en Swing controla cómo se muestra cada elemento en el JComboBox. En este caso, se está personalizando la apariencia de los elementos del JComboBox.
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Alumno) { //verifica si el valor que se va a representar (value) es una instancia de la clase Alumno. Si lo es, significa que estamos trabajando con un objeto Alumno.
                    Alumno alum = (Alumno) value;
                    setText(alum.obtenerAlumnoCombo());
                }
                return this;
            }
        });
    }

    private void borrarFilas() {
        int filas = jTMaterias.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }

    private void buscarMateriasDeAlumnos() {//carga tabla
        borrarFilas();
        Alumno alumno = (Alumno) JcbAlumnos.getSelectedItem();
        List<Materia> materias = null;
        if (JrInscriptas.isSelected()) {
            materias = id.obtenerMateriasCursadas(alumno.getIdAlumno());
        } else {
            materias = id.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        }
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnioMateria(),});
        }
    }

}
