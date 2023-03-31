package StepDefinitations;

import Utilities.GrWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    @After
    public void after(){
        System.out.println("Scenario FINISHED !");

        GrWD.quitDriver();
    }
}
