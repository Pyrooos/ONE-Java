public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabaLenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int large = arreglo.length;
        System.out.println("large = " + large);
        for (int i = 0; i < large; i ++ ){
            System.out.println("arreglo = " + arreglo[i]);
        }
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        
    }
}
