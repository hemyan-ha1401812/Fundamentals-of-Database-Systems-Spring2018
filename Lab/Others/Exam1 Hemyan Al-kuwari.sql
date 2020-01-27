-- Name: Hemyan     QUID: 201401812
set SERVEROUTPUT ON;

-- Part 1

-- Q1
select * from emp e where sal>(select sal from emp m where e.mgr=m.empno );

-- Q2
select ename, deptno, job from emp where deptno=30 and sal>=1200 order by job;

-- Q3
select sum(sal), avg(sal) from emp, dept where emp.deptno=dept.deptno;

-- Q4
select count(*) number_of_accounting from emp, dept where emp.deptno=dept.deptno and dname='ACCOUNTING';

-- Q5
select mgr manager_id, sal highest_paid from emp e where sal > (select max(sal) from emp m where e.mgr=m.empno)  order by sal desc;

-- Q6
select ename, job, dname from emp e, dept d where e.deptno=d.deptno and loc='CHICAGO';

-- Q7
select e.ename employee_name, e.hiredate employee_hirdate, m.ename manager_hirdate, m.hiredate manager_hirdate from emp e, emp m where e.mgr=m.empno and e.hiredate < m.hiredate;

-- Q8
select length(job), ename, round(months_between(sysdate, hiredate)) monthes_worked from emp order by round(months_between(sysdate, hiredate));

-- Q9
select empno, ename from emp where ename = any( select ename from emp where ename='WARD');


-- Part 2

-- Q10
create table collage (code number(5), Name varchar2(20), CONSTRAINT collage_code_pk primary key(code), CONSTRAINT collage_name_uk unique(Name));
create table department (no number(5), Name varchar2(20), loc varchar2(1), c_code number(5), CONSTRAINT department_noe_pk primary key(no), CONSTRAINT department_name_uk unique(Name), CONSTRAINT department_loc_c check(loc='M'or loc='F'),CONSTRAINT department_c_code_fk foreign key(c_code) references collage(code) );
create table student (id number(5), Name varchar2(20) not null, deptno number(5), gba number(5,2), CONSTRAINT student_id_pk primary key(id), CONSTRAINT student_deptno_fk foreign key(deptno) references department(no), CONSTRAINT student_gba_c check(gba > 0 and gba <= 4));

-- Q11
insert into collage values(100, 'ENGINEERING');
insert into collage values(200, 'SCIENCE');
    
insert into DEPARTMENT values(304, 'CSED','M',100);
insert into DEPARTMENT values(308, 'CHEMICAL','F',100);
insert into DEPARTMENT values(410, 'MATH','F',200);
insert into DEPARTMENT values(415, 'CHEMISTRY','F',200);

insert into STUDENT values(11, 'ALI',304,3.5);
insert into STUDENT values(22, 'MOZA',415,3);
insert into STUDENT values(33, 'FARAH',410,2.5);
insert into STUDENT values(44, 'HAYA',410,4);
insert into STUDENT values(55, 'NOOR',308,2.5);

-- Q12
select s.name, d.name, c.name from student s, department d, collage c where c.code=d.c_code and d.no=s.deptno;

-- Q13
select s.name, d.name from student s, department d where s.gba>=3.5 and s.deptno=d.no;


-- Part 3

-- Q14
create table clerks (empno, ename, comm, salary) as (select empno, ename, comm, sal from emp where job='CLERK'); 

-- a
alter table clerks ADD (Certifed varchar2(1)); 

--b
update CLERKS set salary=salary*0.2;
--c
delete from clerks where comm=null;
-- d
rollback;
-- e
drop table clerks;

