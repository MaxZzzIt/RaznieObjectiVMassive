package by.home.maxzzzit;

public class RaznieObjectiVMassive {

	public static void main(String[] args) {
		Object []array = new Object[] {123, "Привет", "All rait", 24};
		raznieTipi(array);

	}
	
	public static void raznieTipi (Object...tip) {
		for (Object X: tip) {
			System.out.println(X);
		}
	}
}
