package Exception_handling;

public class Exception_Example {

	public static void main(String[] args) {
	
		try
		{
			int data =100/0;
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Please execute code");
		}

	}

}
