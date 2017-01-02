package Object_oriented_Programming;

class InstanceofTest {
	public static void main(String args[]) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This si a FireEngine insatance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
	}
}


