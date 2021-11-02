package profundizacion.ejercicio1;

public class Calculations {
	
	public void factorial(int i) throws TooSmallNumberException {
		
		// 2. Throw an exception if the argument is smaller than or equal to zero
		if(i <= 0) throw new TooSmallNumberException();
		
	}

}
