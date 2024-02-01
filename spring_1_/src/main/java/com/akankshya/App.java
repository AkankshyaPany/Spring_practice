package com.akankshya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/akankshya/beans.xml");
        Movie m=context.getBean(Movie.class);
    	
    	System.out.println("movie Name is "+m.movieName);
    }
}
