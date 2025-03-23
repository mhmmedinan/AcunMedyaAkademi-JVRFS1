create table brands
(
	id SERIAL primary key,
	name varchar(50) NOT NULL unique
);


create table models
(
	id SERIAL primary key,
	name varchar(50) NOT NULL unique,
	brandid INT references brands(id)
);

create table fuels
(
	id SERIAL primary key,
	name varchar(50) NOT NULL unique
);


create table transmissions
(
	id SERIAL primary key,
	name varchar(50) NOT NULL unique
);

create table modelfuels
(
	id SERIAL primary key,
	modelid INT references models(id),
	fuelid INT references fuels(id)
);


create table modeltransmissions
(
	id SERIAL primary key,
	modelid INT references models(id),
	transmissionid INT references transmissions(id)
);

create table colors
(
	id SERIAL primary key,
	name varchar(50) NOT NULL unique
);


create table cars
(
	id SERIAL primary key,
	modelid INT references models(id),
	colorid INT references colors(id),
	plate varchar(20) NOT NULL unique,
	kilometer INT NOT NULL,
	modelyear INT NOT NULL
);

--brands table 
insert into brands (name) values ('Toyota'),('Honda'), ('BMW'), 
('Mercedes'), ('Ford'),
('Audi'), ('Hyundai'), 
('Nissan'), ('Peugeot'), ('Volkswagen');

INSERT INTO fuels (name) VALUES
('Benzin'), ('Dizel'), ('Elektrik'), ('Hibrit'), ('LPG'),
('Bio-Dizel'), ('CNG'), ('Etanol'), ('Hidrojen'), ('Biyogaz');



INSERT INTO transmissions (name) VALUES
('Manuel'), ('Otomatik'), ('Yarı Otomatik'), ('CVT'), ('DSG'),
('8 İleri'), ('Tiptronic'), ('Elektrik'), ('Zincirli'), ('Direkt');




INSERT INTO colors (name) VALUES
('Kırmızı'), ('Mavi'), ('Siyah'), ('Beyaz'), ('Gri'),
('Gümüş'), ('Yeşil'), ('Sarı'), ('Turuncu'), ('Mor');

INSERT INTO models (name, brandid) VALUES
('Corolla', 1), ('Civic', 2), ('320i', 3), ('C200', 4), ('Focus', 5),
('A4', 6), ('i30', 7), ('Qashqai', 8), ('208', 9), ('Golf', 10);


INSERT INTO cars (plate, kilometer, modelyear, colorid, modelid) VALUES
('34ABC001', 50000, 2020, 1, 1),
('06DEF002', 30000, 2021, 2, 2),
('35GHI003', 70000, 2019, 3, 3),
('16JKL004', 80000, 2022, 4, 4),
('07MNO005', 20000, 2023, 5, 5),
('44PQR006', 45000, 2020, 6, 6),
('22STU007', 75000, 2018, 7, 7),
('09VWX008', 25000, 2022, 8, 8),
('01YZA009', 15000, 2021, 9, 9),
('45BCD010', 10000, 2023, 10, 10);


INSERT INTO modelfuels (fuelid, modelid) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10);


INSERT INTO modeltransmissions (modelid, transmissionid) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10);


--select (db'den veri sorgulamak)

--tüm arabaları listele

select * from cars;

--tüm marka isimlerini listele
Select name from brands

--Order by
--ASC (Ascending) => Artan
--DESC (Descending) => Azalan

--Renkleri alfabetik sıraya göre listele (A-Z)
Select * from colors Order By name ASC;

--Renkleri alfabetik sıraya göre listele (Z-A)
Select * from colors Order By name DESC;

--where (koşul)

--id değeri 2 olan aracı listele
select id,modelid,plate from cars where id=2

--2019 ve sonrası model araçları listele
select * from cars where modelyear>=2019

--kilometresi 60.000'den fazla olann araçları listele
select * from cars where kilometer>60000

--and ve or operatorleri
--kilometresi 60.000'den fazla ve model yılı 2019 dan düşük araçları listele
select * from cars where kilometer>60000 and modelyear<2019

--kilometresi 60.000'den fazla veye model yılı 2019 dan düşük araçları listele
select * from cars where kilometer>60000 or modelyear<2019


--Join (farklı tablolarda ilişkili olan alanları birleştirir)
--inner join => iki tabloda eşleşen verileri getirir
--left join,right join,full outer join => araştırma konusu

--Aracın plakası,modeli ve marka bilgilerine listele
select c.id,c.plate,b.name as Marka,m.name as Model from cars as c
inner join models as m on c.modelid=m.id
inner join brands as b on m.brandid=b.id


--Aracın modelleri ve vites türlerini listele
select c.id,c.plate,b.name as Marka,m.name as ModelAdı,t.name as VitesTürü from cars as c
inner join models as m on c.modelid=m.id
inner join brands as b on m.brandid=b.id
inner join modeltransmissions as mt on m.id=mt.modelid
inner join transmissions as t on mt.transmissionid=t.id


--Aracın markası, modelleri,yakıt tipi ve vites türlerini listele
select c.id,c.plate,b.name as Marka,
m.name as ModelAdı,t.name as VitesTürü,f.name as YakıtTipi
from cars as c
inner join models as m on c.modelid=m.id
inner join brands as b on m.brandid=b.id
inner join modeltransmissions as mt on m.id=mt.modelid
inner join transmissions as t on mt.transmissionid=t.id
inner join modelfuels as mf on m.id=mf.modelid
inner join fuels as f on mf.fuelid=f.id

--Group by 

--Vites türüne göre model sayısı

select t.name,count(mt.modelid) from transmissions as t
inner join modeltransmissions as mt on t.id=mt.transmissionid
group by t.name


--Having (gruplanmış veriler üzerinde şart koşar)
--where sadece satırlara uygulanır,having ise gruplar üzerinde filtreleme yapar

--En az 1 arabası olan modelleri listele
select m.name,count(c.id) from cars as c
inner join models as m on c.modelid=m.id
Group by m.name
Having count(c.id)>=2
