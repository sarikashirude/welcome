package Abstract_keyword;

public abstract class Abstract {
	int a=20;

	public static void main(String[] args) 
	{
		//Sample s=new Sample();-->We can't Create object of Abstract Class.
    
	}
	
	public void test1()//This Non-Static method.

	{
		System.out.println("This is Complete Method");
	}

	public void test2()//This Non-Static method.
	{
		//method have no body
		//Even if body is empty,this is complete method.
	}
	
	public abstract void test3();//This is incomplete method called as abstract method.
	
	public static void test4()
	{
		System.out.println("This is Static Method with body");
	}
		
}
