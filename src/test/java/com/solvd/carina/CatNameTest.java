package com.solvd.carina;

import com.solvd.carina.api.GetCatByName;
import com.solvd.carina.bin.Cat;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;



public class CatNameTest {
    @Test(enabled = false)
    public void verifyGetCatByNameTest() {
        Cat cat = new Cat();
        cat.setLength("17 to 21 inches, not including tail");
        cat.setOrigin("Riverside, California, USA");
        cat.setImageLink("https://api-ninjas.com/images/cats/ragdoll_cats.jpg");
        cat.setFamilyFriendly(5);
        cat.setShedding(4);
        cat.setGeneralHealth(3);
        cat.setPlayfulness(4);
        cat.setMeowing(4);
        cat.setChildFriendly(5);
        cat.setGrooming(1);
        cat.setIntelligence(4);
        cat.setOtherPetsFriendly(4);
        cat.setMinWeight(10);
        cat.setMaxWeight(20);
        cat.setMinLifeExpectancy(12);
        cat.setMaxLifeExpectancy(17);
//        Set the name to an invalid cat name and test will fail.
//        Change to Siamese Cats for different result
        cat.setName("Ragdoll Cats");


        GetCatByName getCatByName = new GetCatByName(cat.getName());
        getCatByName.addProperty("cat", cat);
        getCatByName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCatByName.callAPI();


        getCatByName.validateResponse();
    }
}
