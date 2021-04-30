package com.Dayana.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionBD {
    
    private Connection conec;
    
    public ConexionBD()
    {
    	
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        conec = DriverManager.getConnection("jdbc:mysql://localhost/beneficiarios","root","root");
        System.out.println("CONECTADO A LA BD");
        
    }catch (Exception e)
    {
        System.out.println("ERROR DE CONEXION A LA BD "+ e);
    }
    }
    public Connection RetornarConexion(){   
        return conec;   
    }
    
}