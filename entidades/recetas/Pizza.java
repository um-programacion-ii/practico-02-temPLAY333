package entidades.recetas;

import entidades.Ingrediente;
import entidades.Receta;
import entidades.Utensilio;
import interfaces.Despensable;

import java.util.HashMap;
import java.util.Map;

public class Pizza extends Receta {
    public Pizza() {
        Map<String, Despensable> despensables = new HashMap<String, Despensable>();
        despensables.put("harina", new Ingrediente("harina",1000));
        despensables.put("levadura", new Ingrediente("levadura", 50));
        despensables.put("aceita", new Ingrediente("aceite",50));
        despensables.put("agua", new Ingrediente("agua",600));
        despensables.put("sal", new Ingrediente("sal", 20));
        despensables.put("bol", new Utensilio("bol", 100));

        super.setTiempoCoccion(20);
        super.setDespensable(despensables);
        super.setPreparacion("Prepara la mezcla, amasa amasa amasa, 10 minutos al horno, y tal cual");
    }
}
