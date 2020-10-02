/**
 * 
 */
package com.rodri.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.rodri.negocio.Negocio;

/**
 * @author rodri
 *
 */
public class Presentacion {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = sc.next();
		
		
		System.out.println("El IMC de " + nombre + " es: " + new Negocio().calculoMasa(nombre));

	}

}
