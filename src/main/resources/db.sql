drop table IF exists hotel;

create table hotel(
	id int IDENTITY PRIMARY KEY,
	hotelname varchar(20),
	rating int,
	datecondition varchar(30),
	customcondition varchar(40),
	price int
);

insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Lakewook',3,'weekday','regular',110);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Lakewook',3,'weekday','rewards',80);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Lakewook',3,'weekend','regular',90);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Lakewook',3,'weekend','rewards',80);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Bridgewood',4,'weekday','regular',160);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Bridgewood',4,'weekday','rewards',110);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Bridgewood',4,'weekend','regular',60);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Bridgewood',4,'weekend','rewards',50);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Ridgewood',5,'weekday','regular',220);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Ridgewood',5,'weekday','rewards',100);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Ridgewood',5,'weekend','regular',150);
insert into hotel(hotelname,rating,datecondition,customcondition,price) values('Ridgewood',5,'weekend','rewards',40);
