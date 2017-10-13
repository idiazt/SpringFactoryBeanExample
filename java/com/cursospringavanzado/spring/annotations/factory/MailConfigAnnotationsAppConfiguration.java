package com.cursospringavanzado.spring.annotations.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cursospringavanzado.spring.factory.MailConfigBean;
import com.cursospringavanzado.spring.factory.MailConfigFactory;

@Configuration
public class MailConfigAnnotationsAppConfiguration {

	@Bean(name = "mailConfigDevAnnotations")
	public MailConfigFactory mailConfigFactory() {
		MailConfigFactory factory = new MailConfigFactory();
		factory.setAccountName("dev");
		factory.setProfile("dev");
		return factory;
	}

	@Bean
	public MailConfigBean mailConfigBean() throws Exception {
		return mailConfigFactory().getObject();
	}
}
