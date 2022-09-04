package springaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalConfig.class, WalkerConfig.class})
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig {
	
	@Bean
	public AnimalAspect animalAspect() {
		return new AnimalAspect();
	}
	
	@Bean
    public WalkerIntroducer introducer() {
        return new WalkerIntroducer();
    }
	
}