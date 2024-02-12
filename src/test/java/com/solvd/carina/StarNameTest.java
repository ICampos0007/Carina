package com.solvd.carina;

import com.solvd.carina.api.GetStarName;
import com.solvd.carina.bin.Star;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class StarNameTest {
    @Test(enabled = false)
    public void verifyGetStarByName() {
        Star star = new Star();
//        Change to an invalid star name for it to fail
//        To check different star name you can use Vega
        star.setName("Vega");

        GetStarName getStarName = new GetStarName(star.getName());
        getStarName.addProperty("star", star);
        getStarName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getStarName.callAPI();

    }
}
