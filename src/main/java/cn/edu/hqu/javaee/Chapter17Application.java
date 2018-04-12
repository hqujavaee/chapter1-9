package cn.edu.hqu.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chapter17Application {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight=context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
