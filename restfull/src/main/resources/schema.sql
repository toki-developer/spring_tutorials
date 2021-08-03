DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id identity primary key,
    name varchar(255) not null,
    role varchar(255) not null
)