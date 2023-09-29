package universidad.accesoADatos;

import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;
import universidad.entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private final Connection con;
    private final MateriaData matData = new MateriaData();
    private final AlumnoData aluData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        if (insc.getIdInscripcion() == 0) {
            String sql = "INSERT INTO inscripcion (idMateria, idAlumno, nota) VALUES (?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setDouble(3, insc.getNota());
                ps.setInt(1, insc.getMateria().getIdMateria());
                ps.setInt(2, insc.getAlumno().getIdAlumno());

                int end = ps.executeUpdate();
                if (end == 1) {
                    JOptionPane.showMessageDialog(null, "Inscripcion Actualizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se guardó la inscripción");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar un alumno: " + ex.getMessage());
            }
        } else {
            String sql = "INSERT INTO inscripcion (idInscripto, idMateria, idAlumno, nota) VALUES (?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, insc.getIdInscripcion());
                ps.setDouble(4, insc.getNota());
                ps.setInt(2, insc.getMateria().getIdMateria());
                ps.setInt(3, insc.getAlumno().getIdAlumno());

                int end = ps.executeUpdate();
                if (end == 1) {
                    JOptionPane.showMessageDialog(null, "Inscripcion Actualizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se guardó la inscripción");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar un alumno: " + ex.getMessage());
            }
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try{
           String sql = "SELECT * FROM inscripcion";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           Inscripcion ins;
           while(rs.next()){
               ins = new Inscripcion();
               ins.setIdInscripcion(rs.getInt("idInscripto"));
               ins.setNota(rs.getDouble("nota"));
               Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
               ins.setAlumno(alu);
               Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
               ins.setMateria(mat);
               
               inscripciones.add(ins);
           }
           ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripcionesXalu = new ArrayList<>();
       // String sql = "SELECT idInscripto, nota, idMateria, idAlumno FROM inscripcion WHERE idAlumno = ?";
        
String sql="SELECT idInscripto, nota, inscripcion.idMateria,idAlumno FROM inscripcion JOIN materia ON inscripcion.idMateria = materia.idMateria WHERE inscripcion.idAlumno = ? and materia.estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Inscripcion ins;
            
         
            while (rs.next()) {
                   Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                   Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                ins.setNota(rs.getDouble("nota"));
                ins.setMateria(mat);
                ins.setAlumno(alu);
                inscripcionesXalu.add(ins);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }
        return inscripcionesXalu;
    }
        
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anioMateria FROM inscripcion, "
                    + "materia WHERE estado = 1 AND inscripcion.idMateria = materia.idMateria\n "
                    + "AND inscripcion.idALumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id){
        List<Materia> materiasNoCursadas = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + "( SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Materia mat;
            while(rs.next()){
                mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("anioMateria"));
                mat.setActivo(rs.getBoolean("estado"));
                materiasNoCursadas.add(mat);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones " + ex.getMessage());
        }
        return materiasNoCursadas;
    }
    
    public void borrarInscripcioMateriaAlumno(int idAlumno, int idMateria) {
        String delete = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(delete);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int cor = ps.executeUpdate();
            if(cor == 1){
                JOptionPane.showMessageDialog(null,"Inscripcion anulada.");
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo anular.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con las inscripciones: " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String update = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(update);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int cor = ps.executeUpdate();
            if (cor == 1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con las notas: " + ex.getMessage());
        }

    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        List<Alumno> aluXmateria = new ArrayList<>();
        //String sql = "SELECT * FROM inscripcion WHERE idMateria = ?";
        String sql = "SELECT idInscripto, nota, idMateria,inscripcion.idAlumno FROM inscripcion JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno WHERE inscripcion.idMateria = ? and alumno.estado=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alu;
            while(rs.next()){
                alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                aluXmateria.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con los alumnos: " + ex.getMessage());
        }
        
        return aluXmateria;
    }
    
}
