package demo;

import java.util.Scanner;


 public class TheInnovetor { //extends Innovetormain {
	    private String name;
	    private String age;
	    private String designation;
	    private String course;
	    private String yrlvl;
//		public String Name;
//		public String Age;
//		public String Designation;
//		public String Course;
//		public String Yrlvl;
		 

	     TheInnovetor(String name, String age, String designation, String course, String yrlvl){

	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	        this.course = course;
	        this.yrlvl = yrlvl;

	    }
	     public void setName(String name){
	        this.name = name;
	    }
   
	    public void setAge(String age){
	        this.age = age;
	    }

	    public void setDesignation (String designation){
	        this.designation = designation;
	    }

	    public void setCourse(String couse){
	        this.course = course;
	    }

	    public void setYrlvl (String yrlvl){
	        this.yrlvl = yrlvl;
	    }

	    public String getName(){
	        return name;
	    }

	    public String getAge(){
	        return age;
	    }

	    public String getDesignation(){
	        return designation;
	    }

	    public String getCourse(){
	        return course;
	    }

	    public String getYrlvl(){
	        return yrlvl;
}
}
