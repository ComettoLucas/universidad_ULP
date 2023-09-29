/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import universidad.vistas.PrincipalVista;

import javax.swing.UIManager; //importo para cambiar apariencia

/**
 *
 * @author Lucas Cometto
 */
public class universidad {
    public static void main(String[] args) {
  /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        // Establece el Look and Feel aquí
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
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

    /* Creo y muestro */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PrincipalVista().setVisible(true);
        }
    });
    
    
    //Alumno deprueba = new Alumno (23344777,"Wilmar","Barrios",LocalDate.of(1992,6,7),true);
    //AlumnoData alu = new AlumnoData();
    //alu.guardarAlumno(deprueba);
    }
}
