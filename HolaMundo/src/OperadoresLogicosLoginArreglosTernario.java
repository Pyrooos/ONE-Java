import java.util.Scanner;

public class OperadoresLogicosLoginArreglosTernario {
    public static void main(String[] args) {
        /*String[] usernames = new String[2];
        String [] passwords = new String[2];

        usernames[0] = "Cristian";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "password";*/
        String[] usernames = {"Cristian", "admin","Pepe"};
        String [] passwords ={"123", "1234","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i< usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;
            /*if ( usernames[i].equals(u)&& passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
            }
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "User o password incorrectos! \n Lo siento requiere autentificacion";

        System.out.println("mensaje = " + mensaje);




       /* if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("User o password incorrectos");
            System.out.println("Lo siento requiere autentificacion");
*/
        }
    }

