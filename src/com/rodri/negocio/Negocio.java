/**
 * 
 */
package com.rodri.negocio;

import java.io.IOException;

import com.rodri.datos.Datos;

/**
 * @author rodri
 *
 */
public class Negocio {
	public double calculoMasa(String nombre) throws IOException {
		Datos d = new Datos();
		double peso;
		double altura;
		peso = Double.parseDouble(d.consultaDatos(nombre).split("-")[1]);
		altura = Double.parseDouble(d.consultaDatos(nombre).split("-")[2]);
		return peso/altura*100;
	}
}

