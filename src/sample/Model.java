package sample;

/**
 * Created by Andrej on 23.10.2016.
 */
public class Model {

    public Double calculation(Double firstNumber, Double secondNumber, String operator){
        if(operator.equals("+")) return firstNumber + secondNumber;
        if(operator.equals("-")) return firstNumber - secondNumber;
        if(operator.equals("/")) return firstNumber / secondNumber;
        if(operator.equals("*")) return firstNumber * secondNumber;

        return 0.0;
    }

}
