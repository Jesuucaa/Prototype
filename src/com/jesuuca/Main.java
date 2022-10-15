package com.jesuuca;

import com.jesuuca.modelo.CuentaAhorroImplementacion;

public class Main {

	public static void main(String[] args) {
		// creamos una cuenta de ahorro, una nueva implementacion
		CuentaAhorroImplementacion cuentaAhorro = new CuentaAhorroImplementacion();
		// y le asignamos un monto de 200
		cuentaAhorro.setMonto(200);
		// por lo tanto apenas creamos una nueva instancia, el tipo se asigna de AHORRO
		// y el monto le estamos indicando 200
		
		// ahora, si queremos tener una cuenta clonada basada en la cuenta de ahorro que creamos previamente
		// simplemente utilizamos el metodo clonar() de la cuentaAhorro y esto nos va devolver una 
		// instancia del mismo tipo y con los mismos valores
		CuentaAhorroImplementacion cuentaClonada = (CuentaAhorroImplementacion) cuentaAhorro.clonar();
		
		System.out.println(cuentaAhorro);
		//System.out.println(cuentaClonada);
		
		// hacemos un if, con la condicion de "si la cuenta clonada es diferente de null entonces se va a
		// imprimir el contenido de esa cuenta"
		if(cuentaClonada != null)
		{
			System.out.println("Cuenta clonada:");
			System.out.println(cuentaClonada);
		}

		// y luego haremos una comprobacion para que vean que la cuenta clonada es distinta a la cuenta de
		// ahorro en referencia a memoria. Si es falso es porque son diferentes
		System.out.println(cuentaClonada == cuentaAhorro);
	}

}
