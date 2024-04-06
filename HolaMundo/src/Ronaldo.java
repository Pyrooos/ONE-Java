import java.util.Random;

public class Ronaldo {

    public static void main(String[] args) {

        Random random = new Random();
        int tamanoArreglo = 10;


        int[] resultado = new int[tamanoArreglo];


        for (int i = 0; i < tamanoArreglo; i++) {

            int numero = random.nextInt(100) + 1;

            if (numero == 0) {
                System.out.println("Se encontró un 0. Se suspende el ciclo.");
                break;
            }

            // Omitir números pares
            if (numero % 2 == 0) {
                System.out.println("Número par omitido: " + numero);
                continue;
            }

            resultado[i] = numero * numero;
        }

        System.out.println("Resultado final:");
        for (int num : resultado) {
            System.out.println(num);
        }
    }
}
