import java.util.Scanner;
/*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
   Podría ser utilizando operador ternario.*/
public class EjercicioOrdenMayorAMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1= s.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = s.nextInt();

        String maxN = (num1 > num2) ? num1 + " mayor que " + num2 : num2 + " mayor que " + num1; //(num1 > num2)? num1 + : num2;

        System.out.println(" = " + maxN);

    }
}
