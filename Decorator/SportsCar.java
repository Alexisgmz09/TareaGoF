// Este carro agrega velocidad y costo al carro que se pasa como argumento al decorador
public class SportsCar extends CarDecorator {
    
    public SportsCar(Car c) {
        super(c);
    }

    // Se le agrega costo al carro actual
    @Override
    public double getCost() {
        return super.getCost() + 130000;
    }

    // Se le agrega velocidad al carro actual
    @Override
    public double getMaxVelocity() {
        return super.getMaxVelocity() + 100000;
    }
}