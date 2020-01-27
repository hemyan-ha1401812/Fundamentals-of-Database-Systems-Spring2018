--Hemyan Al-kuwari
select ename, dname from emp,dept;
select ename, dname from emp cross join dept;
select ename, dname from emp,dept where emp.deptno=dept.deptno;
-- The above and lower statemints are EQUAL
select emp.ename,dept.dname from emp,dept where emp.deptno=dept.deptno;

--1
select ename, dname from emp natural join dept;
select ename, dname from emp join dept on (dept.deptno=emp.deptno);
select ename, dname from emp natural join dept where mgr=7839;
select ename, dname from emp, dept where emp.deptno=dept.deptno and mgr=7839;

--2
desc emp;
select * from emp;
select worker.ename, manager.ename from emp worker,emp manager where worker.mgr=manager.empno;
select e.ename, m.ename from emp e join emp m on (e.mgr=m.empno);

--3
select * from salgrade;
select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal between s.losal and s.hisal;

--4
select ename, dname from emp right outer join dept on (emp.deptno=dept.deptno);
select e.ename, d.deptno,d.dname from emp e, dept d where e.deptno(+)=d.deptno order by e.deptno;

--Practice
select e.ename, m.ename from emp m right outer join emp e on (e.mgr=m.empno);
select e.ename, m.ename from emp m , emp e where m.empno(+)=e.empno;

--4 (cont...)
select e.ename, m.ename from emp e full outer join emp m on (e.mgr=m.empno);

--Practice 

--1
select ename, dname, loc from emp, dept where(emp.deptno=dept.deptno) and comm is not null;

--2
select * from salgrade;
select e.ename, e.job, d.dname, e.sal, s.grade from emp e, dept d, salgrade s where e.deptno=d.deptno and (e.sal between s.losal and s.hisal)and s.grade=3;

--3
select e.ename, e.hiredate from emp e, emp b where b.ename like 'BLAKE' and e.hiredate > b.hiredate;

--4
-- solve it as exercise

--Subqueries

select ename from emp where sal > (select sal from emp where empno=7566);

--Practice
select ename from emp where hiredate =( select hiredate from emp where ename='JAMES') and sal > (select sal from emp where ename='JAMES');

--Subqueries (cont...)
select ename, job, sal from emp where sal =(select min(sal) from emp);
select deptno, min(sal) from emp group by deptno having min(sal) > (select min(sal) from emp where deptno =20);
 
 
--MultipleRow Subqueries
select empno, ename, job from emp where sal < any (select sal from emp where job='CLERK');
select empno, ename, job from emp where sal > all ( select avg(sal) from emp group by deptno);


--Practice

--Q1
select ename from emp where deptno=(select deptno from emp where ename ='BLAKE') and ename <> 'BLAKE'; 

--Q2
select empno,ename , sal from emp where sal>( select avg(sal) from emp) order by sal desc;

--Q3
select empno, ename, deptno from emp where deptno = any (select deptno from emp where ename like '%T%');
desc dept;
--Q4
select * from emp;
select * from dept;
select e.deptno, e.ename, e.job from emp e, dept d where d.loc = 'DALLAS' and e.deptno=d.deptno;

--Q5
select e.deptno, e.ename, e.job from emp e, dept d where d.dname = 'SALES' and e.deptno=d.deptno;











