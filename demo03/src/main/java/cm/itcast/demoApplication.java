package cm.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class demoApplication {


    //创建新分支
    public static void main(String[] args) {
        SpringApplication.run(demoApplication.class,args);
    }
}
