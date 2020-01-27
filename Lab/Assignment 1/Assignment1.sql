-- Name: Hemyan AL-Kuwari   QUID: 201401812

-- Q1
desc dept;

-- Q2
select empno, ename, job, hiredate from emp;

-- Q3
select ename, deptno from emp where deptno = 10 or deptno = 30 order by ename;

-- Q4
select ename from emp where ename like '%LL%' and deptno=30 or mgr=7782;

-- Q5
select ename, job, sal from emp where job = 'CLERK' or job = 'ANALYST' and sal <> 1000 and sal <> 3000 and sal <> 5000;

-- Q6
select empno, ename, sal, round((sal*0.15)+sal) new_salary from emp;

-- Q7
select min(sal), max(sal), sum(sal), avg(sal) from emp group by job;

-- Q8
select count(mgr) number_of_managers from emp;

-- Q9
select ename, dept.deptno, sal from emp, dept where emp.deptno = dept.deptno and loc=(select loc from dept where loc='DALLAS') and sal=3000;-- the only two that have similar salary and commsion are Scott and Ford sal=3000 and comm=null

-- Q10
select ename, hiredate, sal from emp Where ename<>'SCOTT' and (sal, nvl(comm,0)) in (select sal, nvl(comm,0) from emp where ename ='SCOTT');

