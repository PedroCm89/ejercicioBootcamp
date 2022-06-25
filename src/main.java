public class main {

    public static void main(String[] args) {

        int resultado;
        resultado = suma(6,24,5);
        System.out.println(resultado);

        coche coche1 = new coche();
        coche1.SumaPuerta();
        System.out.println(coche1.puerta);

    }

    public static int  suma(int a ,int b,int c){
        return a+b+c;
    }



}

