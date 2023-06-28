CREATE TABLE "USERS"
(
    id uuid primary key ,
    civility varchar(255),
    first_name varchar(255) not null ,
    last_name varchar(255) not null,
    birth_date date,
    children numeric
);