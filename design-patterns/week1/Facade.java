import java.math.BigDecimal;

// create a facade for classes which costumer will use 

public interface IRole {

	int lifeScore; 
	int xAxisPosition;
	int yAxisPosition;
	String name;

	public int hit();
	public void walk(int dx, int y);
	public void sufferHit(int damage);
	public String getName();
}

public class Wizard implements IRole {
	
	int lifeScore = 20; 
	int xAxisPosition;
	int yAxisPosition;

	public int hit() {
		return 1;
	}

	public void walk(int dx, int dy) {
		this.xAxisPosition = this.xAxisPosition + dx;
		this.yAxisPosition = this.yAxisPosition + dy;
	}


	public void sufferHit(int damage) {
		this.lifeScore = this.lifeScore - lifeScore;
	}
	


}


public class Warrior implements IRole {
	
	int lifeScore = 50; 

	public int hit() {
		return 5;
	}

	public void walk();

}
