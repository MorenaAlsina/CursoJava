public class EjercicioCombinatorio {
    public static void main(String[] args) {
        double fraccion1 = 6/5.0;
        double fraccion2 = 2/3.0;
        double fraccion3 = 7/2.0;
        double fraccion4 = 2/30.0;
        double fraccion5 = 1/3.0;
        double div = 5.0;

        double resultado = Math.round(((fraccion1 - (fraccion2 * fraccion3) + fraccion4)) / ((fraccion5) / div));
        System.out.println(( "(6/5 - 2/3 x 7/2 + 2/30)/((1/3)/5 = " + resultado ) );

    }
}
