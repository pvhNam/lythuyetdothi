package WeatherStation1;

public class CurrentConditionsDisplay {
//	hien thi cac so do thopi tiet 
	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.setCurrentConditionsDisplay(this);
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();

	}

	public void display() {
		System.out.println(" current condition: " + temperature + "f degrees and " + humidity + "% humidity");
	}

}
