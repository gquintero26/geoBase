package starter.navigation;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class NavigateTo {

    public static Performable HomePage() {
        return Task.where("Open web",
                Open.browserOn().the(homePage.class));
    }
}
