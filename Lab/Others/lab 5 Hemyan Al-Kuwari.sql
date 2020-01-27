-- Hemyan AL-kuwari
create table dept2 (deptno number(2), dname varchar2(14), loc varchar2(13));
desc dept2;
create table dept30 as select empno, ename, sal*12 annual_sallary, hiredate from emp where deptno = 30;
desc dept30;
select * from dept30;
create table test as (select * from emp where 1=2); -- 1=2 means this condition will always be false
create table managers as (select * from emp where 1=2);
insert into managers(empno, ename, sal, hiredate) select empno, ename, sal, hiredate from emp where job='MANAGER';
select * from managers;

-- Exercise
create table tax(empno number(5), tax number(10,2));
insert into tax select empno, sal*0.05 from emp;
-- the previous statments are Equal to the next statment 
create table tax2 as select empno, sal*0.05 tax from emp;

rename dept2 to department2;

desc dept30;
-- 1- Adding a columm
alter table dept30 add (phone number(6));
alter table dept30 add (address varchar2(20), email varchar2(10));

-- 2- Modifying a column
alter table dept30 modify (ename varchar2(15));
alter table dept30 rename column phone to mobile;

-- 3- Dropping a column
alter table dept30 drop column hiredate;
alter table dept30 drop (address, email);

-- Dropping table
drop table dept30;

select * from tax;
truncate table tax;

-- Practice

desc employee2;
select * from employee2;

-- 1
create table employee2 as select empno id, ename last_name, deptno dept_id from emp where 1=2;

--2
alter table employee2 modify (last_name varchar2(50));
desc employee2;

--3
alter table employee2 drop column last_name;
desc employee2;

--4
drop table employee2;


-- V I E W S

-- Simple View
create view v1 as select empno, ename, job from emp where deptno = 10;
desc v1;
select * from v1;

-- Exercise:

-- 1
insert into emp (empno, ename, deptno) values (456,'KHALED',20); 

-- 2
select * from v1;

-- 3
create view v2 as select empno, ename, dname from emp, dept where dept.deptno=emp.deptno;
select * from v2;

-- Complex View
create view dept_sum (name, minsal, maxsal, avgsal) as select d.dname, min(e.sal), max(sal), avg(sal) from emp e, dept d where e.deptno=d.deptno group by d.dname;

-- Exercise:

select * from emp;
select * from dept;

-- 1
update emp set sal = sal+1000 where deptno = 10;  

-- 2
select * from dept_sum;

-- Dropping View
drop view v1;

-- Practice

-- 1
create view v; -- incorrect, because the view can't stay empty 

-- 2
create view emp_vu  as select empno, ename employee, deptno from emp;

-- 3
select employee, deptno from emp_vu;

