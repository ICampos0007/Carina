package com.solvd.carina.api;

import com.solvd.carina.api.GetCityName;
import com.solvd.carina.bin.City;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class CityNameTest {
    @Test(enabled = false)
    public void verifyGetCityByName() {
        City city = new City();
//        Set the name to a fake city for test to fail
        city.setName("Los Angeles");
//        city.setLatitude(37.7562);
//        city.setLongitude(-122.443);
//        city.setCountry("US");
//        city.setPopulation(3592294);
//        city.setCapital();

        GetCityName getCityName = new GetCityName(city.getName());
//        getCityName.addProperty("city",city);

        getCityName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCityName.callAPI();

    }
}
