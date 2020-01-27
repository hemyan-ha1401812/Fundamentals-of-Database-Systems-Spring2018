-- LAB 1
select * from dept;
select deptno, loc from dept;
select deptno, sal, sal+300  from emp;
select ename, job ,sal, nvl(comm,0) from emp;
select DISTINCT deptno from emp;
select ename, job, deptno from emp where ename='JAMES';
select ename, sal from emp where sal between 1000 and 1500;
select ename, sal from emp where sal>1000 and sal<1500;
select empno, ename, sal, mgr from emp where mgr in(7902,7566,7788);
select ename from emp where ename like 'S%';
select ename , mgr from emp where mgr is null;
select empno, ename, job, sal from emp where sal>= 1100 and job='CLERK';
select empno, ename, job, sal from emp where sal>= 1100 or job='CLERK';
select ename, job from emp where job not in ('CLERK','MANAGER','ANALYST');
select ename,job,deptno, hiredate from emp order by hiredate desc;
select ename, deptno, sal from emp order by deptno, sal desc;

-- Practice
select ename employeeName, job, hiredate, empno employeenumber from emp;
select ename employeename, sal salary from emp where sal > 2850;
select distinct job from emp;
select ename name, sal salary from emp where sal < 1500 or sal>2850;
select ename name, job from emp where mgr is null;
select ename name, sal salary, comm commission from emp where comm is not null order by sal desc, comm desc;
select ename name from emp where ename like'__A%';


--Lab 2
select upper(ename) uppercase, lower(ename) lowercase from emp;
select ename, length(ename) namelength from emp;
select ename, substr(ename,2,3) from emp;
select ename, substr(ename,2,4) from emp;
select round(45.923,2), round(45.923,0), round(45.923,-1) from dummy;
select trunc(45.923,2),trunc(45.923), trunc(45.923,-1) from dummy;
select ename, months_between(sysdate, hiredate) from emp;
select ename, add_months(sysdate, 6) review from emp;
select sysdate+10 from dummy;
select sysdate-10 from dummy;
select sysdate, hiredate, sysdate - hiredate from emp;

--Practice
select ename name, round(months_between(sysdate,hiredate)) months_worked from emp;
select ename, hiredate, to_char(hiredate,'DAY') from emp;

--Lab 2 (cont...)
select ename, to_char(hiredate,'DD MONTH YYYY') from emp;
select to_number('123')+4 from dummy;
select ename name, hiredate from emp where hiredate= to_date('February 21, 1981','Month dd,YYYY');
select comm, nvl(comm,0) from emp;
select hiredate, nvl(hiredate, '01-JAN-97')from emp;
select job, nvl(job,'No Job Yet') from emp;
select ename name, sal salary, comm commission, (sal*12)+nvl(comm,0) from emp;

--Practice 
select ename name, comm commission, nvl(to_char(comm),'No Commission') comm from emp;

--Lab 2 (cont...)
select avg(sal) average_salary, max(sal) maximum_salary, min(sal) minimum_salary, sum(sal) sum_salary from emp where job like'SALES%';
select count(*) from emp where deptno = 30;
select count(nvl(comm,0)) from emp where deptno = 30;
select avg(comm) average from emp;
select avg(nvl(comm,0)) from emp;
select deptno ,sum(sal), count(deptno), avg(sal) average_salary from emp group by deptno;
select job,count(job) , sum(sal) sum_salary from emp group by job having sum(sal) < 5000;
select job, sum(sal) PAYROLL from emp where job not like'SALES%' group by job order by sum(sal);

--Practice
select round(max(sal)) maximum, round(min(sal)) minimum, round(sum(sal)) sum, round(avg(sal)) average from emp;
select job, min(sal), max(sal), sum(sal), avg(sal) from emp group by job;
select job, count(*) from emp group by job;
select DISTINCT deptno, count(*) from emp  group by deptno having count(deptno)<5;
