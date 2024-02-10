package com.solvd.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetWeatherCityName extends AbstractApiMethodV2 {
    public GetWeatherCityName(String city) {
        super(null,"api/weather/get_weather_by_city_name.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("weather_api_url"));
        replaceUrlPlaceholder("city", city);
        String apiKey = Configuration.getRequired("api_key");

        ignorePropertiesProcessor(NotStringValuesProcessor.class);
        addUrlParameter("X-Api-Key", apiKey);

    }
}
