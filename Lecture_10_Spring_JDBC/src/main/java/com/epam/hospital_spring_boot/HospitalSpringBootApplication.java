package com.epam.hospital_spring_boot;

import com.epam.hospital_spring_boot.configuration.DataBaseConf;
import com.epam.hospital_spring_boot.service.DemoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class HospitalSpringBootApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConf.class);

/*        DemoService demoService = (DemoService) context.getBean("demoService");
        demoService.start();*/
	}
}
