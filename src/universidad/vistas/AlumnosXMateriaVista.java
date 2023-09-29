/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vistas;

import universidad.entidades.Alumno;
import universidad.entidades.Materia;
import universidad.accesoADatos.InscripcionData;
import universidad.accesoADatos.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas Cometto
 */
public class AlumnosXMateriaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel vista = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) { //all cells false return false;
            return false;
        }
    };
    
    public AlumnosXMateriaVista() {
        initComponents();
        cargarCombo();
        armarCabecera();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLlistadoAlumnos = new javax.swing.JLabel();
        jLseleccioneMateria = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jCmaterias = new javax.swing.JComboBox<>();
        jSPalumnosXmateria = new javax.swing.JScrollPane();
        jTinscripcionesListadoMaterias = new javax.swing.JTable();

        setClosable(true);

        jLlistadoAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLlistadoAlumnos.setText("Listado de Alumnos por Materia");

        jLseleccioneMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLseleccioneMateria.setText("Seleccione una materia:");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jCmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmateriasActionPerformed(evt);
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
        jSPalumnosXmateria.setViewportView(jTinscripcionesListadoMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jSPalumnosXmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jLlistadoAlumnos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLseleccioneMateria)
                                .addGap(69, 69, 69)
                                .addComponent(jCmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBsalir))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLlistadoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLseleccioneMateria))
                .addGap(29, 29, 29)
                .addComponent(jSPalumnosXmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();         // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmateriasActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jCmateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCmaterias;
    private javax.swing.JLabel jLlistadoAlumnos;
    private javax.swing.JLabel jLseleccioneMateria;
    private javax.swing.JScrollPane jSPalumnosXmateria;
    private javax.swing.JTable jTinscripcionesListadoMaterias;
    // End of variables declaration//GEN-END:variables
    
    private void cargarCombo() {
        MateriaData mate = new MateriaData();
        List<Materia> listamaterias = new ArrayList<>();
        listamaterias.addAll(mate.listarMaterias());
        for (Materia m : listamaterias) {
            //jCmaterias.addItem(m);}
            jCmaterias.addItem(m);
        }
    }

    private void armarCabecera() {
        vista.addColumn("ID");
        vista.addColumn("DNI");
        vista.addColumn("Apellido");
        vista.addColumn("Nombre");
        jTinscripcionesListadoMaterias.setModel(vista);
    }

    private void cargarDatos() {
        vista.setRowCount(0);
        if (jCmaterias.getSelectedIndex() != -1) {
            Materia mat = (Materia) (jCmaterias.getSelectedItem());
            InscripcionData id = new InscripcionData();
            List<Alumno> lista = new ArrayList<>();
            lista.addAll(id.obtenerAlumnosXMateria(mat.getIdMateria()));
            for (Alumno alu : lista) {
                vista.addRow(new Object[]{alu.getIdAlumno(), alu.getDni(), alu.getApellido(), alu.getNombre()});
            }
        }
        jTinscripcionesListadoMaterias.repaint();
    }
}
