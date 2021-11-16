package interfacesegregation;

public class Runner {
	
	public static void main(String[] args) {
		
		Dodo dodo = new Dodo(2);
		Falcon falcon = new Falcon(4);
		
		dodo.goExtinct();
		dodo.getCurrentLocation();
		dodo.getNumberOfEggs();
		
		falcon.doesFly();
		falcon.layEggs();
		
		System.out.println(dodo.getNumberOfEggs());
		System.out.println(dodo.getCurrentLocation());
		System.out.println(falcon.getNumberOfEggs());
		System.out.println(falcon.doesFly());
		
	}

}
