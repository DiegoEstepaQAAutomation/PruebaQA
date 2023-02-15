package Task;

import Interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UserInterfaces.DetalleArticulo.LINK_BUTON_CARRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task
{



    public AgregarProducto()
    {

    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(Click.on(LINK_BUTON_CARRO),//SELECCIONAR COLOR
                TiempoEspera.unMomento(30),
                Enter.theValue().into(), //INGRESA EL VALOR A BUSCAR
                Click.on(),
                Click.on());

    }

    public static AgregarProducto catidad()
    {
        return  instrumented(AgregarProducto.class);
    }
}
