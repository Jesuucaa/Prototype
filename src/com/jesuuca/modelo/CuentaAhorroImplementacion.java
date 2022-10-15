package com.jesuuca.modelo;

import com.jesuuca.interfaz.ICuenta;

public class CuentaAhorroImplementacion implements ICuenta{
	
	// Primero declaramos los atributos y metodos de apoyo
	private String tipo;
	private double monto;
	
	// hacemos un contructor donde inicializaremos el tipo que será de Ahorro
	public CuentaAhorroImplementacion()
	{
		tipo = "AHORRO";
	}

	// sobreescribimos el metodo clonar de la interfaz ICuenta
	// 
	@Override
	public ICuenta clonar() {
		// declaramos una variable cuenta del tipo CuentaAhorroImplementacion
		CuentaAhorroImplementacion cuenta = null;
		
		try {
			// llamamos al metodo clone que es propio de java para que podamos
			// hacer la clonacion de este objeto -> CuentaAhorroImplementacion y tenerlo
			// en esta variable -> cuenta
			cuenta = (CuentaAhorroImplementacion) clone(); 
			
			// si es que la clonacion no es aceptada va a lanzar una excepcion
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		// y devolvemos la instancia clonada
		return cuenta;
	}

	
	// hacemos un metodo toString para mostrar el contenido de los atributos de estre objeto
	@Override
	public String toString() {
		return "CuentaAhorroImplementacion [tipo=" + tipo + ", \nmonto=" + monto + "]"+"\n\n";
	}
	
	// hacemos el get y set para el monto
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	//OBJETIVO de este patron:
	// obtener un clon de una instancia

}
