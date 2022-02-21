create or replace procedure insertStd(
  id in number, name in varchar, email in varchar
)
is begin
insert into student values(id, name, email);
end;
/

begin
insertStd(105,'Myname','myemail@');
dbms_output.put_line('data inserted');
end;
/

create or replace function selectStd(id number)
  return varchar
  is
  res varchar(30);
  begin
  select name into res from student where id =id;
  return res;
  end;
/

-- TODO:not working
declare
res varchar(30);
begin
res := selectStd(102);
for i in res
loop
  dbms_output.put_line('Result: ' || i);
end loop;
end;
/