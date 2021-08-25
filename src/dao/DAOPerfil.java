package dao;

import configuracion.Conexion;
import interfaces.Operaciones;
import java.util.List;
import modelos.Perfil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOPerfil extends Conexion implements Operaciones<Perfil> {

    private String sql;
    private PreparedStatement consulta;

    public DAOPerfil() {
    }

    @Override
    public boolean agregar(Perfil objeto) {
        try {
            sql = "INSERT INTO perfiles (nombre_perfil) VALUES (?)";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, objeto.getNombrePerfil());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOPerfil.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Perfil> consultar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean borrar(Perfil objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizar(Perfil objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Perfil buscar(Integer llavePK) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
