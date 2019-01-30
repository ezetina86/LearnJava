package com.platzi.ereservation.vista.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.services.ClienteService;
import com.platzi.ereservation.vista.resources.vo.ClienteVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Clase que representa el servicio web de cliente
 */

@RestController
@RequestMapping("/api/cliente")
@Api(tags="cliente")
public class ClienteResource {
	private final ClienteService clienteService;
	
	public ClienteResource(ClienteService clienteService ) {
		this.clienteService= clienteService;
	}
	
	@PostMapping
	@ApiOperation(value="Crear cliente", notes="Servicio para crear nuevo cliente")
	@ApiResponses(value= {@ApiResponse(code=201,message="Cliente creado correctamente"),
	@ApiResponse(code=400,message="Solicitud inavlida")})
	
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
	@ApiOperation(value="Actualizar cliente", notes="Servicio para actualizar cliente")
	@ApiResponses(value= {@ApiResponse(code=201,message="Cliente actualizado correctamente"),
	@ApiResponse(code=404,message="Cliente no encontrado")})
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
	
	@DeleteMapping("{/id}")
	@ApiOperation(value="Borrar cliente", notes="Servicio para borrar cliente")
	@ApiResponses(value= {@ApiResponse(code=201,message="Cliente borardo correctamente"),
	@ApiResponse(code=404,message="Cliente no encontrado")})
	public void  deleteCliente(@PathParam ("id") String id, ClienteVO clienteVo) {
		Cliente cliente = this.clienteService.findByIdentificacion(id);
		if (cliente !=null) {
			this.clienteService.delete(cliente);
		}
	}
	
	@GetMapping
	@ApiOperation(value="Listar todos los clientes", notes="Servicio para consultar todos los  clientes")
	@ApiResponses(value= {@ApiResponse(code=201,message="Clientes encontrados correctamente"),
	@ApiResponse(code=404,message="Clientes no encontrados")})
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.ok(this.clienteService.findAll());
	}
	
	
}
