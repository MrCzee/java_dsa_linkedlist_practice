package demo;


import java.util.*;
import java.util.stream.IntStream;

public class tasklinkedlist {
     
    	
	public static void main(String args[])
	{
 
		
		  
		  
		  Random random = new Random();

		  int d = random.nextInt(10);

		 // double d1 = Math.random();

		  System.out.println(d);
  
		  
		 Random rand = new Random();
		 IntStream ints = rand.ints(5,1,100);
		 ints.forEach(System.out::println);
	}
}
