package cn.edu.sdut.springbootmybatisfreemarkerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.edu.sdut.springbootmybatisfreemarkerdemo.mapper")
public class SpringbootmybatisfreemarkerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisfreemarkerdemoApplication.class, args);
    }

}
