--                                         L A B 5

create table dept2 (deptno number(2), dname varchar2(14),loc varchar2(13));
select * from dept2;

create table dept30 as (select empno, ename, sal*12 annsal, hiredate from emp where deptno=30);
select * from dept30;

create table try as (select * from emp where 1=2);
select * from try;

-- ///////////////////////////////////////////////////////////////////////////////

create table managers as (select * from emp where 1=2);
select * from managers;
select * from emp;
insert into managers (empno, ename, sal, hiredate) (select empno, ename, sal, hiredate from emp where Job= 'MANAGER'); 


create table tax (empno number(5), tax number(10,2));
select * from tax;
insert into tax (select empno, sal*0.05 from emp);


rename dept2 to department2;
select * from department2;

alter table dept30 add (phone number(6));
select * from dept30;
alter table dept30 add (address varchar2(20), email varchar2(10));

alter table dept30 modify (ename varchar2(15));

alter table dept30 rename column phone to mobile;

alter table dept30 drop column hiredate;

alter table dept30 drop (address, email);

drop table dept30;


select * from tax;
truncate table tax;


--                  Practice 
select * from employee2;
desc employee2;
-- Q1
create table employee2 (id, last_name, dept_id) as (select empno, ename, deptno from emp where 1=2);

-- Q2
alter table employee2 modify (last_name varchar2(50));

-- Q3
alter table employee2 drop column last_name;

-- Q4
drop table employee2;


--                                    V I E W S

create view v1 as select empno, ename, job from emp where deptno = 10;
desc v1;
select * from v1;

insert into emp(empno, ename, deptno) values (456,'KHALED',20);

select * from v11;

create view v11 as select empno, ename, dname from emp, dept where dept.deptno = emp.deptno;

create view dept_sum(name, minsal, maxsal, avgsal) as select d.dname, min(e.sal), max(e.sal), avg(e.sal) from emp e, dept d where d.deptno=e.deptno group by d.dname;
select * from dept_sum;

update emp set sal=sal+1000 where deptno=10;

drop view v1;

create view emp_vu (empno, employee, deptno) as select empno, ename, deptno from emp;

select employee, deptno from emp_vu;


--                                  L A B 6

create table emp5 (empno number(4), ename varchar2(10) not null, deptno number(2) not null);

create table dept5 (deptno number(2), dname varchar2(14), loc varchar2(13), constraint dept5_dname_uk unique (dname));

insert into dept5 values (33, 'AMY', 'NY');
insert into dept5 values (55,'MARIA','LA');
insert into dept5 values (55, NULL,'LA');

select * from dept5;

create table dept6 (deptno number(2), dname varchar2(14), loc varchar2(13), constraint dept6_dname_uk unique(dname), constraint dept6_deptno_pk primary key (deptno));

insert into dept6 values (55,'LIV','SANADRES');
insert into dept6 values (32,'RUBY','NY');

select * from dept6;

create table customer (year number(4), id number(4), name varchar2(20), phone number(7), constraint customer_year_id_pk primary key (year,id));
desc customer;

create table emp6 (empno number(4), ename varchar(10) not null , deptno number(4), constraint emp6_deptno_fk foreign key (deptno) references dept(deptno));
desc emp6;


create table customer2 (id number(4) primary key, name varchar2(20), deptno number(3), constraint customer2_deptno_fk foreign key (deptno) references dept(deptno) on delete cascade);

insert into dept values (88,'HR','DOHA');
insert into customer2 values (123,'AHMED',88);
delete from dept where deptno=88;
select * from customer2;


create table emp7 (empno number(4), ename varchar2(10) not null, deptno number(2) not null,gender char(1), constraint emp7_gender_ck check (gender = 'M' or gender = 'F'));
desc emp7;
insert into emp7 values (123, 'JOHN', 23, 'M');
insert into emp7 values (444, 'ROSA', 12, 'F');



create table customer3 (id number(3), name varchar2(20), constraint customer_name_nn check (name is not null));
desc customer3;
insert into customer3 values(111,'EVA');
insert into customer3 values (123,null);-- wrong


create table emp8 as select * from emp;
alter table emp8 add constraint emp8_empno_pk primary key(empno);
desc emp8;

alter table emp6 drop constraint emp6_deptno_fk;

alter table emp8 disable constraint emp8_empno_pk;

select empno, job from emp minus select emp_id, job from job_history;




