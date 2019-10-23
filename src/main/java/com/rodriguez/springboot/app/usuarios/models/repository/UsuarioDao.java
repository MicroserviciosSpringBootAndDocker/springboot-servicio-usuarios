package com.rodriguez.springboot.app.usuarios.models.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.rodriguez.springboot.app.commons.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {
	
	@Query("select p from Usuario p where p.username = ?1")
	public Usuario obtenerPorNombre(String username);
	
	@RestResource(path="buscar-username")
	public Usuario findByUsername(@Param("username")String username);
	//http://localhost:8090/api/usuarios/usuarios/search/buscar-username?nombre=andres ó search/findByUsername?username=andres
	
	
}
