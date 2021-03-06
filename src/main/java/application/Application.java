package application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@Slf4j
@EnableNeo4jRepositories
@EnableSpringDataWebSupport
public class Application implements ApplicationRunner {


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("- - Application Started - -");
        log.info(" bootstrap data: ");
        log.info("   - http://localhost:8080/api/bootstrap/votes/last24h ");
        log.info("   - http://localhost:8080/api/bootstrap/votes/3");
        log.info(" http://localhost:8080/api/steemdata/vote/page?page=0&size=10&sort=timestamp,desc");
    }

}
