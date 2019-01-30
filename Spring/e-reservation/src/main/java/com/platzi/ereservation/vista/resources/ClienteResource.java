package com.platzi.ereservation.vista.resources;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.services.ClienteService;
import com.platzi.ereservation.vista.resources.vo.ClienteVO;

/**
 * Clase que representa el servicio web de cliente
 */

@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {
	private final ClienteService clienteService;
	
	public ClienteResource(ClienteService clienteService ) {
		this.clienteService= clienteService;
	}
	
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVo ){
		
		Cliente cliente = new Cliente();
		cliente.setNombreCli(clienteVo.getNombreCli());
		cliente.setApellidoCli(clienteVo.getApellidoCli());
		cliente.setDireccionCli(clienteVo.getDireccionCli());
		cliente.setTelefonoCli(clienteVo.getTelefonoCli());
		cliente.setEmailCli(clienteVo.getEmailCli());
		return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
		
	}
	
	@PutMapping("{/id}")
	public ResponseEntity<Cliente> updateCliente(@PathParam ("id") String id, ClienteVO clienteVo){
		
		Cliente cliente = this.clienteService.findByIdentificacion(id);
		if (cliente==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {

		
		cliente.setNombreCli(clienteVo.getNombreCli());
		cliente.setApellidoCli(clienteVo.getApellidoCli());
		cliente.setDireccionCli(clienteVo.getDireccionCli());
		cliente.setTelefonoCli(clienteVo.getTelefonoCli());
		cliente.setEmailCli(clienteVo.getEmailCli());
		}
		return new ResponseEntity<>(this.clienteService.update(cliente), HttpStatus.OK);
	}
		
	
}
