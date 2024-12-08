package starter.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.loginPO;

import java.util.Collection;

import static net.serenitybdd.core.Serenity.getDriver;

public class loginisVisible {

    public static Question<Collection<String>> loginTrue() {
        return Text.ofEach(loginPO.TextDashboard).describedAs("Validar login exitoso");
    }
}
