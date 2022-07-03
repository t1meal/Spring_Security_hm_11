create table users
(
    id       bigserial,
    username varchar(30) not null unique,
    password varchar(80) not null,
    email    varchar(50) unique,
    primary key (id)
);

create table roles
(
    id   serial,
    name varchar(50) not null,
    primary key (id)
);

create table privileges
(
    id   serial,
    name varchar(50) not null,
    primary key (id)
);

CREATE TABLE users_roles
(
    user_id bigint not null,
    role_id int    not null,
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

create table roles_privileges
(
    role_id      int not null,
    privilege_id int    not null,
    primary key (role_id, privilege_id),
    foreign key (role_id) references roles (id),
    foreign key (privilege_id) references privileges (id)
);

insert into users (username, password, email)
values ('user', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'user@gmail.com');

insert into roles (name)
values ('ROLE_USER'),
       ('ROLE_EDITOR'),
       ('ROLE_ADMIN'),
       ('ROLE_SUPERADMIN');

insert into privileges (name)
values ('VIEW'),
       ('EDIT'),
       ('USER_INFO'),
       ('CREATE'),
       ('DELETE'),
       ('MODER');

insert into users_roles (user_id, role_id)
values (1, 1);

insert into roles_privileges (role_id, privilege_id)
values (1, 1),
       (2, 1),
       (2, 2),
       (3, 1),
       (3, 2),
       (3, 3),
       (3, 4),
       (4, 1),
       (4, 2),
       (4, 3),
       (4, 4),
       (4, 5),
       (4, 6);




