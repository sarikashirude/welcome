package Abstract_keyword;

public class Concrete extends Abstract {
	
	int a=30;//Global Variable

	public static void main(String[] args) {
		// You can't create object of Concrete class.
		
		Concrete c=new Concrete();//Created Object
		c.test1();//This method is another class
		c.test2();//This method is another class
		c.test3();//This method is another class
		c.test5();//This method is same class
	}

	public void test3()
	{
		//This is incomplete method completed in concrete class.
		System.out.println("Test3 Method completed in concrete class");
		
		int a=100;//Local Variable
		int mul=20*a;//Using Local Variable
		System.out.println("Local variable from same class " +mul);
		
		int div=100/this.a;//Global Variable using This keyword
	    System.out.println("Global variable from same class using super keyword  "+div);
	    
		
		int sub=40-super.a;//Global Variable using super keyword from another class.
	    System.out.println("Global variable from another class using super keyword "+sub);
	    
	}
	
	public void test5()
	{
		System.out.println("Test5 Method completed in concrete class");
	}

}
