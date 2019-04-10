package pl.mbierut.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("pl.mbierut")
@EntityScan("pl.mbierut")
@EnableJpaRepositories("pl.mbierut")
public class ArchivesprojectsbApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ArchivesprojectsbApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ArchivesprojectsbApplication.class, args);
    }



}
