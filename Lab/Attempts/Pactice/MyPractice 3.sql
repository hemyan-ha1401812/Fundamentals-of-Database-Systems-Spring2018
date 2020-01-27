-- Practice For Lab 7

set serveroutput on;

declare
v_deptno number(2);
v_loc varchar2(15);
begin
select deptno, loc
into v_deptno, v_loc
from dept
where dname='SALES';
DBMS_OUTPUT.PUT_LINE('Deptno: '||v_deptno||' Loc: '||v_loc);
end;    


declare
v number(6,2);
begin
select avg(sal)
into v
from emp;
DBMS_OUTPUT.PUT_LINE('Average Salary is '||to_char(v));
end;


declare
v_sal_increase emp.sal%type :=2000;
begin
update emp
set sal =  sal+v_sal_increase
where job = 'ANALYST';
end;


declare
x number(3) :=0;
begin
select count(*)
into x
from emp
where sal<5000;
if x=0 then 
DBMS_OUTPUT.PUT_LINE('No employee found');
else
DBMS_OUTPUT.PUT_LINE(x);
end if;
end;


declare
x number (3):= 0;
begin
select deptno 
into x 
from dept 
where dname='IT';
exception
when no_data_found then
DBMS_OUTPUT.PUT_LINE('No such department ');
end;


create or replace procedure pr_class is
var_code varchar2(30):= 'CMPS352';
var_name varchar2(50):='Fundamentals of DB system LAB';
begin
dmbs_outout.put_line('This course is '||var_name||' which is '||var_code);
end pr_class;


create or replace procedure emp_sal(dep_id number, sal_rise number) is
begin
update emp set sal=sal*sal_rise where deptno=dep_id;
DBMS_OUTPUT.PUT_LINE('salary updated successfully');
end emp_sal;


exec emp_sal (20,0.5);
select * from emp;


create or replace procedure adjust_salary(in_employee_id in emp.empno%type, in_percent in number) is
begin
update emp set sal=sal*in_percent/100 where empno=in_emplyee_id;
end;


select sal from emp where empno=7788;
exec adjust_salary(7788, 5);
select sal from emp where empno=7788;


create or replace function totalEmployees
return number is
total number(2) :=0;
begin
select count(*)
into total
from emp;
return total;
end;


declare
c number(2);
begin
c := totalemployees();
DBMS_OUTPUT.PUT_LINE('Total no. of Emplyees: '||c);
end;
























