-- Hemyan AL-Kuwari 201401812
insert into dept(deptno,dname,loc) values (50,'DEVELOPMENT','DETROIT');
insert into dept values (60,'HR','DOHA');
insert into dept(deptno,dname) values (90,'MIS');
insert into dept values (70,'FINANCE',null);
select * from dept;

--Practice
insert into emp(empno,ename,sal,hiredate) values (200,'AHMED',4000,'01 Jan, 2008');
insert into dept values (80,'IT',null);
insert into emp (empno,ename, hiredate) values (123,'SARA',sysdate);
select * from emp;

insert into dept(deptno, dname, loc) values (10,'SUPPORT',null); -- Error 
insert into emp(empno, ename, deptno) values (234,'AHMED',80);

update emp set deptno=20 where empno=7782;
rollback; --undo For ALLl
commit; -- save

--Practice
select * from dept;
select * from emp;
update dept set loc='DOHA' where deptno=80;
update emp set sal=8000 where empno=7499 and sal<5000;

update emp set sal=sal+1000 where deptno=(select deptno from dept where dname = 'RESEARCH');
update emp set sal=(select sal from emp where empno = 7369) where empno= 7900;
select * from emp where empno=7369 or empno= 7900;

delete from dept where dname='DEVELOPMENT';
delete from emp where deptno= (select deptno from dept where dname='SALES');
delete from dept where deptno=70;

--Practice
delete from emp where deptno=10;

delete from dept where deptno=10;
delete from emp where deptno= (select deptno from dept where loc='NEW YORK');

select * from emp;
delete from emp;
rollback;
update emp set deptno =10 where empno=7782; 
select ename, deptno from emp where empno=7782;
rollback;
update emp set deptno =10 where empno=7782; 
commit;
select ename, deptno from emp where empno=7782;
