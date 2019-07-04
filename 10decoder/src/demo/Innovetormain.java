package demo;

import java.util.Scanner;

public class Innovetormain   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner input = new Scanner(System.in);
	        TheInnovetor theinnov = new  TheInnovetor();
System.out.println("");
	        theinnov.setname = (input.nextLine());
	        theinnov.setAge = (input.nextLine());
	        theinnov.setDesignation = (input.nextLine());
	        theinnov.setCourse = (input.nextLine());
	        theinnov.setYrlvl = (input.nextLine());



	        System.out.println("Name: " + theinnov.getName());
	        System.out.println("\nAge: " + theinnov.getAge());
	        System.out.println("\nDesignation: " + theinnov.getDesignation());
	        System.out.println("\nCourse: " + theinnov.getCourse());
	        System.out.println("\nYear Level: " + theinnov.getYrlvl());
	}

}
