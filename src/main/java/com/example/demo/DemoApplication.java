package com.example.demo;

import java.io.InputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.baeldung.snakeyaml.PayLoadData;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hellow World");
		
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication app = new DemoApplication();
		app.sample();
	}
	
	public void sample() {
//		Yaml yaml = new Yaml(new Constructor(Customer.class));
//	    InputStream inputStream = this.getClass()
//	      .getClassLoader()
//	      .getResourceAsStream("customer.yaml");
//	    Customer customer = yaml.load(inputStream);
//		System.out.println("Customer  : "+customer.getAge());
		
		try {
			
			 Yaml yaml = new Yaml(new Constructor(PayLoadData.class));
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("customer.yaml");
			
			PayLoadData abc = yaml.load(inputStream);
			
			System.out.println("------  > "+abc.getCondition());
			//System.out.println(" Size : "+listdata.size());
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
