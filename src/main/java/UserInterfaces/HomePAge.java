package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.mercadolibre.com.co/")
public class HomePAge extends PageObject
{
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA

    public static final Target LINK_SELECCIONAR_BUSQUEDA =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").located(By.xpath("//input[@class = 'nav-search-input']"));

    public static final Target LINK_SELECCIONAR_PRODUCTO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").locatedBy("// button[@class = 'nav-search-btn ] ");

    public static final Target LINK_SELECCIONAR_CARRITO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").locatedBy("p[@id='mlCategory']");


    public static final Target LINK_BUTON_AUTOMAN =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").located(By.xpath("/html/body/div[3]/div/div/div[2]/div/button"));


    public static final Target LINK_BUTON_COOKIE =Target.the("SELECCIONAR COOKIE").located(By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]"));



    public static final Target LINK_BUTON_MICROFONO =Target.the("SELECCIONAR COOKIE").located(By.xpath("//*[@class = 'ui-search-item__title']"));


    ////*[@class = 'ui-search-item__title']

    ////p[@id='mlCategory']

    //body/main[@id='root-app']/div[1]/div[1]/section[1]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/a[1]/h2[1]





}



