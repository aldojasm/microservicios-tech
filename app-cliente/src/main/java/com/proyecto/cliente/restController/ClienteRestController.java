package com.proyecto.cliente.restController;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.cliente.entity.ClienteEntity;
import com.proyecto.cliente.exception.ClienteNotFoundException;
import com.proyecto.cliente.exception.ClienteUnSupportedFieldPatchException;
import com.proyecto.cliente.repository.IClienteRepository;


@RestController
@RequestMapping("cliente/")
public class ClienteRestController {
	
	@Autowired
	IClienteRepository iClienteRepository;
	
	@GetMapping("listarTodos")
	List<ClienteEntity> listarTodos(){
		return iClienteRepository.findAll();
	}
	
	@PostMapping("crear")
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteEntity crear(@Valid @RequestBody ClienteEntity clienteEntity) {
		return iClienteRepository.save(clienteEntity);
	}
	
	@DeleteMapping("eliminar/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	void eliminar(@PathVariable Long id) {
		iClienteRepository.deleteById(id);
	}
	
	@PutMapping("actualizarCrear/{id}")
	ClienteEntity grabarActualizar(@RequestBody ClienteEntity clienteEntity, @PathVariable Long id) {
		
		return iClienteRepository.findById(id)
				.map(
						x -> {
							x.setNombre(clienteEntity.getNombre());
							x.setApellido(clienteEntity.getApellido());
							x.setEdad(clienteEntity.getEdad());
							x.setFechaNacimiento(clienteEntity.getFechaNacimiento());
							return iClienteRepository.save(x);
						}
				)
				.orElseGet(
						() -> {
							return iClienteRepository.save(clienteEntity);
						}
				);		
	}
	
	@PatchMapping("actualizar/{id}")
	ClienteEntity actualizarPatch(@RequestBody Map<String, String> parametro, @PathVariable Long id) {
		return iClienteRepository.findById(id)
				.map(
						x -> {
							String nombre = parametro.get("nombre");
							if(!StringUtils.isEmpty(nombre)) {
								x.setNombre(nombre);
								return iClienteRepository.save(x);
							} else {
								throw new ClienteUnSupportedFieldPatchException(parametro.keySet());
							}
							
						}
				)
				.orElseGet(
						() -> {
							throw new ClienteNotFoundException(id);
						}
				);
	}
	

}
