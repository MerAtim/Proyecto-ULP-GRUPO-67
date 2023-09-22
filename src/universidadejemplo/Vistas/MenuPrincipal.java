package universidadejemplo.Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmAlumno = new javax.swing.JMenu();
        JmiFormularioAlumno = new javax.swing.JMenuItem();
        JmMateria = new javax.swing.JMenu();
        JmiFormularioMateria = new javax.swing.JMenuItem();
        JmAdministracion = new javax.swing.JMenu();
        JmiManejoInscripciones = new javax.swing.JMenuItem();
        JmiManipulacionNotas = new javax.swing.JMenuItem();
        JmConsultas = new javax.swing.JMenu();
        JmiAlumnosPorMateria = new javax.swing.JMenuItem();
        JmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JmAlumno.setText("Alumno");
        JmAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JmiFormularioAlumno.setText("Formulario de Alumno");
        JmiFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiFormularioAlumnoActionPerformed(evt);
            }
        });
        JmAlumno.add(JmiFormularioAlumno);

        jMenuBar1.add(JmAlumno);

        JmMateria.setText("Materia");
        JmMateria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JmiFormularioMateria.setText("Formulario de Materia");
        JmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiFormularioMateriaActionPerformed(evt);
            }
        });
        JmMateria.add(JmiFormularioMateria);

        jMenuBar1.add(JmMateria);

        JmAdministracion.setText("Administracion");
        JmAdministracion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JmiManejoInscripciones.setText("Manejo de Inscripciones");
        JmiManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiManejoInscripcionesActionPerformed(evt);
            }
        });
        JmAdministracion.add(JmiManejoInscripciones);

        JmiManipulacionNotas.setText("Manipulación de Notas");
        JmiManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiManipulacionNotasActionPerformed(evt);
            }
        });
        JmAdministracion.add(JmiManipulacionNotas);

        jMenuBar1.add(JmAdministracion);

        JmConsultas.setText("Consultas");
        JmConsultas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        JmiAlumnosPorMateria.setText("Alumnos por Materia");
        JmConsultas.add(JmiAlumnosPorMateria);

        jMenuBar1.add(JmConsultas);

        JmSalir.setText("Salir");
        JmSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JmSalir.setMinimumSize(new java.awt.Dimension(600, 600));
        JmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(JmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmiFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiFormularioAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmiFormularioAlumnoActionPerformed

    private void JmiManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiManipulacionNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmiManipulacionNotasActionPerformed

    private void JmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiFormularioMateriaActionPerformed
        escritorio.removeAll();
        GestionDeMaterias gdm = new GestionDeMaterias();
        escritorio.add(gdm);
        escritorio.moveToFront(gdm);
        escritorio.setVisible(true);
        gdm.setVisible(true);
        int x = (escritorio.getWidth() - gdm.getWidth()) / 2;
        int y = (escritorio.getHeight() - gdm.getHeight()) / 2;
        gdm.setLocation(x, y);
        escritorio.repaint();
    }//GEN-LAST:event_JmiFormularioMateriaActionPerformed

    private void JmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmSalirActionPerformed
    dispose();
    }//GEN-LAST:event_JmSalirActionPerformed

    private void JmiManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiManejoInscripcionesActionPerformed
      
        escritorio.removeAll();
        ManejoDeInscripciones mdi = new ManejoDeInscripciones();
        escritorio.add(mdi);
        escritorio.moveToFront(mdi);
        escritorio.setVisible(true);
        mdi.setVisible(true);
        int x = (escritorio.getWidth() - mdi.getWidth()) / 2;
        int y = (escritorio.getHeight() - mdi.getHeight()) / 2;
        mdi.setLocation(x, y);
        escritorio.repaint();
        
    }//GEN-LAST:event_JmiManejoInscripcionesActionPerformed

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
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmAdministracion;
    private javax.swing.JMenu JmAlumno;
    private javax.swing.JMenu JmConsultas;
    private javax.swing.JMenu JmMateria;
    private javax.swing.JMenu JmSalir;
    private javax.swing.JMenuItem JmiAlumnosPorMateria;
    private javax.swing.JMenuItem JmiFormularioAlumno;
    private javax.swing.JMenuItem JmiFormularioMateria;
    private javax.swing.JMenuItem JmiManejoInscripciones;
    private javax.swing.JMenuItem JmiManipulacionNotas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
