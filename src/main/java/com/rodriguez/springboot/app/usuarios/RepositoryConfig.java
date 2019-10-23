package com.rodriguez.springboot.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


import com.rodriguez.springboot.app.commons.models.entity.Usuario;
import com.rodriguez.springboot.app.commons.models.entity.Role;
//para mostrar el ID en el JSON
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class,Role.class);
	}

}
