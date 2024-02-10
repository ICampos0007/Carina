package com.solvd.carina;

import com.solvd.carina.api.GetMusicNameAlbum;
import com.solvd.carina.bin.Music;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class MusicNameTest {
    @Test
    public void verifyMusicNameAndAlbumTest() {
        Music music = new Music();
        music.setName("Tate McRae");
        music.setAlbum("greedy");

        GetMusicNameAlbum getMusicNameAlbum = new GetMusicNameAlbum(music.getName(), music.getAlbum());
        getMusicNameAlbum.addProperty("music", music);
        getMusicNameAlbum.expectResponseStatus(HttpResponseStatusType.OK_200);

        getMusicNameAlbum.callAPI();


    }
}
