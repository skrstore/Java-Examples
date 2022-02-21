-- @File_PATH.sql

create table student(
    id number,
    name varchar(10)
);

create table users(
    id number,
    name varchar(20)
);


alter table student add email varchar(30);

alter table student add(col1 number(10,2), col2 number);

alter table student drop column email;

alter table student rename to new_student;

alter table student modify emailid varchar(20);

alter table student rename column emailid to email;

drop table new_student;


truncate table student;


insert into student 
values (102,'Sachin', 'sachin@');

insert into users 
select id, name 
from student 
where id <=107;

insert all 
into student values (108,'SKR', 'skr@')
into users values (106, "SKR")
select * from dual;


update new_student 
set emailid = 'hello@' 
where id = 106;


delete from new_student 
where id = 102;

delete from new_student
where id = 103
and email = 'sachin@';


select distinct id 
from new_student; 
