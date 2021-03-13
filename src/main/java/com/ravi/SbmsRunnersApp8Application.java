package com.ravi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbmsRunnersApp8Application //implements ApplicationRunner,CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SbmsRunnersApp8Application.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("Application run method");
	 * 
	 * }
	 * 
	 * @Override public void run(ApplicationArguments args) throws Exception {
	 * System.out.println("Command run method        " + "");
	 * 
	 * }
	 */
	@Bean
	CommandLineRunner cmdRunner()
	{
		return args ->
		System.out.println("command line runner");
	}
	
	@Bean
	ApplicationRunner appRunner()
	{
		return args ->
		System.out.println("Application runnaer");
	}
}
