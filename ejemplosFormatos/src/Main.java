// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int valor1 = 5 ;//Atribuye el valor 5 a la variable valor
        int valor2 =10;
        valor2 += 10;//Equivalente al valor = valor + 10, atribuye el valor 10 a la variable valor

        System.out.println("valor 1 = " + valor1);
        System.out.println("valor 2 = " + valor2);

        int a = 10 + 5; // Atribuye el valor 15 a la variable a
        int b = 10 - 5; // Atribuye el valor 5 a la variable b
        int c = 10 * 5; // Atribuye el valor 50 a la variable c
        int d = 10 / 5; // Atribuye el valor 2 a la variable d
        int e = 10 % 3; // Atribuye el valor 1 a la variable, ya que (el resto de la división de 10 por 3 es 1)

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int f = 10; // Atribui o valor 10 a variable f
        int g = 5; // Atribui o valor 5 a variable g
        int h = 30; // Atribui o valor 30 a variable h

        boolean igual = (g == f); //En este caso la variable igual quedará con valor *false, pues el el valor de g no es igual al valor de f.

        boolean diferente = (g != h); //La variable diferente quedará con el valor de *true*, pues el valor de g es diferente del valor de h.
        boolean mayor= (g > f); //la variable mayor quedará con el valor *false*, pues el valor de g es menor que el valor de f.

        boolean menorIgual = (g <= h); //La variable menor igual quedará con el valor de *true*, pues el valor de g es menor que el valor de h.

        System.out.println("igual = " + igual);
        System.out.println("diferente = " + diferente);
        System.out.println("mayor = " + mayor);
        System.out.println("menorIgual = " + menorIgual);

        boolean i = true;
        boolean j = false;
        boolean resultado = i && j;
            // Este código no será ejecutado, ya que i es verdadero y j es falso

        System.out.println("El resultado de i && j es: " + resultado);
        boolean k = true;
        boolean l = false;
        boolean resultado1 = k || l;
        System.out.println("El resultado de k || l es: " + resultado1);
            //Este código será ejecutado, ya que k es verdadero aunque l sea falso

        boolean m = true;
        resultado = !m;
        System.out.println("resultado = " + resultado);
            // Este código no será ejecutado, ya que m es verdadero

        int num = 5;
        int resultado3  = ++num; //num es incrementado para 6 e después es atribuido al resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado3); // imprime 6

        String saludo = "Hola, ";
        String nombre = "Alura";
        String mensaje = saludo + nombre + "!";

        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        String mensaje2 = """
                  Hola, mundo!
                  Este es un Text Block.
                  El permite escribir textos com múltiples lineas
                sin necesitar usar caracteres de escape o saltos de linea manualmente o concatenaciones.
                  """;
        System.out.println("mensaje2 = " + mensaje2);

        String nombre2 = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre2, edad, valor));


        String nombre3 = "Juan";
        int aulas = 4;

        String mensaje3= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre3, aulas);

        System.out.println(mensaje3);

        int x = 10;
        double y = x; // casting implícito
        System.out.println("y = " + y);

        double x2 = 10.5;
        int y2 = (int) x; // casting explícito

        System.out.println("y2 = " + y2);

        String saludos = "Hola, mi nombre es ";
        String nombre4= "Alicia ";
        String continuacion = "y mi edad es ";
        int edad2 = 17;
        System.out.println(saludos + nombre4 + continuacion + edad2);
        








    }
}
