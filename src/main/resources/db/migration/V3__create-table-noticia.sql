create table noticia(

id bigint not null auto_increment,

titulo varchar(20) not null,
data varchar(10) not null,
corpo varchar(80) not null,
pchave varchar(20) not null,

primary key(id)

)