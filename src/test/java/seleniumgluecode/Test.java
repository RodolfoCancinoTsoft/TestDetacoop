package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();


    @Given("^El cliente se encuentra en la pagina de inicio de Detaccop$")
    public void el_cliente_se_encuentra_en_la_pagina_de_inicio_de_Detaccop() {

    }

    @When("^Hace click en el boton Uso adecuado de servicios financieros$")
    public void hace_click_en_el_boton_Uso_adecuado_de_servicios_financieros() {
        WebElement botonUsoServicioFinanciero = driver.findElement(By.xpath("//div[@data-id='7b19b69']"));
        botonUsoServicioFinanciero.click();
    }

    @Then("^Se visualiza PDF con informacion sobre el uso adecuado del servicio$")
    public void se_visualiza_PDF_con_informacion_sobre_el_uso_adecuado_del_servicio() {
        String resultadoEsperado = "https://www.detacoop.cl/wp-content/uploads/2024/07/USO-ADECUADO-1-.pdf";
        String resultadoActual = driver.getCurrentUrl();
        Assert.assertEquals(resultadoEsperado, resultadoActual);
        
    }


}
