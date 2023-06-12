package org.campusmolndal;

public class WeatherForecast {


    private final String city;
    private final String temp;
    private final boolean isRaining;


    public WeatherForecast(String city, String temp, boolean isRaining) {
        this.city = city;
        this.temp = temp;
        this.isRaining = isRaining;
    }

    public String getCity() {
        return city;
    }

    public String getTemp() {
        return temp;
    }

    public boolean isRaining() {
        return isRaining;
    }

    @Override
    public String toString() {
        return "\nCurrent Weather: " +
                "\nCity: " + this.city +
                "\nTemperature: " + this.temp + " Degrees Celsius" +
                "\nIs it raining?: " + this.isRaining;
    }
}


