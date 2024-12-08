package starter.steps;


import io.cucumber.java.Before;
import org.hamcrest.CoreMatchers;
import starter.question.loginisVisible;
import starter.task.loginTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.junit.Assert.assertEquals;

public class loginSteps {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) que al ingresar a la web")
    public void que_al_ingresar_a_la_web(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.HomePage());
        System.out.println("se ingreso al citio");
    }
    @When("se ingresa las credenciales \"([^\"]*)\" y \"([^\"]*)\"$")
    public void se_ingresa_las_credenciales_y(String username, String password) {
        withCurrentActor(
                loginTask.login(username,password)
        );
    }
    @Then("se valida la pantalla de bienvenida")
    public void se_valida_la_pantalla_de_bienvenida() {
        String mensaje = "Time at Work";
        theActorInTheSpotlight()
                .should(seeThat(loginisVisible.loginTrue(), everyItem(CoreMatchers.equalTo(mensaje))));

    }
}
