-- Lab 6 Hemyan AL-Kuwari

-- 1- The NOT NULL Constraint
create table emp5(empno number(4), ename varchar(10) Not Null, deptno number(2) Not Null);
insert into emp5 values (123,Null,10); -- Can't put null for something that should not be null

-- 2- The UNIQUE Key Constraint
create table dept5 (deptno number(2), dname varchar2(14), loc varchar2(13), constraint dept5_dname_uk unique (dname));
insert into dept5 values (3,'CSE','QU'); 
insert into dept5 values (44,'CSE','QF');

-- 3- The PRIMARY KEY Constraint
create table dept6 (deptno number(2), dname varchar2(14), loc varchar2(13),constraint dept6_dname_uk unique (dname), constraint dept6_deptno_pk primary key (deptno));
create table customer ( year number(4), id number(4), name varchar2(20), phone number (7), constraint customer_year_id_pk primary key(year, id));

-- 4- The FOREIGN KEY Constraint
create table emp6(empno number(4), ename varchar2(10) not null, deptno number(4), constraint emp6_dept_fk foreign key (deptno) references dept(deptno));

create table customer2 (id number(4) primary key, name varchar2(20), deptno number(3), constraint customer2_deptno_fk foreign key (deptno) references dept(deptno) on delete cascade);

-- a
insert into dept values (88,'HR','DOHA');
-- b
insert into customer2 values (123,'AHMED', 88);
-- c
delete from dept where deptno = 88;
-- d


-- 4- The CHECK Constraint
create table emp7 (empno number(4), ename varchar2(10) not null, deptno number(2) not null, gender char(1), constraint emp7_gender_ck check (gender='M' or gender='F'));

insert into emp7 values ('555', 'MARK', 99, 'M');

create table customer3 (id number(3), name varchar2(20), constraint name_nn check(name is not null));

create table emp8 as select * from emp;

alter table emp8 add constraint emp8_empno_pk primary key(empno);

-- Dropping a Constraint
alter table emp8 drop constraint emp8_empno_pk;

-- Disabling and Enabling Constraint
alter table emp8 enable constraint emp8_empno_pk;

alter table emp8 disable constraint emp8_empno_pk;


-- Set Operators:
create table job_history (emp_id number(4) not null, job varchar2(10) not null, start_date date not null, end_date date not null, deptno number(2));
insert into job_history values (7369, 'SALESMAN', '17 DEC 80' , '25 JAN 82', 30);
insert into job_history values (7369, 'CLERK', '26 JAN 82' , '30 MAY 85', 10);
insert into job_history values (7839, 'ANALYST', '17 NOV 81' , '12 JUN 83', 20);
insert into job_history values (7839, 'PRESIDENT', '28 JUN 83' , '01 MAR 84', 30);
insert into job_history values (7654, 'CLERK', '28 SEP 81' , '02 FEB 84', 10);

select empno,job from emp union select emp_id, job from job_history;

select empno,job from emp union all select emp_id, job from job_history;

select empno,job from emp intersect select emp_id, job from job_history;

select empno,job from emp minus select emp_id, job from job_history;


-- Oracle Data Dictionary :
select * from user_tables;
select * from user_constraints;
select table_name, tablespace_name from user_tables;
select constraint_name, constraint_type, status, table_name from user_constraints;
select table_name, tablespace_name from all_tables;

