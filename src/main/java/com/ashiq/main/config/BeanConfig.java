package com.ashiq.main.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashiq.main.model.Coder;
import com.ashiq.main.model.Computer;

@Configuration
public class BeanConfig {

	/* Setter based bean configuration */
	@Bean
	public Coder coder1(@Qualifier("computer1") Computer computer) {
		Coder coder1 = new Coder();
		coder1.setId(1001);
		coder1.setName("Mr. Dave");
		coder1.setLanguage("Java");
		coder1.setComputer(computer);

		return coder1;
	}

	/* Constructor based bean configuration */
	@Bean
	public Coder coder2(@Qualifier("computer2") Computer computer) {
		Coder coder2 = new Coder(1001, "MR Mat", "Python", computer);

		return coder2;
	}

	/* Setter based bean configuration */
	@Bean
	public Computer computer1() {
		Computer computer1 = new Computer();
		computer1.setBrand("Intel");

		return computer1;
	}
	
	/* Constructor based bean configuration */
	@Bean
	public Computer computer2() {
		Computer computer2 = new Computer("Ryzen");
		
		return computer2;
	}
}
