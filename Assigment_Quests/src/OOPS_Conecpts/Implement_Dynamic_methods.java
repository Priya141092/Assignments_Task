package OOPS_Conecpts;

public class Implement_Dynamic_methods extends Dynamic_Polymorphism {

	
	
	void Method1()
	{
		System.out.println("Overridden method1");
	}
	void Method2()
	{
		System.out.println("Overridden method2");
	}
	public static void main(String[] args) {
		
		Implement_Dynamic_methods id = new  Implement_Dynamic_methods();
		id.Method1();
		

	}

}
