package openclosed;

public class Greeter {

	private Greeting greeting;

	public Greeter() {

	}

	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String personGreeting() {
		return this.greeting.greet(); 
	}

}