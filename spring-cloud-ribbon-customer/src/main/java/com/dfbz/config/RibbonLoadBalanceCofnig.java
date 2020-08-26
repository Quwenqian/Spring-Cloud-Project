package com.dfbz.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 实现负载均衡策略的全局配置
 */
@Configuration
public class RibbonLoadBalanceCofnig {
    //随机原则
    /*@Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }*/

}
