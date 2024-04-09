package servicios;

import entidades.Despensa;
import entidades.Ingrediente;
import entidades.Receta;

public class CocinaService {

    public String verficarIngredientes (Despensa despensa, Receta receta) {
        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            boolean encontrado = false;
            for (Ingrediente ingredienteDespensa : despensa.getDespensa()) {
                if (ingredienteReceta.getNombre().equals(ingredienteDespensa.getNombre())) {
                    if (ingredienteDespensa.getCantidad() >= ingredienteReceta.getCantidad()) {
                        encontrado = true;
                        break;
                    } else {
                        return "Falta " + (ingredienteReceta.getCantidad()-ingredienteDespensa.getCantidad()) + " de " +
                        ingredienteReceta.getNombre();
                    }
                }
            }
            if (!encontrado) {
                return "En la despensa no hay ninguno de los ingredientes necesarios";
            }
        }
        return "Ingredientes verificados con exito!!";
    }

    public void cocinar (Despensa despensa, Receta receta) {
        System.out.println(receta.getPreparacion());
        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            despensa.getIngrediente(ingredienteReceta, ingredienteReceta.getCantidad());
            System.out.println(ingredienteReceta);
        }
    }
}
