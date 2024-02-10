package com.solvd.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetCityName extends AbstractApiMethodV2{
    public GetCityName(String name) {
        super(null,"api/city/get_city_name.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("city_api_url"));
        replaceUrlPlaceholder("name", name);
        String apiKey = Configuration.getRequired("api_key");

        ignorePropertiesProcessor(NotStringValuesProcessor.class);
        addUrlParameter("X-Api-Key", apiKey);
    }

}
