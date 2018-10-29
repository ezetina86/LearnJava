package com.amazon.model;


import java.util.Date;

public interface IVisualizable {
	/**
	 * Captura el tiempo de inicio de vizualiacion  
	 * @param dateI Objeto  de tipo date
	 * @return Devuelve fecha y hora caprurada
	 */
	Date startToSee(Date dateI);
	
	/**
	 * Captura el tiempo de inicio y fin de vizualizacion 
	 * @param dateI Objeto  de tipo date
	 * @return Devuelve fecha y hora caprurada
	 * @param dateI Objeto  de tipo date
	 * @param datef Objeto  de tipo date
	 */
	void stopToSee(Date dateI, Date datef);
	
}
