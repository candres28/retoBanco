package com.co.bancolombia.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Navbar {

    public static Target SERVICIOS = Target.the("option select servicios")
            .locatedBy("//a[text()='SERVICIOS']");

    public static Target INFORMACION_VIAJAERO = Target.the("option select informacion viajero")
            .locatedBy("//a[contains(text(),'del Viajero')]");

    public static Target OBJETOS_EXTRAVIADOS = Target.the("option select objetos extraviado")
            .locatedBy("//a[text()='Objetos Extraviados']");
}
