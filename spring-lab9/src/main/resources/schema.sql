drop table country if exists;
drop table user if exists;
CREATE TABLE country ( id identity, name varchar (20) )
CREATE TABLE user ( id identity, firstname varchar (20), lastname varchar (30) )