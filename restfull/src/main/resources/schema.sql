DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id identity primary key,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    role varchar(255) not null
)