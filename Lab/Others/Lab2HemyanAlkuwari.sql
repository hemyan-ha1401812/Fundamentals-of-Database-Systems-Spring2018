-- Hemyan Al-Kuwari
-- 1-Single-row Functions
-- A
select upper(ename), lower(ename) from emp;
select ename, length(ename) from emp;
select ename, substr(ename,2,3) from emp;

--B
select round(45.923,2), round(45.923,0), round(45.923,-1) from dummy;
select trunc(45.923,2), trunc(45.923), trunc(45.923,-1) from dummy;

--C
select sysdate from DUMMY;
select sysdate+3 from DUMMY;
select sysdate-2 from DUMMY;
select ename,months_between(sysdate, hiredate)from emp;
select add_months(sysdate,6) review from dummy;
select add_months(hiredate,6) review from emp;
--Practice
--1
select ename, round(months_between(sysdate,hiredate)) Months_Worked from emp order by Months_Worked;
--2
select ename, hiredate, TO_CHAR(hiredate,'Day') from emp;

--D
select ename, to_char(hiredate,'Day DD Month YYYY') from emp;
select to_number('123')+4 from dummy;
select ename, hiredate from emp where hiredate = to_date ('February 22, 1981', 'Month dd,yyyy');

--E
select ename, sal, comm, (sal*12)+ NVL(comm,0) from emp;

--Practice
select ename, NVL(to_char(comm),'No Commission') COMM from emp;

-- 2- Multiple-row Functions
-- EXAMPLES
select avg(sal), max(sal), min(sal), sum(sal) from emp where job LIKE 'SALES%';
select count(*) from emp where deptno=30;
select count(comm) from emp where deptno =30;
select comm from emp;
select avg(comm) from emp; -- it ignore the null field and devided it by 4
select avg(NVL(comm,0)) from emp; -- it could not ignore the null field because its a number. So, it devided by 14

-- Creating Groups Of Data
select deptno, sum(sal), avg(sal) from emp group by deptno;

select deptno, sum(sal) from emp group by deptno having sum(sal)>9000;
-- Example
select job, sum(sal) from emp group by job having sum(sal)<5000;
select job, sum(sal) PAYROLL from emp where job Not LIKE 'SALES%' group by job Order by sum(sal);

-- Practice
--1
select round(max(sal)) Maximum, round(min(sal)) Minimum, round(sum(sal)) Sum, round(avg(sal)) Average from emp;

--2
select job, min(sal), max(sal), sum(sal), avg(sal) from emp group by job;

--3
select job, count(*) from emp group by job;

--4
select deptno, count(*) from emp group by deptno having count(*)<5;