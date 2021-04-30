package com.Dayana.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Dayana.Conexion.ConexionBD;
import com.Dayana.Entidades.Personas;


public class ClsPersona {

	ConexionBD conexion = new ConexionBD();
    Connection con = conexion.RetornarConexion();
	
	public boolean ComprobarExistencia(Personas per) {
		ConexionBD cn = new ConexionBD();
	    Connection conexion = cn.RetornarConexion();
		boolean Existencia = false;
        try {
            CallableStatement Statement = conexion.prepareCall("Call SP_S_Persona(?)");
            Statement.setInt("PDUI", per.getDUI());
            ResultSet rs = Statement.executeQuery();
            while (rs.next()) {
                Existencia = true;
            }
        } catch (Exception e) {
        }
        return Existencia;
    }
	
	public String ObtenerNombre(Personas per) {
		ConexionBD cn = new ConexionBD();
	    Connection conexion = cn.RetornarConexion();
		String Nombre = "";
        try {
            CallableStatement Statement = conexion.prepareCall("Call SP_S_1Persona(?)");
            Statement.setInt("PDUI", per.getDUI());
            ResultSet rs = Statement.executeQuery();
            while (rs.next()) {
            	  per.setNombre(rs.getString("nombre"));
            	  Nombre = per.getNombre();
            }
        } catch (Exception e) {
        }
        return Nombre;
    }
	
}
