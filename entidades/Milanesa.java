package entidades;

public class Milanesa extends Receta{
    public Milanesa() {
        super(20,
                new Ingrediente[]{
                        new Ingrediente("milanesa", 1),
                        new Ingrediente("aceite", 20)},
                "Poner un poco de aceite en la sarten, fritar la milanesa de ambos lados. Cuidado que se puede quemar!!");
    }
}
