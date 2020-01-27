-- Quiz 2
-- Name: Hemyan Al-Kuwari   QUID: 201401812

-- Q1
update emp set sal=sal*0.2 where deptno=20;

-- Q2
insert into emp(empno, ename, deptno, hiredate) values (3, 'SARA',10, sysdate);

-- Q3
select ename, sal, loc from emp natural join dept;

-- Q4
select empno, ename from emp where sal < any (select sal from emp where job like 'CLERK');

-- Q5
delete from emp where sal < (select avg(sal) from emp);