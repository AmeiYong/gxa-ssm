create schema gxa collate utf8mb4_0900_ai_ci;

create table admin
(
	id bigint unsigned auto_increment
		primary key,
	name varchar(20) not null comment '登录名',
	pwd char(32) not null comment '密码',
	is_deleted int default 0 not null comment '是否删除: 1 删除, 0 未删除',
	last_login_time datetime null comment '最后登陆时间',
	create_time datetime not null comment '创建时间',
	update_time datetime null comment '更新时间',
	constraint uk_name
		unique (name)
)
comment '管理员表' collate=utf8mb4_unicode_ci;

create table course
(
	id int unsigned auto_increment,
	course_name varchar(10) not null comment '课程名字',
	course_price double not null comment '课程价格',
	course_desc varchar(100) null comment '课程简介',
	course_time int not null comment '课时',
	is_deleted int default 0 not null comment '是否删除，0 未删除 1删除',
	create_time datetime not null comment '创建时间',
	update_time datetime null comment '最后更新时间',
	constraint id
		unique (id)
)
charset=utf8;

alter table course
	add primary key (id);

create table teacher
(
	teacher_id int unsigned auto_increment
		primary key,
	teacher_name varchar(255) not null,
	teacher_gender varchar(255) not null,
	teacher_age int not null,
	is_deleted int default 0 not null comment '0未删除 1删除',
	create_time datetime not null,
	update_time datetime null
)
charset=utf8;

