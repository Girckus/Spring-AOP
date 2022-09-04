package springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnimalAspect {

	@Pointcut("execution(* springaop.Animal.makeSound())")
	public void makingSound() {}
	
	@Before("makingSound()")
	public void beforeSound(){
		System.out.println("making Sound");
	}
	
	@Before("execution(* springaop.Animal.set*(..)) && within(springaop.*)")
	public void beforeSet(){
		System.out.println("method setter called");
	}
	
	@After("makingSound()")
	public void afterSound(){
		System.out.println("made Sound");
	}
	
	@AfterReturning("makingSound()")
	public void AfterReturningSound(){
		System.out.println("made Sound OK");
	}
	
	@AfterThrowing("makingSound()")
	public void afterThrowingSound(){
		System.out.println("made Sound Error");
	}
	
	@Around("execution(** springaop.Animal.getSound(String))")
	public void sound(ProceedingJoinPoint jp){
		try {
			System.out.println("getting Sound");
			jp.proceed();
			System.out.println("got Sound");
		} catch (Throwable e) {
			System.out.println("problems....");
		}
		
	}
	
	@Pointcut("execution(* springaop.Animal.getSound(String)) && args(sound)")
	public void gettingSound(String sound) {}
	
	@Before("gettingSound(sound)")
	public void makingSound(String sound){
		System.out.println("making Sound " + sound);
	}
}