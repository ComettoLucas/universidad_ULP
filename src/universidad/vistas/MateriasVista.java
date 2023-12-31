/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vistas;
import universidad.entidades.Materia;
import universidad.accesoADatos.MateriaData;
import universidad.ValidacionDatos;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas Cometto
 */
public class MateriasVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumnos
     */
    public MateriasVista() {
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

        jLmateria = new javax.swing.JLabel();
        jLcodigo = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLanio = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jRadioEstado = new javax.swing.JRadioButton();
        jTcodigo = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTanio = new javax.swing.JTextField();
        jCmateriaBaja = new javax.swing.JCheckBox();

        setClosable(true);

        jLmateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLmateria.setText("Materia");

        jLcodigo.setText("Codigo:");

        jLnombre.setText("Nombre:");

        jLanio.setText("Año:");

        jLestado.setText("Estado:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jRadioEstado.setText("Tildar para activo");

        jCmateriaBaja.setText("Buscar dadas de baja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLmateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBbuscar)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBguardar)
                        .addGap(24, 24, 24)
                        .addComponent(jBsalir)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLestado)
                            .addComponent(jLanio))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCmateriaBaja))
                            .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLmateria)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodigo)
                    .addComponent(jBbuscar)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnombre)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jCmateriaBaja)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLanio)
                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestado)
                    .addComponent(jRadioEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        
        String idString = jTcodigo.getText();
        if(!idString.isEmpty()){//si id no está vacío
            if(ValidacionDatos.validarNumeroPositivo(idString)){//verifico que no me pongan algo diferente a un numero
        int id = Integer.parseInt(idString);
    limpiar();    
    //esto acá no va, tiene que venir de MateriaData
        //String sql = "SELECT idMateria FROM materia WHERE estado=1";
        
       // try {
            //PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
           // ResultSet rs = ps.executeQuery();
           // while (rs.next()) {
           //     if (rs.getInt("idMateria") == id) {
                    MateriaData md = new MateriaData();
                    Materia mat = null;
                    if(!jCmateriaBaja.isSelected()){
                    mat = md.buscarMateria(id);}
                    else{
                    mat = md.buscarMateriaBajada(id);
                    }
                    
                    if (mat != null){//acá pregunto si no es null, para que no explote
                    jTcodigo.setText(mat.getIdMateria() + "");
                    jTnombre.setText(mat.getNombre());
                    jTanio.setText(mat.getAnioMateria() + "");
                    jRadioEstado.setSelected(mat.isActivo());
                    }//else no le pongo porque debería venir del método EL MENSAJE
                    //        rs.close();
            //    }else if (!rs.isClosed()&&rs.isLast()){
            //        JOptionPane.showMessageDialog(this,"No se encontró ese ID");
              //  }
            //}
            
        //} catch (SQLException ex) {
        //    JOptionPane.showMessageDialog(this, "Error" + ex.getMessage());
        //}
            }else{JOptionPane.showMessageDialog(null, "Sólo se permiten números");}
        }else{JOptionPane.showMessageDialog(null, "Hay campos vacíos");}//si id estávacío
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        //if(!jTcodigo.getText().equals("") || jTcodigo.getText() != null){
         String idString = jTcodigo.getText();
        if(!idString.isEmpty()){//si id no está vacío
            if(ValidacionDatos.validarNumeroPositivo(idString)){//verifico que no me pongan algo diferente a un numero
        int id = Integer.parseInt(idString);
        //int id = Integer.parseInt(jTcodigo.getText());
        MateriaData md = new MateriaData();
        md.eliminarMateria(id);}
        }else{JOptionPane.showMessageDialog(null, "Debe buscar una materia primero");}
        limpiar();
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // AGREGO VALIDACION DE DATOS
        
        //
       // if(!jTnombre.getText().isEmpty()&&!jTanio.getText().isEmpty()){
            
        String nombre = jTnombre.getText();
        String anioString = jTanio.getText();
        boolean estado = jRadioEstado.isSelected();
        if (!ValidacionDatos.validarNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido (solo letras y espacios).");
        return;}
        if(!ValidacionDatos.validarNota(anioString)){
        JOptionPane.showMessageDialog(null,"El año debe ser un número");
        return;
        }
        int anio = Integer.parseInt(anioString);
        Materia mat = new Materia(nombre,anio,estado);
        MateriaData md = new MateriaData();
        md.guardarMateria(mat);
        
        limpiar();
        //}else{JOptionPane.showMessageDialog(null, "Faltan datos");}
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        //modificarMateria(Materia materia)
        //String idString = jTcodigo.getText();
        String nombre = jTnombre.getText();
        String anio = jTanio.getText();
        boolean activo = jRadioEstado.isSelected();
        //if (idString != null && nombre != null && anio != null){//Si no hay campos vacíos voy a ver si son validos//hay que agregar las validaciones
        String idString = jTcodigo.getText();
        if (!idString.isEmpty() && !anio.isEmpty() && !nombre.isEmpty()) {//si no hay campos vacíos
            if (ValidacionDatos.validarNumeroPositivo(idString) && ValidacionDatos.validarNombre(nombre) && ValidacionDatos.validarNumeroPositivo(anio)) {//verifico que no me pongan algo diferente a un numero

                int id = Integer.parseInt(idString);
                MateriaData md = new MateriaData();
                Materia mat = new Materia(id, nombre, Integer.parseInt(anio), activo); //Materia(int idMateria, String nombre, int anioMateria, boolean activo) 
                md.modificarMateria(mat);
            } else {
                JOptionPane.showMessageDialog(null, "Hay algo mal que no anda bien  :-D");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos");
        }
        limpiar();
    }//GEN-LAST:event_jBguardarActionPerformed
private void limpiar(){
jTcodigo.setText("");
        jTnombre.setText("");
        jTanio.setText("");
        jRadioEstado.setSelected(false);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JCheckBox jCmateriaBaja;
    private javax.swing.JLabel jLanio;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLmateria;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JRadioButton jRadioEstado;
    private javax.swing.JTextField jTanio;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
