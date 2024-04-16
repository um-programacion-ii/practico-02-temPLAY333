package servicios;

import entidades.Despensa;
import entidades.Ingrediente;
import entidades.Receta;
import entidades.Utensilio;
import excepciones.StockInsuficiente;
import excepciones.VidaUtilInsifuciente;
import interfaces.Cocinable;
import interfaces.Despensable;

import java.util.Map;

public class CocinaService implements Cocinable {

    public void verficarIngredientes (Despensa despensa, Receta receta) {
        DespensaService despi = new DespensaService();
        try {
            despi.verificarDespensa(despensa, receta);
        } catch (VidaUtilInsifuciente | StockInsuficiente excep) {
            System.out.println(excep);
        }
    }

    public void cocinar (Despensa despensa, Receta receta) {
        System.out.println(receta.getPreparacion());

        for (Map.Entry<String, Despensable> entry : receta.getDespensables().entrySet()) {
            Despensable despReceta = entry.getValue();
            Despensable despDespensa = despensa.getDespensa().get(entry.getKey());

           if (despReceta instanceof Ingrediente && despDespensa instanceof Ingrediente) {
                Ingrediente ingredienteDespensa = (Ingrediente) despDespensa;
                System.out.println("Queda " + ingredienteDespensa.getCantidad() + " de " + ingredienteDespensa.getNombre());
            }
        }
    }
}
