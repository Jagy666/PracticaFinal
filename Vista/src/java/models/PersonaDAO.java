/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mateo.llano
 */
import com.mysql.jdbc.Connection;
import db.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn = null;
    DB conexion = null;

    public void agregar(Persona p) {

        try {
            conn = conexion.getConexion();
            String query = "INSERT INTO persona (nombre, correo) values (?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getNombre()); ps.setString(2, p.getCorreo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { try { rs.close(); } catch (Exception e) { /* ignored */ }
        }
    }
}
