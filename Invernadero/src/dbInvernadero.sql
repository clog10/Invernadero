drop schema invernadero_gran_valle cascade;


create schema invernadero_gran_valle authorization postgres;

set search_path to invernadero_gran_valle;
select * from cosecha;
create table cosecha
(
id_cosecha int primary key,
nombre varchar (35),
unidad_medida varchar(20),
precio_u numeric(6,2),
cantidad int
);

 create table producto 
  (
id_p int primary key,
nombre varchar (35),
unidad varchar(30),
precio_compra numeric(6,2)
);

   create table cliente
  (
  id_cliente smallint primary key,
  nombre varchar (50),
  a_paterno varchar (50),
  a_materno varchar (50),
  calle varchar (30),
  numero integer ,
  colonia varchar (30),
  municipio varchar (50),
  estado varchar (30),
  telefono varchar (20),
  celular varchar (30),
  e_mail varchar (40),
  rfc varchar(12)
  );

  create table proveedor(
  id_prov int primary key,
  rfc_prov varchar (15),
  razon_social varchar(50),
  calle varchar (30),
  numero integer,
  colonia varchar (30),
  municipio varchar (50),
  estado varchar (30),
  telefono varchar (20),
  celular varchar (30),
  e_mail varchar (40)
  );

  

  create table compra 
  (
  folio_c int primary key,
  id_prov int,
  fecha date,
  id_e int,  
  foreign key (id_prov) references proveedor (id_prov) match full on update cascade on delete restrict
  );

  create table detalle_compra
  (
  id_p int,
  folio_c int,
  cantidad int,
  foreign key (folio_c) references compra (folio_c) match full on update cascade on delete restrict,
  foreign key (id_p) references producto (id_p) match full on update cascade on delete restrict
  );

  create table usuario
  (
  id_usuario int primary key,
  nombre varchar (100),
  contraseña varchar (20),
  cuidad varchar (200)  
   
  );

 
  create table venta(
  folio_v int primary key,
  fecha varchar(11),
  id_usuario int,
  id_cliente smallint,
  total numeric(6.2),
  subtotal numeric(6.2),
  cantidad int,
  foreign key (id_usuario) references usuario (id_usuario),
  foreign key (id_cliente) references cliente (id_cliente) 
  );

  create table detalle_venta
  (
  folio_v int,
  id_cosecha int,
  id_p int,
  cantidad int,
  foreign key (folio_v) references venta (folio_v) match full on update cascade on delete restrict,
  foreign key (id_cosecha) references cosecha (id_cosecha) match full on update cascade on delete restrict
  );

CREATE TABLE invernadero_gran_valle.venta
(
    folio_v integer NOT NULL,
    fecha character varying(11) COLLATE pg_catalog."default",
    nombre_usuario character varying(15) COLLATE pg_catalog."default",
    id_cliente smallint,
    cantidad integer,
    total numeric,
    subtotal numeric,
    productos integer[],
    CONSTRAINT venta_pkey PRIMARY KEY (folio_v),
    CONSTRAINT venta_id_cliente_fkey FOREIGN KEY (id_cliente)
        REFERENCES invernadero_gran_valle.cliente (id_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT venta_nombre_usuario_fkey FOREIGN KEY (nombre_usuario)
        REFERENCES invernadero_gran_valle.usuario (nombre_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
