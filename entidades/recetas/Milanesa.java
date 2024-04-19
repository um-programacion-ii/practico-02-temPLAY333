package entidades.recetas;

import entidades.Ingrediente;
import entidades.Receta;
import entidades.Utensilio;
import interfaces.Despensable;

import java.util.HashMap;
import java.util.Map;

public class Milanesa extends Receta {
    public Milanesa() {
        Map<String, Despensable> despensables = new HashMap<String, Despensable>();
        despensables.put("milanesa", new Ingrediente("milanesa", 1));
        despensables.put("aceita", new Ingrediente("aceite", 20));
        despensables.put("sarten", new Utensilio("sarten", 100));

        super.setTiempoCoccion(20);
        super.setDespensable(despensables);
        super.setPreparacion("Poner un poco de aceite en la sarten, fritar la milanesa de ambos lados. Cuidado que se puede quemar!!");
    }
}
