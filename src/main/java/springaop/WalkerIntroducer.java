package springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class WalkerIntroducer {

	@DeclareParents(value="springaop.Animal", defaultImpl=Quadruped.class)
    public static Walker walker;
}