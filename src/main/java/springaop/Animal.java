package springaop;

public interface Animal {

	void makeSound() throws Exception;
	void getSound(String sound);
	
	void setName(String name);
	void setSound(String sound);
	
	String getName();
	String getSound();
}