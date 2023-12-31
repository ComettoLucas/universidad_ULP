/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidad.vistas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Cometto
 */
public class PrincipalVista extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalVista() {
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

        jDescritorio = new javax.swing.JDesktopPane();
        jMbarraMenu = new javax.swing.JMenuBar();
        jMalumno = new javax.swing.JMenu();
        jMformAlumno = new javax.swing.JMenuItem();
        jMmateria = new javax.swing.JMenu();
        jMformMateria = new javax.swing.JMenuItem();
        jMadministracion = new javax.swing.JMenu();
        jMmanejoInscripcion = new javax.swing.JMenuItem();
        jMmanipulacionNotas = new javax.swing.JMenuItem();
        jMconsultas = new javax.swing.JMenu();
        jMalumnosXmateria = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();
        jMexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDescritorio.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jMalumno.setText("Alumno");
        jMalumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMformAlumno.setText("Formulario de alumno");
        jMformAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformAlumnoActionPerformed(evt);
            }
        });
        jMalumno.add(jMformAlumno);

        jMbarraMenu.add(jMalumno);

        jMmateria.setText("Materia");
        jMmateria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMformMateria.setText("Formulario de materia");
        jMformMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformMateriaActionPerformed(evt);
            }
        });
        jMmateria.add(jMformMateria);

        jMbarraMenu.add(jMmateria);

        jMadministracion.setText("Administración");
        jMadministracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMmanejoInscripcion.setText("Manejo de inscripciones");
        jMmanejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanejoInscripcionActionPerformed(evt);
            }
        });
        jMadministracion.add(jMmanejoInscripcion);

        jMmanipulacionNotas.setText("Manipulacion de notas");
        jMmanipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanipulacionNotasActionPerformed(evt);
            }
        });
        jMadministracion.add(jMmanipulacionNotas);

        jMbarraMenu.add(jMadministracion);

        jMconsultas.setText("Consultas");
        jMconsultas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMalumnosXmateria.setText("Alumnos por materia");
        jMalumnosXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumnosXmateriaActionPerformed(evt);
            }
        });
        jMconsultas.add(jMalumnosXmateria);

        jMbarraMenu.add(jMconsultas);

        jMsalir.setText("Salir");
        jMsalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });

        jMexit.setText("Salir");
        jMexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMexitActionPerformed(evt);
            }
        });
        jMsalir.add(jMexit);

        jMbarraMenu.add(jMsalir);

        setJMenuBar(jMbarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMformAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformAlumnoActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        AlumnosVista alu = new AlumnosVista();
        alu.getContentPane().setBackground(new Color(236,118,42));
        alu.setVisible(true);
        jDescritorio.add(alu);
        jDescritorio.moveToFront(alu);

    }//GEN-LAST:event_jMformAlumnoActionPerformed

    private void jMformMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformMateriaActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        MateriasVista mat = new MateriasVista();
        mat.getContentPane().setBackground(new Color(236,118,42));
        mat.setVisible(true);
        jDescritorio.add(mat);
        jDescritorio.moveToFront(mat);        // TODO add your handling code here:
    }//GEN-LAST:event_jMformMateriaActionPerformed

    private void jMmanejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanejoInscripcionActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        InscripcionesVista inscri = new InscripcionesVista();
        inscri.getContentPane().setBackground(new Color(236,118,42));
        inscri.setVisible(true);
        jDescritorio.add(inscri);
        jDescritorio.moveToFront(inscri);
    }//GEN-LAST:event_jMmanejoInscripcionActionPerformed

    private void jMalumnosXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnosXmateriaActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        AlumnosXMateriaVista consultaAlumno = new AlumnosXMateriaVista();
        consultaAlumno.getContentPane().setBackground(new Color(236,118,42));
        consultaAlumno.setVisible(true);
        jDescritorio.add(consultaAlumno);
        jDescritorio.moveToFront(consultaAlumno);    // TODO add your handling code here:
    }//GEN-LAST:event_jMalumnosXmateriaActionPerformed

    private void jMmanipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanipulacionNotasActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        CargaNotasVista carga = new CargaNotasVista();
        carga.getContentPane().setBackground(new Color(236,118,42));
        carga.setVisible(true);
        jDescritorio.add(carga);
        jDescritorio.moveToFront(carga);
        JOptionPane.showMessageDialog(this, "Solo se actualizaran las filas seleccionadas (seleccione con CTRL + Click del ratón)");
    }//GEN-LAST:event_jMmanipulacionNotasActionPerformed

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
        //           JOptionPane.showMessageDialog(null,"BOTON PRESIONADO " );
//aca no funciona el actionperformed VER!!!!
        //System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMexitActionPerformed
        System.exit(0);    // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jMexitActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenu jMadministracion;
    private javax.swing.JMenu jMalumno;
    private javax.swing.JMenuItem jMalumnosXmateria;
    private javax.swing.JMenuBar jMbarraMenu;
    private javax.swing.JMenu jMconsultas;
    private javax.swing.JMenuItem jMexit;
    private javax.swing.JMenuItem jMformAlumno;
    private javax.swing.JMenuItem jMformMateria;
    private javax.swing.JMenuItem jMmanejoInscripcion;
    private javax.swing.JMenuItem jMmanipulacionNotas;
    private javax.swing.JMenu jMmateria;
    private javax.swing.JMenu jMsalir;
    // End of variables declaration//GEN-END:variables
}
