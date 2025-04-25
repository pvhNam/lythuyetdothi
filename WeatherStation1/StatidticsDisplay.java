package WeatherStation1;

import java.awt.DisplayMode;

public class StatidticsDisplay {
// hiemn thi gia tri trung binh cuc tieu cuc dai cua moi so sdo thoi tiet
	private float maxtemp;
	private float mintemp;
	private float tempsum;
	private int numreading;
	private WeatherData weatherData;

	public StatidticsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.setStatisticsDisplay(this);
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		tempsum += temp;
		numreading++;
		if(temp > maxtemp) maxtemp = temp;
		if(temp< mintemp) mintemp = temp;
		display();
		
	}
	public void display() {
		System.out.println("avg/max/min tempreture= "+ (tempsum/numreading)+"/" +maxtemp+"/"+mintemp);
	}

}
