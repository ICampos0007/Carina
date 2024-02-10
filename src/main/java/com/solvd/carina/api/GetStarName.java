package com.solvd.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetStarName extends AbstractApiMethodV2 {
    public GetStarName(String name) {
        super(null,"api/star/get_star_name.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("star_api_url"));
        replaceUrlPlaceholder("name", name);
        String apiKey = Configuration.getRequired("api_key");

        ignorePropertiesProcessor(NotStringValuesProcessor.class);
        addUrlParameter("X-Api-Key", apiKey);
    }
}
