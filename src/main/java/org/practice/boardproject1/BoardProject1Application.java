package org.practice.boardproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BoardProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(BoardProject1Application.class, args);
        //SpringApplication.run(BoardProject1Application.class, args).close();
    }

}
