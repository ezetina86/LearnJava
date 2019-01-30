package com.platzi.ereservation.negocio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir los servicion del cliente
 * 
 * @author Henry
 *
 */
@Service
@Transactional(readOnly=true)
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
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/***
	 * Metodo para  actualizar  un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/***
	 * Metodo para  borrar  un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
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
	
	/***
	 * Metodo para consultar todos los clientes
	 */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
}
