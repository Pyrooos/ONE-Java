import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("cual es el promedio?");
        float promedio = s.nextFloat();

        if (promedio >= 9 && promedio <=10){
            System.out.println("Felicidades excelente promedio");
        } else if (promedio >= 8 && promedio <9) {
            System.out.println("Buen promedio");
        } else if (promedio >= 6 && promedio <7) {
            System.out.println("Necesitas esforzarte mas");
        } else if (promedio <6) {
            System.out.println("Reprobado, necesitas estudiar mas");
        }
        System.out.println("Tu promedio es: " + promedio);
        }

    }

