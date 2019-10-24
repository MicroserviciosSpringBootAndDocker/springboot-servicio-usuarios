INSERT INTO usuarios (username, password, enabled, nombre, apellido, email)VALUES('andres','$2a$10$4.RPYM0WhkjUxU9rDI9l2OUxruH4LmD/8u1ARhypsbaw3VKZCgALG',true,'Andres','Guzman','Guzman@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email)VALUES('admin','$2a$10$Ovsr0efr7lgOmLgLel2LDOFiyi16kKCSxv2yCsnpBY80ug0wwhp52',true,'Jhon','Doe','Jhon@gmail.com');	

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');


INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2,1);
