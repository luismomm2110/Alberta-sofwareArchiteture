// TYPE: CREATIONAL PATTERN

// Used to ensure that is a only instance of a class, for conflicts or global access

/* Use a private constructor, with a variable to determine if an instance was already created and a public method that
variable to create a object or return the already present object */

// Also uses Lazy Creation to create object only when needed

public class ExampleSingleton {
	private static ExampleSingleton uniqueInstance = null;

	private ExampleSingleton() {
	};

	public static ExampleSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("I'm a new example!");
			uniqueInstance = new ExampleSingleton();
		} else {
			System.out.println("I'm an old example!");
		}
		return uniqueInstance;
	}

	public static void main(String[] args) {
		ExampleSingleton newExampleSingleton = getInstance();
		ExampleSingleton oldExampleSingleton = getInstance();
	}

}
