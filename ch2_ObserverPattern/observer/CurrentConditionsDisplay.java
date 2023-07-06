package observer;

import subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, WeatherDisplay {
    private float temperature;
    private float humidity;
    private WeatherData weatherData; // 내가 등록한 Subject

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // Subject 의 Observer 로 등록
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}