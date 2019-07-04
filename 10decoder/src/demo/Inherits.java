package demo;
public class Inherits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*son bi=new son();
bi.expense();
bi.pension();
bi.salary();*/
		
		
//		son ci =(son) new Father();
//		ci.expense();
//		ci.pension();
//		ci.salary();
		
		
	}

}
//class Grandfa
//{
//	void pension(){
//		System.out.println("He is getting stil");
//	}
//}
//class Father extends Grandfa
//{
//	void salary()
//	{
//		System.out.println("He is also getting");
//	}
//}
//class son extends Father
//{
//	void expense()
//	{
//		System.out.println("hi");
//	}
//}
//
class Adder{  
	static int add(int a,int b){return a+b;}  
	static double add1(int a,int b){return a+b;}  
	}  
	class TestOverloading3{  
	public static void main(String[] args){  
	System.out.println(Adder.add(11,11));//ambiguity  
	}}  