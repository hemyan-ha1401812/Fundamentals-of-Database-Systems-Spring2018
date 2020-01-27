-- Name: Hemyan Al-Kuwari       QUID: 201401812

-- Q1
create table emp352 as select empno, ename, mgr from emp;

-- Q2
create table dependent (id number(2), name varchar2(10) not null, essn number (4), constraint dependent_id_pk primary key(id));

-- Q3
insert into dependent (id, name, essn) values (10,'ALI',7369);
insert into dependent (id, name, essn) values (20,'OMAR',7369);
insert into dependent (id, name, essn) values (30,'HASSAN',7844);

-- Q4
alter table DEPENDENT add constraint dependent_id_ck check (id between 10 and 99);

-- Q5
alter table dependent add constraint dependent_essn_fk foreign key (essn) references emp352(empno);
update dependent set essn = 7900;