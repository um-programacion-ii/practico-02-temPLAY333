package entidades;

public class Pizza extends Receta{
    public Pizza() {
        super(60,
                new Ingrediente[]{
                        new Ingrediente("harina",1000),
                        new Ingrediente("levadura",50),
                        new Ingrediente("aceite",50),
                        new Ingrediente("Agua",600),
                        new Ingrediente("sal", 2),
                        new Ingrediente("azucar", 1)},
                "Prepara la mezcla, amasa amasa amasa, 10 minutos al horno, y tal cual");
    }
}
