package entidades.recetas;

import entidades.Ingrediente;
import entidades.Utensilio;
import entidades.Receta;
import interfaces.Despensable;

import java.util.HashMap;
import java.util.Map;

public class HuevoDuro extends Receta {
    public HuevoDuro() {
        Map<String, Despensable> despensables = new HashMap<String, Despensable>();
        despensables.put("huevo", new Ingrediente("huevo", 2));
        despensables.put("agua", new Ingrediente("agua", 500));
        despensables.put("olla", new Utensilio("olla", 100));

        super.setTiempoCoccion(10);
        super.setDespensable(despensables);
        super.setPreparacion("Hervir los huevos en agua durante 10 minutos.");
    }
}

