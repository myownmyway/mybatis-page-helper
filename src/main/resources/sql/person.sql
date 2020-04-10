use study;
select database();
create table if not exists `person`
(
    id   int(11) auto_increment primary key comment '主键',
    name varchar(255) comment '名称',
    sex   varchar(20) comment '性别',
    age  int(3) comment '年纪'
) engine = InnoDb
  charset = utf8;
insert into  person(name,sex,age) values("zhangsan","man",10);
insert into  person(name,sex,age) values("zhangsan2","man",11);
insert into  person(name,sex,age) values("zhangsan3","man",12);
insert into  person(name,sex,age) values("zhangsan4","man",13);
insert into  person(name,sex,age) values("zhangsan5","man",14);
insert into  person(name,sex,age) values("zhangsan6","man",15);
insert into  person(name,sex,age) values("zhangsan7","man",16);
insert into  person(name,sex,age) values("zhangsan8","man",17);
insert into  person(name,sex,age) values("zhangsan9","man",18);
insert into  person(name,sex,age) values("zhangsan10","man",19);
insert into  person(name,sex,age) values("zhangsan11","man",20);
insert into  person(name,sex,age) values("zhangsan12","man",21);