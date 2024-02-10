package com.solvd.carina.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.utils.config.Configuration;

public class GetMusicNameAlbum extends AbstractApiMethodV2 {
    public GetMusicNameAlbum(String name, String album) {
        super(null, "api/music/get_music_by_artist_name_and_album_name.json");
        replaceUrlPlaceholder(null, Configuration.getRequired("music_api_url"));

        replaceUrlPlaceholder("name", name);
        replaceUrlPlaceholder("album", album);

        ignorePropertiesProcessor(NotStringValuesProcessor.class);

    }

}
