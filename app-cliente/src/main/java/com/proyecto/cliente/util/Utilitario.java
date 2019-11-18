package com.proyecto.cliente.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.proyecto.cliente.entity.ClienteEntity;

public class Utilitario {
	
	public static int[] llenarArreglo(List<ClienteEntity> listaCliente) {
		// Declaro el arreglo. Tamaño = Tamaño de la lista listaCliente
		int[] intArray = new int[listaCliente.size()];
		// Recorrer la lista y lleno el arreglo
		for(int i=0; i<listaCliente.size(); i++) {
			intArray[i] = listaCliente.get(i).getEdad().intValue();
		}
		return intArray;
	}

	public static double desviacion(int[] v) {
		double prom, sum = 0;
		int i, n = v.length;
		prom = promedio(v);
		for (i = 0; i < n; i++)
			sum += Math.pow(v[i] - prom, 2);
		return Math.sqrt(sum / (double) n);
	}

	public static double promedio(int[] v) {
		double prom = 0.0;
		for (int i = 0; i < v.length; i++)
			prom += v[i];
		return prom / (double) v.length;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public static Date calcular_fecha_probable_muerte(ClienteEntity clienteEntity) {
		// Convirtiendo Date a Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(clienteEntity.getFechaNacimiento());
		// Agregar 70 Años
		calendar.add(Calendar.YEAR, 70); // 70 Esperanza de vida
		// Convirtiendo Calendar a Date
		Date fechaMuerte = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String fechaSinHora = formatter.format(fechaMuerte);  
	    try {
	    	fechaMuerte = new SimpleDateFormat("dd/MM/yyyy").parse(fechaSinHora);
		} catch (Exception e) {}  
		return fechaMuerte;
	}
	
}
