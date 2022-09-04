package springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
		
		Animal animal = (Animal) context.getBean("animal");
		try {
			animal.makeSound();
		} catch (Exception e) {
		}
		
		animal.setName("Test: " + animal.getName());
		animal.setSound("Test: " + animal.getSound());
		
	    System.out.println(animal);
	    animal.getSound("some sound");
	    
	    ((Walker) animal).walk();
	}
	
}