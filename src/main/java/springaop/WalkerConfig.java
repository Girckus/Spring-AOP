package springaop;

import org.springframework.context.annotation.Bean;

public class WalkerConfig {

	@Bean(name="walker")
	public Walker getWalker() {
		return new Quadruped();
	}
	
}