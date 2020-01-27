--Practice For                          L A B 7

set SERVEROUTPUT ON;

declare
    v_deptno number(2);
    v_loc varchar2(15);
begin
    select deptno, loc into v_deptno, v_loc from dept where dname ='SALES';
end;



declare
    v number(6,2);
begin
    select avg(sal) into v from emp;
    DBMS_OUTPUT.PUT_line('The average salary is '||to_char(v));
end;



declare
    v_sal_increase emp.sal%type := 2000;
begin
    update emp set sal=sal+v_sal_increase where job = 'ANALYST';
end;
    




declare
    x number(3) := 0;
begin
    select count(*) into x from emp where sal<5000;
if x=0 then
    dbms_output.put_line ('No Employee Found');
else 
    dbms_output.put_line(x);
end if;
end;




declare
    x number(3) := 0;
begin
    select deptno into x from dept where dname='IT';
exception
    when no_data_found then DBMS_OUTPUT.PUT_LINE('No such department');
end;



-- PROCEDURE




create or replace procedure pr_class is
    var_code varchar2(30) := 'CMPS352';
    var_name varchar2(50) := 'Fundamental of DB System LAB';
begin
    dmbs_output.put_line('This course is '||var_name||' wich is '||var_code);
end pr_class;






create or replace procedure emp_sal(dep_id number, sal_raise number) is
begin
    update emp set sal=sal*sal_raise where deptno = dept_id;
    dmbs_output.put_line('Salary Updated Successfully');
end;






exec emp_sal(20.0,5)
select * from emp;






create or replace procedure adjust_salary(in_employee_id in emp.empno%type, in_percent in number) is
begin
    update emp set sal= sal+sal*in_percent/100 where empno= in_employee_id;
end;


select sal from emp where empno =7788;
exec adjust_salary(7788,5);
select sal from emp where empno =7788;




-- FUNCTION

create or replace function totalEmployee return number is
    total number(2) := 0;
begin
    select count(*) into totalNumber from emp;
    return total;
end;






declare
    c number(2) := 0;
begin
    c := totalEmployee();
    DBMS_OUTPUT.PUT_LINE('Total no. of EMployees: '||c);
end;






-- Practice For                            L A B 8

create or replace trigger t1 after insert on emp for each row
begin
    DBMS_OUTPUT.PUT_LINE('New Recored Inserted ');
end;

alter trigger t1 enable;
insert into emp (empno, ename, sal) values (222, 'ABC', 20000);

















--LAB 10
Create or replace procedure raiseSal(dno number, per number)
is
begin
update emp set sal=sal+sal*per/100
where deptno=dno;
end; 






























