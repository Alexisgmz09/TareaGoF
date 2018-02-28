// Esta es la clase que decora al carro, es decir, le agrega funcionalidad
public abstract class CarDecorator implements Car {
    // El carro a decorar se guarda en esta variable, esto para agregar funcionalidad
    // a la funcionalidad ya existente del carro
    protected final Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }
    
    // Por defecto, se toma la funcionalidad ya implementada en el carro
    @Override
    public double getCost() {
        return decoratedCar.getCost();
    }

    // Por defecto, se toma la funcionalidad ya implementada en el carro
    @Override
    public double getMaxVelocity() {
        return decoratedCar.getMaxVelocity();
    }
}