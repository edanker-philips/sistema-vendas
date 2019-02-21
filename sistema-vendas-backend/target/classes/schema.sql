drop table item;
drop table documento;
drop table produto;

create table produto (codigo integer not null, descricao varchar(255), preco integer, primary key (codigo));

create table documento (numero integer not null auto_increment, total integer, confirmado varchar(1), primary key (numero));

create table item (id integer not null, numero_documento integer, codigo_produto integer, FOREIGN KEY(numero_documento) REFERENCES documento(numero),
                                                                                          FOREIGN KEY(codigo_produto) REFERENCES produto(codigo),
                                                                                          primary key (id));