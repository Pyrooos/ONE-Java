import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);
        String estado = variable;
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;


        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese calificacion de matematicas entre 0 - 10.0" );
        matematicas = s.nextDouble();

        System.out.println("Ingrese calificacion de ciencias entre 0 - 10.0" );
        ciencias = s.nextDouble();

        System.out.println("Ingrese calificacion de historia entre 0  - 10.0" );
        historia = s.nextDouble();
        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);
        estado = promedio >=5.99 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
