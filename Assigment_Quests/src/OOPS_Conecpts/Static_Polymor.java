package OOPS_Conecpts;

public class Static_Polymor extends Static_Polymorphism {
	
	int add (int a, int b,int c)
	{
		return a+b+c;
	}
	
	
	
	

	public static void main(String[] args) {
		Static_Polymor sp = new Static_Polymor();
		sp.add(1, 2);
		sp.add(3, 4, 5);
		
		

	}

}
