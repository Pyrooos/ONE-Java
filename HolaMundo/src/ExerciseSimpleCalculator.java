import java.util.Scanner;

public class ExerciseSimpleCalculator {
    public static void main(String[] args) {
        char operator;
        double firstNumber, secondNumber, result;
        // create an object of Scanner class
        Scanner s = new Scanner(System.in);
        // here put your text or sign
        System.out.println("Choose the operator you need to work with +, -, *, /");
        operator= s.next().charAt(0);
        // here ask user, choose one number
        System.out.println("Enter a number");
        firstNumber= s.nextDouble();
        System.out.println("Enter a second number");
        secondNumber = s.nextDouble();

        switch (operator){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("result = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("result = " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("result = " + result);
                break;
            case '/':
                try {
                    result = firstNumber / secondNumber;
                    System.out.println("result = " + result);
                } catch (ArithmeticException e){
                    System.err.println("Operador no valido");
                }
                break;
            default:
                System.out.println("Invalid operator!" );
                break;
        }

    }
}
