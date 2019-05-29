import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yj"})//扫描组件，如果启动类和组件不在一个包中，需要使用该注解扫描需要扫描的包
@MapperScan({"com.yj.demorepository.mybatisTestRepository.mapper"})//该注解用于扫描mybatis的mapper
public class DemoControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoControllerApplication.class, args);
    }

}


