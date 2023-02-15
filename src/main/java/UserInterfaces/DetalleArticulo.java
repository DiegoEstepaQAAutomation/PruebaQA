package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class DetalleArticulo extends PageObject
{
    public static final Target LINK_BUTON_CARRO =Target.the("SELECCIONAR COOKIE").located(By.xpath("//button[@class = 'andes-button andes-button--quiet']"));


    public static final Target LINK_BUTON_POPUP = Target.the("VALIDA POPUP").located(By.xpath("//div[@class = 'andes-card andes-card--flat andes-card--default center-card__body center-card__body--reduced center-card__body--centered andes-card--padding-default']"));




    ////div[@class = 'andes-card andes-card--flat andes-card--default center-card__body center-card__body--reduced center-card__body--centered andes-card--padding-default']

}
