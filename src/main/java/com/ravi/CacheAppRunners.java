package com.ravi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class CacheAppRunners implements ApplicationRunner{
	
	public CacheAppRunners() {
	System.out.println("Application Runners constructure");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("inside Application Run Method");
		
	}

}
