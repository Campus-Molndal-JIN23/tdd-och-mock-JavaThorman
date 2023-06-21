package org.campusmolndal;



public class WeatherService {
    private WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public String getWeatherData(WeatherForecast forecast) {
        return weatherAPI.getWeatherData(forecast);
    }
}



