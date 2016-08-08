package weather.forecast;

public class Google implements Observer {
	private String name;
	
	

	public Google(String name) {
		super();
		this.name = name;
	}



	@Override
	public void forecast(String name, boolean isRain) {
		if (isRain) {
			System.out.println("Google " + this.name + " , location: " + name
					+ " is raining ...");
		} else {
			System.out.println("Google " + this.name + " , location: " + name
					+ " is NOT raining ...");
		}

	}

}
