import java.util.Scanner;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres", "Pepe","Maria","Paco","Lalo", "Bea", "Pato","Pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("Andres".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("PEpa".toLowerCase())){
                continue;
            }
            System.out.println(i + ".- "+ nombres[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre por ejemplo \"pepe\" o \"maria\":");
        String nombre= scanner.nextLine();

        boolean encontrado = false;
        for(int i=0; 1 < count; i++){
            if (nombres[i].equalsIgnoreCase(nombre)){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            System.out.println(nombre +" fue encontrado");
        } else {
            System.out.println(nombre+"no existe");
        }
    }
}
