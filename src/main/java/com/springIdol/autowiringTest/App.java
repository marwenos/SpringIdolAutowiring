package com.springIdol.autowiringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
    	/*Singer singer = (Singer) application.getBean("saloonSinger");
    	singer.sing();*/
    	Singer singer1 = (Singer) application.getBean("James1");
    	singer1.sing();
    }
}
