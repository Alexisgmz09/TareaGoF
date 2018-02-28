public class CheapCar extends Car {
    
    // Este es el metodo que sobreescribe para escoger el tipo de llanta
    // En este caso, el tipo de llanta es la barata porque este carro es el barato
    @Override 
    public Tire tireFactory() {
        return new CheapTire();
    }
}