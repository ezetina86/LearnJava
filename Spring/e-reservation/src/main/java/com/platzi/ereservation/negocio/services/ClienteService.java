package com.platzi.ereservation.negocio.services;

import org.springframework.stereotype.Service;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir los servicion del cliente
 * 
 * @author Henry
 *
 */
@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository=clienteRepository;
	}
	
	/***
	 * Metodo para  guardar un cliente
	 * @param cliente
	 * @return
	 */
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/***
	 * Metodo para  actualizar  un cliente
	 * @param cliente
	 * @return
	 */
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/***
	 * Metodo para  borrar  un cliente
	 * @param cliente
	 * @return
	 */
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	
	/***
	 * Metodo para  consultar   un cliente por su identificacion
	 * @param cliente
	 * @return
	 */
	public Cliente findByIdentificacion (String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
}
