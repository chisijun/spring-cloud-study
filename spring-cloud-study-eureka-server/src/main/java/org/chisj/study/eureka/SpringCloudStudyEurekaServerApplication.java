package org.chisj.study.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class SpringCloudStudyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStudyEurekaServerApplication.class, args);
		log.info("spring cloud study eureka server application start...");
	}
}
