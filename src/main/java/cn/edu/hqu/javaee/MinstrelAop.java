package cn.edu.hqu.javaee;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MinstrelAop {
	@Pointcut("execution(** cn.edu.hqu.javaee.BraveKnight.embarkOnQuest(..))")
	public  void embarkWork() {}
	
	@Before("embarkWork()")
	public void singBeforeQuest() {
		System.out.println("它将去杀死恶龙!");
	}
	
	@After("embarkWork()")
	public void singAfterQuest() {
		System.out.println("它已经杀死了恶龙!");
	}
}
