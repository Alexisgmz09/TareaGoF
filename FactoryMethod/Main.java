public class Main {
    public static void main(String[] args){
        
        // Aqui se prueban las diferentes llantas, el carro caro tendra llantas caras 
        // y el carro barato tendra llantas baratas
        ExpensiveCar expensiveCar = new ExpensiveCar();
        CheapCar cheapCar = new CheapCar();

        System.out.println("ExpensiveCar tires: ");
        for(Tire tire : expensiveCar.getTires()){
            System.out.println(tire.getMaterial() + ":" + tire.getPrice());
        }

        System.out.println("\nCheapCar tires: ");
        for(Tire tire : cheapCar.getTires()){
            System.out.println(tire.getMaterial() + ":" + tire.getPrice());
        }
    }
}