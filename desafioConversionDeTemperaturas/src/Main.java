import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //This program is a small challenge where I test my skills.
        /*
                Instructions:
                
                write a program that converts degrees Celsius to Fahrenheit
                the program should use variables to represent the values of temperatures and print the converted value from Celsius to Fahrenheit on console.
                The result should only show the temperature without decimals.
                Advice: the formula to converts degrees Celsius to Fahrenheit is: (temp*1.8)+32.
                */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the temperature in degrees celsius "  );
        String tempStr = scanner.nextLine();
        double temp = Double.parseDouble(tempStr);
        double result =  (temp*1.8)+32;
        int resultWithoutDecimals = (int) result;
        System.out.println("Converted temperature in Fahrenheit:   " + resultWithoutDecimals+ "°F");

    }
}
