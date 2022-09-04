package springaop;

import java.util.Random;

import org.springframework.context.annotation.Bean;

public class AnimalConfig {

	@Bean(name="animal")
	public Animal getAnimal1() {
		Random rand = new Random();
		
		int op = rand.nextInt(3);
		
		Animal animal = null;
		
		switch(op) {
			case 0: animal = new Cat();
					animal.setName("Cat");
					animal.setSound("Miau");
					break;
			case 1: animal = new Dog();
					animal.setName("Dog");
					animal.setSound("Au Au Au");
					break;
			case 2: animal = new Lion();
					animal.setName("Lion");
					animal.setSound("Wraaaugh");
					break;
		}
		
		return animal;
	}
	
}