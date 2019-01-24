package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Reserva;

/***
 * Interfaz para definir las operaciones de base de  datos  relacionadas con reservas
 * @author Henry
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String>{

}
