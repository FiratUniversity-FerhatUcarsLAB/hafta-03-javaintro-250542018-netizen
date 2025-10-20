public class Stringİfadeler {
    public static void main ( String [] args ) {
        
                String urun1 = "Süt";
                int miktar1 = 2;
                double fiyat1 = 34.50; 

                String urun2 = "Ekmek";
                int miktar2 = 1;
                double fiyat2 = 10.00; 

                String urun3 = "Yumurta (15'li)";
                int miktar3 = 1;
                double fiyat3 = 75.75; 

                double toplam1 = miktar1 * fiyat1;
                double toplam2 = miktar2 * fiyat2;
                double toplam3 = miktar3 * fiyat3;

                double genelToplam = toplam1 + toplam2 + toplam3;

                System.out.println("************************************************************");
                System.out.println("                 HESAP ÖZETİ (ALIŞVERİŞ FİŞİ)");
                System.out.println("************************************************************");


                System.out.printf("%-20s %8s %12s %12s\n", "ÜRÜN ADI", "MİKTAR", "BİRİM FİYAT", "TOPLAM");
                System.out.println("------------------------------------------------------------");

                System.out.printf("%-20s %8d %12.2f ₺ %12.2f ₺\n", urun1, miktar1, fiyat1, toplam1);
                System.out.printf("%-20s %8d %12.2f ₺ %12.2f ₺\n", urun2, miktar2, fiyat2, toplam2);
                System.out.printf("%-20s %8d %12.2f ₺ %12.2f ₺\n", urun3, miktar3, fiyat3, toplam3);

                System.out.println("------------------------------------------------------------");
                System.out.printf("%-42s %12.2f ₺\n", "GENEL TOPLAM:", genelToplam);
                System.out.println("************************************************************");
            }
        }
