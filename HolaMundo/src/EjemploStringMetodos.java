import javax.lang.model.SourceVersion;

public class EjemploStringMetodos{
    public static void main(String[] args) {
        
        String nombre= "Cristian";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.lowercase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Cristian\") = " + nombre.equals("Cristian"));
        System.out.println("nombre.equals(\"cristian\") = " + nombre.equals("cristian"));
        System.out.println("nombre.equalsIgnoreCase(\"cristian\") = " + nombre.equalsIgnoreCase("cristian"));
        System.out.println("nombre.compareTo(\"Cristian\") = " + nombre.compareTo("Cristian"));
        System.out.println("nombre.compareTo(\"carlos\") = " + nombre.compareTo("carlos"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(1) = " + nombre.substring(0,8));
        System.out.println("nombre.substring(1) = " + nombre.substring(4,8));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabaLenguas = "Trabalenguas";
        System.out.println("trabaLenguas.replace(\"a\",\".\") = " + trabaLenguas.replace("a","."));
        System.out.println("trabaLenguas = " + trabaLenguas);//no cambia el string de origen
        System.out.println("trabaLenguas = " + trabaLenguas.indexOf("a"));
        System.out.println("trabaLenguas.lastIndexOf(\"a\") = " + trabaLenguas.lastIndexOf("a"));
        System.out.println("trabaLenguas.indexOf(\"z\") = " + trabaLenguas.indexOf("z"));
        System.out.println("trabaLenguas.contains(\"t\") = " + trabaLenguas.contains("t"));
        System.out.println("trabaLenguas.startsWith(\"lenguas\") = " + trabaLenguas.startsWith("lenguas"));
        System.out.println("trabaLenguas.startsWith(\"lenguas\") = " + trabaLenguas.startsWith("Traba"));
        System.out.println("trabaLenguas.endsWith(\"d\") = " + trabaLenguas.endsWith("d"));
        System.out.println("trabaLenguas.endsWith(\"d\") = " + trabaLenguas.endsWith("s"));
        System.out.println("  Trabalenguas ");
        System.out.println("  Trabalenguas ".trim());


    }
}
