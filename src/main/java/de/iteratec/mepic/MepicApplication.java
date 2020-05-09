package de.iteratec.mepic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MepicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MepicApplication.class, args);
    }

}
