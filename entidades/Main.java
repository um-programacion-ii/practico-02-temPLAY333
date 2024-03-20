package entidades;

public class Main {
    static Ingrediente tomate = new Ingrediente("tomate",9);
    static Ingrediente zanahoria = new Ingrediente("zanahoria",10);
    static Despensa alacena = new Despensa(new Ingrediente[2]);


    public static void main(String[] args) {
        System.out.println(tomate.toString());
        System.out.println(zanahoria.toString());

        zanahoria.sacar(3);
        System.out.println(zanahoria);

        alacena.addIngrediente(tomate);
        alacena.getIngrediente(tomate,3);
        System.out.println(tomate);

        alacena.addIngrediente(zanahoria);
        alacena.getIngrediente(zanahoria,3);
        alacena.getIngrediente(tomate,10);
        System.out.println(alacena);
    }
}
