package com.co.bancolombia.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Visible implements Question<Boolean> {
    private Target target;

    public Visible(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static Visible isOn(Target target) {
        return new Visible(target);
    }
}
