/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vistas;

import universidad.entidades.Inscripcion;
import universidad.entidades.Alumno;
import universidad.accesoADatos.AlumnoData;
import universidad.accesoADatos.InscripcionData;
import universidad.ValidacionDatos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *a
 * @author Lucas Cometto
 */
public class CargaNotasVista extends javax.swing.JInternalFrame {
private DefaultTableModel vistaNotas = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) { 
            return column == 2;
        }
    };


    public CargaNotasVista() {
        initComponents();
        jBguardar.setToolTipText("Actualiza la calificación, primero la o las debe cambiar y luego Seleccionar");
        cargarCombo();
        armarCabecera();
        cargarInscriptas();
        //para que permita elegir varias filas
        jTinscripcionesListadoMaterias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLcargaNotas = new javax.swing.JLabel();
        jLseleccioneAlumno = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jCalumnos = new javax.swing.JComboBox<>();
        jSPcargaNotas = new javax.swing.JScrollPane();
        jTinscripcionesListadoMaterias = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();

        setClosable(true);

        jLcargaNotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLcargaNotas.setText("Carga de notas");

        jLseleccioneAlumno.setText("Seleccione un alumno");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jCalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalumnosActionPerformed(evt);
            }
        });

        jTinscripcionesListadoMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "codigo", "nombre", "nota"
            }
        ));
        jSPcargaNotas.setViewportView(jTinscripcionesListadoMaterias);

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLcargaNotas)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(208, 208, 208)
                            .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLseleccioneAlumno)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBguardar)
                                .addGap(134, 134, 134)
                                .addComponent(jBsalir))
                            .addComponent(jSPcargaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLcargaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLseleccioneAlumno)
                    .addComponent(jCalumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSPcargaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBsalir)
                            .addComponent(jBguardar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed
        cargarInscriptas();
        
    }//GEN-LAST:event_jCalumnosActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        /*InscripcionData inscData = new InscripcionData();
        Alumno alu;
        int contadorFila = jTinscripcionesListadoMaterias.getSelectedRowCount();
                
        int fila = jTinscripcionesListadoMaterias.getSelectedRow();
        try{
            alu = (Alumno)jCalumnos.getSelectedItem();
            int idMat = (int)(vistaNotas.getValueAt(fila,0));
            double nota = Double.parseDouble(vistaNotas.getValueAt(fila, 2).toString());
            
            inscData.actualizarNota(alu.getIdAlumno(), idMat, nota);
            
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Error al guardar nota: " + ex.getMessage());
        }*/
        InscripcionData inscData = new InscripcionData();
    Alumno alu;
    
    int[] filasSeleccionadas = jTinscripcionesListadoMaterias.getSelectedRows();
    
    for (int fila : filasSeleccionadas) { //recorro hasta la cant de filas elegidas
        try {
            alu = (Alumno) jCalumnos.getSelectedItem();
            int idMat = (int) (vistaNotas.getValueAt(fila, 0));
            String nota = vistaNotas.getValueAt(fila, 2).toString();
            if (ValidacionDatos.validarNota(nota)){
            inscData.actualizarNota(alu.getIdAlumno(), idMat, Double.parseDouble(nota));
            }else{JOptionPane.showMessageDialog(null, "La nota debe ser un numero del 1 al 10");}
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar nota: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCalumnos;
    private javax.swing.JLabel jLcargaNotas;
    private javax.swing.JLabel jLseleccioneAlumno;
    private javax.swing.JScrollPane jSPcargaNotas;
    private javax.swing.JTable jTinscripcionesListadoMaterias;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo() {
        AlumnoData alu = new AlumnoData();
        List<Alumno> listaalumnos = new ArrayList<>();
        listaalumnos.addAll(alu.listarAlumnos());
        for (Alumno a : listaalumnos) {
            jCalumnos.addItem(a);
        }
    }

    private void armarCabecera() {
        vistaNotas.addColumn("Código");
        vistaNotas.addColumn("Nombre");
        vistaNotas.addColumn("Nota");

        jTinscripcionesListadoMaterias.setModel(vistaNotas);
    }

    private void cargarInscriptas() {
        vistaNotas.setRowCount(0);//elimino todas las filas
        if (jCalumnos.getSelectedIndex() != -1) {
            Alumno alu = (Alumno) (jCalumnos.getSelectedItem());
            int IdAlumno = alu.getIdAlumno();
            InscripcionData insc = new InscripcionData();
            List<Inscripcion> materiasInsc = new ArrayList();
            materiasInsc.addAll(insc.obtenerInscripcionesPorAlumno(IdAlumno)); //acá pincha inscripcionesporalumno devuelve una inscripcion parece que id alumno esta viniendo vacio

            for (Inscripcion inscmateria : materiasInsc) {
                
                vistaNotas.addRow(new Object[]{inscmateria.getMateria().getIdMateria(), inscmateria.getMateria().getNombre(), inscmateria.getNota()});
            }
        }
        jTinscripcionesListadoMaterias.repaint();
    }
}
