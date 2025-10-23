public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen saniye değerini girin: ");
        int toplamSaniye = scanner.nextInt();
        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        System.out.print(toplamSaniye + " saniye = ");
        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniye);


        scanner.close();
    }
