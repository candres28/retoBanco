package com.co.bancolombia.reto.tasks;

import com.co.bancolombia.reto.userinterfaces.Navbar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.bancolombia.reto.userinterfaces.Navbar.*;

public class OptionObjetos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SERVICIOS)
                        ,Click.on(INFORMACION_VIAJAERO)
                        ,Click.on(OBJETOS_EXTRAVIADOS));
    }

    public static OptionObjetos extraviados(){
        return Tasks.instrumented(OptionObjetos.class);
    }
}
