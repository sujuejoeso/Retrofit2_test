package com.joeso.retrofit2test;

public class WeatherForecast {
    private String Date;

    private String getDate() {
        return Date;
    }

    private void setDate(String date) {
        Date = date;
    }

    private String getTemperatureC() {
        return TemperatureC;
    }

    public void setTemperatureC(String temperatureC) {
        TemperatureC = temperatureC;
    }

    public String getTemperatureF() {
        return TemperatureF;
    }

    public void setTemperatureF(String temperatureF) {
        TemperatureF = temperatureF;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String TemperatureC;
    public String TemperatureF;
    public String Summary;
}
