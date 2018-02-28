// Clase abstracta para representar el tipo de llanta que se tendran los diferentes carros
public abstract class Tire {
    private String material;
    private double price;

    public Tire (String material, double price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial(){
        return this.material;
    }

    public double getPrice() {
        return this.price;
    }
}