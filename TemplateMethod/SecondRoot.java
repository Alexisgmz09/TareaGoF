// Esta clase cambia la implementacion del algoritmo de la formula general
// para obtener la segunda raiz de una ecuacion cuadratica
public class SecondRoot extends GeneralFormula {

    @Override
    protected double substractSumSquareRoot(double number1, double number2) {
        return number1 + number2;
    }
}