package dong.example.amsfirst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "dong.example.amsfirst.dao")
public class AmsfirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmsfirstApplication.class, args);
    }

}
