 public static void main(String[] args) {
        final double MIL_TO_KM_KATSAYISI = 1.609;

        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("Mil\tKilometre");
        System.out.println("-----------------");

        for (int mil : milDegerleri) {

            double kilometre = mil * MIL_TO_KM_KATSAYISI;
            System.out.printf("%d\t%.3f\n", mil, kilometre);

        }
 }
