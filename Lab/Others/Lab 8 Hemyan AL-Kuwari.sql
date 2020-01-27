--Lab 8 Hemyan Al-Kuwari

set serveroutput on;

create or replace trigger T1
after insert on emp
for each row
begin
dbms_output.put_line('new record inserted');
end;


insert into emp (empno, ename, sal) values (7711,'MONA',4000);

commit;









create or replace trigger T2
after insert on emp
for each row
begin
if : new.hiredate-sysdate<30 then 
raise_application_error(-20001,'hiredate can not be before 30 days');
end if;
end;

alter trigger t1 disable; -- because you can't trigger two thing at the same time

insert into emp (empno, ename, hiredate) values (8822,'HAYA','03 jan, 2018');








alter trigger t2 disable;

create table auditemp(username varchar2(20), opdate date, empno number(4));

create or replace trigger loginsert
after insert on emp
for each row --missing in the Lab 8
begin
insert into auditemp values (user, sysdate, :new.empno);
end;

insert into emp(empno, ename) values (333,'AHMED');

select * from auditemp;













alter trigger t1 disable;

alter trigger t1 enable;

drop trigger t1;
























