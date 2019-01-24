package com.platzi.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/***
 * Clase que representa la tabla cliente
 * @author Henry
 * 
 */
@Entity
@Table(name="cliente")
@Data
public class Cliente {
	@Id
	@GeneratedValue (generator="systrem-uuid")
	@GenericGenerator(name="systrem-uuid", strategy="uuid2")
	 private String idCli;
	 private String nombreCli;
	 private String apellidoCli;
	 private String direccionCli;
	 private String telefonoCli;
	 private String emailCli;
	 @OneToMany(mappedBy="cliente")
	 private Set<Reserva> reservas;
	
	public Cliente() {	
	
	}
}
