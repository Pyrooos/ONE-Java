public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a="a";
        String b="b";
        String c=a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i<100000; i++){//                     500,     1000, 10000, 100000
            //c = c.concat(a).concat(b).concat("\n"); //500=>   2 ms,  3ms, 103 ms, 4240 ms
           //c += a + b+ "\n";                        //500 => 10 ms, 14ms,  53 ms, 1629 ms
           //sb.append(a).append(b).append("\n");    //500=>    0 ms,  0ms,   1 ms,    8 ms


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
