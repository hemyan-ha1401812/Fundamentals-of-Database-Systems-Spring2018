-- P R A C T I C E -- L A B 3 & 4

-- LAB 3
select ename, dname from emp, dept;
select ename, dname from emp cross join dept;

-- Question:
select ename, dname from emp, dept where emp.deptno=dept.deptno;

-- 1- Equijoins (Inner Join):
select emp.ename, dept.dname from emp, dept where emp.deptno=dept.deptno;
select ename, dname from emp natural join dept;
select ename, dname from emp join dept on (emp.deptno=dept.deptno);
select ename, dname from emp natural join dept where mgr=7839;
select ename, dname from emp, dept where emp.deptno=dept.deptno and mgr= 7839;

-- 2- Self Joins:
select worker.ename Worker, manager.ename Manager from emp worker, emp manager where worker.mgr=manager.empno;

-- 3- Non-Equijoins:
select * from salgrade;
select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- 4- Outer Joins:
select ename, dname from emp right outer join dept on (dept.deptno=emp.deptno); 
select e.ename, d.dname from emp e, dept d where e.deptno(+)=d.deptno order by e.deptno;

-- Practice:
select e.ename, m.ename from emp m right outer join emp e on(e.mgr=m.empno);

-- 4- Outer Joins: (cont..)
select e.ename, m.ename from emp e full outer join emp m on (e.mgr=m.empno);

-- Practice:

-- 1
select ename, dname, loc from emp natural join dept where emp.comm is not null;

-- 2
desc salgrade;
select ename, job, dname, sal, grade from emp, dept, salgrade where dept.deptno=emp.deptno and salgrade.grade=3;

-- 3
select e.ename, e.hiredate from emp e, emp b where b.ename like 'BLAKE' and b.hiredate < e.hiredate;

-- 4
select e.ename emp, e.hiredate hiredate, m.ename Manager, m.hiredate mgr_hiredtae from emp e, emp m where e.mgr=m.empno and m.hiredate > e.hiredate;


-- Sub-queries:
select ename from emp where sal>(select sal from emp where empno=7566);

-- Practice:
select ename from emp where hiredate=(select hiredate from emp where ename like 'JAMES') and sal > (select sal from emp where ename like 'JAMES');

-- Sub-queries: (cont..)
select ename, job, sal from emp where sal = (select min(sal) from emp);
select deptno, min(sal) from emp group by deptno having min(sal)>(select min(sal) from emp where deptno =20);

select empno, ename, job from emp where sal < any (select sal from emp where job='CLERK');
select empno, ename, job from emp where sal > all (select avg(sal) from emp group by deptno);

-- Practice:

-- 1
select ename, hiredate from emp where ename not like 'BLAKE' and deptno= all (select deptno from emp where ename like 'BLAKE');

-- 2
select empno, ename, sal from emp where sal > all (select avg(sal) from emp) order by sal desc;

-- 3
select empno, ename, deptno from emp where deptno = any (select deptno from emp where ename like '%T%');

-- 4
select ename, deptno, job from emp where deptno = all (select deptno from dept where loc like 'DALLAS');

-- 5
select deptno, ename, job from emp where deptno = all (select deptno from dept where dname like 'SALES');


--LAB 4
