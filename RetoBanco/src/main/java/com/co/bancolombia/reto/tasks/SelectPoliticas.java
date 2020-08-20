package com.co.bancolombia.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.bancolombia.reto.userinterfaces.ObjetosPage.*;

public class SelectPoliticas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PDF_OBJETOS));
    }

    public static SelectPoliticas downoloadPdf(){
        return Tasks.instrumented(SelectPoliticas.class);
    }
}
