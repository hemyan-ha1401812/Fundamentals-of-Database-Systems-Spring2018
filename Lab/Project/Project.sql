-- CREATING TABLES

-- Table Customer:
create table cust (BAccNo number(9), Bname varchar2(30), constraint cust_BAccNo_pk primary key(BAccNo));

-- Table Item:
create table item (itemNo number(5), constraint item_itemNo_pk primary key(itemNo)); 

-- Table Classes:
create table classes(price number(6,2), type varchar2(25), constraint classes_Price_pk primary key(price));

-- Table Bank Account:
create table bankAccount (accNum number(9), Bname varchar2(25),amount number(7,2), constraint bankAccount_accNum_pk primary key(accNum));

-- Table Online Retail Application:
create table onlineApp (custID number(9), pass varchar2(20), constraint onlineApp_CustID_pk primary key(custID));

-- Table Customer Regestration:
create table custRegi (accNum number(9), bName varchar2(30), custName varchar2(25), custEmail varchar2(40), custMobile number(8), constraint custRegi_accNum_pk primary key(accNum));

-- Table Bill:
create table bill (quantity number(3), price number(3,2), discount number(3,2), constraint bill_quantity_pk primary key(quantity));

-- Table Orders:
create table orders (orderNo number(9),constraint orders_orderNo_pk primary key(orderNo));

-- Table Customer Purchases:
create table custPurch(quantity number(3), item number(5), payItem varchar2(30), constraint custPurch_quantity_pk primary key(quantity));

-- Table Supplier:
create table supplier(supplies number(3),constraint suppkier_supplies_pk primary key(supplies));

-- Table Place Order:
create table placeOrder (lessStock varchar2(30), orderFromSupp varchar2(30), constraint placeOrder_lessStock_pk primary key(lessStock));

-- Table Purchase Product:
create table pruchProduct(addNewItem number(9), suppResp varchar(3), purchPro varchar2(30),constraint purchProduct_addNewItem_pk primary key(addNewItem), constraint purchProduct_suppResp_ck check(suppResp='YES' or suppResp='NO'));

-- Table Sales:
create table sales(prodOrder varchar2(30), sale number(3,2), constraint sales_prodOrder_pk primary key(prodOrder));

-- Table Inventory Updates:
create table invenUpdate(outOfStock varchar2(3), sales number(3,2), replenished varchar2(3), itemSold varchar2(3),constraint invenUpdate_outOfStock_pk primary key(outOfStock), constraint invenUpdate_outOfStock_ck check(outOfStock='YES' or outOfStock='No'), constraint invenUpdate_replenished_ck check(replenished='YES' or replenished='No'), constraint invenUpdate_itemSold_ck check(itemSold='YES' or itemSold='No'));


-- Relations:-

-- Relations from or to Customer table:

-- Has:
alter table bankAccount add (BAccNo number(9), constraint bankAccount_BAccNo_fk foreign key(BAccNo) references cust (BAccNo));

-- Purchases:
alter table Item add (BAccNo number(9), constraint Item_BAccNo_fk foreign key(BAccNo) references cust (BAccNo));

-- Regesters:
alter table onlineApp add (BAccNo number(9), constraint onlineApp_BAccNo_fk foreign key(BAccNo) references cust (BAccNo));
alter table cust add (custID number(9), constraint cust_custID_fk foreign key(custID) references onlineApp (custID));

-- Has:
alter table orders add (BAccNo number(9), constraint orders_BAccNo_fk foreign key(BAccNo) references cust (BAccNo));
alter table cust add (orderNo number(9), constraint cust_orderNo_fk foreign key(orderNo) references orders (orderNo));


-- Relations from or to Item:

-- Has:
alter table Item add (quantity number(3), constraint Item_quantity_fk foreign key(quantity) references Bill (quantity));

-- Shipped By:
alter table supplier add (itemNo number(9), constraint supplier_itemNo_fk foreign key(itemNo) references Item (itemNo));

-- Categorized:
alter table classes add (itemNo number(9), constraint classes_itemNo_fk foreign key(itemNo) references Item (itemNo));
alter table item add (price number(6,2), constraint item_price_fk foreign key(price) references classes (price));

-- Has:
alter table invenUpdate add (itemNo number(9), constraint invenUpdate_itemNo_fk foreign key(itemNo) references Item (itemNo));
alter table item add (outOfStock varchar2(3), constraint item_outOfStock_fk foreign key(outOfStock) references invenUpdate (outOfStock));


-- Relations from or to Inventory Updates:

-- ReOrder:
alter table invenUpdate add (lessStock varchar2(30), constraint invenUpdate_lessStock_fk foreign key(lessStock) references placeOrder (lessStock));
alter table placeOrder add (outOfStock varchar2(3), constraint placeOrder_outOfStock_fk foreign key(outOfStock) references invenUpdate (outOfStock));

-- Purchases:
alter table invenUpdate add (addNewItem number(9), constraint invenUpdate_addNewItem_fk foreign key(addNewItem) references pruchProduct (addNewItem));
alter table pruchProduct add (outOfStock varchar2(3), constraint pruchProduct_outOfStock_fk foreign key(outOfStock) references invenUpdate (outOfStock));

