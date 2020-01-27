-- Lab7 Hemyan AL-kuwari

set serveroutput on;

declare 
v_deptno number(2);
v_loc varchar2(15);
begin
select deptno, loc into v_deptno, v_loc from dept where dname='SALES';
dbms_output.put_line (to_char(v_deptno)||' '||v_loc);
end;

declare
v number(6,2);
begin
select avg(sal) into v from emp;
dbms_output.put_line ('the average salary is '||to_char(v));
end;



declare
v_sal_increase emp.sal%type := 2000;
begin
update emp
set sal = sal+v_sal_increase
where job='ANALYST';
end;

select sal from emp;

declare
x number(3):=0;
begin
select count(*) into x from emp where sal<5000;
if x=0 then
dbms_output.put_line('No employee found');
else
dbms_output.put_line(x);
end if;
end;




declare
x number(3):=0;
begin
select deptno into x from dept where dname= 'IT';
exception
when no_data_found then
dbms_output.put_line('No such department');
end;




create or replace procedure pr_class is
var_code varchar2(30) := 'CMPS352';
var_name varchar2(50) := ' Fundamental of DB system LAB ';
begin
dbms_output.put_line(' This course is '||var_name||' which is '||var_code);
end pr_class;
execute pr_class;







create or replace procedure emp_sal(dept_id number, sal_raise number) is
begin
update emp set sal= sal*sal_raise where deptno=dept_id; 
dbms_output.put_line(' Salary updated successfully ');
end;



exec emp_sal(20,0.5);
select * from emp;




create or replace procedure adjust_salary(in_employee_id in emp.empno%type, in_percent in number) is
begin
update emp set sal= sal*in_percent/100
where empno=in_employee_id; 
end;



select sal from emp where empno=7499;



execute adjust_salary (7499,5);



select sal from emp where empno=7499;





create or replace function totalEmployees
return number is
total number(2):=0;
begin
select count(*) into total
from emp;
return total;
end;


select totalEmployees from dual;  -- To call the function



declare
c number (2);
begin
c := totalEmployees();
dbms_output.put_line(' Total no. of Employees: '||c);
end;








