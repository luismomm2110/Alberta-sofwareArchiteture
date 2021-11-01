// Common interface to products

public interface Knife {
	String cut();
	String doTricks(); 
	void sharp();
}

// Concrete product 1
public class WoodKnife  implements Knife {
	public String cut() {
		return "I'm useless for cut";
	}
	public String doTricks() {
		return "Hi! this is safe";
	}
} 

// Concrete product 2
public class ChefKnife implements Knife {
	public String cut() {
		return "Let's cut this onion (but I can't stop you of crying)";
	}
	public String doTricks() {
		return "Are you crazy? this is dangerous";
	}
}

// As we can see, each subclass implement its own version of the interface 

// Factory class, have some core business common to all classes
public abstract class OrderKnife {
	public void showKnife() {
		Knife knife = createKnife();
		knife.sharp();
		knife.cut();
		knife.doTricks();
	}

	public abstract Knife createKnife();
}

// Concrete creator 

public class OrderWoodKnife extends OrderKnife {
	// return its own woodKnife
	@Override 
	public Knife createKnife() {
		return new WoodKnife();
	}
}

public class OrderChefKnife extends OrderKnife {
	// return its own ChefKnife
	@Override 
	public Knife createKnife() {
		return new ChefKnife();
	}
}

public class Store {
	private static OrderKnife orderKnife;

	public static void main(String[] args) {
		
		chooseKnife("wood");
		chooseKnife("chef");
	}

	static void chooseKnife(String typeKnife) {
		if (typeKnife.equals("wood")) {
			orderKnife = new OrderWoodKnife();
		} else if (typeKnife.equals("chef")) {
			orderKnife = new OrderChefKnife();
		}

		orderKnife.showKnife();
	}

}