insert into user values(90001, sysdate(), 'User1','test1','701010-1111111');
insert into user values(90002, sysdate(), 'User2','test2','801010-1111111');
insert into user values(90003, sysdate(), 'User3','test3','901010-1111111');

insert into post values(10001, 'My First post', 90001);
insert into post values(10002, 'My Second post', 90001);
insert into post values(10003, 'My Third post', 90003);