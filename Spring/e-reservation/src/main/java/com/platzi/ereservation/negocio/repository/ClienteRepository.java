package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/***
 * Interfaz para definir las operaciones de base de  datos  relacionadas con clientes
 * @author Henry
 *
 */
public interface ClienteRepository  extends JpaRepository<Cliente, String>{
	
	

}
