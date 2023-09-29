/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vistas;

import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;
import universidad.entidades.Alumno;
import universidad.accesoADatos.AlumnoData;
import universidad.accesoADatos.MateriaData;
import universidad.accesoADatos.InscripcionData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas Cometto
 */
public class InscripcionesVista extends javax.swing.JInternalFrame {
private final DefaultTableModel vistaInsc = new DefaultTableModel();
private Alumno aluElejido =new Alumno();   /**
     * Creates new form Alumnos
     */
    public InscripcionesVista() {
        initComponents();
        cargarCombo();
        armarCabecera();
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGInscripotasoNo = new javax.swing.ButtonGroup();
        jLInscripciones = new javax.swing.JLabel();
        jLseleccioneAlumno = new javax.swing.JLabel();
        jBinscribir = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLlistadoMaterias = new javax.swing.JLabel();
        jCalumnos = new javax.swing.JComboBox<>();
        jSPinscripciones = new javax.swing.JScrollPane();
        jTinscripcionesListadoMaterias = new javax.swing.JTable();
        jRMateriasInscriptas = new javax.swing.JRadioButton();
        jRMateriasNoInscriptas = new javax.swing.JRadioButton();

        setClosable(true);

        jLInscripciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLInscripciones.setText("Inscripciones");

        jLseleccioneAlumno.setText("Seleccione un alumno:");

        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jBanular.setText("Anular inscripcion");
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLlistadoMaterias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLlistadoMaterias.setText("Listado de Materias");

        jCalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalumnosActionPerformed(evt);
            }
        });

        jTinscripcionesListadoMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jSPinscripciones.setViewportView(jTinscripcionesListadoMaterias);

        bGInscripotasoNo.add(jRMateriasInscriptas);
        jRMateriasInscriptas.setText("Inscriptas");
        jRMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasInscriptasActionPerformed(evt);
            }
        });

        bGInscripotasoNo.add(jRMateriasNoInscriptas);
        jRMateriasNoInscriptas.setText("NO inscriptas");
        jRMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasNoInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPinscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBinscribir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBanular)
                            .addGap(102, 102, 102)
                            .addComponent(jBsalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLseleccioneAlumno)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLInscripciones)
                                .addComponent(jCalumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRMateriasInscriptas)
                        .addGap(115, 115, 115)
                        .addComponent(jRMateriasNoInscriptas)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLlistadoMaterias)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLseleccioneAlumno)
                    .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLlistadoMaterias)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMateriasInscriptas)
                    .addComponent(jRMateriasNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPinscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinscribir)
                    .addComponent(jBanular)
                    .addComponent(jBsalir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTinscripcionesListadoMaterias.getModel();
        InscripcionData id = new InscripcionData();
        Alumno alu;
        int selected = jTinscripcionesListadoMaterias.getSelectedRow();
        if (selected != -1 && jCalumnos.getSelectedIndex() != -1) {
            
            int idMat = (int) (modelo.getValueAt(selected, 0));
            alu = (Alumno) (jCalumnos.getSelectedItem());
            
            id.borrarInscripcioMateriaAlumno(alu.getIdAlumno(), idMat);
            modelo.removeRow(selected);
            jTinscripcionesListadoMaterias.repaint();
            
        } else {
            JOptionPane.showMessageDialog(this, "Alumno o Materia no seleccionados.");
        }
    }//GEN-LAST:event_jBanularActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();         // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed
        //ACA SELECCIONO EL ALUMNO DEL COMBO
        //Alumno aluElejido =(Alumno) jCalumnos.getSelectedItem();

        ((DefaultTableModel) jTinscripcionesListadoMaterias.getModel()).setRowCount(0);//borro todo 
        aluElejido = (Alumno) jCalumnos.getSelectedItem(); // no estoy seguro de que vaya aca
        if (jRMateriasNoInscriptas.isSelected() && aluElejido != null) {
            cargarNoInscriptas(aluElejido.getIdAlumno()); //aca hay que traer el id del combo
        }
         if (jRMateriasInscriptas.isSelected() && aluElejido != null) {

            cargarInscriptas(aluElejido.getIdAlumno()); //aca hay que traer el id del combo

        }    
    }//GEN-LAST:event_jCalumnosActionPerformed

    private void jRMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasNoInscriptasActionPerformed
        jBanular.setEnabled(false);
        jBinscribir.setEnabled(true);
        vistaInsc.setRowCount(0);
        if (jRMateriasNoInscriptas.isSelected() && aluElejido != null) {
            cargarNoInscriptas(aluElejido.getIdAlumno()); //aca hay que traer el id del combo
        }

    }//GEN-LAST:event_jRMateriasNoInscriptasActionPerformed

    private void jRMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasInscriptasActionPerformed
        jBinscribir.setEnabled(false);
        jBanular.setEnabled(true);
        vistaInsc.setRowCount(0);
        if (jRMateriasInscriptas.isSelected() && aluElejido != null) {

            cargarInscriptas(aluElejido.getIdAlumno()); //aca hay que traer el id del combo

        }    // TODO add your handling code here:
    }//GEN-LAST:event_jRMateriasInscriptasActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTinscripcionesListadoMaterias.getModel();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
        Materia mat;
        Alumno alu;

        //OBTENGO LO DATOS DE LA MATERIA Y EL ALUMNO DESDE LA TABLA Y EL COMBO BOX.
        int selected = jTinscripcionesListadoMaterias.getSelectedRow();
        if (selected != -1 && jCalumnos.getSelectedIndex() != -1) {

            int idMat = (int) (modelo.getValueAt(selected, 0));
            mat = md.buscarMateria(idMat);
            alu = (Alumno) (jCalumnos.getSelectedItem());

            //CREO LA INSCRIPCION CON alu Y mat, NOTA EN 0 PARA MODIFICARLA DESPUES.
            Inscripcion insc = new Inscripcion(alu, mat, 0);
            id.guardarInscripcion(insc);
            modelo.removeRow(selected);
            jTinscripcionesListadoMaterias.repaint();

        } else {
            JOptionPane.showMessageDialog(this, "Alumno o Materia no seleccionados.");
        }
    }//GEN-LAST:event_jBinscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGInscripotasoNo;
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCalumnos;
    private javax.swing.JLabel jLInscripciones;
    private javax.swing.JLabel jLlistadoMaterias;
    private javax.swing.JLabel jLseleccioneAlumno;
    private javax.swing.JRadioButton jRMateriasInscriptas;
    private javax.swing.JRadioButton jRMateriasNoInscriptas;
    private javax.swing.JScrollPane jSPinscripciones;
    private javax.swing.JTable jTinscripcionesListadoMaterias;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo() {
        // MateriaData mate = new MateriaData();
        AlumnoData alu = new AlumnoData();
        List<Alumno> listaalumnos = new ArrayList<>();
        listaalumnos.addAll(alu.listarAlumnos());
        for (Alumno a : listaalumnos) {
            //jCmaterias.addItem(m);}
            jCalumnos.addItem(a);
        }
    }

    private void armarCabecera() {
        vistaInsc.addColumn("Id");
        vistaInsc.addColumn("Nombre");
        vistaInsc.addColumn("Año");

        jTinscripcionesListadoMaterias.setModel(vistaInsc);
    }

    
    private void cargarInscriptas(int IdAlumno) {
//NECESITO inscripciondata obtener alumnos x materia
//public List<Materia> obtenerMateriasCursadas(int id)
        InscripcionData insc = new InscripcionData();
        List<Materia> materiasInsc = new ArrayList();
        materiasInsc.addAll(insc.obtenerMateriasCursadas(IdAlumno));

//vistaInsc.addRow(materiasInsc[]);
        for (Materia materia : materiasInsc) {

            vistaInsc.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }

    }

    private void cargarNoInscriptas(int IdAlumno) {
//NECESITO inscripciondata obtener alumnos x materia
//public List<Materia> obtenerMateriasCursadas(int id)
        InscripcionData noinsc = new InscripcionData();
        List<Materia> materiasInsc = new ArrayList();
        materiasInsc.addAll(noinsc.obtenerMateriasNoCursadas(IdAlumno));

//vistaInsc.addRow(materiasInsc[]);
        for (Materia materia : materiasInsc) {

            vistaInsc.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }

    }
}
