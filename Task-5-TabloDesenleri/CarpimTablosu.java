public static void main(String[] args) {
        int sayi = 2;

        System.out.println(sayi + "'nin Çarpım Tablosu");
        System.out.println("---------------------");

        for (int i = 1; i <= 10; i++) {


            int sonuc = sayi * i;

            System.out.printf("%d x %2d = %d\n", sayi, i, sonuc);

        }
    }
