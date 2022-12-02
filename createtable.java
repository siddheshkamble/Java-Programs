create table Teacher
(
    EID int PRIMARY KEY,
    Name varchar(255) NOT NULL,
    Department varchar(255) UNIQUE,
    Age int, 
    City varchar(255) DEFAULT 'Pune',
    CHECK (Age>20)
);