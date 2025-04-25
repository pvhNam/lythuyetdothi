package WeatherStation1;

public class WeatherData {
	private CurrentConditionsDisplay currentConditionsplay;
	private StatidticsDisplay StatidticsDisplay;
	private ForecastDisplay forecastDisplay;
	private float temperture;
	private float humidity;
	private float pressure;
	private float temperature;

	public float getTemperture() {
		return temperture;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public WeatherData() {
		this.temperture = temperture;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public void measurementsChanged() {
		float temp = getTemperture();
		float humidity = getHumidity();
		float pressure = getPressure();
		currentConditionsplay.update(temp, humidity, pressure);
		StatidticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void setCurrentConditionsDisplay(CurrentConditionsDisplay currentConditionsDisplay) {
		this.currentConditionsplay = currentConditionsDisplay;
	}

	public void setStatisticsDisplay(StatidticsDisplay StatidticsDisplay) {
		this.StatidticsDisplay = StatidticsDisplay;
	}

	public void setForecastDisplay(ForecastDisplay forecastDisplay) {
		this.forecastDisplay = forecastDisplay;
	}
}
