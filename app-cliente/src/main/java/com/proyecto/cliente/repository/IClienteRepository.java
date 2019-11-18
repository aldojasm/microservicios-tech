package com.proyecto.cliente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.cliente.entity.ClienteEntity;

public interface IClienteRepository extends JpaRepository<ClienteEntity, Long> {
	List<ClienteEntity> findByNombreOrderByEdadAsc(String nombre);
	

}
