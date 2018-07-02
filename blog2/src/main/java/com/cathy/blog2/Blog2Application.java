package com.cathy.blog2;

import com.cathy.blog2.data.UsersMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.cathy.blog2.data")
public class Blog2Application {

    public static void main(String[] args) {
        SpringApplication.run(Blog2Application.class, args);
    }

    private final UsersMapper usersMapper;

    public Blog2Application(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return (args) -> System.out.println(this.usersMapper.selectByPrimaryKey(1).getUsername());
    }
}
