import java.util.ArrayList;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}

public class Channel implements Subject {
	private ArrayList<Observer> observers; 
	private String channelName;
	private String status; 
  
	public Channel(String channelName, String status) {
		this.status = status;
		this.channelName = channelName;
		this.observers = new ArrayList<Observer>();
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;  
	}
    
	// Implements abscract methods of subject 

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observers.map(x -> x.notify());
	}	

}





Observer.java

public interface Observer {
	public void update(String status);
}






public class Follower implements Observer {

	private String followerName; 

	public Follower(String followerName) {
		this.followerName = followerName;
	}

	@Override
	public void update(String update) {
		System.out.println(update);
	}

	public void play() {}





V
}