package Exception_handling;

public class Throw1 {
	
	
	public void age(int age)
	{
		if (age<18)
		
			throw new ArithmeticException("Elogible age is not");
	}

	
	
	public static void main(String[] args) {
		 Throw1 t = new Throw1();
		 t.age(11);
		
		
		
		

	}

}
