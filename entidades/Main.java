package entidades;

import entidades.recetas.HuevoDuro;

public class Main {
    static Ingrediente tomate = new Ingrediente("tomate",10);
    static Ingrediente zanahoria = new Ingrediente("zanahoria",5);
    static Despensa alacena = new Despensa();
    static HuevoDuro huevoDuroSimple = new HuevoDuro();
    static Chef Ramsey = new Chef("Gordon Ramsey",5);
    static Ingrediente huevo = new Ingrediente("huevo",4);
    static Ingrediente agua = new Ingrediente("agua",400);

    public static void main(String[] args) {
        System.out.println(tomate.toString());
        System.out.println(zanahoria.toString());
        System.out.println("--------------------------");

        zanahoria.sacar(3);
        System.out.println(zanahoria);

        alacena.addDespensable(tomate);
        alacena.getIngrediente("tomate",3);
        System.out.println(tomate);

        alacena.addDespensable(zanahoria);
        alacena.getIngrediente("zanahoria",3);
        alacena.getIngrediente("tomate",10);
        System.out.println(alacena);
        System.out.println("--------------------------");

        System.out.println(huevoDuroSimple);
        System.out.println("--------------------------");

        System.out.println(Ramsey);
        alacena.addDespensable(huevo);
        alacena.addDespensable(agua);
        Ramsey.verificarIngredientes(alacena, huevoDuroSimple);
        Ramsey.cocinar(alacena,huevoDuroSimple);
    }
}
