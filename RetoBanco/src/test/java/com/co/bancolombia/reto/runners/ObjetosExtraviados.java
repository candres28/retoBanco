package com.co.bancolombia.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/objectos_extraviados.feature"
        , snippets = SnippetType.CAMELCASE
        , glue = "com.co.bancolombia.reto.stepdefinitions")
public class ObjetosExtraviados {
}
