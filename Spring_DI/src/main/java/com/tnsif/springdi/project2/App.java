package com.tnsif.springdi.project2;

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
       
    	
    	//configuration
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
    	
    	Car c = con.getBean("two",Car.class);
    	
    	c.dispCarInfo();
    	
    }
}
