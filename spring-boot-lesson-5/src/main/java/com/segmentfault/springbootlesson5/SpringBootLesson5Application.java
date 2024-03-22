package com.segmentfault.springbootlesson5;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringBootLesson5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLesson5Application.class, args);
    }
    @Controller
    public class MyController{
        @RequestMapping("/message")
        @ResponseBody
            public String message(){
            return  "Hello,world";
        }

    }

        @Bean
    public static  EmbeddedServeletContainerCustomizer embeddedServeletContainerCustomizer(){
        return new EmbeddedServeletContainerCustomizer(){
            @Override
        public void customize( ConfigurableEmbeddedServeletContainer container){
        if(container instanceof TomcatEmbeddedServeletContainerFactory){
            TomcatEmbeddedServeletContainerFactory factory = TomcatEmbeddedServeletContainerFactory.class.cast(container);
        }
        }
        }
        }
}
