create table subjects
( subcode varchar2(10) primary key,
  subname varchar2(50)
);

insert into subjects values('java','Java Langauge');
insert into subjects values('c#','C# Language');
insert into subjects values('hib','Hibernate');
insert into subjects values('aspnet','Asp.Net');

create table titles
(  id       int  primary key,
   title    varchar2(50),
   subcode  varchar2(10) references subjects(subcode),
   price    number(5)
);


insert into titles values (1,'Java Complete Reference','java',450);
insert into titles values (2,'Thinking in Java','java',550);
insert into titles values (3,'C# Complete Reference','c#',499);
insert into titles values (4,'Hibernate In Action','hib',450);
insert into titles values (5,'Beginning Hibernate','hib',299);
insert into titles values (6,'Asp.Net Unleashed','aspnet',500);
insert into titles values (7,'Pro ASP.NET 3.5 with C#','aspnet',650);
insert into titles values (8,'C# Programming','c#',400);
insert into titles values (9,'Illustrated C# 2008','c#',300);
insert into titles values (10,'Java 6 Platform Revealed','java',350);

create table Etitles
(  titleid  int  primary key,
   weburl   varchar2(50)
);

insert into ETitles  values(9,'http://www.apress.com/book/view/9781590599549');
insert into ETitles  values(10,'http://www.apress.com/book/view/9781590596609');











