package weather.forecast;

import java.util.ArrayList;
import java.util.List;

public class ClientObserver {
	private String name;
	private boolean isRain;
	private List<Observer> observers = new ArrayList<Observer>();

	public ClientObserver(String name, boolean isRain) {
		super();
		this.name = name;
		this.isRain = isRain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRain() {
		return isRain;
	}

	public void setRain(boolean isRain) {
		this.isRain = isRain;
		for (Observer list : observers) {
			list.forecast(this.name, this.isRain);
		}

	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void addObserverStation(Observer observer) {

		observers.add(observer);
	}

}
