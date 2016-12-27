package Exercise;

public class Exercise3_7 {
	public static void main(String[] args) { // ¸øÇ°..
		int fahrenheit = 100;
		float celcius = ((5 / 9.f * (fahrenheit - 32)) * 1000 % 10 >= 5 ? 
							(int)(((5 / 9.f * (fahrenheit - 32)) * 100) + 1) / 100.f :(int)((5 / 9.f * (fahrenheit - 32)) * 100) / 100.f);
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
