package WeatherStation1;

public class ForecastDisplay {
// du bao thoi tiet don gian 
	private float currentPressure = 29.9f;
	private float lastPressure;
	private WeatherData weatherDate;

	public ForecastDisplay(WeatherData weatherDate) {
		super();
		this.weatherDate = weatherDate;
		weatherDate.setForecastDisplay(this);
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();

	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
