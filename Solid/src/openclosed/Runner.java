package openclosed;

public class Runner {
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		FormalGreeting formalGreeting = new FormalGreeting();
		CasualGreeting casualGreeting = new CasualGreeting();
		
		System.out.println(formalGreeting.greet());
		System.out.println(casualGreeting.greet());
		
		// Setter Injection
		greeter.setGreeting(formalGreeting);
		System.out.println(greeter.personGreeting());
		
		greeter.setGreeting(casualGreeting);
		System.out.println(greeter.personGreeting());
		
	}

}
