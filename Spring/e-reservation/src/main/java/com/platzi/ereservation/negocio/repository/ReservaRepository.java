package com.platzi.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.modelo.Reserva;

/***
 * Interfaz para definir las operaciones de base de  datos  relacionadas con reservas
 * @author Henry
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String>{
	
	@Query("SELECT r FROM Reserva r WHERE r.fechaIngresoRes =: fechaInicio AND r.fechaSalidaRes =: fechaSalida")
	public List<Reserva> find(@Param("fechaInicio") Date fechaInicio,@Param("fechaSalida") Date fechaSalida);

}
