package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
		}
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
	@Bean
	public MinstrelAop minstrelAop() {
		return new MinstrelAop(); 
	}

}
