package weather.forecast;

public class Yahoo implements Observer {
	private String name;

	
	public Yahoo(String name) {
		super();
		this.name = name;
	}


	@Override
	public void forecast(String name, boolean isRain) {
		if (isRain) {
			System.out.println("Yahoo " + this.name + " , location: " + name
					+ " is raining ...");
		} else {
			System.out.println("Yahoo " + this.name + " , location: " + name
					+ " is NOT raining ...");
		}

	}

}
