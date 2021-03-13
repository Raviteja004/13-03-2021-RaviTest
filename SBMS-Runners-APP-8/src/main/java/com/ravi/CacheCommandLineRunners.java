package com.ravi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CacheCommandLineRunners implements CommandLineRunner{
	
	public CacheCommandLineRunners() {
	System.out.println("Commandline runners Constuructures");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("commandline arg run method");
		
	}
	
	

}
