package springaop;

public abstract class AbstractAnimal implements Animal {
	
	protected String sound;
	protected String name;
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void makeSound() throws Exception;
	public abstract void getSound(String sound);
	public abstract String toString();
	
}