package com.hello.properties;

import com.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anchao
 * @date 2020/12/21 16:31
 **/
@Configuration
@ConditionalOnClass({HelloService.class})
//@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

   // @Autowired
    //private HelloProperties helloProperties;

    /**
     * 当容器没有这个 Bean 的时候才创建这个 Bean
     */
    @Bean
    @ConditionalOnMissingBean(HelloProperties.class)
    public HelloService helloWorldService() {
        HelloService helloService = new HelloService();
        helloService.setStr1("你好");//helloProperties.getStr1()
        helloService.setStr2("hello-starter");//helloProperties.getStr1()
        return helloService;
    }

}
