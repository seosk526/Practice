package kr.ac.kopo.kopo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class SpringBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoardApplication.class, args);
	}
}
