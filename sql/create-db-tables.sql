USE university_database;

CREATE TABLE student (
    id int,
    last_name varchar(255),
    first_name varchar(255),
    branch_name varchar(50)
);

INSERT INTO student VALUES(1, 'doe', 'john', 'cse');