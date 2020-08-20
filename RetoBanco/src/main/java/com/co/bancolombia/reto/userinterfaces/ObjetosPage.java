package com.co.bancolombia.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ObjetosPage {

    public static Target PDF_OBJETOS = Target.the("option select pdf politicas de objetos extraviados")
            .locatedBy("(//a//img[@alt='pdf'])[1]");

}
