package kr.co.OrcaARS;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("kr.co.OrcaARS")
public class OrcaARSApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrcaARSApplication.class, args);
	}


}