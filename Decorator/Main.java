public class Main {
    public static void main(String[] args){

        // Un auto normal
        Car c = new Car() {
            @Override 
            public double getCost() {
                return 150000;
            }

            @Override
            public double getMaxVelocity(){
                return 200000;
            }
        };

        System.out.println("Normal car. Cost: " + c.getCost() + ". MaxVelocity: " + c.getMaxVelocity());

        // Se pasa el carro normal a la clase SportsCar para convertirlo en 
        // un auto deportivo agregandoles funcionalidad y costo
        c = new SportsCar(c);
        System.out.println("Sports car. Cost: " + c.getCost() + ". MaxVelocity: " + c.getMaxVelocity());
    }
}