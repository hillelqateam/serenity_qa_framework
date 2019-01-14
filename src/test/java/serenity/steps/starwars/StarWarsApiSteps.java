package serenity.steps.starwars;

import core.ws.AbstractWsConfiguration;
import dto.AllStarWarsUsers;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;

public class StarWarsApiSteps extends AbstractWsConfiguration {

    private static final String SERVER_BASE_URL = "https://swapi.co/api";
    private static final String ALL_USERS_PATH = "/people/";

    @Step
    public AllStarWarsUsers getAllUsers() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(ALL_USERS_PATH).as(AllStarWarsUsers.class);
    }

    public static void main(String[] args) {
        final StarWarsApiSteps steps = new StarWarsApiSteps();
        final AllStarWarsUsers allUsers = steps.getAllUsers();
    }
}
