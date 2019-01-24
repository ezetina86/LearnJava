package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/***
 * Interfaz para definir las operaciones de base de  datos  relacionadas con clientes
 * @author Henry
 *
 */
public interface ClienteRepository  extends JpaRepository<Cliente, String>{
	
	/**
	 * Definicion de metodo para buscar clientes por apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion (String identificacionCli);
	
}
