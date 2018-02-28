public class ExpensiveCar extends Car {
    // Este es el metodo que se sobreescribe de carro para obtener una llanta mas cara
    @Override 
    public Tire tireFactory(){
        return new ExpensiveTire();
    }
}