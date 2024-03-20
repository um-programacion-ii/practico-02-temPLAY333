package entidades;

public class Main {
    static Ingrediente tomate = new Ingrediente("tomate",10);
    static Ingrediente zanahoria = new Ingrediente("zanahoria",5);
    static Ingrediente huevo = new Ingrediente("huevo",6);
    static Ingrediente agua = new Ingrediente("agua",100);
    static Despensa alacena = new Despensa(new Ingrediente[4]);
    static HuevoDuro huevoDuroSimple = new HuevoDuro(600,new Ingrediente[] {huevo, agua},"Poner el huevo a hervir durante 10 minutos");

    public static void main(String[] args) {
        System.out.println(tomate.toString());
        System.out.println(zanahoria.toString());
        System.out.println("--------------------------");

        zanahoria.sacar(3);
        System.out.println(zanahoria);

        alacena.addIngrediente(tomate);
        alacena.getIngrediente(tomate,3);
        System.out.println(tomate);

        alacena.addIngrediente(zanahoria);
        alacena.getIngrediente(zanahoria,3);
        alacena.getIngrediente(tomate,10);
        System.out.println(alacena);
        System.out.println("--------------------------");

        System.out.println(huevoDuroSimple);
    }
}
