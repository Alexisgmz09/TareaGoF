// Clase para obtener la formula general 
public abstract class GeneralFormula{

    public GeneralFormula() {
    
    }

    public double getRoot(double a, double b, double c){
        return templateMethod(a, b, c);
    }

    // Metodo que implementa los pasos del algoritmo para obtener una raiz 
    // de la formula general
    private double templateMethod(double a, double b, double c){
        double resultInsideSquareRoot = getResultInsideSquareRoot(a, b, c);
        double squareRootResult = getSquareRoot(resultInsideSquareRoot);
        double changedB = changeSign(b);
        double topResult = substractSumSquareRoot(changedB, squareRootResult);
        double result = divide(topResult, 2*a);
        return result;
    }

    protected double getResultInsideSquareRoot(double a, double b, double c) {
        return b*b - ( 4 * a * c);
    }

    protected double getSquareRoot(double number){
        return Math.sqrt(number);
    }

    protected double changeSign(double number) {
        return number * -1.0;
    }

    // Metodo que cambia dependiendo si se necesita la primera o segunda raiz 
    // de la ecuacion cuadratica
    abstract protected double substractSumSquareRoot(double number1, double number2);

    protected double divide(double number1, double number2){
        return number1 / number2;
    }
}