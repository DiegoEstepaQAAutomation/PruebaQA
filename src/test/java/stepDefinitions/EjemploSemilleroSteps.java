package stepDefinitions;

import Task.AgregarProducto;
import Task.BuscarProducto;
import UserInterfaces.DetalleArticulo;
import UserInterfaces.HomePAge;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static UserInterfaces.DetalleArticulo.LINK_BUTON_POPUP;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class EjemploSemilleroSteps

{

    @Managed(driver = "chrome")

    //CREAR LAS VARIABLES DEL NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor= Actor.named("Global");

    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePAge homePage = new HomePAge();
    private DetalleArticulo articulo = new DetalleArticulo();

    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccedeALaWebDeCompras()
    {
        actor.can(BrowseTheWeb.with(driver));

        driver.manage().window().maximize();


        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^el agrega unidades  de (.*) al carrito$")
    public void elAgregaUnProductoAlCarrito(String descripcion)
    {

        actor.wasAbleTo(BuscarProducto.conDescription(descripcion),
        AgregarProducto.catidad());

    }
    @Entonces("^el ve los productos en el carrito de compras$")
    public void elVeLosProductosEnElCarritoDeCompras()
    {
        actor.should(seeThat(the(LINK_BUTON_POPUP),isPresent()));
    }

    @Cuando("^el agrega un producto al carrito$")
    public void elAgregaUnProductoAlCarrito(List<String>datos)
    {
        actor.wasAbleTo(BuscarProducto.conDescription(datos.get(0)),
        AgregarProducto.catidad());

    }

    @Entonces("^el ve los productos en el carrito de compras de organizacion$")
    public void elVeLosProductosEnElCarritoDeCompraslista()
    {
        actor.should(seeThat(the(LINK_BUTON_POPUP),isPresent()));
    }


}
