public class Main {
    public static void main (String[] args){
        double a = 10;
        double b = 40;
        double c = 20;

        double firstRoot = new FirstRoot().getRoot(10, 40, 20);
        double secondRoot = new SecondRoot().getRoot(10, 40, 20);

        System.out.println("First Root: " + firstRoot);
        System.out.println("Second Root: " + secondRoot);
    }
}