create table usuarios(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    apellido_paterno varchar(100) not null unique,
    apellido_materno varchar(100) not null unique,
    username varchar(100) not null,
    password varchar(50) not null,
    calle varchar(100) not null,
    colonia varchar(100) not null,
    ciudad varchar(100) not null,
    numero_exterior varchar(20),
    numero_interior varchar(20),
    codigo_postal int not null,

    primary key(id)
);