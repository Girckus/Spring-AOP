package springaop;

public class Lion extends AbstractAnimal {
	
	@Override
	public void makeSound() throws Exception {
		System.out.println(name + ": " + sound);
		
		if(Math.random() < 0.5) {
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "AnimalImpl [sound=" + sound + ", name=" + name + "]";
	}
	
	@Override
	public void getSound(String sound) {
		System.out.println("Lion - " + sound);
	}

	public Lion() {
		System.out.println("Lioning");
	}

}