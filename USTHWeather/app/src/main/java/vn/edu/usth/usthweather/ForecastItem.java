package vn.edu.usth.usthweather;

public class ForecastItem {
    int day;
    int weather_icon;
    int temperature;
    int weather;

    public ForecastItem(int day, int weather_icon, int temperature, int weather) {
        this.day = day;
        this.weather_icon = weather_icon;
        this.temperature = temperature;
        this.weather = weather;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getWeather_icon() {
        return weather_icon;
    }

    public void setWeather_icon(int weather_icon) {
        this.weather_icon = weather_icon;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }
}
