create table users (
    id bigserial,
    username varchar(30) not null unique,
    password varchar(30) not null ,
    email varchar (50) not null ,
    primary key (id)
);
create table roles (
    id serial,
    name varchar (50)  not null ,
    primary key (id)
);
create table user_roles (
    user_id bigint not null ,
    role_id int not null ,
    primary key (user_id, role_id),
    foreign key (user_id references users (id) ),
    foreign key (role_id references roles (id) )
);

insert into users (username, password, email)
VALUES
    ('user','$2a$12$NDe5HYkFLkLrBeg9A3rLE.0bNf6QeugX/N8SDiN7jHIrd6pep8KSW' , 'user@mail.ru');

insert into roles (name)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

insert into user_roles (user_id, role_id)
VALUES (1, 1);


