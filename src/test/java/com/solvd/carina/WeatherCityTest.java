package com.solvd.carina;

import com.solvd.carina.api.GetWeatherCityName;
import com.solvd.carina.bin.Weather;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class WeatherCityTest {
    @Test
    public void verifyGetWeatherByCityName() {
        Weather weather = new Weather();
        weather.setCity("London");

        GetWeatherCityName getWeatherCityName = new GetWeatherCityName(weather.getCity());
//        getWeatherCityName.addProperty("weather",weather);
        getWeatherCityName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherCityName.callAPI();
    }
}
