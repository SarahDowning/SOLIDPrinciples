package singleresponsibility;

public class DoggoJobs {
	
	private Dog dog;
	
	public void dogJobs(Dog dog) {
		this.dog = dog;
	}
	
	public void walk() {
		System.out.println("Lets go for a walk");
	}
	
	public void playCatch() {
		System.out.println("I got the ball!");
	}
	
}
