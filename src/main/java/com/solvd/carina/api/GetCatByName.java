package com.solvd.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;


public class GetCatByName extends AbstractApiMethodV2 {
    public GetCatByName(String name) {
        super(null, "api/cats/get_cat.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("cat_api_url"));
        replaceUrlPlaceholder("name", name);
        String apiKey = Configuration.getRequired("api_key");

        ignorePropertiesProcessor(NotStringValuesProcessor.class);
        addUrlParameter("X-Api-Key", apiKey);


    }

}
