import java.util.Scanner;

public class NombresDeFamiliares {
    public static void main(String[] args) {
        /*
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se
        le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

        N.es_A.ia_E.pe        */
        //R= leído, M = modificado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String primerNombreR = scanner.nextLine();
        String primerNombreM = primerNombreR.toUpperCase().charAt(1)+"."+ primerNombreR.substring(primerNombreR.length()-2).concat("_");

        System.out.println("Ingrese segundo nombre ");
        String segundoNombreR = scanner.nextLine();
        String segundoNombreM = segundoNombreR.toUpperCase().charAt(1) +"."+ segundoNombreR.substring(segundoNombreR.length()-2)+ "_";

        System.out.println("Ingrese el tercer nombre");
        String tercerNombreR = scanner.nextLine();
        String tercerNombreM = tercerNombreR.toUpperCase().charAt(1) +"."+ tercerNombreR.substring(tercerNombreR.length()-2);

        System.out.println(primerNombreM+segundoNombreM+tercerNombreM);

    }
}
