class Instrumento {
    protected String material;
    protected String color;
    public Instrumento(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public void afinar() {
        System.out.println("Afinando el instrumento...");
    }
}
class Aire extends Instrumento {
    protected String tipo;

    public Aire(String material, String color, String tipo) {
        super(material, color);
        this.tipo = tipo;
        System.out.println("Aire es una herencia de Instrumento.");
    }

    public void soplar() {
        System.out.println("Soplando el instrumento de aire...");
    }
}

class Quena extends Aire {

    protected String forma;

    public Quena(String material, String color, String tipo, String forma) {
        super(material, color, tipo);
        this.forma = forma;
        System.out.println("Quena es una herencia de Aire.");
    }

    @Override
    public void soplar() {
        System.out.println("Soplando la quena...");
    }
}

public class Main {
    public static void main(String[] args) {
        Quena miQuena = new Quena("Madera", "Marrón", "Flauta", "Cilíndrica");
        
        miQuena.afinar();
        miQuena.soplar();
        
        System.out.println("Material de la quena: " + miQuena.material);
        System.out.println("Color de la quena: " + miQuena.color);
        System.out.println("Tipo de la quena: " + miQuena.tipo);
        System.out.println("Forma de la quena: " + miQuena.forma);
    }
}
