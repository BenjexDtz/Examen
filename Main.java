// Clase Instrumento
class Instrumento {
    // Atributos
    protected String material;
    protected String color;
    
    // Constructor
    public Instrumento(String material, String color) {
        this.material = material;
        this.color = color;
    }
    
    // Métodos
    public void afinar() {
        System.out.println("Afinando el instrumento...");
    }
}

// Clase Aire que hereda de Instrumento
class Aire extends Instrumento {
    // Atributo
    protected String tipo;

    // Constructor
    public Aire(String material, String color, String tipo) {
        super(material, color);
        this.tipo = tipo;
        System.out.println("Aire es una herencia de Instrumento.");
    }

    // Método
    public void soplar() {
        System.out.println("Soplando el instrumento de aire...");
    }
}

// Clase Quena que hereda de Aire
class Quena extends Aire {
    // Atributo
    protected String forma;

    // Constructor
    public Quena(String material, String color, String tipo, String forma) {
        super(material, color, tipo);
        this.forma = forma;
        System.out.println("Quena es una herencia de Aire.");
    }

    // Método
    @Override
    public void soplar() {
        System.out.println("Soplando la quena...");
    }
}

// Clase principal para probar el código
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
