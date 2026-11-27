create database member_service;
USE member_service;

CREATE TABLE tbl_member (
    mem_no INT UNSIGNED auto_increment		,
    mem_id VARCHAR(30) NOT NULL unique		,
    mem_pw VARCHAR(255) NOT null			,
    mem_mail VARCHAR(100) NOT null			,
    mem_phone VARCHAR(20) NOT null			,
    mem_is TINYINT NOT NULL DEFAULT 1		comment '0:탈퇴회원 1:일반회원',
    mem_reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    mem_mod_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (mem_no)
) AUTO_INCREMENT = 1001;

select * from tbl_member;