package myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyselfRule {
	@Bean
	public IRule myRule() {
		return new RandomRule(); //用我们选择的随机算法替换默认的轮询算法
	}
}
