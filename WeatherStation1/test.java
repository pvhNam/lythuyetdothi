package WeatherStation1;

public class test {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatidticsDisplay statisticsDisplay = new StatidticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("------------------------");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("------------------------");
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
