package weather.forecast;

public class ForecastStation implements Observer {
	private String name;

	public ForecastStation(String name) {
		super();
		this.name = name;
	}

	@Override
	public void forecast(String name, boolean isRain) {
		if (isRain) {
			System.out.println("Station " + this.name + " , location: " + name
					+ " is raining ...");
		} else {
			System.out.println("Station " + this.name + " , location: " + name
					+ " is NOT raining ...");
		}

	}

}
