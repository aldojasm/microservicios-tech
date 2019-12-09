package com.proyecto.appclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.appclient.entity.ClienteEntity;

public interface IClientRepository extends JpaRepository<ClienteEntity, Long>{
	//List<ClienteEntity> findByNombreOrderByEdadAsc(String nombre);

}
