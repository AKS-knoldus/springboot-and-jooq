# spring-boot-mysql-jooq

## Introduction
A Spring Boot service for demonstration of using generating pojo classes using jooq and using these pojos.

## How Stuff Works
1. Set up the mysql database and create the database named university_database and create the table named student use these query if you have docker not installed in your systems
   1) [ to create database](sql/create-db.sql)
   2) [ to create tables](sql/create-db-tables.sql)

2. If docker is set up in your system then run below command this command will set up local instance of mysql.
* cd bin
* ./start-mysql-db.sh

3. To generate pojo files you need to run the below command
*   mvn clean install