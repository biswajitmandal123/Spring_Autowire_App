package com.biswajit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswajit.AppConfig;
import com.biswajit.beans.ReportService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	ReportService service	= 	context.getBean(ReportService.class);
		service.generateReport();
	}

}
