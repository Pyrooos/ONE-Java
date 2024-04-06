public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Pre incremento
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j+"\n");

        //post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j+"\n");

        //pre decremento

        i=3;
        System.out.println("inicial de i = " + i);
        j= --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j+"\n");

        //Post decremento

        i=4;
        System.out.println("inicial de i = " + i);
        j= i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);





    }
}
