package com.maven.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml" );
//    	Dev obj = (Dev) context.getBean("dev");
    	
//    	obj.build();
        System.out.println( "Coming to App" );
    }
}
