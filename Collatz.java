package looping.boy;

public class Main {
    public static final long MAX_MILLION = 1000000;

    public static void main(String[] args) {

        long n = 0;
        long iteration = 0;
        long nombreRetenu = 0;
        long nombreIteration = 1;

        for (long test = 1; test <= MAX_MILLION; test++) {

            n = test;                               // ON INITIALISE LA VALEUR N DE DEPART

            do {
                if ((n % 2) == 0) {                 // Si IL EST PAIR
                    n = n / 2;
                } else {                            // SI Il EST IMPAIR
                    n = (3 * n) + 1;
                }
                iteration++;
            } while (n != 1);                       // TANT QU'ON EST PAS A 1

            System.out.println("Ok pour : " + test);

            if (nombreIteration < iteration) {
                nombreIteration = iteration;
                nombreRetenu = test;
            }

            iteration = 0;
        }

        System.out.println("Le numéro qui fait le plus d'itérations est : " + nombreRetenu + " avec " + nombreIteration + " iterations !");
    }
}
