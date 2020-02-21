package cm.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class demoApplication {
    public static void main(String[] args) {
		
		
        //分支创建
        SpringApplication.run(demoApplication.class,args);
    }
}
