package com.ashiq.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.ashiq.main.config.BeanConfig;
import com.ashiq.main.model.Coder;
import com.ashiq.main.model.Computer;

@SpringBootApplication
@Import({ BeanConfig.class })
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println(c1.getName());
		System.out.println(c1.getLanguage());
		System.out.println(c1.getComputer());
		c1.setLanguage("Python");
		System.out.println(c1.getLanguage());
	}

}
