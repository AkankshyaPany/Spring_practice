package com.akankshya;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext ctx
	    =new ClassPathXmlApplicationContext("com/akankshya/beans.xml");
    	
    	Employee e=(Employee)ctx.getBean("emp");
    	
    	System.out.println("Employee Prerequisite Skills :"+ e.getSkills());
    	
    	System.out.println("Employee Addresses :"+ e.getAddresses());
    	
    }
}
