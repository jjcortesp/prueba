CREATE TABLE perfiles
(
	cod_perfil BIGINT NOT NULL AUTO_INCREMENT,
	nombre_perfil VARCHAR(100) NOT NULL,
	PRIMARY KEY(cod_perfil)
);

CREATE TABLE usuarios
(
	cod_usuario BIGINT NOT NULL AUTO_INCREMENT,
	cod_perfil BIGINT NOT NULL,
	nombre_usuario VARCHAR(100) NOT NULL,
	clave_usuario VARCHAR(100) NOT NULL,
	estado_usuario SMALLINT NOT NULL,
	PRIMARY KEY(cod_usuario)
);

CREATE UNIQUE INDEX indice_nomusu ON usuarios(nombre_usuario);

ALTER TABLE usuarios ADD CONSTRAINT fk_usuarios_ref_perfiles FOREIGN KEY (cod_perfil)
	REFERENCES perfiles (cod_perfil) ON DELETE RESTRICT ON UPDATE CASCADE;

