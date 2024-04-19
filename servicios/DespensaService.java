package servicios;

import java.util.Map;

import entidades.Despensa;
import entidades.Ingrediente;
import entidades.Receta;
import entidades.Utensilio;
import excepciones.StockInsuficiente;
import excepciones.VidaUtilInsifuciente;
import interfaces.Despensable;

public class DespensaService {

    public String verificarDespensa(Despensa despensa, Receta receta) throws VidaUtilInsifuciente,StockInsuficiente {
        for (Map.Entry<String, Despensable> entry : receta.getDespensables().entrySet()) {
            String nombreDespensable = entry.getKey();
            Despensable despReceta = entry.getValue();
            Despensable despDespensa = despensa.getDespensa().get(nombreDespensable);

            if (despReceta instanceof Ingrediente && despDespensa instanceof Ingrediente) {
                Ingrediente ingredienteReceta = (Ingrediente) despReceta;
                Ingrediente ingredienteDespensa = (Ingrediente) despDespensa;
                if (ingredienteDespensa.getCantidad() < ingredienteReceta.getCantidad()) {
                    throw new StockInsuficiente();
                }
            } else if (despReceta instanceof Utensilio && despDespensa instanceof Utensilio) {
                Utensilio utensilioReceta = (Utensilio) despReceta;
                Utensilio utensilioDespensa = (Utensilio) despDespensa;
                if (utensilioDespensa.getVidaUtil() < utensilioReceta.getVidaUtil()) {
                    throw new VidaUtilInsifuciente();
                }
            } else {
                return "En la despensa no hay ninguno de los despensables necesarios";
            }
        }
        return "Despensables verificados con exito!!";
    }

    public void renovarUtensilios (Utensilio utensilio) {
        if (utensilio.getVidaUtil() == 0) {
            utensilio.setVidaUtil(20);
        } else {
            System.out.println("El utensilio aun se puede utilizar");
        }
    }
}
