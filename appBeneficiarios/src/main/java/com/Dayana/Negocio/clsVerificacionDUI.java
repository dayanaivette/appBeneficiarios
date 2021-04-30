package com.Dayana.Negocio;


import com.Dayana.DAO.ClsPersona;
import com.Dayana.Entidades.Personas;

public class clsVerificacionDUI {

	public int acceso(Personas per) {
		int acceso = 0;
		ClsPersona clspersona = new ClsPersona();
		boolean existencia = clspersona.ComprobarExistencia(per);
		if (existencia == true) {
			acceso = 1;
		}

		return acceso;
	}
	
	public String ObtenerNombre(Personas per) {
		ClsPersona clspersona = new ClsPersona();
		return clspersona.ObtenerNombre(per);
	}
}
