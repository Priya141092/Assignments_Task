package OOPS_Conecpts;

public class Implement_methods extends Abstraction_Example {

	

	
	public void Input() {
		System.out.println("This method is for taking inputs");
		
	}

	
	public void Output() {
		System.out.println("This method is gving ouputs");
		
	}

	
	public void Results() {
		System.out.println("Results_Method2");
	}
	
	public static void main(String[] args) {
	
	Implement_methods m = new Implement_methods();
	m.Results();//Method overidden in child class
	m.Input();

	}
}
