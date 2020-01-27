-- Name: Hemyan Al-Kuwari   QUID: 201401812

--  Q1
create table customer (custno number(3), cname varchar2(25), city varchar2(12), constraint customer_custno_pk primary key (custno), constraint customer_cname_uk unique (cname));

create table item (itemno number(3), unitprice number(6,2), constraint item_itemno_pk primary key (itemno));

create table orders (orderno number(3), odate date not null, custno number(3), ord_amt number(5),constraint orders_orderno_pk primary key (orderno), constraint orders_custno_fk foreign key (custno) references customer(custno));

create table order_item (orderno number(3), itemno number(3), qty number(5), constraint order_item_orderno_itemno_pk primary key (orderno, itemno));

create table shipment (orderno number(3), warehouseno varchar2(3), ship_date date, constraint shipment_orderno_whno_pk primary key (orderno, warehouseno));

create table warehouse (warehouseno varchar2(3), city varchar2(12),constraint warehouse_warehouseno_pk primary key (warehouseno));


--  Q2
insert into customer (custno, cname, city) values (11,'SARA','DOHA');
insert into customer (custno, cname, city) values (22,'FATMA','DOHA');
insert into customer (custno, cname, city) values (33,'OMAR','KHOR');
insert into customer (custno, cname, city) values (44,'ALI','SHIMAL');
insert into customer (custno, cname, city) values (55,'HASSAN','KHOR');

insert into orders (orderno, odate, custno, ord_amt) values (21,'3 Apr 02',11, 10000);
insert into orders (orderno, odate, custno, ord_amt) values (22,'9 Mar 04',22, 11000);
insert into orders (orderno, odate, custno, ord_amt) values (23,'23 Jan 01',33, 14000);
insert into orders (orderno, odate, custno, ord_amt) values (24,'11 Aug 08',44, 16000);
insert into orders (orderno, odate, custno, ord_amt) values (25,'6 oct 10',55, 20000);

insert into item (itemno, unitprice) values (1,1100);
insert into item (itemno, unitprice) values (2,1200);
insert into item (itemno, unitprice) values (3,1300);
insert into item (itemno, unitprice) values (4,1400);
insert into item (itemno, unitprice) values (5,1500);

insert into order_item (orderno, itemno, qty) values(21,1,20);
insert into order_item (orderno, itemno, qty) values(25,5,30);
insert into order_item (orderno, itemno, qty) values(22,2,40);
insert into order_item (orderno, itemno, qty) values(24,4,10);
insert into order_item (orderno, itemno, qty) values(23,3,60);

insert into shipment (orderno, warehouseno, ship_date) values (21, 'W1', '11 jan 02');
insert into shipment (orderno, warehouseno, ship_date) values (25, 'W2', '24 feb 10');
insert into shipment (orderno, warehouseno, ship_date) values (22, 'W3', '13 jun 05');
insert into shipment (orderno, warehouseno, ship_date) values (24, 'W4', '16 sep 09');
insert into shipment (orderno, warehouseno, ship_date) values (23, 'W5', '28 apr 03');

insert into warehouse (warehouseno, city) values ('W1', 'NAJMA');
insert into warehouse (warehouseno, city) values ('W2', 'KHOR');
insert into warehouse (warehouseno, city) values ('W3', 'DOHA');
insert into warehouse (warehouseno, city) values ('W4', 'MUNTZA');
insert into warehouse (warehouseno, city) values ('W5', 'RAYAAN');


--  Q3     
create view cust_with_order as select c.custno, c.cname, c.city, o.orderno, o.odate, o.ord_amt from customer c, orders o where c.custno=o.custno;

-- Q4
select orderno, ship_date from shipment where warehouseno ='W2';

-- Q5
select w.city, w.warehouseno from warehouse w, customer c , shipment s, orders o where w.warehouseno=s.warehouseno and s.orderno=o.orderno and o.custno = c.custno and  c.cname = 'FATMA';

-- Q6
select c.cname, count(o.orderno) no_of_order, avg(o.ord_amt) avg_order_amt from customer c, orders o where c.custno = o.custno group by cname;

-- Q7    
select o.orderno, o.odate, o.custno, o.ord_amt from orders o, shipment s where o.orderno = s.orderno and s.ship_date-o.odate > 30;

-- Q8
select s.orderno from shipment s, warehouse w where w.warehouseno = s.warehouseno and w.city = 'RAYAAN';

-- Q9
delete from orders where custno =( select custno from customer where cname = 'SARA');

-- Q10
select * from item where unitprice > (select avg(unitprice) from item);

-- Q11
select itemno from item where unitprice = (select max(unitprice) from item);

-- Q12
select c.cname from customer c, warehouse w, shipment s, orders o where c.custno=o.custno and o.orderno=s.orderno and s.warehouseno=w.warehouseno and c.city=w.city;









