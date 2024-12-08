package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.loginPO;
public class loginTask {

    public static Performable login(String username, String password){
        return Task.where("Se ingresa las credenciales al sitio web",
                Enter.theValue(username).into(loginPO.InputUserName),
                Enter.theValue(password).into(loginPO.InputPassword),
                Click.on(loginPO.btnLogin)
        );
    }
}
