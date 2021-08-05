DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id identity primary key,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    role varchar(255) not null
);

DROP TABLE IF EXISTS customer_order;

CREATE TABLE customer_order (
    id identity primary key,
    description varchar(255) not null,
    status varchar(255) not null
);