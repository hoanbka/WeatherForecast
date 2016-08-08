package weather.forecast;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Google google = new Google("Hawai");
		ForecastStation f = new ForecastStation("Hanoi station");

		ClientObserver test = new ClientObserver("Saigon", false);
		test.addObserverStation(google);
		test.addObserverStation(f);

		test.setRain(true);

		Yahoo yh = new Yahoo("Washington");
		test.addObserverStation(yh);
		System.out.println("===========================");
		test.setRain(false);

	}

}
