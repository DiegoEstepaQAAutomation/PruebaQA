package Task;

import Interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static UserInterfaces.HomePAge.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task
{
    private String descripcion;




    public BuscarProducto(String descripcion)
    {


        this.descripcion = descripcion;


    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo
                (
                        Enter.theValue(descripcion).into(LINK_SELECCIONAR_BUSQUEDA), //RECIBIR UN VALOR,DILIGENCIA UN CAMPO
                Hit.the(Keys.ENTER).into(LINK_SELECCIONAR_BUSQUEDA),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                        TiempoEspera.unMomento(5),
                        Click.on(LINK_BUTON_AUTOMAN),
                        TiempoEspera.unMomento(5),
                        Click.on(LINK_BUTON_MICROFONO),
                        TiempoEspera.unMomento(5),//ALERTA
                        Click.on(LINK_BUTON_COOKIE),
                        TiempoEspera.unMomento(30));




    }


    public static BuscarProducto conDescription(String descripcion)
    {

        return instrumented(BuscarProducto.class,descripcion);


    }
}
