import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {
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

            if ( usernames[i].equals(u)&& passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
            }




        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("User o password incorrectos");
            System.out.println("Lo siento requiere autentificacion");

        }
    }
}
