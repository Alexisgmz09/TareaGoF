import java.util.*;  

public abstract class Car {
	private final LinkedList<Tire> tires = new LinkedList<Tire>();  

    // Esta clase utiliza el factory method makeTire para instanciar una rueda dependiendo del tipo
    // de carro. Por eso es que los clases que dependen de esta clase deben sobreescribir el metodo para
    // escoger el tipo de rueda que tendra el carro
    public Car () {
        Tire tire1 = makeTire();
        Tire tire2 = makeTire();
        Tire tire3 = makeTire();
        Tire tire4 = makeTire();

        this.tires.add(tire1);
        this.tires.add(tire2);
        this.tires.add(tire3);
        this.tires.add(tire4);
    }

    public LinkedList<Tire> getTires() {
        return this.tires;
    }

    // Metodo a sobreescribir para el tipo de llanta, este es el factory method
    // ya que instancia diferentes llantas dependiendo de la implementacion
    abstract public Tire tireFactory();
}