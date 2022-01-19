
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ValoresModelo {
    
    PreparedStatement ps;
    public int ejecutarSentenciaSQL(int valor){
        Connection con;
        try {
            con = Conexion.getConnection();
            String sentencia = "INSERT INTO tbValores (valor) VALUES (?)";
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, valor);
            ps.execute();
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }
    }
    public ResultSet mostrarDatosResultSet(){
        Connection con;
        try {
            con = Conexion.getConnection();
            String sentencia = "SELECT * FROM tbValores ORDER BY idvalor asc";
            ps = con.prepareStatement(sentencia);
            ResultSet respuesta = ps.executeQuery();
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public int eliminarRegistroSQL(int id){
        Connection con;
        try {
            con = Conexion.getConnection();
            String sentencia = "DELETE tbValores WHERE idvalor = ?";
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, id);
            ps.execute();
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }
    }
    
    public int actualizarRegistroSQL(int id, int valor){
        Connection con;
        try {
            con = Conexion.getConnection();
            String sentencia = "UPDATE tbValores SET valor = ? WHERE idvalor = ?";
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, valor);
            ps.setInt(2, id);
            ps.execute();
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        }
    }
}
