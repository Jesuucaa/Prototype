package com.jesuuca.interfaz;

// Interfaz que está extendiendo una clase conocida como clonable, esto es propio de JAVA
public interface ICuenta extends Cloneable{
	
	// Lo que voy a indicar en esta interfaz es que voy a establecer un metodo que lo llamaremos clonar
	// que va a devolver la misma interfaz, porque si devuelve la misma interfaz se supone que puede
	// haber alguna clase que implemente esa interfaz y cumpla con este objetivo, 
	ICuenta clonar();
	
	// y para eso vamos a crear una clase que se va a llamar CuentaAhorroImplementacion que obviamente 
	//implementa la interfaz ICuenta
	
	
}
