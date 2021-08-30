package OOPS_Conecpts;


public class ImplementingInterface implements Interface_Example {
	
	
	public void Input() {
		System.out.println("Input1");
		
	}

	
	public void output() {
		System.out.println("Output1");
		
	}

	
	public void results() {
		System.out.println("Results");
		
	}

	
public static void main(String[] args) {
	
	Interface_Example ip = new ImplementingInterface();
	ip.Input();
	ip.output();
	
		

	}
}



