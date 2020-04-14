package com.rhp.userperm;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.rhp.userperm.mapper")
@SpringBootApplication
public class UserPermApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserPermApplication.class, args);
    }

}
