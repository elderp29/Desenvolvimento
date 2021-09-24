1-  banco usado foi postgresql-9.6.23-1
2- Existe uma lib de conexao na pasta lib para o tomcat
3 - criei as seguintes tabelas 
CREATE SEQUENCE USUARIO_USUA_SEQ_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE IF NOT EXISTS USUARIO
(
    USUA_SEQ integer NOT NULL DEFAULT nextval('USUARIO_USUA_SEQ_seq'::regclass),
    USUA_NOME character varying(45) COLLATE pg_catalog.default NOT NULL,
    USUA_EMAIL character varying(45) COLLATE pg_catalog.default NOT NULL,
    USUA_SENHA character varying(45) COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT PK_USUARIO PRIMARY KEY (USUA_SEQ)
)


CREATE SEQUENCE EVENTO_EVEN_ID_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE IF NOT EXISTS EVENTO
(
    EVEN_ID integer NOT NULL DEFAULT nextval('EVENTO_EVEN_ID_seq'::regclass),
    EVEN_NOME character varying(45) COLLATE pg_catalog.default NOT NULL,
    EVEN_DATA date NOT NULL,
    EVEN_HORA time with time zone NOT NULL,
    EVEN_LOCAL character varying(45) COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT PK_EVENTOS PRIMARY KEY (EVEN_ID)
);

CREATE SEQUENCE EVENTO_USUARIO_EVUS_ID_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

    CREATE TABLE IF NOT EXISTS EVENTO_USUARIO
(
    EVUS_ID integer NOT NULL DEFAULT nextval('EVENTO_USUARIO_EVUS_ID_seq'::regclass),
    EVUS_EVEN_ID integer,
    EVUS_USUA_ID integer,
    CONSTRAINT PK_EVENTO_USUARIO PRIMARY KEY (EVUS_ID),
    CONSTRAINT FK_EVUS_EVEN FOREIGN KEY (EVUS_ID)
        REFERENCES evento (even_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT FK_EVUS_USUA_ID FOREIGN KEY (EVUS_ID)
        REFERENCES usuario (usua_seq) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

4 o usuario : administrador
   senha    : 123456
é o ADM do sistema

5 o servidor é TOMCAT 7.0

6 o JAVA é o 1.6

