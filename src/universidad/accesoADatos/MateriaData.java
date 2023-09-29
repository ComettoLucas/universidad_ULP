package universidad.accesoADatos;

import universidad.entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
//void guardarMateria listo
//Materia buscarMateria(int id) listo
//void modificarMateria(Materia materia) listo
//void eliminarMateria(int id)listo
//List<Materia>listarMaterias()

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
    }
    

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, anioMateria, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Materia Agregada/Actualizada");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());

        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, anioMateria, estado FROM materia WHERE idMateria = ? AND estado=1";
        //PreparedStatement ps = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(rs.getBoolean("estado"));
            }else{JOptionPane.showMessageDialog(null, "No se encontraron materias con esa ID");}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return materia;
    }

    public Materia buscarMateriaBajada(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, anioMateria, estado FROM materia WHERE idMateria = ? AND estado=0";
        //PreparedStatement ps = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(rs.getBoolean("estado"));
            }else{JOptionPane.showMessageDialog(null, "No se encontraron materias con esa ID");}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return materia;
    }
    public void modificarMateria(Materia materia) {
        String SQL = "UPDATE materia SET nombre = ?, anioMateria = ?, estado =? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(2, materia.getAnioMateria());
            ps.setString(1, materia.getNombre());
            ps.setBoolean(3, materia.getActivo());
            ps.setInt(4, materia.getIdMateria());

            int cor = ps.executeUpdate();
            if (cor == 1) {
                JOptionPane.showMessageDialog(null, "Materia Actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());

        }

    }

    public void eliminarMateria(int id) { // si lo hago logico puedo tener problemas con las inscripciones
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? and estado=1"; //agrego acá estado activo porque sino siempre entra en materia eliminada
            //String sql = "DELETE FROM materia WHERE idMateria = ?"; //agrego acá estado activo porque sino siempre entra en materia eliminada
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una materia con ese id");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia:"+e.getMessage());
        }
    }
//List<Materia>listarMaterias()

    public List<Materia> listarMaterias() {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnioMateria(rs.getInt("anioMateria"));
                mate.setActivo(rs.getBoolean("estado"));
                materias.add(mate);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return materias;
    }
    
}
     