-- Product Ordered:
alter table invenUpdate add (prodOrder varchar2(30), constraint invenUpdate_prodOrder_fk foreign key(prodOrder) references sales (prodOrder));
alter table sales add (outOfStock varchar2(3), constraint sales_outOfStock_fk foreign key(outOfStock) references invenUpdate (outOfStock));



-- Relation from or to Online Retail Application:

-- Regesters:
alter table onlineApp add (accNum number(9), constraint onlineApp_accNum_fk foreign key(accNum) references custRegi (accNum));
alter table custRegi add (custID number(9), constraint custRegi_custID_fk foreign key(custID) references onlineApp (custID));



-- Relation from or to Bill:

-- Requires:
alter table bill add (accNum number(9), constraint bill_accNum_fk foreign key(accNum) references bankAccount (accNum));
alter table bankAccount add (quantity number(3), constraint bankAccount_quantity_fk foreign key(quantity) references bill (quantity));



-- Relation from or to Orders:

-- Purchases:
alter table orders add (quantity number(3), constraint orders_quantity_fk foreign key(quantity) references custPurch (quantity));
alter table custPurch add (orderNo number(9), constraint custPurch_orderNo_fk foreign key(orderNo) references orders (orderNo));




select * from bankAccount;
insert into bankAccount(accnum, Bname, amount) values (111,'ANGIE',3000);
select bname, amount, accnum from bankAccount where accNum = 111;
insert into bankAccount(accnum, Bname, amount) values (222,'Mary',4000);
insert into bankAccount(accnum, Bname, amount) values (333,'Harry',5000);
insert into bankAccount(accnum, Bname, amount) values (444,'Smar',6000);


insert into cust (BAccNo, Bname) values ( 345, 'saski');
insert into cust (BAccNo, Bname) values ( 435, 'Hassan');
insert into cust (BAccNo, Bname) values ( 534, 'Omar');
insert into cust (BAccNo, Bname) values ( 045, 'Malak');


insert into item (itemNo) values (456);
insert into item(itemNo) values (900);
insert into item(itemNo) values (100);
insert into item(itemNo) values (780);


insert into classes ( price, type) values (45.00,'plastic');
insert into classes ( price, type) values (467.00,'glass');
insert into classes ( price, type) values (678.23,'metal');
insert into classes ( price, type) values (890.78,'gold');


insert into bankAccount (accNum, Bname, amount) values (657,'sara', 8900);
insert into bankAccount (accNum, Bname, amount) values (597,'alaa', 8009);
insert into bankAccount (accNum, Bname, amount) values (757,'ola', 8090);
insert into bankAccount (accNum, Bname, amount) values (758,'farid', 1000);

insert into onlineApp(custID,pass) values (1,'qwe19970');
insert into onlineApp(custID,pass) values (2,'df_2345');
insert into onlineApp(custID,pass) values (3,'lkjh-8k8h');
insert into onlineApp(custID,pass) values (4,'plmn&567');

insert into custRegi (accNum, bName, custName, custEmail,custMobile) values (1256,'joe','mick','mick@hotmail.com',5678904);
insert into custRegi (accNum, bName, custName, custEmail,custMobile) values (2156,'jamil','nicky','nicky@hotmail.com',65434343);
insert into custRegi (accNum, bName, custName, custEmail,custMobile) values (5621,'jan','max','max@hotmail.com',9999999);
insert into custRegi (accNum, bName, custName, custEmail,custMobile) values (1256,'jamika','salim','salim@hotmail.com',565656);



 
insert into orders (orderNo) values (290);


insert  into custPurch (quantity, item ,payItem) values (4,2,'Yes');
insert into custPurch (quantity, item, payItem) values (5,1,'No');
insert into custPurch (quantity, item, payItem) values (2,5,'Yes');
 
insert into supplier (supplies) values (190); 
insert into supplier (supplies) values (200);
insert into supplier (supplies) values (340);
insert into supplier (supplies) values (234);

insert into placeOrder ( lessStock,orderFromSupp) values ('yes','yes');
insert into placeOrder ( lessStock,orderFromSupp) values ('No','No');


insert into pruchProduct (addNewItem,suppResp,purchPro) values (78912,'NO','table');
insert into pruchProduct (addNewItem,suppResp,purchPro) values (97182,'YES','door');
insert into pruchProduct (addNewItem,suppResp,purchPro) values (10000,'NO','seats');


insert into sales(prodOrder,sale) values ('wood',4.7);
insert into sales(prodOrder,sale) values ('iron',7.2);
insert into sales(prodOrder,sale) values ('matel',2.2);

insert into invenUpdate (outOfStock, sales, replenished, itemSold) values ('YES',6.2,'YES','YES');
insert into invenUpdate (outOfStock, sales, replenished, itemSold) values ('No',1.2,'No','No');
select * from invenUpdate;



select * from bill;


insert into bill(quantity,price,discount,accnum) values ( 3,4,0.5,111);
insert into bill(quantity,price,discount,accnum) values ( 6,3,0.25,222);
insert into bill(quantity,price,discount) values ( 9,4,3);
insert into bill(quantity,price,discount) values ( 10,4,4);

 commit;
